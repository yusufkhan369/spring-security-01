package com.in28minutes.learnspringframework.game.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class MongoDBDataService implements DataService{

	@Override
	public int[] retreiveData() {
		// TODO Auto-generated method stub
		return new int[] {12,31,24,25211,42};
	}

}
