package com.webservices.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class employee 
{
	long empId;
	String name;
	String designation;
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	int year;
	public long getEmpId() {
		return empId;
	}
	
	public employee()
	{
		
	}
	
	public employee(long empId,String name,String designation,int year)
	{
		this.empId=empId;
		this.name=name;
		this.designation=designation;
		this.year=year;
	}
	
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
