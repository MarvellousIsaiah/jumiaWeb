package com.Jumia.JumiaWeb.services;

import com.Jumia.JumiaWeb.data.model.Product;
import com.Jumia.JumiaWeb.data.repositories.ProductRepository;
import com.Jumia.JumiaWeb.dto.ProductRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Builder
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;


    @Override
    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .price(productRequest.getPrice())
                .description(productRequest.getDescription())
                .build();
        var result = productRepository.save(product);
        log.info("product {} is saved" , product.getId());

    }
    @Override
    public List<Product> getAllProduct() {
        List<Product> products = productRepository.findAll();

        return products;
    }
//    public List<Product> getAllProducts() {
//        List<Product> products = productRepository.findAll();
//        return products;//.stream().map(this::mapToProductResponse).toList();

    }
