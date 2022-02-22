package org.personal.loginapp.dao;

import org.personal.loginapp.model.Login;

public interface LoginDao {
    Login validate(Login login);
}

