package io.jtedu.zkcommunication.module.user.controller;

import cn.hutool.core.lang.UUID;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.additional.query.impl.LambdaQueryChainWrapper;
import io.jtedu.zkcommunication.module.user.entity.UserDO;
import io.jtedu.zkcommunication.module.user.service.impl.UserServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 应用模块名称<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
@Controller
@RequestMapping("/api")
@Log4j2
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/select")
    public void select(String username){
        //通过mapper.xml里面的方法进行查找
        UserDO select = userService.select(username);
        log.info("mybatis查询出用户密码为{}",select.getPassword());
    }

    @PostMapping("/save")
    public void save(String username,String password){
        //通过mybatisplus的方法进行增删改查
        UserDO userDO=new UserDO();
        userDO.setUsername(username);
        userDO.setPassword(password);
        userDO.setId(UUID.randomUUID().toString());
        userDO.insert();
    }

    @PostMapping("/mpSelect")
    public void mpSelect(String username){
        UserDO userDO = new UserDO().selectOne(new LambdaQueryWrapper<UserDO>().eq(UserDO::getUsername, username));
        log.info("myabtisplus查询出用户密码为:{}",userDO.getPassword());
    }



}
