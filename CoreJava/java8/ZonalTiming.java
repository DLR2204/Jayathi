package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTiming {
	
	public static void main(String[] args) {
		
		ZoneId zone = ZoneId.of("US/Central");
		
		ZonedDateTime time =ZonedDateTime.now(zone);
		
		System.out.println(time);
		
		System.out.println("\n \n \n");
		
		
		
		Set<String> values = ZoneId.getAvailableZoneIds();
		
		for(String set :values) {
			System.out.println(set);
		}
	}

}
