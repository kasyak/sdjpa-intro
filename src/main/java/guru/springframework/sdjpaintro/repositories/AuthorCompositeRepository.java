package guru.springframework.sdjpaintro.repositories;

import guru.springframework.sdjpaintro.domain.composite.AuthorComposite;
import guru.springframework.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}
