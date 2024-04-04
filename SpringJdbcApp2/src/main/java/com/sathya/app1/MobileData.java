package com.sathya.app1;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class MobileData {
private JdbcTemplate jt;

public MobileData() {
	super();
}

public JdbcTemplate getJt() {
	return jt;
}

public void setJt(JdbcTemplate jt) {
	this.jt = jt;
}

public void createtable() {
jt.execute("create table mobiledetails(modelno number,modelname varchar2(40),ram_size varchar2(30),"
		+ "rom_size varchar2(30),osname varchar2(30),"
		+ "processorname varchar2(30),glass_type varchar2(30),f_cam varchar2(30),"
		+ "b_cam varchar2(30),imeino varchar2(30),company_name varchar2(30),price number,description varchar2(50))");	
System.out.println("table creataed");
}
public void dataInsert() {

  /* jt.update("insert into mobiledetails values(1001,'k12','4gb','64gb','windows','superfast','uitrahd','20mp','64mp','5141514hs',"
   		+ "'oppo',20000,'very good product dont buy')");

   jt.update("insert into mobiledetails values(1002,'k13','6gb','128gb','windows','noramlfast','hd','30mp','54mp','5146366hs',"
   		+ "'vivo',430000,'very good product please buy')");
   jt.update("insert into mobiledetails values(1003,'h525','8gb','100gb','ios','doublefast','ultrahd','10mp','154mp','3535hdd',"
	   		+ "'samsung',50000,'very good')");
	   		
	 jt.update("insert into mobiledetails values(1004,'hshs22','10gb','164gb','windowsplus','snapdragon','sd','30mp','94mp','73737hh',"
		   		+ "'hp',70000,'very good product parledu')");
	 jt.update("insert into mobiledetails values(1005,'ksissj21','1gb','14gb','android','dragonsnap','sdhd','540mp','194mp','7727hsh',"
		   		+ "'infinix',21000,'nice product')");*/
	 jt.update("insert into mobiledetails values(1006,'jgfa3223','98gb','149gb','superandroid','spring','hdultra','730mp','84mp','kis82d',"
		   		+ "'apple',2000,'konukko nice product')");
   System.out.println("data inserted");
}
public void updateDetails() {
	//jt.update("update mobiledetails set modelno=939393 where modelname='k12'");
	jt.update("update mobiledetails set modelno='1006' where modelname='k12'");
	System.out.println("data updated");
}
public void deleteDetails() {
	jt.update("delete from mobiledetails where modelno=1006");
	System.out.println("data deleted");
}
public void getonerecord() {
List t=   jt.queryForList("select * from mobiledetails where modelno=1002");
	t.stream()
	.forEach(System.out::println);
}
public void getallrecord() {
	List t=   jt.queryForList("select * from mobiledetails");
//	Iterator itr=t.iterator();
//	while (itr.hasNext()) {
//		 Object o=  itr.next();
//		System.out.println(o);
//	}
//	
	t.stream()
	.forEach(System.out::println);
}
























}
