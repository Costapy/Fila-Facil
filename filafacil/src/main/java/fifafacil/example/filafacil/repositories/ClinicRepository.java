package fifafacil.example.filafacil.repositories;

import fifafacil.example.filafacil.domain.clinic.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClinicRepository extends JpaRepository<Clinic, UUID> {
}
