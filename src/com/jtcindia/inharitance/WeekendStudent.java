package com.jtcindia.inharitance;

public class WeekendStudent extends CurrentStudent {
private String wcompany;
private String wemail;
private double wctc;
public WeekendStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public WeekendStudent(int sid, String sname, String city, String status, double totalfee, String feebal, String timing,
		String branch,String wcompany, String wemail, double wctc) {
	super(sid, sname, city, status, totalfee, feebal, timing, branch);
	this.wcompany = wcompany;
	this.wemail = wemail;
	this.wctc = wctc;
}
public String getWcompany() {
	return wcompany;
}
public void setWcompany(String wcompany) {
	this.wcompany = wcompany;
}
public String getWemail() {
	return wemail;
}
public void setWemail(String wemail) {
	this.wemail = wemail;
}
public double getWctc() {
	return wctc;
}
public void setWctc(double wctc) {
	this.wctc = wctc;
}
}
