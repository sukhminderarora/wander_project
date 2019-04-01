package com.bharti.dns.dao;

 

import java.util.List;

import com.bharti.dns.model.Note;
import com.bharti.dns.model.User;

 

public interface IUserDao {
               

                public User validateUser(String username, String password);

 

                public boolean updateUser(String name, String username, String pass);

 

                public boolean updateNotedao(String title, String description);

 

                public List<Note> getNoteData();

 

                public void updateNoteDataDao(String ptime,String title, String created_time,

                                                String description);



				public void deleteNoteDataDao(String title);

 

               

 

// public User updateUser(String name, String username, String pass);

 

}
