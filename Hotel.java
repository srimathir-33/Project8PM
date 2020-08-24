package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass 
{

	public Hotel()
	 
	{
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='username']")
	public  WebElement userName;
	@FindBy(xpath = "//input[@id='password']")
	public  WebElement password;
	
	@FindBy(xpath = "//input[@id='login']")

	public  WebElement btn;
	
	@FindBy(xpath = "//select[@id='location']")
	public WebElement location;
	@FindBy(xpath = "//select[@id='hotels']")
	public WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']")
	public WebElement roomtype;
	@FindBy(xpath = "//select[@id='room_nos']")
	public WebElement roomno;
	@FindBy(xpath = "//input[@id='datepick_in']")
	public WebElement checkIn;
	@FindBy(xpath = "//input[@id='datepick_out']")
	public WebElement checkOut;
	@FindBy(xpath = "//select[@id='adult_room']")
	public WebElement adultRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	public WebElement childRoom;

	@FindBy(xpath = "//input[@id='Submit']")
	public WebElement submit;
	@FindBy(xpath = "//input[@id='Reset']")
	public WebElement reset;
@FindBy(id="radiobutton_0")
public WebElement radioBtn;
@FindBy(id="continue")
public WebElement continueBtn;
@FindBy(id="cancel")
public WebElement cancel;
@FindBy(name="first_name")
public WebElement first_name;
@FindBy(name="last_name")
public WebElement last_name;

@FindBy(name="address")
public WebElement address;
@FindBy(name="cc_num")
public WebElement cc_num;
@FindBy(xpath = "//select[@id='cc_type']")
public WebElement cc_type;

@FindBy(xpath = "//select[@id='cc_exp_month']")
public WebElement cc_exp_month;
@FindBy(xpath = "//select[@id='cc_exp_year']")
public WebElement cc_exp_year;


@FindBy(name="cc_cvv")
public WebElement cc_cvv;
@FindBy(name="book_now")
public WebElement book_now;

@FindBy(name="order_no")
public WebElement order_no;


	public WebElement getOrder_no() {
	return order_no;
}

public void setOrder_no(WebElement order_no) {
	this.order_no = order_no;
}

	public WebElement getBook_now() {
	return book_now;
}

public void setBook_now(WebElement book_now) {
	this.book_now = book_now;
}

	public WebElement getRadioBtn() {
	return radioBtn;
}

public void setRadioBtn(WebElement radioBtn) {
	this.radioBtn = radioBtn;
}

public WebElement getContinueBtn() {
	return continueBtn;
}

public void setContinueBtn(WebElement continueBtn) {
	this.continueBtn = continueBtn;
}

public WebElement getCancel() {
	return cancel;
}

public void setCancel(WebElement cancel) {
	this.cancel = cancel;
}

public WebElement getFirst_name() {
	return first_name;
}

public void setFirst_name(WebElement first_name) {
	this.first_name = first_name;
}

public WebElement getLast_name() {
	return last_name;
}

public void setLast_name(WebElement last_name) {
	this.last_name = last_name;
}

public WebElement getAddress() {
	return address;
}

public void setAddress(WebElement address) {
	this.address = address;
}

public WebElement getCc_num() {
	return cc_num;
}

public void setCc_num(WebElement cc_num) {
	this.cc_num = cc_num;
}

public WebElement getCc_type() {
	return cc_type;
}

public void setCc_type(WebElement cc_type) {
	this.cc_type = cc_type;
}

public WebElement getCc_exp_month() {
	return cc_exp_month;
}

public void setCc_exp_month(WebElement cc_exp_month) {
	this.cc_exp_month = cc_exp_month;
}

public WebElement getCc_exp_year() {
	return cc_exp_year;
}

public void setCc_exp_year(WebElement cc_exp_year) {
	this.cc_exp_year = cc_exp_year;
}

public WebElement getCc_cvv() {
	return cc_cvv;
}

public void setCc_cvv(WebElement cc_cvv) {
	this.cc_cvv = cc_cvv;
}

	public WebElement getLocation() {
		return location;
	}

	public void setLocation(WebElement location) {
		this.location = location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public void setHotels(WebElement hotels) {
		this.hotels = hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(WebElement roomtype) {
		this.roomtype = roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public void setRoomno(WebElement roomno) {
		this.roomno = roomno;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public void setCheckIn(WebElement checkIn) {
		this.checkIn = checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public void setCheckOut(WebElement checkOut) {
		this.checkOut = checkOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public void setAdultRoom(WebElement adultRoom) {
		this.adultRoom = adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public void setChildRoom(WebElement childRoom) {
		this.childRoom = childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

	public WebElement getReset() {
		return reset;
	}

	public void setReset(WebElement reset) {
		this.reset = reset;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getBtn() {
		return btn;
	}

	public void setBtn(WebElement btn) {
		this.btn = btn;
	}
	
	
}
