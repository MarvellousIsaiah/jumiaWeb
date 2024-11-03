package com.Jumia.JumiaWeb.services;

import com.Jumia.JumiaWeb.data.model.Product;
import com.Jumia.JumiaWeb.dto.ProductRequest;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

   List<Product> getAllProduct();

//    List<Product> getAllProducts();
}
