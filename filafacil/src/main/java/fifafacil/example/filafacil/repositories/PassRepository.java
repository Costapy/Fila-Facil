package fifafacil.example.filafacil.repositories;

import fifafacil.example.filafacil.domain.pass.Pass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PassRepository extends JpaRepository<Pass, UUID> {
}
