package com.project02.Service;

import java.sql.SQLException;
import java.util.List;

import com.project02.Dao.Medicine_Quatity_Dao;
import com.project02.Models.Medicine_Quantity;

public class Medicine_quantity_Service {
    private Medicine_Quatity_Dao quantityDAO;

    public Medicine_quantity_Service() {
        quantityDAO = new Medicine_Quatity_Dao();
    }

    public void addOrUpdateMedicineQuantity(Medicine_Quantity quantity) throws SQLException {
        quantityDAO.addOrUpdateMedicineQuantity(quantity);
    }

    public List<Medicine_Quantity> getAllMedicineQuantities() throws SQLException {
        return quantityDAO.getAllMedicineQuantities();
    }

    public Medicine_Quantity getMedicineQuantityById(int quantityId) throws SQLException {
        return quantityDAO.getMedicineQuantityById(quantityId);
    }

    public void updateMedicineQuantity(Medicine_Quantity quantity) throws SQLException {
        quantityDAO.updateMedicineQuantity(quantity);
    }

    public void deleteMedicineQuantity(int quantityId) throws SQLException {
        quantityDAO.deleteMedicineQuantity(quantityId);
    }
}
