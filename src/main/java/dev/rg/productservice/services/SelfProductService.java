package dev.rg.productservice.services;

import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService{
    @Override
    public Product getSingleProduct(Long id) {
        return null;
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return List.of();
    }

    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }

    @Override
    public Product updateProduct(Long id, UpdateProductDto updateProductDto) {
        return null;
    }

    @Override
    public Product deleteProduct(Long id) {
        return null;
    }
}
