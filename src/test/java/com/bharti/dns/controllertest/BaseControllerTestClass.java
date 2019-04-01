package com.bharti.dns.controllertest;

import javax.servlet.http.HttpServletRequest;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

import com.bharti.dns.controller.BaseController;
import com.bharti.dns.model.User;

public class BaseControllerTestClass extends TestCase {

	public void testLogin() {
		
		 BaseController base=new BaseController();

         HttpServletRequest request = null;

         ModelAndView model1 = base.login(null, "eci", "ems", request);

         assertEquals("ModelAndView: reference to view with name 'login'; model is {error=Please enter the correct details}",model1 );

	}

	public void testSignUpController() {
		
		 BaseController base=new BaseController();
		 User user1=null;

         HttpServletRequest request = null;

         ModelAndView model1 = base.signUpController(user1, "ems", "nms", "ems", request);

         assertEquals("model",model1 );

	}

	
}
