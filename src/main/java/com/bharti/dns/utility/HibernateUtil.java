package com.bharti.dns.utility;

 

//import org.apache.log4j.Logger;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

 

public class HibernateUtil {
                private static SessionFactory sessionFactory;

                private static ServiceRegistry serviceRegistry;

// private static final Logger LOGGER = Logger.getLogger(HibernateUtil.class);

 

                static {
                                try {
                                                // Configuration configuration = new Configuration();

                                                Configuration configuration = new Configuration().configure();

 

                                                serviceRegistry = new ServiceRegistryBuilder().applySettings(

                                                                                configuration.getProperties()).buildServiceRegistry();

                                                sessionFactory = configuration.buildSessionFactory(serviceRegistry);

                                } catch (HibernateException he) {
// LOGGER.error("Error creating Session: " + he);

                                                throw new ExceptionInInitializerError(he);

                                }

                }

 

                public static SessionFactory getSessionFactory() {
                                return sessionFactory;

                }

}
