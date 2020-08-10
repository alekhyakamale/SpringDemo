package com.spring;

import org.springframework.beans.factory.DisposableBean; 

import org.springframework.beans.factory.InitializingBean; 

//Bean Lifecycle methods
public class Spring implements InitializingBean, DisposableBean { 

//Init method
@Override
public void afterPropertiesSet()  
throws Exception 
{ 
    System.out.println("Init method has started");
} 

//Destroy method
@Override
public void destroy() throws Exception 
{ 
    System.out.println("Destroy method has started");
} 
} 