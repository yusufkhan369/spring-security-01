package com.in28minutes.learnspringframework.game.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan
public class DepInjectionLauncherSpringApplication2 {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(DepInjectionLauncherSpringApplication2.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}