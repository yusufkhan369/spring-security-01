package com.in28minutes.learnspringframework.game.examples.c1;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService{

	@Override
	public int[] retreiveData() {
		// TODO Auto-generated method stub
		return new int[] {12,3,4,6,8};
	}
	
	

}
