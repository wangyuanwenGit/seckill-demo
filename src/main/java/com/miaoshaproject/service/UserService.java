package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.UserModel;

public interface UserService {

    //通过用户id获取对象的方法
    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    /**
     * 验证登录
     * @param telphone 用户注册手机
     * @param encrptPassword 用户加密后的密码
     * @return
     * @throws BusinessException
     */
    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
