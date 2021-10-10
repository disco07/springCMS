package com.springcms.cms.Service;

import com.springcms.cms.Entity.User;
import com.springcms.cms.Repository.UserRepository;

public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User findByEmail(String email) {
        User user = null;
        try {
            user = userRepository.findByEmail(email);
        } catch (Exception e) {
            throw e;
        }
        return user;
    }
}
