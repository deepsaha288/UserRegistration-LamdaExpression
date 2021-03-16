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
    public void firstName_checkValidation_ture() {
        boolean result = user.checkFirstName.validate("Deep");
        Assertions.assertTrue(result);

    }

    @Test
    public void firstName_checkValidate_false() {
        boolean result = user.checkLastName.validate("Dee123");
        Assertions.assertFalse(result);
    }

}
