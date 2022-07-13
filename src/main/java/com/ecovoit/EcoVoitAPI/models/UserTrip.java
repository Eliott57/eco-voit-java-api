package com.ecovoit.EcoVoitAPI.models;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "user_trip")
@IdClass(UserTripId.class)
public class UserTrip {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "trip_id", referencedColumnName = "id")
    private Trip trip;

    @Column(name = "qr_code_url")
    private String qrCodeUrl;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "opinion")
    private String opinion;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
}
