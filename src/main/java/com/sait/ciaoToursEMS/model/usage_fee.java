package com.sait.ciaoToursEMS.model;

import javax.persistence.*;
import java.time.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "usage_fee")
public class usage_fee {
    @Id
    @GeneratedValue
    @Column(name = "usage_fee_id" )
    private long usage_fee_id  ;
    @Column(name = "usage_cost" )
    private float usage_cost;
    @Column(name = "office_usage" )
    private String office_usage;

    public usage_fee(long usage_fee_id, float usage_cost, String office_usage) {
        this.usage_fee_id = usage_fee_id;
        this.usage_cost = usage_cost;
        this.office_usage = office_usage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof usage_fee)) return false;
        usage_fee usage_fee = (usage_fee) o;
        return getUsage_fee_id() == usage_fee.getUsage_fee_id() && Float.compare(usage_fee.getUsage_cost(), getUsage_cost()) == 0 && Objects.equals(getOffice_usage(), usage_fee.getOffice_usage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsage_fee_id(), getUsage_cost(), getOffice_usage());
    }

    public long getUsage_fee_id() {
        return usage_fee_id;
    }

    public void setUsage_fee_id(long usage_fee_id) {
        this.usage_fee_id = usage_fee_id;
    }

    public float getUsage_cost() {
        return usage_cost;
    }

    public void setUsage_cost(float usage_cost) {
        this.usage_cost = usage_cost;
    }

    public String getOffice_usage() {
        return office_usage;
    }

    public void setOffice_usage(String office_usage) {
        this.office_usage = office_usage;
    }

    @Override
    public String toString() {
        return "usage_fee{" +
                "usage_fee_id=" + usage_fee_id +
                ", usage_cost=" + usage_cost +
                ", office_usage='" + office_usage + '\'' +
                '}';
    }
}
