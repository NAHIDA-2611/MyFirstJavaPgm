package com.citibank.main.domain;

import java.util.Objects;

public class Customer {
    private int cutomerID;
    private String name, city;

    public Customer() {
        // TODO Auto-generated constructor stub
    }

 

    public Customer(int cutomerID, String name, String city) {
        super();
        this.cutomerID = cutomerID;
        this.name = name;
        this.city = city;
    }

 

    public int getCutomerID() {
        return cutomerID;
    }

 

    public void setCutomerID(int cutomerID) {
        this.cutomerID = cutomerID;
    }

 

    public String getName() {
        return name;
    }

 

    public void setName(String name) {
        this.name = name;
    }

 

    public String getCity() {
        return city;
    }

 

    public void setCity(String city) {
        this.city = city;
    }
    
    

    @Override
	public int hashCode() {
    	System.out.println("in hasout");
		return Objects.hash(city, cutomerID, name);	
	
    }



	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(city, other.city) && cutomerID == other.cutomerID && Objects.equals(name, other.name);
	}



	@Override
    public String toString() {
        // TODO Auto-generated method stub
        return ("ID : "+cutomerID+ ", Name :"+name+ ", City: "+city);
    }

}