package com.in28minutes.learnspringframework.game.examples.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Component
class ClassA{
	
}

@Lazy
@Component
class ClassB{
	
	private ClassA classA;

	public ClassB(ClassA classA) {
		
		//logic
		System.out.println("Some initialization");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Printing in CLassB");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			System.out.println("Iniatialization of context is completed.");
			context.getBean(ClassB.class).doSomething();
			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}