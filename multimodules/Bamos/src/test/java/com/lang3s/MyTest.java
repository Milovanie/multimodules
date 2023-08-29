package com.lang3s;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.utils.*;



class MyTest extends MySimpleTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	protected void setUp() throws Exception {
		 System.out.println(" setUp from  MyTest ");
		 
	}

	@Test
	  void test() {
		 System.out.println("test() from  MyTest ");
	}

}
