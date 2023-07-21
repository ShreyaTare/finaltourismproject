package com.myexample.mytourism.MyRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.myexample.mytourism.MyModel.Userenquiry;

public interface myEnquiryrepo extends JpaRepository<Userenquiry , Integer> {
    @Query("SELECT e FROM Userenquiry e WHERE e.name LIKE %:keyword% OR e.spackage LIKE %:keyword% OR e.id = :id")
List<Userenquiry> findByKeyword(@Param("keyword") String keyword, @Param("id") Integer id);

 List<Userenquiry> findByEmail(String email);


 //login user history custom query
 @Query("SELECT e FROM Userenquiry e WHERE e.email = :email")
 List<Userenquiry> getPackageHistoryForUser(@Param("email") String email);

     

    
}


    



