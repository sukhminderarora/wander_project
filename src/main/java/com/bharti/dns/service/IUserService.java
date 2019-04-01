package com.bharti.dns.service;

 

import java.util.List;

import com.bharti.dns.model.Note;
import com.bharti.dns.model.User;

 

public interface IUserService {
               

                public User checkuserlogin(String username, String password);

 

                public boolean checkSignup(String name, String username, String pass);

 

                public boolean updateNote(String title, String description);

 

                public List<Note> getNote();

 

                public void updateNotesData(String ptime,String title, String created_time,

                                                String description);



				public void deleteNotesData(String title);

 

               

 

               

 

}

 

