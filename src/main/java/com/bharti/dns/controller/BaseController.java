package com.bharti.dns.controller;

 

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharti.dns.model.User;
import com.bharti.dns.service.IUserService;
import com.bharti.dns.service.UserService;

 

@Controller

public class BaseController {
 

               

                IUserService userservice = new UserService();

               

               

 

                @RequestMapping(value = "/login" ,method = RequestMethod.POST)

                public ModelAndView login(@ModelAttribute User user,@RequestParam("inputUsername") String username,

                                                @RequestParam("inputPassword") String password,

                                                HttpServletRequest request) {
 

                                ModelAndView model = new ModelAndView();

                                User user1 = userservice.checkuserlogin(username, password);

                               

                                if (user1 == null) {
                                                model.addObject("error", "Please enter the correct details");

                                                model.setViewName("login");

                                } else if (user1.getRole() == 0) {
                                                HttpSession session = request.getSession(false);

                                                session.setAttribute("user", "0");

                                                session.setAttribute("username", username);

                                                session.setAttribute("password", password);

                                                model.addObject("name", user1.getName());

                                                model.setViewName("userpanel");

                                }

                                else{
                                                model.addObject("error", "Please enter the correct details");

                                                model.setViewName("login");

                                }

                               

                                return model;

 

                }

               

                @RequestMapping(value = "/signup", method = RequestMethod.POST)

                public ModelAndView signUpController(@ModelAttribute User user,@RequestParam("inputName") String name,@RequestParam("inputUsername") String username,

                                                @RequestParam("inputPassword") String pass, HttpServletRequest request) {
                                ModelAndView model = new ModelAndView();

                               

                                boolean flag=userservice.checkSignup(name,username,pass);

                               

                                if(flag==false)

                                                model.addObject("error", "Username already exist");  

                                else

                                                model.addObject("error", "Successfully Registered. Kindly Login");

                               

                                model.setViewName("signup");

                                return model;

 

                }

 

                @RequestMapping(value = "/", method = RequestMethod.GET)

                public ModelAndView homePageController() {
                                ModelAndView model = new ModelAndView();

                                model.setViewName("login");

                                return model;

 

                }

 

                @RequestMapping(value = "/logout", method = RequestMethod.GET)

                public ModelAndView logout(HttpServletRequest req, HttpServletResponse res) throws IOException {
                                ModelAndView model = new ModelAndView();

                               

                // PrintWriter out=res.getWriter();

                                HttpSession session = req.getSession(false);

                                session.removeAttribute("user");

                                session.removeAttribute("getRole");

                                if (session != null) {
                                                session.removeAttribute("user");

                                                session.removeAttribute("getRole");

                                                session.removeAttribute("username");

                                                session.removeAttribute("password");

                                                session.invalidate();

                                               

                                                model.setViewName("login");

                                               

                                }

                               

                                return model;

                }

 

 

}
