// use the 'private' access modifier and rely on getters/setters to retrieve/alter the object's data
// try to use multiple types of constructors and set the field's data in different manners (constructor or setter)
// use debugger to identify the changes

//1. A class called Employee, which models an employee with an ID, name and salary. The method raiseSalary(percent) increases the salary by the given percentage. Write the Employee class.
//        2. A class called InvoiceItem, which models an item of an invoice, with ID, description, quantity and unit price. Write the InvoiceItem class. This class should contain a method called getTotal() based on quantity and price.
//        3. A class called Date, which models a calendar date. Write the Date class. This class must contain a field for day, one for month and one for year. This class must contain a method to print the date with this template "day/month/year".
//        4. A class called Account, which models a bank account of a customer. The methods credit(amount) and debit(amount) add or subtract the given amount to the balance.
//        The method transferTo(anotherAccount, amount) transfers the given amount from this Account to the given anotherAccount. Write the Account class.


public class Main {
    public static void main(String[] args) {

//        1.------------------------------------------------------------------------------------------------------------------------------------


        Employee employee = new Employee(1, "John Doe", 50000.0);

        System.out.println("Original Employee Information:");
        System.out.println(employee);

        employee.raiseSalary(10); // Increase salary by 10%
        System.out.println("\nEmployee Information After Raise:");
        System.out.println(employee);

//        2.---------------------------------------------------------------------------------------------------------------------------------------

        InvoiceItem item=new InvoiceItem(1,"keyboard",2,20);

        System.out.println(" Initial Item: ");
        System.out.println(item);


        System.out.println("The final price of your order is:");
        System.out.println(item.getTotal());

    }
}