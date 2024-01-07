package com.dongguo.entity;

/**
 * @author dongguo
 * @date 2023/9/16
 * @description:
 */
public class TeddyDog extends Dog {
	private String name;

	public TeddyDog() {
	}

	public TeddyDog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
