package com.springcms.cms.Service;

import com.springcms.cms.Entity.User;

public interface UserService {

    User findByEmail(String email);
}
