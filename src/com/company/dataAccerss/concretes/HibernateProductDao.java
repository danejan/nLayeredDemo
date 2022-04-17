package com.company.dataAccerss.concretes;

import com.company.dataAccerss.abstracts.ProductDao;
import com.company.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements ProductDao {


  @Override
  public void add(Product product) {
    System.out.println("Hibernate ile eklendi" + product.getName());
  }

  @Override
  public void update(Product product) {

  }

  @Override
  public void delete(Product product) {

  }

  @Override
  public Product get(int id) {
    return null;
  }

  @Override
  public List<Product> getAll() {
    return null;
  }
}

//Hibernate veritabanıyla iletişim kuran veri yapısı