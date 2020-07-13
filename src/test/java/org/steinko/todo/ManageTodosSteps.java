package org.steinko.todo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.containsString;

public class ManageTodosSteps {
	
	@Given("Todos Exists In the System")
	public void todos_exists_in_the_system() {
		String uri = "http://localhost:8080";
		RestAssured.baseURI = uri;	  
	    when().
	    get("/hello-world").
	    then().
	    body(containsString("Hello World"));
	}

	@When("I activate the get todos command")
	public void i_activate_the_get_todos_command() {
	    
	}

	@Then("I get todo details  id: {int}")
	public void i_get_todo_details_id(Integer int1) {
	   
	}

	@Then("user name: Stein")
	public void user_name_stein() {
	   
	}

	@Then("description Fix mutter")
	public void description_fix_mutter() {
	   
	}

	@Then("target date {int}-{int}-{int}")
	public void target_date(Integer int1, Integer int2, Integer int3) {
	    
	}

	@Then("if the task is done false")
	public void if_the_task_is_done_false() {
	   
	}

	@Then("user name: Oddmund")
	public void user_name_oddmund() {
	   
	}

	@Then("description Fix kjak")
	public void description_fix_kjak() {
	    
	}



}
