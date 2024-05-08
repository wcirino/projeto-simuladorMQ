package simuladorEmail.simuladorEmail.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import simuladorEmail.simuladorEmail.entity.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
    
}
