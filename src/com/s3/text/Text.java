package com.s3.text;

import com.s3.Service.impl.PersonServiceimpl;
import com.s3.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Text {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring_mybatis.xml");
        PersonServiceimpl bean = context.getBean(PersonServiceimpl.class);
        List<Person> all = bean.getAll();
        for (Person p : all) {
            System.out.println("姓名"+p.getName()+"年龄"+p.getAge());
        }
    }
}
