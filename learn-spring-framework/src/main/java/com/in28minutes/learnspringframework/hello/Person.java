package com.in28minutes.learnspringframework.hello;

public record Person(
        String name,
        int age,
        Address address
) {
}
