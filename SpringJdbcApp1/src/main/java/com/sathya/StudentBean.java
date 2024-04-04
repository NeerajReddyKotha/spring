package com.sathya;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentBean {
private JdbcTemplate jt;

public StudentBean() {
}

public JdbcTemplate getJt() {
	return jt;
}

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public void detais() {
	jt.execute("create table studentbean1(id number,name varchar2(30),email varchar2(30),address varchar2(30))");
	System.out.println("table created");
} 
public void insertmethod() {
int i=	jt.update("insert into studentbean1 values(101,'kishan','kishan@gamil.com','warangal')");
int i1=jt.update("insert into studentbean1 values(102,'rudra','rudra@gmail.com','hanamkonda')");
jt.update("insert into studentbean1 values(103,'bhavani','bhavani@gmil.com','hasanparthy')");
jt.update("insert into studentbean1 values(104,'prasad','prasad@gmail.com','nagaram')");
jt.update("insert into studentbean1 values(105,'chintu','chintu@gmail.com','assam')");
	System.out.println("data inserted:");
}
public void updatemethod() {
	int i=jt.update("update studentbean1 set email='chimtu@gmail.com' where id=105");
	System.out.println("data updated ");
}
public void deleterecord() {
	jt.update("delete from studentbean1 where id=104");
	System.out.println("data deleted");
}
public void getonerecord() {
List l=	jt.queryForList("select * from studentbean1 where id=105");
Iterator itr=l.iterator();
while (itr.hasNext()) {
	Object o=itr.next();
	System.out.println(o.toString());
	}
}
public void getallrecord() {
List l=	jt.queryForList("select * from studentbean1");
l.stream()
.forEach(e->System.out.println(e.toString()));
}
}
