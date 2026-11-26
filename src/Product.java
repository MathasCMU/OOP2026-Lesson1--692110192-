public class Product {
    // ===== Part A - Lesson 1 (Task 3) =====
    // Do NOT write a constructor in Part A.
    // TODO 1: fields - String code, name; double price; int stock; String category
    String code, name;
    double price;
    int stock;
    String category;

    // TODO 2: void printInfo()          prints exactly: P001 Notebook - 59.5 THB (stock: 20)
    void printInfo() {
        System.out.println(code + "" + name + " - " + price + " THB (stock: " + stock + ")");
    }

    // TODO 3: boolean isInStock()       true when stock > 0
    boolean isInStock() {
        if (stock > 0)
            return true;
    }
    return false;

    // TODO 4: void sell(int quantity)   stock -= quantity, only if 0 < quantity <= stock
    void sell(int quantity) {
        if ((quantity > 0) && (stock >= quantity)) {
            stock -= quantity;
        }
        // TODO 5: double totalValue()       returns price * stock

        // ===== Part B - Lesson 2 (Task 4) =====
        // TODO 6: Product(String code, String name, double price, int stock, String category)
        //         use this.field = field
        // TODO 7: Product(String code, String name, double price)
        //         stock is 0, category is "General" - call this(...) on the first line
        // TODO 8: Product()
        //         this("P000", "Unnamed", 0.0)
    }
}