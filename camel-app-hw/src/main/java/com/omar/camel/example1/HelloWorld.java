package com.omar.camel.example1;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class HelloWorld {

    public static void main(String[] args) throws Exception {

        //Create Camel Context
        CamelContext context = new DefaultCamelContext();

        context.addRoutes(new HelloWorldRoute());

        context.start();
    }
}
