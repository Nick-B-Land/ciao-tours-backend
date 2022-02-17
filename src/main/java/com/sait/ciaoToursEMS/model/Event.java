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

    public Event(){}

    public Event(long eventId, String eventDescription) {
        this.eventId = eventId;
        this.eventDescription = eventDescription;
    }

    public long getEventId() {
        return eventId;
    }

    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event)) return false;
        Event event = (Event) o;
        return getEventId() == event.getEventId() && Objects.equals(getEventDescription(), event.getEventDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventId(), getEventDescription());
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}