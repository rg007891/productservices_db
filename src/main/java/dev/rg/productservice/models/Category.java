package dev.rg.productservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Category extends BaseModel {
    private String title;

    @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
    @JsonIgnore
    private List<Product> productList;
}
