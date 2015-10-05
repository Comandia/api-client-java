package com.comandia.api.rest.v1.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParameter implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static final DateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");
	private Date date;
	
	public DateParameter(Date date) {
		this.date= date;
	}
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static DateParameter valueOf(String dateString) {
        Date _date = null;
		try {
            _date = new Date(dateString); // yes, I know this is a deprecated method
        } catch(Exception e) {
            try{
            	_date = DATE_FORMAT.parse(dateString);
            }catch(Exception ex){
            	
            }
        }
        return new DateParameter(_date);
    }

   
    // Constructor, Getters, Setters
}
