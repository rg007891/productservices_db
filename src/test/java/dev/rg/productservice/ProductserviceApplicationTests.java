package dev.rg.productservice;

import dev.rg.productservice.models.Product;
import dev.rg.productservice.repositories.ProductRepository;
import dev.rg.productservice.repositories.Projections.ProductProjection;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProductserviceApplicationTests {

	@Autowired //  -- Tells spring to inject the object of prod repo
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testingQuery(){
		Product product = productRepository
				.getProductWithASpecificTitleAndId("Kitchen", 2L);
		System.out.println(product.getTitle());
	}

	@Test
	public void testNativeQuery(){
		ProductProjection product = productRepository.getProductWithSomeTitle("Test Product 3", 3L);

		System.out.println("Product id is: " + product.getTitle());
		System.out.println("Product title: " + product.getDescription());
	}

}
