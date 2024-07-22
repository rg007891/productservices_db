package dev.rg.productservice.services;

import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Category;
import dev.rg.productservice.models.Product;
import dev.rg.productservice.repositories.CategoryRepository;
import dev.rg.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SelfProductService")
public class SelfProductService implements ProductService{

    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    public SelfProductService(ProductRepository productRepository,
                              CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Product createProduct(UpdateProductDto updateProductDto) {
        Product product = new Product();
        product.setTitle(updateProductDto.getTitle());
        product.setPrice(updateProductDto.getPrice());
        product.setDescription(updateProductDto.getDescription());
        product.setImage(updateProductDto.getImage());

        Category categoryFromDB = categoryRepository.findByTitle(updateProductDto.getCategory());
        if(categoryFromDB == null){
            Category newCategory = new Category();
            newCategory.setTitle(updateProductDto.getCategory());
//            categoryFromDB = categoryRepository.save(newCategory);
            categoryFromDB = newCategory;
        }
        product.setCategory(categoryFromDB);
        return productRepository.save(product);
    }

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
