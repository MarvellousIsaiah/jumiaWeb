package com.Jumia.JumiaWeb.test;

import com.Jumia.JumiaWeb.data.model.Product;
import com.Jumia.JumiaWeb.data.repositories.ProductRepository;
import com.Jumia.JumiaWeb.dto.ProductRequest;
import com.Jumia.JumiaWeb.services.ProductService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest

public class ProductTest {
    private ObjectMapper objectMapper;
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;


    @BeforeEach
    void setUp() {

    }

    @Test
    public void createProduct() {
        ProductRequest productRequest = ProductRequest.builder()
                .name("Iphone13")
                .description("Iphone13")
                .price(BigDecimal.valueOf(12000))
                .build();

        productService.createProduct(productRequest);
        assertThat(productRequest.getName()).isEqualTo("Iphone13");
    }

    @Test
    public void getAllProducts() {
        ProductRequest productRequest = ProductRequest.builder()
                .name("Iphone13")
                .description("Iphone13")
                .price(BigDecimal.valueOf(12000))
                .build();
//         productService.getAllProducts(productRequest);
        List<Product> products = productService.getAllProduct();
        assertNotNull(products);
        assertTrue(products.size() > 0);


    }
}

