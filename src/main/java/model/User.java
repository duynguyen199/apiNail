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
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "contact_info")
    private String contactInfo;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<GalleryImage> galleryImageList;

    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Appointment> appointmentList;

    @OneToMany(mappedBy = "user")
    private List<Review> reviewList;

    @ManyToMany(mappedBy = "userList")
    @JsonIgnore
    private List<Role> roles;
}
