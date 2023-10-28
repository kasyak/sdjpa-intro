package guru.springframework.sdjpaintro.domain.composite;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class NameId implements Serializable {
    private String firstName;
    private String lastName;
}
