package com.webservices.services;

import java.util.ArrayList;
import java.util.List;

import com.webservices.model.employee;

public class EmployyServices 
{ List<employee> emp=new ArrayList<employee>();
	
	public List<employee> addEmp()
	{
	//throw new DataNotFoundException("not found");
	 employee emp1=new employee(1, "ank2014", "SSE",2014);
	 employee emp2=new employee(2, "anki2015", "SSE",2015);
	 employee emp3=new employee(3, "anki2016", "SSE",2016);
	 emp.add(emp1);
	 emp.add(emp2);
	 emp.add(emp3);
	 
	 return emp;
	}
	
	
 
 
}
