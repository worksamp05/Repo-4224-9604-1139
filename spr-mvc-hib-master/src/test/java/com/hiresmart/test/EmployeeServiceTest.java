package com.hiresmart.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.hiresmart.model.Employee;
import com.hiresmart.service.EmployeeService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"file:src/main/webapp/WEB-INF/config/sdnext-servlet-test.xml"})
public class EmployeeServiceTest{
	
	@Autowired
	private EmployeeService employeeService;
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void testHomePage() throws Exception {
		String response = employeeService.sayHello("Rahul");
		Assert.assertNotNull(response);
	}

	@Test
	public void testGetEmployee() throws Exception {
		Employee employee = employeeService.getEmployee(2);
		Assert.assertNotNull(employee);
	}
	
}
