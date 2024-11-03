package com.Jumia.JumiaWeb.data.repositories;

import com.Jumia.JumiaWeb.data.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface ProductRepository extends MongoRepository<Product,String> {

}
