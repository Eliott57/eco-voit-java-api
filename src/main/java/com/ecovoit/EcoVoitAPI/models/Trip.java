package com.ecovoit.EcoVoitAPI.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.w3c.dom.Text;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String departure_city;
    private String departure_zip_code;
    private String departure_address;
    private String arrival_zip_code;
    private String arrival_city;
    private String arrival_address;

    private Date departure_date;
    private Date arrival_date;
    private Float kilometers;
    private Float price;
    private String description;
    private Integer number_of_seats;

    @OneToMany(mappedBy = "trip")
    private List<UserTrip> userAssoc;

    private enum status {
        PROGRAMMED,
        IN_PROGRESSE,
        FINISHED
    }
    private String unique_key;


    @Temporal(TemporalType.TIMESTAMP)
    private Date created_at;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updated_at;

}
