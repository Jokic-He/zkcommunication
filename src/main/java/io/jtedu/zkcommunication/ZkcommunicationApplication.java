package io.jtedu.zkcommunication;

import io.jtedu.zkcommunication.module.user.entity.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"io.jtedu.zkcommunication.**.dao"})
public class ZkcommunicationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZkcommunicationApplication.class, args);
//        UserDO userDO=new UserDO();
//        userDO.setId("1241241424");
//        userDO.setUsername("admin");
//        userDO.setPassword("123456");
//        userDO.insert();
    }

}
