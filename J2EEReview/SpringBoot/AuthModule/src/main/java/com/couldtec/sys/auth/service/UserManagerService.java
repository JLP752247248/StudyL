package com.couldtec.sys.auth.service;

import com.couldtec.sys.auth.dao.AuthRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserManagerService {

    @Autowired
    protected AuthRoleRepository authRoleDao;

    public void list(){


    }


}
