package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;
@Repository
public interface UserDao {
    List<User> getAllUsers();
    void updateUser(User user);
    void removeUser(Long id);
    User getUserById(Long id);

    void save(User user);
}
