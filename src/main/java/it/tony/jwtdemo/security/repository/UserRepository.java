package it.tony.jwtdemo.security.repository;

import it.tony.jwtdemo.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * Created by casinan on 21.08.17.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
