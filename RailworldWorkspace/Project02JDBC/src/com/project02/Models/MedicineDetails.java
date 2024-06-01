package com.project02.Models;

public class MedicineDetails {
    private int medicineId;
    private String medicineName;
    private int medicineRating;
    private int medicineQuantity;
    private String categoryName;

    // Getters and setters
    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getMedicineRating() {
        return medicineRating;
    }

    public void setMedicineRating(int medicineRating) {
        this.medicineRating = medicineRating;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
