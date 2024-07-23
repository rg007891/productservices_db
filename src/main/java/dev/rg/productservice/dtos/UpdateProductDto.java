package dev.rg.productservice.dtos;

import dev.rg.productservice.models.Category;
import dev.rg.productservice.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateProductDto {
    private String title;
    private Double price;
    private String category;
    private String description;
    private String image;

    public Product toProduct(){
        Product product = new Product();
        product.setTitle(title);
        product.setPrice(price);
        product.setDescription(description);
        product.setImage(image);

        return product;
    }
}
