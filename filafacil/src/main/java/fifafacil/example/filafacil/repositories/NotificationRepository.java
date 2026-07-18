package fifafacil.example.filafacil.repositories;

import fifafacil.example.filafacil.domain.notification.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}
