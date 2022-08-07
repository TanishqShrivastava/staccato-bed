package com.staccato.authenticator.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.staccato.authenticator.domain.AuthUserModel;

@Repository
public interface AuthRepository extends JpaRepository<AuthUserModel, String>{

}
