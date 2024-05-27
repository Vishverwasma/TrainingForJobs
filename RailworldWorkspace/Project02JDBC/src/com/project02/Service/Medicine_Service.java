package com.project02.Service;

import java.sql.SQLException;
import java.util.List;

import com.project02.Dao.Medicine_Dao;
import com.project02.Models.Medicine;

public class Medicine_Service {
    private Medicine_Dao medicineDAO;

    public Medicine_Service() {
        medicineDAO = new Medicine_Dao();
    }

    public void addMedicine(Medicine medicine) throws SQLException {
        medicineDAO.addMedicine(medicine);
    }

    public List<Medicine> getAllMedicines() throws SQLException {
        return medicineDAO.getAllMedicines();
    }

    public Medicine getMedicineById(int medicineId) throws SQLException {
        return medicineDAO.getMedicineById(medicineId);
    }

    public void updateMedicine(Medicine medicine) throws SQLException {
        medicineDAO.updateMedicine(medicine);
    }

    public void deleteMedicine(int medicineId) throws SQLException {
        medicineDAO.deleteMedicine(medicineId);
    }

    public List<Medicine> getMedicineByCategoryId(int categoryId) throws SQLException {
        return medicineDAO.getMedicineByCategoryId(categoryId);
    }
}
