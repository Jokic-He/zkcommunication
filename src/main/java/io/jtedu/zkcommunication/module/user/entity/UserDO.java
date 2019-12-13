package io.jtedu.zkcommunication.module.user.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 应用模块名称<p>
 *
 * @author hepeiyun
 * @since 2019/12/13
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("user")
public class UserDO extends Model<UserDO> {

    private String id;

    private String username;

    private String password;

}
