package com.example.Main;

import com.example.Service.Inter.ICustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ICustomerService customerService = (ICustomerService) context.getBean("customerService");
        customerService.getUsers();
    }

}
