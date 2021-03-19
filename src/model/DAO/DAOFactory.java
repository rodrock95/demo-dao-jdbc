package model.DAO;

import model.DAO.impl.SellerDaoJDBC;

public class DAOFactory {

	public static SellerDAO createSellerDAO() {
		return new SellerDaoJDBC();
	}
}
