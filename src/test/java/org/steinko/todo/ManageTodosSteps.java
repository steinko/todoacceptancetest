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
	
	

	@When("I activate the get todos command")
	public void i_activate_the_get_todos_command() {
		String uri = "http://localhost:8080";
		RestAssured.baseURI = uri;	
		 respons = 
	      when().
	         get("/users/stein/todos").
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
		String targetDate = with(respons).get("[1].targetDate");
		
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
		
		assertEquals(JsonPath.with(respons).get("[1].description"), "Fix Kajakk");
	    
	}
	
	@Given("user {string}")
	public void user(String string) {
	    
	}


	@Then("target date <date>")
	public void target_date_date() {
	    
	}
	
	@Then("if the task is done <isCompleted>")
	public void if_the_task_is_done_is_completed() {
		assertFalse(JsonPath.with(respons).getObject("[0].isDone", Boolean.class));
	}

	@Then("description Fix kjakkk")
	public void description_fix_kjakkk() {
		assertEquals(JsonPath.with(respons).get("[1].description"), "Fix kajakk");
	    
	}

	
	




}
