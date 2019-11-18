package com.jiay.demo.liquibasedemo.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jiay.demo.liquibasedemo.entity.User;
import com.jiay.demo.liquibasedemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JIAY
 * @since 2019-11-18
 */
@Controller
@RequestMapping("/liquibasedemo/user")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/getList")
    @ResponseBody
    public String getList(){
        List<User> users = userService.list();
        String usersJson = null;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            usersJson = objectMapper.writeValueAsString(users);
        }catch (JsonProcessingException e){
            e.printStackTrace();
        }
        return usersJson;
    }
}
