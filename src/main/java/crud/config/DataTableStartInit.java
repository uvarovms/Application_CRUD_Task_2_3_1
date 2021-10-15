package crud.config;

import crud.model.User;
import crud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DataTableStartInit {

    private final UserService userService;

    @Autowired
    public DataTableStartInit(UserService userService) {
        this.userService = userService;
    }

    @PostConstruct
    private void postConstruct() {
        userService.addUser(new User("Anton Tihonov",   25));
        userService.addUser(new User("Valeriy Uskov",  70));
        userService.addUser(new User("Yakov Sichev", 38));
        userService.addUser(new User("Sergey Litvinov", 22));
    }
}
