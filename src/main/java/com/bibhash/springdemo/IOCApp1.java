package com.bibhash.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCApp1 {

    public static void main(String[] args) {
        
           //creating the application context (container)									// add this comment
           ApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");		// add this line
           
           //creating the bean																// add this comment
           Organization org = (Organization) ctx.getBean("myorg");							// add this line
           
           //invoking bean method															// add this comment
           org.corporateSlogan();															// add this line
           
           //close the application context (container)										// add this comment
           ((FileSystemXmlApplicationContext) ctx).close();          						// add this line
    }

}
