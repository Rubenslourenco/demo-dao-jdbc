package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;

public class Program {

	public static void main(String[] agrs) {
		
		SellerDao sellerDao = new DaoFactory.createSellerDao();
	}
}
