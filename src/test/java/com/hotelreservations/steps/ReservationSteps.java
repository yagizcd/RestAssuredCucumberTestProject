package com.hotelreservations.steps;

import com.hotelreservations.models.Booking;
import com.hotelreservations.models.BookingResponse;
import com.hotelreservations.services.ReservationService;
import com.hotelreservations.utils.TestDataFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ReservationSteps {

    ReservationService reservationService;
    String authKey;
    BookingResponse bookingResponse;
    Booking booking;
    TestDataFactory testDataFactory = new TestDataFactory();


    @Given("User creates a new reservations")
    public void startCall(){
        reservationService = new ReservationService();
    }

    @Given("User adds informations necessary for reservation")
    public void createAuth(){
        authKey = reservationService.createToken();
    }

    @When("User creates a reservation")
    public void createReservations(){
        booking = testDataFactory.returnBody();
        bookingResponse = reservationService.createBooking(booking);
    }

    @Then("Reservations created succesfully")
    public void assertReservation(){
        Assertions.assertEquals(this.booking.getFirstname(),bookingResponse.getBooking().getFirstname());
    }

    @Then("User deletes reservation")
    public void deleteReservation(){
        reservationService.deleteReservation(authKey,bookingResponse.getBookingid());
    }
}
