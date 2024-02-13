package com.xworkz.email.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "email")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class EmailEntity {

    @Id
    @Column(name = "e_id")
    private int id;

    @Column(name = "e_senderEmail")
    private String senderEmail;

    @Column(name = "e_recipientEmail")
    private String recipientEmail;

    @Column(name = "e_subject")
    private String subject;

    @Column(name = "e_sentDate")
    private String sentDate;

    @Column(name = "e_success")
    private boolean success;
}
