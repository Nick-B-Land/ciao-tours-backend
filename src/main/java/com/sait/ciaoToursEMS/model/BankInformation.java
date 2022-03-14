package com.sait.ciaoToursEMS.model;

import javax.persistence.Embeddable;

@Embeddable
public class BankInformation {

    private long institutionID;

    private long bankAccountNumber;

    private long transitNumber;

    public BankInformation() {
    }

    public BankInformation(long institutionID, long bankAccountNumber, long transitNumber) {
        this.institutionID = institutionID;
        this.bankAccountNumber = bankAccountNumber;
        this.transitNumber = transitNumber;
    }

    public long getInstitutionID() {
        return institutionID;
    }

    public void setInstitutionID(long institutionID) {
        this.institutionID = institutionID;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public long getTransitNumber() {
        return transitNumber;
    }

    public void setTransitNumber(long transitNumber) {
        this.transitNumber = transitNumber;
    }

}
