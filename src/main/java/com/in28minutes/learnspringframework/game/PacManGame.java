package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

	@Override
	public void up() {
		// TODO Auto-generated method stub
		System.out.println("pac up");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("pac down");

	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("pac left");

	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("pac ryt");

	}
	

}
