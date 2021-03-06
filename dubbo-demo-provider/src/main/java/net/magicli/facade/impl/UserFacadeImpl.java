package net.magicli.facade.impl;

import net.magicli.domain.User;
import net.magicli.facade.UserFacade;
import org.apache.dubbo.config.annotation.Service;

@Service(interfaceClass = UserFacade.class)
public class UserFacadeImpl implements UserFacade {

    @Override
    public User getById(String id) {
        User user = new User();

        user.setName("name");
        user.setAge(10);
        user.setId(id);

        return user;

    }
}
