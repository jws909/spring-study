package com.app.controller.study.quiz.quiz14;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Quiz14Configuration {

	//Bean 등록 설정
	@Bean
	public CoffeeBean coffeeBean() {
		return new CoffeeBean("민트초코프라페");
	}

	@Bean
	public CupBean cupBean(CoffeeBean coffeeBean) {
		return new CupBean(coffeeBean);
	}
	
	@Bean
	public DessertBean dessertBean() {
		DessertBean dessertBean = new DessertBean();
		dessertBean.setName("당근케이크");
		
		return dessertBean;
	}
	
	@Bean
	public PlateBean plateBean(DessertBean dessertBean) {
		return new PlateBean(dessertBean);
	}
}
