package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private long eventId;

    @Column(name = "event_description")
    private String eventDescription;


}