package com.app.controller.study.quiz.quiz14;

public class PlateBean {
	DessertBean dessertBean;

	public PlateBean(DessertBean dessertBean) {
		super();
		this.dessertBean = dessertBean;
	}

	@Override
	public String toString() {
		return "접시에 담긴 디저트의 이름 - " + dessertBean.getName();
	}
	
	
}
