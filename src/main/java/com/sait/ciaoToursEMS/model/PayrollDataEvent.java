package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

/**
 * PayrollDataEvent
 * A nested event class for the PayrollData class.
 */
@Entity
@Table(name = "payroll_data_event")
public class PayrollDataEvent {
    /**
     * The event id. This is the primary key.
     * This is a generated value.
     */
    @Id
    @GeneratedValue
    @Column(name = "event_id")
    private long eventId;

    /**
     * The event description.
     */
    @Column(name = "event_description")
    private String eventDescription;

    /**
     * Default constructor.
     */
    public PayrollDataEvent(){}

    /**
     * Constructor.
     * @param eventDescription The event description.
     * @param eventId The event id.
     */
    public PayrollDataEvent(long eventId, String eventDescription) {
        this.eventId = eventId;
        this.eventDescription = eventDescription;
    }

    /**
     * Getter for eventId.
     * @return The event id.
     */
    public long getEventId() {
        return eventId;
    }

    /**
     * Setter for eventId.
     * @param eventId The event id.
     */
    public void setEventId(long eventId) {
        this.eventId = eventId;
    }

    /**
     * Getter for eventDescription.
     * @return The event description.
     */
    public String getEventDescription() {
        return eventDescription;
    }

    /**
     * Setter for eventDescription.
     * @param eventDescription The event description.
     */
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