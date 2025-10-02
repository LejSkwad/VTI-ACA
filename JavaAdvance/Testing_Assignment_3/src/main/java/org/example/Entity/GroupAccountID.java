package org.example.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class GroupAccountID {
    private int accountID;
    private int groupID;

    public int getAccountID() {
        return accountID;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public GroupAccountID() {
    }

    public GroupAccountID(int accountID, int groupID) {
        this.accountID = accountID;
        this.groupID = groupID;
    }


}
