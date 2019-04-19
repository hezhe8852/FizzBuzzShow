package com.test.demoUtil;

import java.util.ArrayList;
import java.util.List;
public class FizzBuzzShowUtil {
	
	public static List<String> showFizzBuzz(int number) 
	{
		List<String> res = new ArrayList<String>();
        for(int i = 1; i<=number; i++)
        {
            if(i%5 == 0 && i%3 == 0 || String.valueOf(i).contains("3") && String.valueOf(i).contains("5"))
            {
                res.add("FizzBuzz");
            }
            else if(i%5 == 0 || String.valueOf(i).contains("5"))
            {
                res.add("Buzz");
            }
            else if(i%3 == 0 || String.valueOf(i).contains("3"))
            {
                res.add("Fizz");
            }
            else
            {
                res.add(String.valueOf(i));
            }
        }
        return res;
    }
}
