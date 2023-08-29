package com.utils;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

    public class MySimpleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	final protected void basicSetUp() throws Exception {
		System.out.println(" setUp from  MySimpleTest ");
	}

	@Test
	    void aaatest() {
		System.out.println("test() from   MySimpleTest ");
	}
	 public   boolean isOddTL(int number) {
	        return number % 2 != 0;
	    }
}
