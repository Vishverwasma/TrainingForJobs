package com.project02.Dao;

import java.sql.*;
import java.util.*;

import com.project02.Models.Medicine;
import com.project02.Models.MedicineDetails;
import com.project02.Utility.DBUtil;

public class Medicine_Dao {
    
    public void addMedicine(Medicine medicine) throws SQLException {
        String sql = "INSERT INTO Medicine (Medicine_id, Medicine_Name, Medicine_category_id, medicine_Rating) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, medicine.getMedicine_id());
            stmt.setString(2, medicine.getMedicine_Name());
            stmt.setInt(3, medicine.getMedicine_category_id());
            stmt.setInt(4, medicine.getMedicine_Rating());
            stmt.executeUpdate();
        }
    }
    
    public List<Medicine> getAllMedicines() throws SQLException {
        List<Medicine> medicines = new ArrayList<>();
        String sql = "SELECT * FROM Medicine";

        try (Connection conn = DBUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Medicine medicine = new Medicine();
                medicine.setMedicine_id(rs.getInt("Medicine_id"));
                medicine.setMedicine_Name(rs.getString("Medicine_Name"));
                medicine.setMedicine_category_id(rs.getInt("Medicine_category_id"));
                medicine.setMedicine_Rating(rs.getInt("medicine_Rating"));
                medicines.add(medicine);
            }
        }
        return medicines;
    }

    public Medicine getMedicineById(int medicineId) throws SQLException {
        Medicine medicine = null;
        String sql = "SELECT * FROM Medicine WHERE Medicine_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, medicineId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                medicine = new Medicine();
                medicine.setMedicine_id(rs.getInt("Medicine_id"));
                medicine.setMedicine_Name(rs.getString("Medicine_Name"));
                medicine.setMedicine_category_id(rs.getInt("Medicine_category_id"));
                medicine.setMedicine_Rating(rs.getInt("medicine_Rating"));
            }
        }
        return medicine;
    }
    
    public List<Medicine> getMedicineByCategoryId(int categoryId) throws SQLException {
        List<Medicine> medicines = new ArrayList<>();
        String sql = "SELECT * FROM Medicine WHERE Medicine_category_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, categoryId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Medicine medicine = new Medicine();
                medicine.setMedicine_id(rs.getInt("Medicine_id"));
                medicine.setMedicine_Name(rs.getString("Medicine_Name"));
                medicine.setMedicine_category_id(rs.getInt("Medicine_category_id"));
                medicine.setMedicine_Rating(rs.getInt("medicine_Rating"));
                medicines.add(medicine);
            }
        }
        return medicines;
    }


    public void updateMedicine(Medicine medicine) throws SQLException {
        String sql = "UPDATE Medicine SET Medicine_Name = ?, Medicine_category_id = ?, medicine_Rating = ? WHERE Medicine_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, medicine.getMedicine_Name());
            stmt.setInt(2, medicine.getMedicine_category_id());
            stmt.setInt(3, medicine.getMedicine_Rating());
            stmt.setInt(4, medicine.getMedicine_id());
            stmt.executeUpdate();
        }
    }

    public void deleteMedicine(int medicineId) throws SQLException {
        String sql = "DELETE FROM Medicine WHERE Medicine_id = ?";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, medicineId);
            stmt.executeUpdate();
        }
    }
    
    public List<MedicineDetails> getMedicineDetails() throws SQLException {
        List<MedicineDetails> medicineDetailsList = new ArrayList<>();
        String sql = "SELECT m.Medicine_id, m.Medicine_Name, m.medicine_Rating, q.medicine_quantity, c.Category_Name " +
                     "FROM medicine m " +
                     "INNER JOIN medicine_category c ON c.category_Id = m.Medicine_category_id " +
                     "INNER JOIN medicine_quantity q ON q.medicine_id = m.Medicine_id "
                     + "ORDER BY m.Medicine_id";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                MedicineDetails details = new MedicineDetails();
                details.setMedicineId(rs.getInt("Medicine_id"));
                details.setMedicineName(rs.getString("Medicine_Name"));
                details.setMedicineRating(rs.getInt("medicine_Rating"));
                details.setMedicineQuantity(rs.getInt("medicine_quantity"));
                details.setCategoryName(rs.getString("Category_Name"));
                medicineDetailsList.add(details);
            }
        }
        return medicineDetailsList;
    }
}
