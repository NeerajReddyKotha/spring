package com.sathya.app3;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class ProductDetails {
private JdbcTemplate jt;

public ProductDetails() {
	super();
}
public JdbcTemplate getJt() {
	return jt;
}
public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}
public void createtable() {
	jt.execute("create table productbean(proid number,proname varchar2(15),price number,quantity number,"
			+ "companyname varchar2(20),description varchar2(20))");
	System.out.println("table created");
}
public void insertvalues() {
//	jt.update("insert into productbean values(101,'mobile',20000,1,'oppo','good proccesor')");
jt.update("insert into productbean values(102,'laptop',30000,3,'lenovo','nice product')");
	//jt.update("insert into productbean values(103,'tv',220000,4,'samsung','good quality')");
int i=jt.update("insert into productbean values(102,'laptop',30000,3,'lenovo','nice product')");

	System.out.println("data inserted:"+i);
}
public void updaterecords() {
	jt.update("update productbean set proname='ac',companyname='godrej' where proid=103");
	System.out.println("data updated");
}
public void deleterecords() {
	jt.update("delete from productbean where proid=102");
	System.out.println("data deleted");
}
public void getonerecord() {
List L=	jt.queryForList("select * from productbean where proid=101");
L.stream()
 .forEach(e->System.out.println(e));
}
public void getallrecord() {
List L=	jt.queryForList("select * from productbean");
L.stream()
 .forEach(e->System.out.println(e));
}
}
