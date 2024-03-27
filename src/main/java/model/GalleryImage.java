package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.base.BaseEntity;

@Entity
@Table(name = "gallery_images")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GalleryImage extends BaseEntity {

    @Column(name = "imageUrl")
    private String imageUrl;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
