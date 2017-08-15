package com.concretepage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.concretepage.bean.Person;
import com.concretepage.bean.PersonType;

public class App 
{
	public static void main(String[] args) {
		ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
		Person person = (Person)context.getBean("person");
		PersonType ptype = person.getType();
		System.out.println(ptype.getTypeName());
	}
}
