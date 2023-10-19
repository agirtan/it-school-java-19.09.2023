public class InvoiceItem {
//    2. A class called InvoiceItem, which models an item of an invoice, with ID, description, quantity and unit price. Write the InvoiceItem class.
//    This class should contain a method called getTotal() based on quantity and price.


    private int id;
    private String description;
    private int quantity;
    private int price;

    public InvoiceItem(int id, String description, int quantity, int price) {

        this.id = id;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public double getTotal() {
        return quantity * price;


    }
}
