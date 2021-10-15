package crud.service;

import crud.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void addUser(User user);
    void deleteUserById(Long id);
    void updateUser(User user);
    User getUser(Long id);
}
