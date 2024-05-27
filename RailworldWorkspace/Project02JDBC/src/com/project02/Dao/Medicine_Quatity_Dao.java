package com.project02.Dao;

import java.sql.*;
import java.util.*;

import com.project02.Models.Medicine_Quantity;
import com.project02.Utility.DBUtil;

public class Medicine_Quatity_Dao {
    
    public void addOrUpdateMedicineQuantity(Medicine_Quantity quantity) throws SQLException {
        String sql = "INSERT INTO Medicine_Quantity (quantity_id, medicine_id, medicine_quantity) VALUES (?, ?, ?) " +
                     "ON DUPLICATE KEY UPDATE medicine_quantity = medicine_quantity + VALUES(medicine_quantity)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quantity.getQuantity_id());
            stmt.setInt(2, quantity.getMedicine_id());
            stmt.setDouble(3, quantity.getMedicine_quantity());
            stmt.executeUpdate();
        }
    }

    public List<Medicine_Quantity> getAllMedicineQuantities() throws SQLException {
        List<Medicine_Quantity> quantities = new ArrayList<>();
        String sql = "SELECT * FROM Medicine_Quantity";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medicine_Quantity quantity = new Medicine_Quantity();
                quantity.setQuantity_id(rs.getInt("quantity_id"));
                quantity.setMedicine_id(rs.getInt("medicine_id"));
                quantity.setMedicine_quantity(rs.getDouble("medicine_quantity"));
                quantities.add(quantity);
            }
        }
        return quantities;
    }

    public Medicine_Quantity getMedicineQuantityById(int quantityId) throws SQLException {
        Medicine_Quantity quantity = null;
        String sql = "SELECT * FROM Medicine_Quantity WHERE quantity_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quantityId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                quantity = new Medicine_Quantity();
                quantity.setQuantity_id(rs.getInt("quantity_id"));
                quantity.setMedicine_id(rs.getInt("medicine_id"));
                quantity.setMedicine_quantity(rs.getDouble("medicine_quantity"));
            }
        }
        return quantity;
    }

    public void updateMedicineQuantity(Medicine_Quantity quantity) throws SQLException {
        String sql = "UPDATE Medicine_Quantity SET medicine_id = ?, medicine_quantity = ? WHERE quantity_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quantity.getMedicine_id());
            stmt.setDouble(2, quantity.getMedicine_quantity());
            stmt.setInt(3, quantity.getQuantity_id());
            stmt.executeUpdate();
        }
    }

    public void deleteMedicineQuantity(int quantityId) throws SQLException {
        String sql = "DELETE FROM Medicine_Quantity WHERE quantity_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, quantityId);
            stmt.executeUpdate();
        }
    }
}
