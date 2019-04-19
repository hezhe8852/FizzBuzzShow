package com.test.testDemo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.test.demoUtil.FizzBuzzShowUtil;


public class FizzBuzzTest {

	@Test
	public void testWheatherDivisibleBy3OrHas3()
	{
		List<String> needShowList = new ArrayList<String>();
		needShowList = FizzBuzzShowUtil.showFizzBuzz(100);
		assertEquals("Fizz", needShowList.get(2));
		assertEquals("Fizz", needShowList.get(65));
		
		
	}
	
	@Test
	public void testWheatherDivisibleBy5OrHas5()
	{
		List<String> needShowList = new ArrayList<String>();
		needShowList = FizzBuzzShowUtil.showFizzBuzz(100);
		assertEquals("Buzz", needShowList.get(4));
		assertEquals("Buzz", needShowList.get(79));
	}
	
	@Test
	public void testWheatherDivisibleBy3And5OrHas3And5()
	{
		List<String> needShowList = new ArrayList<String>();
		needShowList = FizzBuzzShowUtil.showFizzBuzz(100);
		assertEquals("FizzBuzz", needShowList.get(59));
		assertEquals("FizzBuzz", needShowList.get(14));
	}
}
