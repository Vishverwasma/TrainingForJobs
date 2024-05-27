package com.project02.Service;

import java.sql.SQLException;
import java.util.List;

import com.project02.Dao.Medicine_Category_Dao;
import com.project02.Models.Medicine_Category;

public class Medicine_Category_Service {
    private Medicine_Category_Dao categoryDAO;

    public Medicine_Category_Service() {
        categoryDAO = new Medicine_Category_Dao();
    }

    public void addCategory(Medicine_Category category) throws SQLException {
        categoryDAO.addCategory(category);
    }

    public List<Medicine_Category> getAllCategories() throws SQLException {
        return categoryDAO.getAllCategories();
    }

    public Medicine_Category getCategoryById(int categoryId) throws SQLException {
        return categoryDAO.getCategoryById(categoryId);
    }

    public void updateCategory(Medicine_Category category) throws SQLException {
        categoryDAO.updateCategory(category);
    }

    public void deleteCategory(int categoryId) throws SQLException {
        categoryDAO.deleteCategory(categoryId);
    }
}
