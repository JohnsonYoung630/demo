package com.johnson.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void testStageOne() {
		for (int i = 1; i <= 100; i++) {
			if(isDivided(i, 3) && isDivided(i, 5)) {
				System.out.println("FizzBuzz");
			} else if(isDivided(i, 3)) {
				System.out.println("Fizz");
			} else if(isDivided(i, 5)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i + "");
			}
		} 
	}
	
	@Test
	public void testStageTwo() {
		for (int i = 1; i <= 100; i++) {
			if((isDivided(i, 3) && isDivided(i, 5)) || (isContains(i, 3) && isContains(i, 5))) {
				System.out.println("FizzBuzz");
			} else if(isDivided(i, 3) || isContains(i, 3)) {
				System.out.println("Fizz");
			} else if(isDivided(i, 5) || isContains(i, 5)) {
				System.out.println("Buzz");
			} else {
				System.out.println(i + "");
			}
		} 
	}
	
	private boolean isDivided(Integer number, Integer divideNum) {
		return number % divideNum == 0;
	}
	
	private boolean isContains(Integer number, Integer containsNum) {
		return number.toString().indexOf(containsNum.toString()) > -1;
	}
}

}
