package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] agrs) {
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		
		System.out.println("==== Test1: seller findByID =====");
		Seller seller = sellerDao.findById(3);
		
		
	System.out.println(seller);
	}
}
