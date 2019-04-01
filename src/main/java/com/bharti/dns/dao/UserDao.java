package com.bharti.dns.dao;

 

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.bharti.dns.model.Note;
import com.bharti.dns.model.User;
import com.bharti.dns.utility.HibernateUtil;

 

@Repository

public class UserDao implements IUserDao {
               

                public User validateUser(String id, String pwd) {
                                Session session = HibernateUtil.getSessionFactory().openSession();

                                Transaction tr = session.beginTransaction();

                                Query query = session.createQuery("from User where username ='" + id

                                                                + "' and password ='" + pwd + "'");

 

                                User user1 = (User) query.uniqueResult();

                                tr.commit();

                                session.close();

                                if (user1 != null) {
                                                return user1;

                                } else {
                                                return user1;

                                }

                }

 

                public boolean updateUser(String name, String username, String pass) {
                               

                                Session session = HibernateUtil.getSessionFactory().openSession();

                                Transaction tr = session.beginTransaction();

                                Query query = session.createQuery("from User where username ='" + username +"'");

                                User user1 = (User) query.uniqueResult();

                                if (user1 != null) {
                                                return false;

                                } else {
                                                User user =new User();

                                                user.setName(name);

                                                user.setUsername(username);

                                                user.setPassword(pass);

                                                user.setRole(0);

                                                session.saveOrUpdate(user);

                                                tr.commit();

                                                session.close();

                                                return true;

                                }

                }

 

                public boolean updateNotedao(String title, String description) {
                                Session session = HibernateUtil.getSessionFactory().openSession();

                                Transaction tr = session.beginTransaction();

                                Query query = session.createQuery("from Note where title ='" + title +"'");

                                Note note1 = (Note) query.uniqueResult();

 

                                if (note1 != null) {
                                                return false;

                                } else {
                                                Note note=new Note();

                                                String pattern="yyyy-MM-dd HH:mm:ss";

                                                SimpleDateFormat sf=new SimpleDateFormat(pattern);

                                                String time=sf.format(new Date());

                                note.setTitle(title);

                                note.setDescription(description);

                                note.setCreated_time(time);

                                session.saveOrUpdate(note);

                                tr.commit();

                                session.close();

                                return true;

                }

}

 

                public List<Note> getNoteData() {
                                Session session = HibernateUtil.getSessionFactory().openSession();

                                Transaction tr = session.beginTransaction();

                                List<Note> list = new ArrayList<Note>();

                                Query query = session.createQuery("from Note");

                                list = query.list();

                                //System.out.println("Dao>>>>>>>>>>>>>>>>>>>>list>>>>>>>"+list);

                                tr.commit();

                                session.close();

                                return list;

                }

 

                public void updateNoteDataDao(String ptime,String title, String created_time,

                                                String description) {
                                Session session = HibernateUtil.getSessionFactory().openSession();

                                Transaction tr = session.beginTransaction();

                                String pattern="yyyy-MM-dd HH:mm:ss";

                                SimpleDateFormat sf=new SimpleDateFormat(pattern);

                                String time=sf.format(new Date());

                                session.createSQLQuery("UPDATE note SET title='"+title+"',created_time='"+created_time+"',description='"+description+"',updated_time='"+time+"' where title='"+ptime+"'").executeUpdate();

                                tr.commit();

                                session.close();

                               

                }



				public void deleteNoteDataDao(String title) {
					// TODO Auto-generated method stub
					Session session = HibernateUtil.getSessionFactory().openSession();

                    Transaction tr = session.beginTransaction();

                    session.createSQLQuery("DELETE FROM note where title='"+title+"'").executeUpdate();

                    tr.commit();

                    session.close();
				}

               

               

}
