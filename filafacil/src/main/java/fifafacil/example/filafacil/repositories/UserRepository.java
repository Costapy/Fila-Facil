package fifafacil.example.filafacil.repositories;

import fifafacil.example.filafacil.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
