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
    private long event_id;
    @Column(name = "Event_description")
    private String Event_description;


}