package com.xworkz.email.repository;

import com.xworkz.email.entity.EmailEntity;

public interface EmailRepository {

    Integer save(EmailEntity entity);
}
