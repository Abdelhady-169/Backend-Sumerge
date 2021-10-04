package com.codebind;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Future;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.Set; 

public class booking 
{
	@Size(min = 3, max = 100, message= "Name must range from 3 and 100 characters")
	private String Name;
	
	@Min(value = 0, message = "Age should be positive")
	private int Age;
	
	@Pattern(regexp = "(?=.*[0-9]).+", message = "Must contain building number")
    @Pattern(regexp = "(?=.*[A-z]).+", message = "Must contain street name")
    private String Address;
	
	@Email(message = "Email should be valid")
	private String Email;
	
	@Size(min = 3, max = 100, message= "Doctor's name must range from 3 and 100 characters")
	String doctorName;
	
	@Future(message= "Must be a date in the present or in the future")
	private Date bookingDate;
	
	public void setName(String Name) {
		this.Name=Name;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName=doctorName;
	}
	
	public void setAge(int Age) {
		this.Age=Age;
	}
	
	public void setEmail(String Email) {
		this.Email=Email;
	}
	
	public void setDate(Date bookingDate) {
		this.bookingDate=bookingDate;
	}
	
	public void setAddress(String Address) {
		this.Address=Address;
	}
		
    public static void main( String[] args ) throws Exception
    {
    	
    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    	javax.validation.Validator validator = factory.getValidator();
    	
        booking slot = new booking();
        slot.setName("Abdelhady");
        
        //invalid
        slot.setDoctorName("Po"); //less than 3 characters	
        
        slot.setAge(-22); //is negative
        
        slot.setEmail("sumerge.com"); //not a valid email	
        
        String date = "6/Nov/1999";	 //past dates invalid
        Date dateParam = new SimpleDateFormat("dd/MMM/yyyy").parse(date); 
        slot.setDate( dateParam );
        
        slot.setAddress( "56" ); //incorrect format requires characters for street name ex        
        
        Set<ConstraintViolation<booking>> violations = validator.validate(slot);
        for (ConstraintViolation<booking> violation : violations) {
        	System.out.println(violation.getMessage()); 
        }
    }
}