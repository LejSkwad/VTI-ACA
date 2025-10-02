package org.example.Entity;
import jakarta.persistence.*;
@Entity
@Table(name = "`Manager`")
public class Manager {
    @Id
    @Column(name = "AccountID")
    private int AccountID;

    @Column(name = "WorkingNumberOfYear",nullable = false)
    private int WorkingNumberOfYear;

    @OneToOne
    @MapsId
    @JoinColumn(name = "AccountID")
    private Account account;

    public int getAccountID() {
        return AccountID;
    }

    public void setAccountID(int accountID) {
        AccountID = accountID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public int getWorkingNumberOfYear() {
        return WorkingNumberOfYear;
    }

    public void setWorkingNumberOfYear(int workingNumberOfYear) {
        WorkingNumberOfYear = workingNumberOfYear;
    }
}
