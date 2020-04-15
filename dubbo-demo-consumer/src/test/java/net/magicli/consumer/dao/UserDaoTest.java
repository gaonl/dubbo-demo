package net.magicli.consumer.dao;

import net.magicli.domain.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserDaoTest {

    private Logger logger = LoggerFactory.getLogger(UserDaoTest.class);

    @Autowired
    private UserDao userDao;

    @Test
    void testGetById() {
        User user = userDao.getById("user_id_abc");
        logger.info("%s,  %s,  %s", user.getId(), user.getName(), String.valueOf(user.getAge()));

    }

}
