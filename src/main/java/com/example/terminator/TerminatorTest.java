package com.example.terminator;

import com.example.terminator.quoters.Quoter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TerminatorTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		context.getBean(Quoter.class).sayQuote();
	}
}
