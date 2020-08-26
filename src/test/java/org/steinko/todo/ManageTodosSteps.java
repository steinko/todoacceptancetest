package org.steinko.todo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.containsString;

import io.restassured.path.json.JsonPath;
import static io.restassured.path.json.JsonPath.with;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.springframework.beans.factory.annotation.Autowired;



public class ManageTodosSteps {
	String respons;
	
	@Autowired
	StepSharing sharing;
	
	@Given("I am loged in as user {string}")
	public void i_am_loged_in_as_user(String string) {
	    
	}


	@Given("the description for the todos in the application for user {string} is displayed as:")
	public void the_description_for_the_todos_in_the_application_for_user_is_displayed_as(String string, io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	
	}

	
	@Then("description for the todos display:")
	public void description_for_the_todos_display(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		String uri="http://localhost:8080";
		RestAssured.baseURI = uri;	
		 respons = 
	      when().
	         put("/users/Stein/todo").
	      then().
	         log().
	            body().
	         statusCode(200).
		  extract().asString();
	    throw new io.cucumber.java.PendingException();
	}


	@When("I activate the get todos command")
	public void i_activate_the_get_todos_command() {
		
		//String uri = "https://todobackend-dot-springboot22.ew.r.appspot.com"; 
		String uri="http://localhost:8080";
		RestAssured.baseURI = uri;	
		 respons = 
	      when().
	         get("/users/Stein/todos").
	      then().
	         log().
	            body().
	         statusCode(200).
		  extract().asString();
		
	    
	}

	
	@Then("description Fix mutter")
	public void description_fix_mutter() {
		assertEquals(JsonPath.with(respons).get("[0].description"), "Fix mutter");
	   
	}

	@Then("target date {int}-{int}-{int}")
	public void target_date(Integer day, Integer month, Integer year) {
		String targetDate = with(respons).get("[0].targetDate");
		
		String aDay = targetDate.substring(0,2);
		String aMonth = targetDate.substring(3,5);
		String aYear = targetDate.substring(6,10);
		
		Integer iDay = Integer.parseInt(aDay);
		System.out.print(iDay);
		Integer iMonth = Integer.parseInt(aMonth);
		System.out.print(iMonth);
		Integer iYear = Integer.parseInt(aYear);
		System.out.print(iYear);
		
		assertEquals(day,iDay);
		assertEquals(month,iMonth);
		assertEquals(year,iYear);
	}


	@Then("description Fix kjakk")
	public void description_fix_kjakk() {
		
		assertEquals(JsonPath.with(respons).get("[1].description"), "Fix kajakk");
	    
	}
	

	
	@Then("description Learn React")
	public void description_learn_react() {
	   
	}
	
	
	@Then("following todos is displayed")
	public void following_todos_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


	
	




}
