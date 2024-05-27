import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.project02.Models.Medicine;
import com.project02.Models.Medicine_Category;
import com.project02.Models.Medicine_Quantity;
import com.project02.Dao.Medicine_Dao;
import com.project02.Dao.Medicine_Quatity_Dao;
import com.project02.Dao.Medicine_Category_Dao;

public class Main {
    private Medicine_Dao medicineDao;
    private Medicine_Quatity_Dao quantityDao;
    private Medicine_Category_Dao categoryDao;
    private Scanner scanner;

    public Main() {
        medicineDao = new Medicine_Dao();
        quantityDao = new Medicine_Quatity_Dao();
        categoryDao = new Medicine_Category_Dao();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Main app = new Main();
        app.run();
    }

    public void run() {
        while (true) {
            showMenu();
            int choice = Integer.parseInt(scanner.nextLine());

            try {
                switch (choice) {
                    case 1:
                        addMedicine();
                        break;
                    case 2:
                        viewAllMedicines();
                        break;
                    case 3:
                        updateMedicine();
                        break;
                    case 4:
                        deleteMedicine();
                        break;
                    case 5:
                        viewMedicineByCategoryId();
                        break;
                    case 6:
                        addOrUpdateMedicineQuantity();
                        break;
                    case 7:
                        viewAllMedicineQuantities();
                        break;
                    case 8:
                        updateMedicineQuantity();
                        break;
                    case 9:
                        deleteMedicineQuantity();
                        break;
                    case 10:
                        viewAllCategories();
                        break;
                    case 11:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                     }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println("\nMedicine Management System");
        System.out.println("1. Add Medicine");
        System.out.println("2. View All Medicines");
        System.out.println("3. Update Medicine");
        System.out.println("4. Delete Medicine");
        System.out.println("5. View Medicine by Category ID");
        System.out.println("6. Add or Update Medicine Quantity");
        System.out.println("7. View All Medicine Quantities");
        System.out.println("8. Update Medicine Quantity");
        System.out.println("9. Delete Medicine Quantity");
        System.out.println("10. View All Categories");
        System.out.println("11. Exit");
        System.out.print("Enter your choice: ");
    }

    private void addMedicine() throws SQLException {
        System.out.print("Enter ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter category ID: ");
        int categoryId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter rating: ");
        int rating = Integer.parseInt(scanner.nextLine());

        Medicine medicine = new Medicine(id, name, categoryId, rating);
        medicineDao.addMedicine(medicine);
        System.out.println("Medicine added successfully!");
    }

    private void viewAllMedicines() throws SQLException {
        List<Medicine> medicines = medicineDao.getAllMedicines();
        System.out.println("\nMedicine List:");
        for (Medicine medicine : medicines) {
            System.out.println("ID: " + medicine.getMedicine_id() + ", Name: " + medicine.getMedicine_Name() +
                    ", Category ID: " + medicine.getMedicine_category_id() + ", Rating: " + medicine.getMedicine_Rating());
        }
    }

    private void viewAllCategories() throws SQLException {
        List<Medicine_Category> categories = categoryDao.getAllCategories();
        System.out.println("\nMedicine Categories:");
        for (Medicine_Category category : categories) {
            System.out.println("Category ID: " + category.getCategory_Id() + ", Category Name: " + category.getCategory_Name());
        }
    }

    private void updateMedicine() throws SQLException {
        System.out.print("Enter medicine ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new category ID: ");
        int categoryId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new rating: ");
        int rating = Integer.parseInt(scanner.nextLine());

        Medicine medicine = new Medicine(id, name, categoryId, rating);
        medicineDao.updateMedicine(medicine);
        System.out.println("Medicine updated successfully!");
    }

    private void deleteMedicine() throws SQLException {
        System.out.print("Enter medicine ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        medicineDao.deleteMedicine(id);
        System.out.println("Medicine deleted successfully!");
    }

    private void viewMedicineByCategoryId() throws SQLException {
        System.out.print("Enter category ID to view medicines: ");
        int categoryId = Integer.parseInt(scanner.nextLine());
        List<Medicine> medicines = medicineDao.getMedicineByCategoryId(categoryId);
        System.out.println("\nMedicine List for Category ID " + categoryId + ":");
        for (Medicine medicine : medicines) {
            System.out.println("ID: " + medicine.getMedicine_id() + ", Name: " + medicine.getMedicine_Name() +
                    ", Category ID: " + medicine.getMedicine_category_id() + ", Rating: " + medicine.getMedicine_Rating());
        }
    }

    private void addOrUpdateMedicineQuantity() throws SQLException {
        System.out.print("Enter quantity ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter medicine ID: ");
        int medicineId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter medicine quantity: ");
        double quantity = Double.parseDouble(scanner.nextLine());

        Medicine_Quantity medicineQuantity = new Medicine_Quantity(id, medicineId, quantity);
        quantityDao.addOrUpdateMedicineQuantity(medicineQuantity);
        System.out.println("Medicine quantity added or updated successfully!");
    }

    private void viewAllMedicineQuantities() throws SQLException {
        List<Medicine_Quantity> quantities = quantityDao.getAllMedicineQuantities();
        System.out.println("\nMedicine Quantity List:");
        for (Medicine_Quantity quantity : quantities) {
            System.out.println("Quantity ID: " + quantity.getQuantity_id() + ", Medicine ID: " + quantity.getMedicine_id() +
                    ", Quantity: " + quantity.getMedicine_quantity());
        }
    }

    private void updateMedicineQuantity() throws SQLException {
        System.out.print("Enter quantity ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new medicine ID: ");
        int medicineId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter new medicine quantity: ");
        double quantity = Double.parseDouble(scanner.nextLine());

        Medicine_Quantity medicineQuantity = new Medicine_Quantity(id, medicineId, quantity);
        quantityDao.updateMedicineQuantity(medicineQuantity);
        System.out.println("Medicine quantity updated successfully!");
    }

    private void deleteMedicineQuantity() throws SQLException {
        System.out.print("Enter quantity ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        quantityDao.deleteMedicineQuantity(id);
        System.out.println("Medicine quantity deleted successfully!");
    }
}
