package com.phantomsaber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author phantomsaber
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class VoidApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(VoidApplication.class, args);
    }
}
