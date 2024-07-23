package dev.rg.productservice.repositories;

import dev.rg.productservice.models.Product;
import dev.rg.productservice.repositories.Projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Product save(Product product);

    List<Product> findByCategory_title(String title);

//    @Query("select p from Product p where p.category.title = :title and p.id = :id")
//    Product getProductWithASpecificTitleAndId(String electronic, long id);

    @Query("SELECT p FROM Product p WHERE p.category.title = :title AND p.id = :id")
    Product getProductWithASpecificTitleAndId(@Param("title") String title, @Param("id") Long id);

    @Query(value = "SELECT * FROM product WHERE title = :title AND id = :id", nativeQuery = true)
    ProductProjection getProductWithSomeTitle(@Param("title") String title, @Param("id") Long id);
}
