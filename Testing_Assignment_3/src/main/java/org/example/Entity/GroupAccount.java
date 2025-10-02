package org.example.Entity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "GroupAccount")
public class GroupAccount {
    @EmbeddedId
    private GroupAccountID groupAccountID = new  GroupAccountID();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("accountID") //ánh xạ AccountID trong composite key
    @JoinColumn(name = "AccountID",nullable = false)
    private Account account;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("groupID")
    @JoinColumn(name = "GroupID")
    private Group group;

    @Column(name = "JoinDate")
    private LocalDateTime JoinDate;

}
