package com.jtcindia.inharitance;

public class WeekdayStudent extends CurrentStudent {
private String qualification;
private String percentage;
private String yop;
public WeekdayStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public WeekdayStudent(int sid, String sname, String city, String status, double totalfee, String feebal, String timing,
		String branch,String qualification, String percentage, String yop) {
	super(sid, sname, city, status, totalfee, feebal, timing, branch);
	this.qualification = qualification;
	this.percentage = percentage;
	this.yop = yop;
}
public String getQualification() {
	return qualification;
}
public void setQualification(String qualification) {
	this.qualification = qualification;
}
public String getPercentage() {
	return percentage;
}
public void setPercentage(String percentage) {
	this.percentage = percentage;
}
public String getYop() {
	return yop;
}
public void setYop(String yop) {
	this.yop = yop;
}
}
