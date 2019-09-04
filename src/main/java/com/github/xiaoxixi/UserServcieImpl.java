package com.github.xiaoxixi;

public class UserServcieImpl implements UserService {
    @Override
    public UserDO queryUser(UserQuery query) {
        UserDO user = new UserDO();
        user.setUserId(1L);
        user.setUserName("hello");
        return user;
    }
}
