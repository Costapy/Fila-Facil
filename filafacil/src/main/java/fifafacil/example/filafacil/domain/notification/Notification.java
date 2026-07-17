package fifafacil.example.filafacil.domain.notification;

import fifafacil.example.filafacil.domain.pass.Pass;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@Table(name = "notification")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {
    @Id
    @GeneratedValue
    private UUID Id;

    private String Channel;
    private String Status;
    private Timestamp CreatedAt;

    @ManyToOne
    @JoinColumn(name = "pass_id")
    private Pass pass;
}
