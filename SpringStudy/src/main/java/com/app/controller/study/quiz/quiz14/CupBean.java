package com.app.controller.study.quiz.quiz14;

public class CupBean {
	CoffeeBean coffeeBean;

	public CupBean(CoffeeBean coffeeBean) {
		super();
		this.coffeeBean = coffeeBean;
	}

	@Override
	public String toString() {
		return "컵에 담긴 음료의 이름 - " + coffeeBean;
	}
	
}
