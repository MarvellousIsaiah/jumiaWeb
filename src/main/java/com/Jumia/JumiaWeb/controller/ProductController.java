package com.Jumia.JumiaWeb.controller;

import com.Jumia.JumiaWeb.data.model.Product;
import com.Jumia.JumiaWeb.data.repositories.ProductRepository;
import com.Jumia.JumiaWeb.dto.ProductRequest;
import com.Jumia.JumiaWeb.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping("createProduct")
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);

    }

   @GetMapping("/getAllProducts")
   public List<Product> getAllProducts() {
        productService.getAllProduct();
        return productService.getAllProduct();

    }
}
