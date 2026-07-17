package fifafacil.example.filafacil.domain.clinic;

import fifafacil.example.filafacil.domain.queue.Queue;
import fifafacil.example.filafacil.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Table(name = "table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clinic {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String cnpj;
    private String email;
    private Timestamp created_at;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "queue_id")
    private Queue queue;
}
