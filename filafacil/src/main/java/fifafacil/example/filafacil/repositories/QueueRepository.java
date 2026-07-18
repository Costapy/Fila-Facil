package fifafacil.example.filafacil.repositories;

import fifafacil.example.filafacil.domain.queue.Queue;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface QueueRepository extends JpaRepository<Queue, UUID> {
}
