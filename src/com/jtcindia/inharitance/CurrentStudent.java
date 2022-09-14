package com.jtcindia.inharitance;

public class CurrentStudent extends Student {
private String feebal;
private String timing;
private String branch;
public CurrentStudent() {
	super();
	// TODO Auto-generated constructor stub
}
public CurrentStudent(int sid, String sname, String city, String status, double totalfee,String feebal, String timing, String branch) {
	super(sid, sname, city, status, totalfee);
	this.feebal = feebal;
	this.timing = timing;
	this.branch = branch;
}
public String getFeebal() {
	return feebal;
}
public void setFeebal(String feebal) {
	this.feebal = feebal;
}
public String getTiming() {
	return timing;
}
public void setTiming(String timing) {
	this.timing = timing;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
}
