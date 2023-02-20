package com.in28minutes.learnspringframework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Context init completed.");
            context.getBean(ClassB.class).doSomething();
        }
    }
}

@Component
class ClassA {

}

@Lazy
@Component
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some init logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}
