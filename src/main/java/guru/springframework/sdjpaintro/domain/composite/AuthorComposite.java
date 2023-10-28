package guru.springframework.sdjpaintro.domain.composite;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Entity
@IdClass(value = NameId.class)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class AuthorComposite {
    @Id
    private String firstName;
    @Id
    private String lastName;
    private String country;
}
