package com.practice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.bean.RegisterBean;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		RegisterBean registerBean=(RegisterBean)ctx.getBean("rb");
		registerBean.showData();
		
	}

}
