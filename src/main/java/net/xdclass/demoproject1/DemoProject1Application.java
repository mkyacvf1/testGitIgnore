package net.xdclass.demoproject1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * <p>
 *  Springboot 启动类
 * </p>
 *
 * @author menglingtao
 * @since 2022年04月21日 10:01:35
 */
@SpringBootApplication
@ServletComponentScan
public class DemoProject1Application {

    // Springboot 引用入口函数
    public static void main(String[] args) {
        SpringApplication.run(DemoProject1Application.class, args);
    }

}
