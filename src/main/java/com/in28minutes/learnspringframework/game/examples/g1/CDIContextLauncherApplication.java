package com.in28minutes.learnspringframework.game.examples.g1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Component
class BusinessService{
	
	private DataService dataservice;



	@Autowired
	public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}
	

	public DataService getDataservice() {
		System.out.println("Setter injection is performed");
		return dataservice;
	}
	
}


class DataService {

}

@Configuration
@ComponentScan
public class CDIContextLauncherApplication {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(CDIContextLauncherApplication.class)) {
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);	
			
			System.out.println(context.getBean(BusinessService.class).getDataservice());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}