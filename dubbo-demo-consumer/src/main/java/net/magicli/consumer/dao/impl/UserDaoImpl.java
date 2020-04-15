package net.magicli.consumer.dao.impl;

import net.magicli.consumer.dao.UserDao;
import net.magicli.domain.User;
import net.magicli.facade.UserFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Reference
    private UserFacade userFacade;

    @Override
    public User getById(String id) {
        return userFacade.getById(id);
    }
}
