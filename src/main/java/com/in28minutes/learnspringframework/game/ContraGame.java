package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Qualifier("SuperContraGameQualifier")
@Component
public class ContraGame implements GamingConsole{
	public void up() {
		System.out.println("up");
	}
	
	public void down() {
		System.out.println("sit down");
	}
	
	public void left() {
		System.out.println("shoot a bullet");
	}
	
	public void right() {
		System.out.println("go back");
	}
}
