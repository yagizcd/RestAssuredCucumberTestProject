package com.hotelreservations.services;

import com.hotelreservations.models.Auth;
import com.hotelreservations.models.Booking;
import com.hotelreservations.models.BookingDates;
import com.hotelreservations.models.BookingResponse;
import com.hotelreservations.utils.TestDataFactory;
import com.sun.net.httpserver.Request;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class ReservationService extends BaseTest {

    public String createToken() {
        Auth authbody = new Auth("admin","password123");


        Response tokenResponse = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(authbody)
                .post("/auth");

        return tokenResponse.jsonPath().getJsonObject("token");
    }

    public BookingResponse createBooking(Booking body){

        Response createBookingResponse = given(spec)
                .contentType(ContentType.JSON)
                .when()
                .body(body)
                .post("/booking");

        createBookingResponse
                .then()
                .statusCode(HttpStatus.SC_OK);

        return createBookingResponse.as(BookingResponse.class);
    }

    public void deleteReservation(String token, int bookingId){
        Response deleteResponse = given(spec)
                .contentType(ContentType.JSON)
                .header("Cookie","token="+token)
                .when()
                .delete("/booking/"+bookingId);

        deleteResponse.then()
                .statusCode(HttpStatus.SC_CREATED);
    }

}
