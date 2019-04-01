package com.bharti.dns.controller;

 

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bharti.dns.model.Note;
import com.bharti.dns.service.IUserService;
import com.bharti.dns.service.UserService;

 

@Controller

public class UserController {
               

                IUserService userservice=new UserService();

               

                @RequestMapping(value = "/createnote",method=RequestMethod.POST)

                public ModelAndView createController() {
                                ModelAndView model = new ModelAndView();

                                model.setViewName("create_note");

                                return model;

                }
                
                

               

                @RequestMapping(value = "/notesubmit",method=RequestMethod.POST)

                public ModelAndView noteController(@RequestParam("title") String title,

                                                @RequestParam("description") String description,

                                                HttpServletRequest request){
                                ModelAndView model = new ModelAndView();

                                boolean flag=userservice.updateNote(title,description);

                               

                                if(flag==false)

                                                model.addObject("error", "Title already exist");

                                else

                                                model.addObject("error", "Note Submitted successfully");

                               

                                model.setViewName("create_note");

                                return model;

                }

               

                @RequestMapping(value = "/viewnote",method=RequestMethod.GET)

                public ModelAndView viewnoteController() {
                                ModelAndView model = new ModelAndView();

                                List<Note> list=userservice.getNote();

                                model.addObject("list", list);

                                model.setViewName("viewnote");

                                return model;

                }

               

                @RequestMapping(value = "/updatenotes")

                public ModelAndView updnoteController(@RequestParam("title") String title,

                                                @RequestParam("created_time") String created_time,@RequestParam("updated_time") String updated_time

                                                ,@RequestParam("description") String description,

                                                HttpServletRequest request) {
                                ModelAndView model = new ModelAndView();

                               

                                model.addObject("title", title);

                                model.addObject("created_time", created_time);

                                model.addObject("updated_time", updated_time);

                                model.addObject("description", description);

                                model.setViewName("createupdate_note");

                                return model;

                }

               

                @RequestMapping(value = "/updatenotesubmit")

                public ModelAndView updnoteController1(@RequestParam("title") String title,

                                                @RequestParam("created_time") String ctime

                                                ,@RequestParam("description") String description,

                                                HttpServletRequest request) {
                                ModelAndView model = new ModelAndView();

                                String created_time=ctime.split(",,,")[0].trim();

                                String ptime=ctime.split(",,,")[1].trim();

                                System.out.println(ptime);

                                userservice.updateNotesData(ptime,title,created_time,description);

                               

                                model.setViewName("redirect:/viewnote");

                                return model;

                }
                
                @RequestMapping(value = "/deletenotes")

                public ModelAndView deleteteController1(@RequestParam("title") String title,
                                                HttpServletRequest request) {
                                ModelAndView model = new ModelAndView();
                                userservice.deleteNotesData(title);

                               

                                model.setViewName("redirect:/viewnote");

                                return model;

                }

 

}
