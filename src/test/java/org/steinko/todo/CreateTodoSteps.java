package org.steinko.todo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.post;

public class CreateTodoSteps {
	
	@Given("following todos exist:")
	public void following_todos_exist(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	}

	@When("I enter a description {string}")
	public void i_enter_a_description(String string) {
	}

	@When("I eneter target date {int}-{int}-{int}")
	public void i_eneter_target_date(Integer int1, Integer int2, Integer int3) {
	}

	@When("I activate the create todo command")
	public void i_activate_the_create_todo_command() {
		String uri="http://localhost:8080";
		RestAssured.baseURI = uri;	
		 given().
		    pathParam("decription", "Fix kjakk").
	        pathParam("targetDate", 01-01-2020).
	        pathParam("isCompleted", false ).
	      when().
	         post("/user/Stein/todo").
	      then().
	         log().
	            body().
	         statusCode(200);
	}

	@Then("following details is displayed for the todos")
	public void following_details_is_displayed_for_the_todos(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}
	
	@Given("I am loged in in as user {string}")
	public void i_am_loged_in_in_as_user(String string) {
	    
	   
	}

	@Given("I select the todo with description {string}")
	public void i_select_the_todo_with_description(String string) {
	    
	}

	@Then("following todos is displayed:")
	public void following_todos_is_displayed(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
	}



}
