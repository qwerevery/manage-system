package cn.tedu.managesystem.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("cn.tedu.managesystem.mapper")
public class ConfigMybatis {
}
