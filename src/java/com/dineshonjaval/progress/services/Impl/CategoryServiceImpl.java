package com.dineshonjaval.progress.services.Impl;

import com.dineshonjaval.progress.model.Category;
import com.dineshonjaval.progress.dao.CategoryDao;
import com.dineshonjaval.progress.services.CategoryService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 * @author Dinesh Rajput
 *
 */

@Service("categoryService")
//@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDao categoryDao;
	
	@Transactional
	public void addCategory(Category categoryBean) {
		categoryDao.addCategory(categoryBean);
	}
        @Transactional
	@Override
	public List<Category> getCategories() {
		return categoryDao.getCategories();
	}
        @Transactional
	@Override
	public Category getCategory(int categoryId) {
		return categoryDao.getCategory(categoryId);
	}
        @Transactional
	@Override
	public void deleteCategory(int categoryId) {
		categoryDao.deleteCategory(categoryId);
	}

}
