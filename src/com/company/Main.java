package com.company;

import com.company.business.abstracts.ProductService;
import com.company.business.concretes.ProductManager;
import com.company.core.JLoggerManagerAdapter;
import com.company.dataAccerss.concretes.AbcProductDao;
import com.company.dataAccerss.concretes.HibernateProductDao;
import com.company.entities.concretes.Product;

public class Main {

    // Burası test için
    public static void main(String[] args) {

        //ToDo : Spring IoC ile çözülecek.
        //ProductService productService = new ProductManager(new HibernateProductDao());
        ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

        Product product = new Product(1,3, "Elma" , 12, 50 );
        productService.add(product);

    }
}
//Bir proje de Entitiy ler hariç new işlemi yapılıyorsa ilerde problem yaşanır.

