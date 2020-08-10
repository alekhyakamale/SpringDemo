package com.spring;


import org.springframework.context.ConfigurableApplicationContext; 
import org.springframework.context.support.ClassPathXmlApplicationContext; 


//Driver class 
public class Main { 

public static void main(String[] args) 
    throws Exception 
{ 	
	//This provides beans configuration methods
    ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("Beans.xml"); 

    // Spring container is closed and destroy method is invoked.
    context.close(); 
} 
} 