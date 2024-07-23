package dev.rg.productservice.services;

import dev.rg.productservice.dtos.UpdateProductDto;
import dev.rg.productservice.models.Category;
import dev.rg.productservice.models.Product;
import dev.rg.productservice.repositories.CategoryRepository;
import dev.rg.productservice.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        Product product = updateProductDto.toProduct();

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
        Optional<Product> product = productRepository.findById(id);

        return product.orElse(null);
    }

    @Override
    public List<Product> getProductByCategory(String category) {
        return productRepository.findByCategory_title(category);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Long id, UpdateProductDto updateProductDto) {
        Product newProduct = updateProductDto.toProduct();
        newProduct.setId(id);

        Category categoryFromDB = categoryRepository.findByTitle(updateProductDto.getCategory());
        if(categoryFromDB == null)
        {
            Category category = new Category();
            category.setTitle(updateProductDto.getCategory());
            categoryFromDB = categoryRepository.save(category);
        }

        newProduct.setCategory(categoryFromDB);

        return productRepository.save(newProduct);
    }

    @Override
    public Product deleteProduct(Long id)
    {
        Product product = productRepository.findById(id).orElse(null);
        productRepository.deleteById(id);
        return product;
    }
}
