package com.spring.boot.SpringBootJava;

import javax.annotation.Resource;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;




/**
 * Hello world!
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App implements CommandLineRunner
{
	@Resource
	private HelloWorldService helloWorldService;
    public static void main( String[] args )
    {
    	ApplicationContext ctx = SpringApplication.run(App.class, args);
        System.out.println("启动.......");
    }

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("child:"+this.helloWorldService.getHelloMessage());
	}
}
