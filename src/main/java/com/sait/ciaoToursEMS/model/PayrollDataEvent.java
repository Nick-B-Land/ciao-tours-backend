package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "payroll_data_event")
public class PayrollDataEvent {
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private long eventId;

    @Column(name = "event_description")
    private String eventDescription;

    public PayrollDataEvent(){}

    public PayrollDataEvent(long eventId, String eventDescription) {
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
        if (!(o instanceof PayrollDataEvent)) return false;
        PayrollDataEvent that = (PayrollDataEvent) o;
        return eventId == that.eventId &&
                Objects.equals(eventDescription, that.eventDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, eventDescription);
    }

    @Override
    public String toString() {
        return "PayrollDataEvent{" +
                "eventId=" + eventId +
                ", eventDescription='" + eventDescription + '\'' +
                '}';
    }
}