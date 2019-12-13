package io.jtedu.zkcommunication.module.user.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.jtedu.zkcommunication.module.user.entity.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * 应用模块名称<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
//此处两个注解必须使用，所有的业务模块数据库包的名称必须Mapper打底
@Repository
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {


    //此处的名称对应xml文件中的id
    UserDO findByUsername(String username);
}
