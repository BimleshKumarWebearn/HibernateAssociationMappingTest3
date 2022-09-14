package com.jtcindia.inharitance;

public class OldStudent extends Student {
private String oldcompany;
private String oldemail;
private double oldctc;
public OldStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public OldStudent(int sid, String sname, String city, String status, double totalfee,String oldcompany, String oldemail, double oldctc) {
	super(sid, sname, city, status, totalfee);
	this.oldcompany = oldcompany;
	this.oldemail = oldemail;
	this.oldctc = oldctc;
}
public String getOldcompany() {
	return oldcompany;
}
public void setOldcompany(String oldcompany) {
	this.oldcompany = oldcompany;
}
public String getOldemail() {
	return oldemail;
}
public void setOldemail(String oldemail) {
	this.oldemail = oldemail;
}
public double getOldctc() {
	return oldctc;
}
public void setOldctc(double oldctc) {
	this.oldctc = oldctc;
}
}
