
package DKV_4459;
import java.util.*;
public class TextBook extends Book{
    Scanner nhap=new Scanner(System.in);
    private String status;
    public TextBook(String BookID, String publisher, Date entryDate, double unitPrice, double quantity, String status){
        super(BookID, publisher, entryDate, unitPrice, quantity);
        this.status=status;
    }
    public TextBook(){
        
    }
    @Override
    public void addBook(){
        super.enter();
        System.out.println("Hay nhap tinh tieu de sach: ");
        this.status=nhap.nextLine();
    }
    @Override
    public void updateBook(String id){
        super.edit(id);
        System.out.println("Hay nhap tieu de moi: ");
        this.status=nhap.nextLine();
    }
    @Override
    public void displayB(){
        super.display();
        System.out.println("Tieu de: "+status);
    }
}
