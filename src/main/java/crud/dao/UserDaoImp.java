package crud.dao;

import crud.model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAllUsers() {
        return em.createQuery("FROM User").getResultList();
    }

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void deleteUserById(Long id) {
        em.remove(getUser(id));
    }

    @Override
    public void updateUser(User user) {
        em.merge(user);
    }

    @Override
    public User getUser(Long id) {
        return em.find(User.class, id);
    }
}


