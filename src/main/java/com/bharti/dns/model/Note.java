package com.bharti.dns.model;

 

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

 

@Entity

@Table(name = "note")

public class Note implements Serializable{
               

                @Id

                @GenericGenerator(name = "generator", strategy = "increment")

                @GeneratedValue(generator = "generator")

                @Column(name="sr_no")

                int sr_no;

               

                @Column(name = "title")

                private String title;

               

                @Column(name = "description")

                private String description;

               

                @Column(name = "created_time")

                private String created_time;

               

                @Column(name = "updated_time")

                @Temporal(TemporalType.TIMESTAMP)

                Date updated_time;

 

               

 

                public int getSr_no() {
                                return sr_no;

                }

 

                public void setSr_no(int sr_no) {
                                this.sr_no = sr_no;

                }

 

                public String getTitle() {
                                return title;

                }

 

                public void setTitle(String title) {
                                this.title = title;

                }

 

                public String getDescription() {
                                return description;

                }

 

                public void setDescription(String description) {
                                this.description = description;

                }

 

               

 

                public String getCreated_time() {
                                return created_time;

                }

 

                public void setCreated_time(String created_time) {
                                this.created_time = created_time;

                }

 

                public Date getUpdated_time() {
                                return updated_time;

                }

 

                public void setUpdated_time(Date updated_time) {
                                this.updated_time = updated_time;

                }

 

               

 

}
