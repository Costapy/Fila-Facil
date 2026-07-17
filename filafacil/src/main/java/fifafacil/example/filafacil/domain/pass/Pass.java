package fifafacil.example.filafacil.domain.pass;

import fifafacil.example.filafacil.domain.queue.Queue;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Table(name = "pass")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pass {
    @Id
    @GeneratedValue
    private UUID id;

    private String code;
    private String status;
    private Timestamp created_at;
    private Timestamp called_at;
    private Timestamp finished_at;

    @ManyToOne
    @JoinColumn(name = "queue_id")
    private Queue queue;
}
