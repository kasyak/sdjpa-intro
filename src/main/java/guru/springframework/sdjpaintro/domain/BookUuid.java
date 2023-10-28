package guru.springframework.sdjpaintro.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.JdbcTypeCode;

import java.sql.Types;
import java.util.UUID;

/**
 * Created by jt on 6/12/21.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class BookUuid {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(length = 16, columnDefinition = "binary(16)", updatable = false, nullable = false)
    @JdbcTypeCode(value = Types.BINARY)
    @EqualsAndHashCode.Include
    private UUID id;

    private String title;
    private String isbn;
    private String publisher;
    public BookUuid(String title, String isbn, String publisher) {
        this.title = title;
        this.isbn = isbn;
        this.publisher = publisher;
    }
}
