package com.example.terminator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TerminatorTest {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("context.xml");
	}
}
