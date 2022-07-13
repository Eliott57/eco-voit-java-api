package com.ecovoit.EcoVoitAPI.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Integer id;
    private String slug;
    private String title;
    private String description;

    private enum type {
        ALERT,
        MESSAGE,
        WARNING
    }

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    @OneToMany(mappedBy = "notification")
    private List<UserNotification> userAssoc;
}
