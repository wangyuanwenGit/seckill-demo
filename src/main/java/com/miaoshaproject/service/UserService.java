package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    //通过用户id获取对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;
}
