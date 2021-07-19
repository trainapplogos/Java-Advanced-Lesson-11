package ua.lviv.trainapplogos.service.impl;

import java.sql.SQLException;
import java.util.List;

import ua.lviv.trainapplogos.dao.ProductDao;
import ua.lviv.trainapplogos.dao.impl.ProductDaoImpl;
import ua.lviv.trainapplogos.domain.Product;
import ua.lviv.trainapplogos.service.ProductService;

public class ProductServiceImpl implements ProductService {

	
private ProductDao productDao;
	
	public ProductServiceImpl() {
		try {
			productDao = new ProductDaoImpl();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Product create(Product product) {
		return productDao.create(product);
	}

	@Override
	public Product read(Integer id) {
		return productDao.read(id);
	}

	@Override
	public Product update(Product product) {
		return productDao.update(product);
	}

	@Override
	public void delete(Integer id) {
		productDao.delete(id);
	}

	@Override
	public List<Product> readAll() {
		return productDao.readAll();
	}
	
	
}
