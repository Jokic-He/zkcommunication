package io.jtedu.zkcommunication.module.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.jtedu.zkcommunication.module.user.entity.UserDO;

/**
 * 应用模块名称<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
public interface UserService extends IService<UserDO> {


    UserDO select(String username);
}
