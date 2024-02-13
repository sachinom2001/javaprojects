package com.xworkz.email.boot;

import com.xworkz.email.entity.EmailEntity;
import com.xworkz.email.repository.EmailRepository;
import com.xworkz.email.repository.EmailRepositoryImpl;

public class Runner {

    public static void main(String[] args) {

        EmailEntity email = new EmailEntity(
                2,"sachinom@gmail.com","gagana@gmail.com","Product Launch","2024-01-23",true);
        EmailRepository emailRepository = new EmailRepositoryImpl();
        emailRepository.save(email);
    }
}
