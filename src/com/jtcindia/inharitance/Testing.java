package com.jtcindia.inharitance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Testing {
public static void main(String[]args) {
	try {
	Configuration cfg=new Configuration();
	cfg.configure("Hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	Student stu=new Student(111,"JTC","Noida","Online",18000.00);
	CurrentStudent cst=new CurrentStudent(222,"Delhi","Noida sec2","Online",19000.00,"10000","10am-12pm","patna");
	WeekdayStudent wdstu=new WeekdayStudent(333,"Delhi","Noida sec2","Online",19000.00,"10000","10am-12pm","patna","B.E","55%","2017");
	WeekendStudent westu=new WeekendStudent(444,"Delhi","Noida sec2","Online",19000.00,"10000","10am-12pm","patna","jio","kutumbh@care",21000.00);
	OldStudent ostu=new OldStudent(555,"JTC","Noida","Online",18000.00,"Reliance Jio","bimlesh@123",21000.00);
	session.save(stu);
	session.save(cst);
	session.save(wdstu);
	session.save(westu);
	session.save(ostu);
	tx.commit();
	session.close();
	sf.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	
	System.out.println("Record Inserted Successfully");
}
}
