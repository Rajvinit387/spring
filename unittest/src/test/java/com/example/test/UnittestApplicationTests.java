package com.example.test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.intThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UnittestApplicationTests {
	
	private calculator calculator = new calculator();

	@Test
	void contextLoads() {
		
		
		
	}
	
	
	
	@Test
	@Disabled
	void testsum()
	{
		int expectedresult=26;
		
		
		int actualresult= calculator.dosum(12, 8, 6);
		
		
		assertThat(actualresult).isEqualTo(expectedresult);
	}
	
	@Test
	void  comparenum()
	{
	Boolean x=	calculator.compare(0, 0);
	assertThat(x).isTrue();
	}

}
