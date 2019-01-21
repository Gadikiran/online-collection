package com.niit.project1backend;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfiguration;
import com.niit.dao.ProductDao;
import com.niit.dao.ProductDaoImpl;
import com.niit.models.Product;

import junit.framework.TestCase;

public class projectTestcase  extends TestCase
{
	

	ApplicationContext context=new AnnotationConfigApplicationContext(DBConfiguration.class,ProductDaoImpl.class);
	 ProductDao productDao=(ProductDao)context.getBean("productDaoImpl");
	
	 public void testGetProduct() {
		
		Product actualProduct1=productDao.getProduct(39);//id exists in the product table
	//	Product actualProduct2=productDao.getProduct(45);//id doesnt exists in the product table
		assertNotNull(actualProduct1);//expected 1 product object
		//assertNull(actualProduct2);//expected object is null
		
	}

	public void testDeleteProduct() {
		 productDao.deleteProduct(41);//GIVE THE VALUES WHICH IS THERE IN YOUR TABLE
		   Product product=productDao.getProduct(41);
		   assertNull(product);
	}

	public void testGetAllProducts() {
		List<Product> products=productDao.getAllProducts();
		assertFalse(products.isEmpty());
		assertTrue(products.size()==4);//CHECK THE SIZE 
	}

	public void testSaveOrUpdate() {
		
			//FOR INSERT	
		
		Product p=new Product();
		p.setProductname("Mobile device - Samsung");
		p.setDescription("124GB ");
		p.setPrice(35000);
		p.setQuantity(25);
		//before inserting id is 0 , before persisting
		productDao.saveOrUpdate(p);
		//after successful insertion id will be greater than 0 , after persisting
		assertTrue(p.getId()>0);
		
		
		//FOR UPDATE
		//get product with id 2 -> call productDao getProduct and get product obj
		//set the price of the product as 200
		//call updateProduct method in dao
		//check if the price is updated successfully [assertMethod]
				Product product=productDao.getProduct(2);//select * from product where id=2 in DAO layer
				product.setPrice(250);//setting the price as 250
				productDao.saveOrUpdate(product);//update product set price=250 where id=2 in DAO layer
				product=productDao.getProduct(2);//select * from product where id=2 in DAO layer
				assertTrue(product.getPrice()==250);
	}

}

