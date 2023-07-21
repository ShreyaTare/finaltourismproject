package com.myexample.mytourism.MyService;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.myexample.mytourism.MyModel.UserLogin;
import com.myexample.mytourism.MyModel.Usercontatct;

import com.myexample.mytourism.MyModel.Usersignup;
import com.myexample.mytourism.MyRepository.myLoginrepo;
import com.myexample.mytourism.MyRepository.myRepository;
import com.myexample.mytourism.MyRepository.mySignuprepo;



@Service
public class myservice {
    @Autowired
    myRepository myrepo;

    public void Addcontact(Usercontatct usercontact){
        myrepo.save(usercontact);
    }

    //contact us detail as feedback
    public List<Usercontatct> getAll(){
        return myrepo.findAll();
    }

    @Autowired
    mySignuprepo mysignrepo;

    public void signuser(Usersignup usersignup){
        mysignrepo.save(usersignup);
    }

    //checkuser signed it or not using email
    public boolean isEmailAlreadyRegistered(String email) {
        Usersignup existingUser = mysignrepo.findByEmail(email);
        return existingUser != null;
    }
    
    
   



    //userlogin
    @Autowired
    myLoginrepo mylogin;
    public boolean loginuser(UserLogin userlogin){
        mylogin.save(userlogin);
        return true;
        
    }

    public void newloginuser(UserLogin userlogin){
        mylogin.save(userlogin);
    }
    
    // public boolean isLoggedIn(HttpServletRequest request) {
    //     HttpSession session = request.getSession(false);
    //     return session != null && session.getAttribute("loggedInUserEmail") != null;
    // }
    
    // public boolean logeduser(UserLogin userlogin) {
    //     // Check if the provided email and password match the login credentials in the database
    //     UserLogin loggedInUser = mylogin.findByEmail(userlogin.getEmail());

    //     if (loggedInUser != null && loggedInUser.getPassword().equals(userlogin.getPassword())) {
    //         return true; // Login successful
    //     } else {
    //         return false; // Login failed
    //     }
    // }
      
    // public void addUserLoginIfNotPresent(UserLogin userlogin) {
    //     UserLogin existingUser = mylogin.findByEmail(userlogin.getEmail());

    //     if (existingUser == null) {
    //         // User with the given email does not exist in the database, add the user
    //         mylogin.save(userlogin);
    //     } else {
    //         // User with the given email already exists, update the username and password if necessary
    //         if (!existingUser.getUsername().equals(userlogin.getUsername())) {
    //             existingUser.setUsername(userlogin.getUsername());
    //         }
    //         if (!existingUser.getPassword().equals(userlogin.getPassword())) {
    //             existingUser.setPassword(userlogin.getPassword());
    //         }
    //         mylogin.save(existingUser);
    //     }
    // }

    public UserLogin getUserByEmail(String email) {
        return mylogin.findByEmail(email);
    }
    
    public void registerUser(UserLogin userlogin) {
        mylogin.save(userlogin);
    }



    ///////////////////////////////
  
   
     




}
