package com.ibm.demo.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "offers")


public class offerService {
	@Id
	private String id;
	private String userPhone;
    private String userName;
    private String userAccId;
     private String offerid; 
	
     public offerService(){}

     
     public offerService(String userPhone, String userName,String userAccId,String offerid) {
         this.userPhone = userPhone;
         this.userName = userName;
         this.userAccId = userAccId;
         this.offerid = offerid;
     }
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public String getuserAccId() {
		return userAccId;
	}

	public void setuserAccId(String userAccId) {
		this.userAccId = userAccId;
	}
  
	
	public String getuserPhone() {
		return userPhone;
	}

	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	
	public String getofferid() {
		return offerid;
	}

	public void setofferid(String offerid) {
		this.offerid = offerid;
	}
	
	
	
	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	

	
	
	
}
