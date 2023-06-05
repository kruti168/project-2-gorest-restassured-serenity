package com.gorest.userinfo;

import com.gorest.testbase.UserTestBase;
import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;

//@Concurrent(threads = "4x")
@UseTestDataFrom("src/test/java/resources/testdata/userinfo.csv")
@RunWith(SerenityParameterizedRunner.class)
public class CreateUserDataDriven extends UserTestBase {

    private Integer id;
    private String name;
    private String email;
    private String gender;
    private String status;

    @Steps
    UserSteps userSteps;

    @Title("Data driven test for adding multiple users")
    @Test
    public void createMultipleUsers(){

        userSteps.createUser(name,email,gender,status);
    }
}
