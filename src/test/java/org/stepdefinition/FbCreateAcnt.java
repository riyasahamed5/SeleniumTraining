package org.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.SignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class FbCreateAcnt extends Baseclass {
	
SignInPojo s;

@Given("To launch browser and maximixe")
public void to_launch_browser_and_maximixe() {
	launchBrowser();
	windowMaximize();
    
}

@When("To launch the url of facebok")
public void to_launch_the_url_of_facebok() {
   launchUrl("https://www.facebook.com/login/"); 
}

@When("To click the create new account button")
public void to_click_the_create_new_account_button() {
	s= new SignInPojo();
	clickBtn(s.getCreateNew());
    
}

@When("To pass firstname in first name field")
public void to_pass_firstname_in_first_name_field(DataTable  d) {
	List<String> l = d.asList();	
	s= new SignInPojo();
	passText(l.get(2), s.getFirst());
    
}

@When("To pass secname in secname field")
public void to_pass_secname_in_secname_field() {
	s = new SignInPojo();
	passText("ahamed", s.getSecond());
   
}

@When("To pass the mobile number in the text box")
public void to_pass_the_mobile_number_in_the_text_box(DataTable d) {
	List<List<String>> l = d.asLists();
	s = new SignInPojo();
	passText(l.get(1).get(2), s.getMobile());
    }

@When("To pass the password in password field")
public void to_pass_the_password_in_password_field() {
	s = new SignInPojo();
	passText("Rat@1345",s.getPass());
   
}

@Then("To close the browser")
public void to_close_the_browser() {
	//closeEntireBrowser();
    
}



}
