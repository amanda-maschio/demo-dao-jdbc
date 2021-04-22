package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

/**
 * Classe respons�vel por instanciar os DAOs
 * @author Amanda Maschio
 *
 */
public class DaoFactory {
	
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
