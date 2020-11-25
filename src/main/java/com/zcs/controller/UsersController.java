package com.zcs.controller;

import com.zcs.entity.Users;
import com.zcs.service.UsersService;
import com.zcs.utils.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
public class UsersController {

    @Autowired
    UsersService usersService;

    /**
     * 注册功能
     */

    @ResponseBody
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Msg register(@Valid @RequestBody Users users, BindingResult result) {

        /**JSR303 校验有错*/
        if (result.hasErrors()) {

            /**用一个Map来存键值对 返回JSON格式数据*/
            Map<String, Object> map = new HashMap<>();
            List<FieldError> errors = result.getFieldErrors();

            for (FieldError fieldError : errors) {
                System.out.println("错误的字段名：" + fieldError.getField());
                System.out.println("错误信息：" + fieldError.getDefaultMessage());
                map.put(fieldError.getField(), fieldError.getDefaultMessage());
            }
            return Msg.fail().add("check_msg", map);
        } else {

            /**如果JSR303检验，格式正确 则进行数据库查找，查看该号码是否被注册*/
            boolean b = usersService.CheckUserName(users.getuPhone());
            if (b) {
                usersService.register(users);
                return Msg.success();
            } else {
                Map<String, Object> map = new HashMap<>();
                map.put("uPhone","用户名已注册");
                return Msg.fail().add("check_msg", map);
            }
        }
        //数据库用户名重复校验
    }

    /**
     * 登录功能
     */
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Msg Login(@RequestBody Users users) {
        boolean login;
        login = usersService.login(users);
        if (login == false) {
            return Msg.fail().add("login_msg", "账号、密码或用户类型有错");
        } else {
            return Msg.success().add("Info",users);
        }
    }


}
