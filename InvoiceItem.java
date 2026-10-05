package Assignments;
public class InvoiceItem {

    // Attributes
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getter for id
    public String getId() {
        return id;
    }

    // Getter for description
    public String getDesc() {
        return desc;
    }

    // Getter for quantity
    public int getQty() {
        return qty;
    }

    // Setter for quantity
    public void setQty(int qty) {
        this.qty = qty;
    }

    // Getter for unit price
    public double getUnitPrice() {
        return unitPrice;
    }

    // Setter for unit price
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Calculate total
    public double getTotal() {
        return unitPrice * qty;
    }

    // Convert object to String
    public String toString() {
        return "InvoiceItem[id=" + id +
                ",desc=" + desc +
                ",qty=" + qty +
                ",unitPrice=" + unitPrice + "]";
    }


}
class TestInvoiceItem {

    public static void main(String[] args) {

        // Test constructor
        InvoiceItem item1 = new InvoiceItem("A01", "Laptop", 2, 500);

        // Test toString()
        System.out.println(item1);

        // Test setQty() setter
        item1.setQty(3);

        // Test toString() after changing quantity
        System.out.println(item1);

        // Test getId() getter
        System.out.println("id is: " + item1.getId());

        // Test getDesc() getter
        System.out.println("description is: " + item1.getDesc());

        // Test getQty() getter
        System.out.println("quantity is: " + item1.getQty());

        // Test getUnitPrice() getter
        System.out.println("unit price is: " + item1.getUnitPrice());

        // Test setUnitPrice() setter
        item1.setUnitPrice(600);

        // Test getUnitPrice() after changing price
        System.out.println("new unit price is: " + item1.getUnitPrice());

        // Test getTotal() method
        System.out.println("total is: " + item1.getTotal());

        // Test toString() after all changes
        System.out.println(item1);
    }
}