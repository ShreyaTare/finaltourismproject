package com.myexample.mytourism.MyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myexample.mytourism.MyModel.Userenquiry;
import com.myexample.mytourism.MyRepository.myEnquiryrepo;

@Service
public class myenquireser {
    public myenquireser(myEnquiryrepo myenq) {
        this.myenq = myenq;
    }

    public List<Userenquiry> getPackageHistoryForUser(String email) {
        // Implement the method to fetch the package history for the user with the given email.
        // You can use the userEnquiryRepository to query the database for the package history.
        // For example (assuming you are using Spring Data JPA):
        return myenq.findByEmail(email);
    }
    
    

    //enquiry form
    @Autowired
    private myEnquiryrepo myenq;
    public void enquiryAdd(Userenquiry userenquiry){
        myenq.save(userenquiry);
    }

     //contact us detail as feedback
    public List<Userenquiry> getAll(){
        return myenq.findAll();
    }

    //search bar using keyword
    public List<Userenquiry> search(String keyword) {
        return myenq.findByKeyword(keyword, null);
    }

    // public List<Userenquiry> getPackageHistoryForUser(String email) {
    //     return null;
    // }
         
    // public List<Userenquiry> getPackageHistoryForUser(String email) {
    //     return myenq.findByEmail(email);
    // }   
        
    
        // public List<Userenquiry> getPackageHistoryForUser(String email) {
        //     return myenq.findByEmail(email);
        // }
    
        

}
