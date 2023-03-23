package com.modern.api.repository;

import java.util.List;
import java.util.Map;
import org.reactivestreams.Publisher;


public interface Repository {

    Product getProduct(String id);

    List<Product> getProducts();

}