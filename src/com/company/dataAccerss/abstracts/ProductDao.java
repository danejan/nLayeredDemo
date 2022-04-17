package com.company.dataAccerss.abstracts;

import com.company.entities.concretes.Product;
import java.util.List;

public interface ProductDao {
  void add(Product product);
  void update(Product product);
  void delete(Product product);
  Product get (int id);
  List<Product> getAll();


}

//ProductRepository de yazıklabilirdi.
//Ürünle ilgili
// add
// update
// delete

