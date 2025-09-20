package day.nine.assignment;

import java.util.Scanner;

class AuthenticationException extends Exception{
    public AuthenticationException(String message){
        super(message);
    }
}

public class LoginSystem {
    public void login(String username,String password) throws AuthenticationException {
        String validUsername = "vishnu";
        String validPassword = "12345";
        if(!username.equals(validUsername) || !password.equals(validPassword)){
            throw  new AuthenticationException("Invalid Username Or Password");
        }else{
            System.out.println("Login Successful");
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String getUsername=sc.nextLine();
        System.out.println("Enter your password");
        String getPassword=sc.nextLine();

        try{
            new LoginSystem().login(getUsername, getPassword);
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
