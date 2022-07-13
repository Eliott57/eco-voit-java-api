package com.ecovoit.EcoVoitAPI.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String surname;

    private Date birth_date;
    private String bio;

    private String avatar_url;
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date email_verified_at;

    private String passeword;

    @ManyToOne
    private Role role;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

    @OneToMany(mappedBy = "user")
    private List<UserTrip> tripAssoc;

    @OneToMany(mappedBy = "user")
    private List<UserNotification> notificationAssoc;
}
