package com.zcs.service;

import com.zcs.dao.UsersMapper;
import com.zcs.entity.Users;
import com.zcs.entity.UsersExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    UsersMapper usersMapper;

    /**
     * 检验用户名是否可用（即当前号码是否已注册）
     * @return  true：代表当前姓名可用   false：不可用
     */
    public boolean CheckUserName(String uphone){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUPhoneEqualTo(uphone);
        long count = usersMapper.countByExample(usersExample);
        return count==0;
        /**相当于
         * select count(*) from users where uphone =(传过来的账号值)
         */
    }

    /**
     * 注册
     */
    public void register(Users users){
        usersMapper.insertSelective(users);
    }

    /**
     * 检测是否登录成功
     */
    public boolean login(Users user){
        UsersExample usersExample = new UsersExample();
        UsersExample.Criteria criteria = usersExample.createCriteria();
        criteria.andUPhoneEqualTo(user.getuPhone());
        criteria.andUPwdEqualTo(user.getuPwd());
        criteria.andUStatusEqualTo(user.getuStatus());
        long count = usersMapper.countByExample(usersExample);
        return count==1;
        /**相当于
         * select count(*) from users where uphone =(传过来的账号值)
         * and pwd = (传过来的密码值)
         * and status = (传过来的用户类型值)；
         */
    }
}
