package com.myexample.mytourism.MyController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myexample.mytourism.MyModel.UserLogin;
import com.myexample.mytourism.MyModel.Usercontatct;
import com.myexample.mytourism.MyModel.Userenquiry;
import com.myexample.mytourism.MyModel.Usersignup;
import com.myexample.mytourism.MyService.myenquireser;
import com.myexample.mytourism.MyService.myservice;

@Controller
public class demoController {

    // @PostMapping("/welcome")
    // public String welcome(@ModelAttribute User user, Model model) {
    // // System.out.println(User.toString());
    // //model.addAttribute("name", user.getName());
    // List<User> records = demo.getAll();
    // model.addAttribute("records", records);
    // demo.Add(user);
    // return "redirect:/";
    // }

    // Main page (home) index.html
    @GetMapping("/")
    public String myhomepage() {
        return "index";
    }

    // Aboutus page
    @GetMapping("/abtus")
    public String myabout() {
        return "aboutus";
    }

    @GetMapping("/servicee")
    public String servicemy() {
        return "services";
    }

    @GetMapping("/form")
    public String myenquiry() {
        return "enquiry";
    }

    @GetMapping("/pkg")
    public String mypackage() {
        return "package";
    }

    @GetMapping("/contct")
    public String contactus() {
        return "contactus";
    }

    @GetMapping("/loginn")
    public String mylogin() {
        return "login";
    }

    @GetMapping("/history")
    public String history() {
        return "viewpkghistory";
    }

    @Autowired
    myservice ser;

    @PostMapping("/cntme")
    public String contus(@ModelAttribute Usercontatct usercontact, Model model) {
        List<Usercontatct> records = ser.getAll();
        model.addAttribute("records", records);
        ser.Addcontact(usercontact);
        return "redirect:/cntmelist";
    }

    @GetMapping("/cntmelist")
    public String contactlist(@ModelAttribute Usercontatct usercontact, Model model) {

        List<Usercontatct> records = ser.getAll();
        model.addAttribute("records", records);
        return "contactus";
    }

    // @PostMapping("/uslogin")
    // public String userloggin(@ModelAttribute UserLogin userlogin, Model model) {
    //     ser.loginuser(userlogin);
    //     // System.out.println(userlogin.toString());
    //     String result = userlogin.getEmail();
    //     model.addAttribute("result", result);
    //     return "package";
    // }
    
@PostMapping("/uslogin")
public String userloggin(@ModelAttribute UserLogin userlogin,Model model) {
    // Assuming ser.loginuser(userlogin) returns true for a successful login.
    boolean loginSuccessful = ser.loginuser(userlogin);

    if (loginSuccessful) {
        String loggedInUserEmail = userlogin.getEmail();
        String result = userlogin.getEmail();
        model.addAttribute("result", result);

        return "redirect:/dashboard?email=" + loggedInUserEmail;
    } else {
        // Handle unsuccessful login, for example, redirect to the login page with an error message.
        return "redirect:/uslogin?error=1"; // Replace "/login" with the URL of your login page.
    }

     

}




@GetMapping("/dashboard")
    public String showDashboard(@RequestParam(name = "email") String email, Model model) {
        
        List<Userenquiry> packageHistory = enqser.getPackageHistoryForUser(email);
        model.addAttribute("packageHistory", packageHistory);

        return "userhistory"; 
    }


  

// @GetMapping("/dashboard")
// public String showDashboard(Userenquiry userenquiry, UserLogin userlogin, Model model) {
//     String loggedInUserEmail = userlogin.getEmail();

//     // Check if loggedInUserEmail is null or empty before accessing it.
//     if (loggedInUserEmail != null && !loggedInUserEmail.isEmpty()) {
//         model.addAttribute("result", loggedInUserEmail);

//         // Compare the emails using .equals() to check for content equality
//         if (loggedInUserEmail.equals(userenquiry.getEmail())) {
//             // Emails match, so fetch the package history for the logged-in user.
//             List<Userenquiry> packageHistory = enqser.getPackageHistoryForUser(loggedInUserEmail);
//             model.addAttribute("packageHistory", packageHistory);
//         }
//     } else {
        
//         return "redirect:/login"; // Replace "/login" with the URL of your login page.
//     }

//     return "userhistory"; // Replace "userhistory" with the appropriate view name for your dashboard page.
// }




    // @GetMapping("/dashboard/{email}")
    // public ResponseEntity<List<Userenquiry>> showDashboard(@RequestParam(name = "email") String email) {
    //     // Implement the logic to fetch the package history for the provided email
    //     List<Userenquiry> packageHistory = enqser.getPackageHistoryForUser(email);

    //     // Return the package history as a response (for demonstration purposes)
    //     return ResponseEntity.ok(packageHistory);
    // }






      // Check if the email is already registered

    @PostMapping("/signn")
    public String processSignup(@ModelAttribute Usersignup usersignup, Model model) {
        // Check if the email is already registered
        if (ser.isEmailAlreadyRegistered(usersignup.getEmail())) {
            model.addAttribute("error", "Email is already registered. Please use a different email.");
            return "signup"; // Redirect back to the signup page with an error message
        }

        // Email is not registered, proceed with user registration
        ser.signuser(usersignup);
        return "redirect:/loginn"; // Redirect to the login page
    }

    @GetMapping("/signnup")
    public String mysign() {
        return "signup";
    }

    @Autowired
    myenquireser enqser;

    @PostMapping("/enqry")
    public String enquiryhere(@ModelAttribute Userenquiry userenquiry) {
        // System.out.println(userenquiry);
        enqser.enquiryAdd(userenquiry);
        return "redirect:/his";
    }

    @GetMapping("/his")
    public String allpackagehistory(@ModelAttribute Userenquiry userenquiry, Model model) {
        List<Userenquiry> records = enqser.getAll();
        model.addAttribute("records", records);
        return "viewpkghistory";
    }

    @GetMapping("/search")
    public String search(@RequestParam(name = "keyword") String keyword, Model model) {
        List<Userenquiry> records = enqser.search(keyword);
        model.addAttribute("records", records);
        return "viewpkghistory";
    }

    // user package history

    // public String allpackagehistory(Model model) {
    // String loggedInUserEmail = ser.getLoggedInUserEmail();
    // if (loggedInUserEmail != null) {
    // List<Userenquiry> records =
    // enqser.getPackageHistoryForUser(loggedInUserEmail);
    // model.addAttribute("records", records);
    // return "viewpkghistory";
    // } else {
    // return "redirect:/loginn"; // Redirect to the login page if the user is not
    // logged in
    // }
    // }

    // @GetMapping("/dashboard")
    // public String showDashboard(HttpServletRequest request, Model model) {
    // if (ser.isLoggedIn(request)) {
    // // User is logged in, retrieve the email from the session
    // HttpSession session = request.getSession(false);
    // String email = (String) session.getAttribute("email");

    // // Use the email to fetch the package history for the logged-in user
    // List<Userenquiry> packageHistory = ser.getPackageHistoryForUser(email);
    // model.addAttribute("packageHistory", packageHistory);

    // return "dashboard"; // Replace "dashboard" with the appropriate dashboard
    // page
    // } else {
    // // User is not logged in, redirect to the login page
    // return "redirect:/loginn";
    // }
    // }

}
