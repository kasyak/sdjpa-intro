package guru.springframework.sdjpaintro.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;


/**
 * Created by jt on 6/12/21.
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AuthorUuid {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    @JdbcTypeCode(value = Types.VARCHAR)
    @Column(length = 36, columnDefinition = "varchar(36)", updatable = false, nullable = false)
    private UUID id;

    private String firstName;
    private String lastName;

    public AuthorUuid(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
