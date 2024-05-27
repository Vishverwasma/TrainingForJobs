package com.project02.Dao;

import java.sql.*;
import java.util.*;

import com.project02.Models.Medicine_Category;
import com.project02.Utility.DBUtil;

public class Medicine_Category_Dao {
    
    public void addCategory(Medicine_Category category) throws SQLException {
        String sql = "INSERT INTO Medicine_Category (category_Id, Category_Name) VALUES (?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, category.getCategory_Id());
            stmt.setString(2, category.getCategory_Name());
            stmt.executeUpdate();
        }
    }

    public List<Medicine_Category> getAllCategories() throws SQLException {
        List<Medicine_Category> categories = new ArrayList<>();
        String sql = "SELECT * FROM Medicine_Category";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medicine_Category category = new Medicine_Category();
                category.setCategory_Id(rs.getInt("category_Id"));
                category.setCategory_Name(rs.getString("Category_Name"));
                categories.add(category);
            }
        }
        return categories;
    }

    public Medicine_Category getCategoryById(int categoryId) throws SQLException {
        Medicine_Category category = null;
        String sql = "SELECT * FROM Medicine_Category WHERE category_Id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                category = new Medicine_Category();
                category.setCategory_Id(rs.getInt("category_Id"));
                category.setCategory_Name(rs.getString("Category_Name"));
            }
        }
        return category;
    }

    public void updateCategory(Medicine_Category category) throws SQLException {
        String sql = "UPDATE Medicine_Category SET Category_Name = ? WHERE category_Id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, category.getCategory_Name());
            stmt.setInt(2, category.getCategory_Id());
            stmt.executeUpdate();
        }
    }

    public void deleteCategory(int categoryId) throws SQLException {
        String sql = "DELETE FROM Medicine_Category WHERE category_Id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoryId);
            stmt.executeUpdate();
        }
    }
}
