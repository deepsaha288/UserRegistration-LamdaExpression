package com.lamda;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {

    UserRegistration user;
    boolean result;
    String[] allEmails;

    @BeforeEach
    public void setup(){

        user = new UserRegistration();

    }

 @Test
    public void lastName_checkValidation_ture() {
        boolean result = user.checkLastName.validate("Saha");
        Assertions.assertTrue(result);


    }
    @Test
    public void lastName_CheckValidation_false(){
        boolean result = user.checkLastName.validate("Sha");
        Assertions.assertTrue(result);

    }
   @Test
    public void Email_checkValidation_True(){

        boolean result = user.checkEmail.validate("deepsaha9@gmail.com");
        Assertions.assertTrue(result);

     }
    @Test
    public void Email_checkValidation_False(){

        boolean result = user.checkEmail.validate("deepsaha9@123gmail.com");
        Assertions.assertTrue(result);


    }
   @Test
    public void MobileNumber_validation_True() {

        boolean result = user.checkMobileNum.validate("91 9916522077");
        Assertions.assertTrue(result);


    }
    @Test
    public void MobileNumber_validation_False() {

        boolean result = user.checkMobileNum.validate("123456789666");
        Assertions.assertFalse(result);

   }

}
