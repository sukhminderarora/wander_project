package com.bharti.dns.daotest;

 

import junit.framework.TestCase;
import com.bharti.dns.utility.HibernateUtil;

import com.bharti.dns.dao.UserDao;
import com.bharti.dns.model.User;

 

public class UserdaoTest extends TestCase {
 

                public void testValidateUser() {
                                UserDao base=new UserDao();

                                User user=base.validateUser("anthony", "give it up");

                                User user1=null;

                                assertEquals(user1, user );

                }

               

                public void testValidate() {
                                UserDao base=new UserDao();

                                User user=base.validateUser("bash sic", "inthis");

                                User user1=null;

                                assertEquals(user1, user );

                }

               

                public void testValidateuser() {
                                UserDao base=new UserDao();

                                User user=base.validateUser("ring", "postitup");

                                User user1=null;

                                assertEquals(user1, user );

                }
                
                public void updateuser() {
                    UserDao base=new UserDao();

                    boolean user=base.updateUser("xyz", "admin","xyz");

                    assertEquals("false", user );
                    }
                
                public void updateuse() {
                    UserDao base=new UserDao();

                    boolean user=base.updateUser("abc", "ain","abc");

                    assertEquals("true", user );
                    }
                
                
                public void updateuser1() {
                    UserDao base=new UserDao();

                    boolean user=base.updateUser("user", "myuser","@123");

                    assertEquals("true", user );
                    }
 

 

}
