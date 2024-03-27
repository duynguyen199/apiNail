package model.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("status")
    private Boolean status;

    @JsonProperty("createdAt")
    private LocalDateTime createdAt = LocalDateTime.now();

    @JsonProperty("updatedAt")
    private LocalDateTime updatedAt = LocalDateTime.now();

    @JsonProperty("createdBy")
    private Long createdBy ;

    @JsonProperty("updatedBy")
    private Long updatedBy ;

}
