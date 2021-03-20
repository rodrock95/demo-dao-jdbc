package application;

import model.DAO.DAOFactory;
import model.DAO.SellerDAO;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		/*
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, obj);
		System.out.println(seller);
		*/
		SellerDAO sellerDao = DAOFactory.createSellerDAO();
		
		Seller seller = sellerDao.findById(3);

		System.out.println(seller);
	}

}
