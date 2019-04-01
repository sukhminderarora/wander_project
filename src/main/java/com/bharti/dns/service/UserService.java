package com.bharti.dns.service;

 

import java.util.List;

import org.springframework.stereotype.Service;

import com.bharti.dns.dao.IUserDao;
import com.bharti.dns.dao.UserDao;
import com.bharti.dns.model.Note;
import com.bharti.dns.model.User;

 

@Service

public class UserService implements IUserService {
               

                IUserDao userdao=new UserDao();

               

                public User checkuserlogin(String username, String password) {
                                return userdao.validateUser(username,password);

                }

 

                public boolean checkSignup(String name, String username, String pass) {
                               

                                return userdao.updateUser(name,username,pass);

                }

 

                public boolean updateNote(String title, String description) {
                                return userdao.updateNotedao(title,description);

                               

                }

 

                public List<Note> getNote() {
                               

                                return userdao.getNoteData();

                }

 

                public void updateNotesData(String ptime,String title, String created_time,

                                                String description) {
                                userdao.updateNoteDataDao(ptime,title,created_time,description);

                               

                }



				public void deleteNotesData(String title) {
					// TODO Auto-generated method stub
					userdao.deleteNoteDataDao(title);
				}

 

               

 

 

 

}
