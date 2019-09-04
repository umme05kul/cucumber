package demo;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class second {
	@Given("user in home page")
	public void user_in_home_page() {
	    System.out.println("user name in home page");
	}

	@When("user enters credential")
	public void user_enters_credential(io.cucumber.datatable.DataTable dt) {
	    List<Map<String,String>>list=dt.asMaps();
	    System.out.println(list.get(0).get("username"));
	    System.out.println(list.get(0).get("password"));
	}

	@When("click on login button")
	public void click_on_login_button() {
	    System.out.println("login");
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("homepage");
	}


}
