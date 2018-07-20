package com.linkedin.learning.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ReservationRequest {

    private Long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;

    public ReservationRequest() {

    }

    public ReservationRequest(Long id, LocalDate checkin, LocalDate checkout) {

        this.id = id;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
