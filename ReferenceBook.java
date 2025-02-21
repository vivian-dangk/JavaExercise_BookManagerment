
package DKV_4459;
import java.util.*;
public class ReferenceBook extends Book {
    private double tax;
    public ReferenceBook(String BookID, String publisher, Date entryDate, double unitPrice, double quantity, double tax){
        super(BookID, publisher, entryDate, unitPrice, quantity);
        this.tax=tax;
    }
    public ReferenceBook(){
        
    }
    @Override
    public void addBook(){
        super.enter();
        System.out.println("Hay nhap thue: ");
        this.tax=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void updateBook(String ID){
        super.edit(ID);
        System.out.println("Hay cap nhat thue: ");
        this.tax=nhap.nextDouble();
        nhap.nextLine();
    }
    @Override
    public void displayB(){
        super.display();
        System.out.println("Thue: "+tax);
    }
}
