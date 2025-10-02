package org.example.Entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "`Group`")
public class Group {
    @Id
    @Column(name = "GroupID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int GroupID;

    @Column(name = "GroupName", nullable = false,unique = true)
    private String GroupName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CreatorID",nullable = false)
    private Account creator;

    @Column(name = "CreateDate")
    private LocalDateTime CreateDate;

    public int getGroupID() {
        return GroupID;
    }

    public void setGroupID(int groupID) {
        GroupID = groupID;
    }

    public String getGroupName() {
        return GroupName;
    }

    public void setGroupName(String groupName) {
        GroupName = groupName;
    }

    public LocalDateTime getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        CreateDate = createDate;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

}
