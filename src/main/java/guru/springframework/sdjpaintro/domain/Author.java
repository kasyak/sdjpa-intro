package guru.springframework.sdjpaintro.domain;

import jakarta.persistence.*;
import lombok.*;


/**
 * Created by jt on 6/12/21.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    private String firstName;
    private String lastName;
}
