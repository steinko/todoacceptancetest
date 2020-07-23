package org.steinko.todo;

import org.springframework.stereotype.Component;
import io.cucumber.spring.ScenarioScope;
import io.restassured.filter.session.SessionFilter;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@ScenarioScope
public class StepSharing {
	
	private SessionFilter sessionFilter;
	private String info;
	
	@Autowired
	FakeDataSource datasource;
		
	public StepSharing() {
		
	      sessionFilter = new SessionFilter();
	      info = "";
    }
	
	public SessionFilter getSessionFilter() {
		return sessionFilter;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	public String getUrl() {
		return datasource.getUrl();
	}

}
