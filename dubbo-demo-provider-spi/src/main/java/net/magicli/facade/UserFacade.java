package net.magicli.facade;

import net.magicli.domain.User;

public interface UserFacade {
    User getById(String id);
}
