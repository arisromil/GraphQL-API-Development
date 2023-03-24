package com.modern.api.services;

import com.packt.modern.api.generated.types.Product;
import com.packt.modern.api.generated.types.ProductCriteria;
import java.util.List;
import org.reactivestreams.Publisher;

/**

 **/
public interface ProductService {

    Product getProduct(String id);

    List<Product> getProducts(ProductCriteria criteria);

}