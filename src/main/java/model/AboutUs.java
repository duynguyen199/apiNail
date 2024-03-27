package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;

@Entity
@Table(name = "about_us")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AboutUs extends BaseEntity {

    @Column(columnDefinition = "TEXT")
    private String content;
}
