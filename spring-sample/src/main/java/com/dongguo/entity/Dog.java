package com.dongguo.entity;

/**
 * @author dongguo
 * @date 2023/9/16
 * @description:
 */
public class Dog {
	private String color;
	private Integer age;

	public Dog() {
	}

	public Dog(String color, Integer age) {
		this.color = color;
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
