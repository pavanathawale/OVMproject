package com.online.voting.OVM.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.online.voting.OVM.Model.UserLogin;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Integer> {

}
