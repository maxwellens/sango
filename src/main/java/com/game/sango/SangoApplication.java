package com.game.sango;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.game.sango.dao"})
public class SangoApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SangoApplication.class, args);
    }
}
