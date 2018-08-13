package it.abd.esb.camel.service.impl;

import it.abd.esb.camel.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, "+name;
    }
}
