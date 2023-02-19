package com.in28minutes.learnspringframework.hello;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Mark";
    }

    @Bean
    public int age() {
        return 29;
    }

    @Bean
    public Person person() {
        return new Person("Gyuri", 54, new Address("3rd Street", "Salonta"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address2Qualifier") Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "customAddress")
    @Primary
    public Address address() {
        return new Address("1st street", "Moscow");
    }

    @Bean(name = "address2")
    @Qualifier("address2Qualifier")
    public Address address2() {
        return new Address("5th Street", "Baia Mare");
    }
}
