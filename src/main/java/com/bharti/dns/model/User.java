package com.bharti.dns.model;

 

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

 

@Entity

@Table(name = "login")

public class User implements Serializable {
 

                private static final long serialVersionUID = 1L;

               

                @Column(name = "name")

                private String name;

 

                @Id

                @Column(name = "username")

                private String username;

 

                @Column(name = "password")

                private String password;

 

                @Column(name = "role")

                @Value("${some.key.0}")

                int role;

 

                public String getName() {
                                return name;

                }

 

                public void setName(String name) {
                                this.name = name;

                }

 

                public String getUsername() {
                                return username;

                }

 

                public void setUsername(String username) {
                                this.username = username;

                }

 

                public String getPassword() {
                                return password;

                }

 

                public void setPassword(String password) {
                                this.password = password;

                }

 

                public int getRole() {
                                return role;

                }

 

                public void setRole(int role) {
                                this.role = role;

                }

}
