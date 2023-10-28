package guru.springframework.sdjpaintro;

import guru.springframework.sdjpaintro.domain.composite.AuthorComposite;
import guru.springframework.sdjpaintro.domain.composite.AuthorEmbedded;
import guru.springframework.sdjpaintro.domain.composite.NameId;
import guru.springframework.sdjpaintro.repositories.AuthorCompositeRepository;
import guru.springframework.sdjpaintro.repositories.AuthorEmbedRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class CompositeIntegrationTest {
    @Autowired
    AuthorCompositeRepository authorCompositeRepository;
    @Autowired
    AuthorEmbedRepository authorEmbedRepository;

    @Test
    void testUuidEntities() {
        NameId nameId = new NameId("John", "Doe");
        AuthorComposite author = new AuthorComposite();
        author.setCountry("US");
        author.setFirstName(nameId.getFirstName());
        author.setLastName(nameId.getLastName());
        AuthorComposite savedAuthor = authorCompositeRepository.save(author);
        assertThat(authorCompositeRepository.findById(nameId)).hasValue(savedAuthor);

        AuthorEmbedded authorEmb = new AuthorEmbedded();
        authorEmb.setCountry("US");
        authorEmb.setFullName(nameId);
        AuthorEmbedded savedAuthorEmb = authorEmbedRepository.save(authorEmb);
        assertThat(authorEmbedRepository.findById(nameId)).hasValue(savedAuthorEmb);
    }
}
