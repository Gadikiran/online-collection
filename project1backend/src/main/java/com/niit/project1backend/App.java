package com.niit.project1backend;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.models.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //CREATE SPRING CONTAINER , CONFIGURATION DETAILS TO THE CONTAINER
        ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
      ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
      
/*    
 Product product=productDao.getProduct(2);
  
    System.out.println(product);
    if(product!=null){
    System.out.println(product.getId());
    System.out.println(product.getProductname());
    System.out.println(product.getDescription());
    System.out.println(product.getPrice());
    System.out.println(product.getQuantity());
    }else{
  	  System.out.println("Product id  not found");
    }
  */  
//  product.setQuantity(150);
//    productDao.updateProduct(product);
//    System.out.println("After Update");
//    if(product!=null){
//        System.out.println(product.getId());
//        System.out.println(product.getProductname());
//        System.out.println(product.getDescription());
//        System.out.println(product.getPrice());
//        System.out.println(product.getQuantity());
//        }
    
    
 //   List<Product> products=productDao.getAllProducts();
   // System.out.println(products);
    //System.out.println(products.size());
      
      
      //insert product
      
//      Product p=new Product();
//     p.setProductname("bike");
//      p.setQuantity(5);
//      p.setPrice(70000);
//      p.setDescription("good looking");
//      
//      productDao.addProduct(p);
//      
//      System.out.println("Product Insertedd Successfuly....");
//      
  }
}


