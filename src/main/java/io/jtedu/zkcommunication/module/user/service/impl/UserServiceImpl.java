package io.jtedu.zkcommunication.module.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.jtedu.zkcommunication.module.user.dao.UserMapper;
import io.jtedu.zkcommunication.module.user.entity.UserDO;
import io.jtedu.zkcommunication.module.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;


/**
 * 应用模块名称<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public UserDO select(String username) {

        return userMapper.findByUsername(username);

    }
}
