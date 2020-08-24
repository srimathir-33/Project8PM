package org.test;

import org.apache.poi.util.SystemOutLogger;

public class SubClass extends Hotel 
{
	public static void main(String[] args) throws Throwable {
		
		
		
		
		
		launchBrowser();
		loadUrl("http://adactinhotelapp.com/");
		SubClass sc = new SubClass();
		insert(sc.getUserName(),"srimathi");
		insert(sc.getPassword(),"Sairam@33");
		click(sc.getBtn());
		selectByVisibleText(sc.getLocation(),"Sydney");
		selectByVisibleText(sc.getHotels(),"Hotel Creek");
		selectByVisibleText(sc.getRoomtype(),"Standard");

		selectByVisibleText(sc.getRoomno(),"2 - Two");
		insert(sc.getCheckIn(),"21/08/2020");
		insert(sc.getCheckOut(),"23/08/2020");
		selectByVisibleText(sc.getAdultRoom(),"2 - Two");
		selectByVisibleText(sc.getChildRoom(),"1 - One");
click(sc.getSubmit());
click(sc.getRadioBtn());
click(sc.getContinueBtn());
insert(sc.getFirst_name(),"Srimathi");
insert(sc.getLast_name(),"Naveen");
insert(sc.getAddress(),"Newyork");
insert(sc.getCc_num(),"4234567812341234");
selectByVisibleText(sc.getCc_type(),"American Express");

selectByVisibleText(sc.getCc_exp_year(),"2022");
selectByVisibleText(sc.getCc_exp_month(),"January");

insert(sc.getCc_cvv(),"345");
click(sc.getBook_now());
Thread.sleep(2000);
getAttribute(sc.getOrder_no(),"value");
	}
	

}
