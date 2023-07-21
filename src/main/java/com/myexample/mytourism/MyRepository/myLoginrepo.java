package com.myexample.mytourism.MyRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.myexample.mytourism.MyModel.UserLogin;
import com.myexample.mytourism.MyModel.Userenquiry;

public interface myLoginrepo extends JpaRepository<UserLogin ,String>{
//     UserLogin findByUsernameAndEmail(String username, String email);
//login user history custom query
 @Query("SELECT e FROM Userenquiry e WHERE e.email = :email")
 List<Userenquiry> getPackageHistoryForUser(@Param("email") String email);

 UserLogin findByEmail(String email);
 


}

