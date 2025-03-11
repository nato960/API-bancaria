package DIO.api.bancaria20.domain.repository;

import DIO.api.bancaria20.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountNumber(String accountNumber);

}
