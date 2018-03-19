package com.testrepogit.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestRepoGitImpl {
 private static final String dateFormat = "dd/MM/yyyyy";
 private static final SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
 public boolean isSeniorCitizen(Date dob) {
	 return false;
 }
 
 public boolean isInfant(String dobOfinfant) throws ParseException {
	Date dob  = sdf.parse(dobOfinfant);
	Date currentDate = new Date();
	Long diff = dob.getTime() - currentDate.getTime();
	long days = TimeUnit.DAYS.convert(diff, TimeUnit.MICROSECONDS);
	int years = (int) (days/12);
	if(years < 3) {
		return true;
	}
	return false;
	 
 }
}
