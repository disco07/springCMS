package com.springcms.cms.Service;

import com.springcms.cms.Entity.User;
import com.springcms.cms.Repository.UserRepository;
import com.springcms.cms.Security.MyUserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public MyUserDetails findByEmail(String email) {
        User user = null;
        try {
            user = userRepository.findByEmail(email);
        } catch (Exception e) {
            throw e;
        }
        return new MyUserDetails(user);
    }
}
