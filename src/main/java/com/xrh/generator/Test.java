package com.xrh.generator;

import com.xrh.generator.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by xuruhong on 2018/3/2.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml","spring-mybatis.xml"});
         IUserService userService = (IUserService) ac.getBean("userServiceImpl");
        System.out.println(userService.getUser());

    }

}
