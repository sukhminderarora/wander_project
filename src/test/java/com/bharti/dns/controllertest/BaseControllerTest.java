package com.bharti.dns.controllertest;

 

import javax.servlet.http.HttpServletRequest;

import junit.framework.TestCase;

import org.springframework.web.servlet.ModelAndView;

import com.bharti.dns.controller.BaseController;

 

public class BaseControllerTest extends TestCase {
 

                public void testLogin() {
                                BaseController base=new BaseController();

                                HttpServletRequest request = null;

                                ModelAndView model1 = base.login(null, "eci", "ems", request);

                // ModelAndView model = null;

                                assertEquals("ModelAndView: reference to view with name 'login'; model is {error=Please enter the correct details}",model1 );

                }

 

               

 

}
