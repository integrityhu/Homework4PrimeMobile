package hu.infokristaly.back.domain;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SystemUser {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;
    
    public int getAge() {
        Date now = new Date(); 
        Calendar newCDate = new GregorianCalendar();
        newCDate.setTime(now);
        Period period = birthday.until(LocalDate.of(newCDate.get(Calendar.YEAR), newCDate.get(Calendar.MONTH), newCDate.get(Calendar.DAY_OF_MONTH)));        
        return period.getYears();
    }
    
	public SystemUser() {
		
	}
}
