package login;

import login.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.stereotype.Repository;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    //User findById(Long id);
}