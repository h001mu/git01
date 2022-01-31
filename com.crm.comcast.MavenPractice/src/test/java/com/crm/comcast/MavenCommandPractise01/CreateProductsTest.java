package com.crm.comcast.MavenCommandPractise01;

import org.testng.annotations.Test;

public class CreateProductsTest {
	@Test
	public void CreateProductsTest01() {
		System.out.println("execute CreateProductsTest01");
	}
	@Test(groups="smokeTest")
	public void CreateProductsTest02() {
		System.out.println("execute CreateProductsTest02");
	}
	@Test(groups="RegressionTest")
	public void CreateProductsTest03() {
		System.out.println("execute CreateProductsTest03");
	}
	@Test(groups="smokeTest")
	public void CreateProductsTest04() {
		System.out.println("execute CreateProductsTest04");
	}
	@Test
	public void CreateProductsTest05() {
		System.out.println("execute CreateProductsTest05");
	}
	

}
