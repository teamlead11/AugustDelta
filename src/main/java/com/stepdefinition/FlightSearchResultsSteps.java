package com.stepdefinition;

import org.junit.Assert;

import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Then;

public class FlightSearchResultsSteps extends FunctionalLibrary{

	@Then("^The user should be in search results page$")
	public void the_user_should_be_in_search_results_page() throws Throwable {
		Assert.assertEquals("Airline Tickets & Flights: Book Direct with Delta Air Lines - Official Site", driver.getTitle());
	}
}
