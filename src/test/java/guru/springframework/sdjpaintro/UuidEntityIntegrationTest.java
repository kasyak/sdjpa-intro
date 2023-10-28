package guru.springframework.sdjpaintro;

import guru.springframework.sdjpaintro.domain.AuthorUuid;
import guru.springframework.sdjpaintro.domain.BookUuid;
import guru.springframework.sdjpaintro.repositories.AuthorUuidRepository;
import guru.springframework.sdjpaintro.repositories.BookUuidRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ActiveProfiles("local")
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UuidEntityIntegrationTest {
    @Autowired
    BookUuidRepository bookUuidRepository;
    @Autowired
    AuthorUuidRepository authorUuidRepository;

    @Test
    void testUuidEntities() {
        BookUuid savedBook = bookUuidRepository.save(new BookUuid("TestBook", "123", "Test House"));
        assertThat(bookUuidRepository.findById(savedBook.getId())).hasValue(savedBook);

        AuthorUuid savedAuthor = authorUuidRepository.save(new AuthorUuid("TestAuthorFirstName", "TestAuthorLastName"));
        assertThat(authorUuidRepository.findById(savedAuthor.getId())).hasValue(savedAuthor);
    }
}
