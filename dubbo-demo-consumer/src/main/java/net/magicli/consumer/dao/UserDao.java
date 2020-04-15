package net.magicli.consumer.dao;

import net.magicli.domain.User;

public interface UserDao {
    User getById(String id);
}
