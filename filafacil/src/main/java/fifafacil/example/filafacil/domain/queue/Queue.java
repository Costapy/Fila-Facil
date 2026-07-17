package fifafacil.example.filafacil.domain.queue;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "queue")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Queue {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private Date date_reference;
    private String status;
}
