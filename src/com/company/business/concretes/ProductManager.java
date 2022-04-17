package com.company.business.concretes;

import com.company.business.abstracts.ProductService;
import com.company.core.LoggerService;
import com.company.dataAccerss.abstracts.ProductDao;
import com.company.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {


  private  ProductDao productDao;
  private LoggerService loggerService;
  //Hibernate bağlı değil ama Hibernate in Referansını tutabilir. 28.satır için

  public ProductManager(ProductDao productDao, LoggerService loggerService) {
    super();
    this.productDao = productDao;
    this.loggerService= loggerService;
  }

  @Override
  public void add(Product product) {

    //İş kodları yazılır.

    if(product.getCategoryId() ==1) {
      System.out.println("Bu kategoride ürün kabul edilmiyor");
      return;
    }
    this.productDao.add(product);
    this.loggerService.logToSystem("Ürün eklendi : "  + product.getName());

  }

  @Override
  public List<Product> getAll() {
    return null;
  }
}

//İş kodlarını yapan sınıf
//Bunun interface i ProductService
