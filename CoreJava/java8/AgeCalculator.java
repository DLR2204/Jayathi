package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		
		LocalDate birthdate = LocalDate.of(2003, 10,10 );
		
		Period p = Period.between(birthdate, currentDate);
		
		System.out.printf("Your age is %d years %d months %d days",p.getYears(),p.getMonths(),p.getDays());
		 
	}

}
