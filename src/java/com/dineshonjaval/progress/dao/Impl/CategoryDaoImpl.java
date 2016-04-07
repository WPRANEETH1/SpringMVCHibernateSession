package com.dineshonjaval.progress.dao.Impl;

import com.dineshonjaval.progress.model.Category;
import com.dineshonjaval.progress.dao.CategoryDao;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



/**
 * @author Dinesh Rajput
 *
 */

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addCategory(Category categoryBean) {
		sessionFactory.getCurrentSession().saveOrUpdate(categoryBean);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Category> getCategories() {
		return (List<Category>) sessionFactory.getCurrentSession().createCriteria(Category.class).list();
	}

	@Override
	public Category getCategory(int categoryId) {
		return (Category) sessionFactory.getCurrentSession().get(Category.class, categoryId);
	}

	@Override
	public void deleteCategory(int categoryId) {
		sessionFactory.getCurrentSession().createQuery("DELETE FROM category WHERE categoryId = "+categoryId).executeUpdate();
	}

}
