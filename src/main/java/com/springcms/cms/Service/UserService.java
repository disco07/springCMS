package com.springcms.cms.Service;

import com.springcms.cms.Security.MyUserDetails;

public interface UserService {

    MyUserDetails findByEmail(String email);
}
