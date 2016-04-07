package com.dineshonjaval.progress.services;

import com.dineshonjaval.progress.model.Category;
import java.util.List;



public interface CategoryService {
	
	public void addCategory(Category categoryBean);
	
	public List<Category> getCategories();
	
	public Category getCategory(int categoryId);
	
	public void deleteCategory(int categoryId);

}
