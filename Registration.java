package com.syntax.groupHW2;
//create registration class
//varaibles: email, userName, and password
public class Registration {

    private String email;
    private String userName;
    private String password;
    //set email
    void setEmail(String email){
        if(email.contains("yahoo")){
            System.out.println(email+ " is a valid email");
        }else{
            System.out.println(email+" is an invalid email");
        }

    }
    //set Username
    void setUserName(String userName){
        this.userName=userName;

        if(userName.isEmpty()){
            System.out.println("Userename cannot be empty");
        }else if(userName.length()<6){
            System.out.println("Username must have more than 6 characters");
        }else{
            System.out.println("Username is valid");
        }
    }
    //set Password
    void setPassword(String password){
        this.password=password;

        if(password.isEmpty()){
            System.out.println("Password cannot be empty");
        }else if(password.length()<6){
            System.out.println("Password must be more than 6 characters");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain Username");
        }else{
            System.out.println("Password is valid");
        }
    }
}
