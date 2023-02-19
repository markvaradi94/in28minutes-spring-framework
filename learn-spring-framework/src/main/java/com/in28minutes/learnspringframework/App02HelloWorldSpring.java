package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.hello.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // 1. Launch a Spring Context  --> AnnotationConfigApplicationContext
        try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            // 2. Configure the things that we want Spring framework to manage  - @Configuration
            // HelloWorldConfiguration -- @Configuration
            // name - @Bean

            // 3. Retrieving Beans managed by Spring
            Object name = context.getBean("name");
            System.out.println(name);
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println("Method calls:");
            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3Parameters"));
//        System.out.println(context.getBean("address"));
            System.out.println(context.getBean("customAddress"));

            System.out.println();
            System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
            System.out.println();
            System.out.println(context.getBean("person5Qualifier"));
        }
    }
}
