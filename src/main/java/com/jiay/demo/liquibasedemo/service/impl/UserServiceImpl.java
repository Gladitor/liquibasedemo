package com.jiay.demo.liquibasedemo.service.impl;

import com.jiay.demo.liquibasedemo.entity.User;
import com.jiay.demo.liquibasedemo.mapper.UserMapper;
import com.jiay.demo.liquibasedemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JIAY
 * @since 2019-11-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> list() {
        return userMapper.selectList(null);
    }
}
