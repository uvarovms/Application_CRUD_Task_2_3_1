package crud.service;

import crud.dao.UserDao;
import crud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        userDao.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
