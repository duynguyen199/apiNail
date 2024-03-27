package model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;

import java.util.List;

@Entity
@Table(name = "service")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Service extends BaseEntity {

    @Column(name = "serviceName")
    private String serviceName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "service")
    @JsonIgnore
    private List<Appointment> appointmentList;

    @OneToMany(mappedBy = "service")
    @JsonIgnore
    private List<Review> reviewList;
}
