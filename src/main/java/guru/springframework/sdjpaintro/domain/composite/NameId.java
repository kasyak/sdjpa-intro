package guru.springframework.sdjpaintro.domain.composite;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class NameId implements Serializable {
    private String firstName;
    private String lastName;
}
