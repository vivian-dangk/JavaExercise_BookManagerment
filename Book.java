
package DKV_4459;
import java.util.*;
import java.text.*;
public abstract class Book implements IBook{
    Scanner nhap=new Scanner(System.in);
    private String BookID;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    private SimpleDateFormat bd =new SimpleDateFormat("dd/MM/yyyy");
    public Book(String BookID, String pulisher, Date entryDate, double unitPrice, double quantity){
        this.BookID=BookID;
        this.entryDate=entryDate;
        this.publisher=pulisher;
        this.quantity=quantity;
        this.unitPrice=unitPrice;
    }
    public Book(){
        
    }
    public String getID(){
        return BookID;
    }
    public void setDate(Date dateEntry){
        this.entryDate=dateEntry;
    }
    public void setPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    public void setPublicsher(String publicsher){
        this.publisher=publicsher;
    }
    @Override
    public void addBook(){
    }
    @Override
    public void updateBook(String id){
    }
    @Override
    public void displayB(){
    }
    public void enter(){
        System.out.println("Hay nhap ID: ");
        this.BookID=nhap.nextLine();
        System.out.println("Hay nhap NXB: ");
        this.publisher=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay nhap ngay nhap sach: ");
                this.entryDate=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai, hay nhap lai!");
            }
        }
        System.out.println("Hay nhap gia niem yet: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay nhap so luong: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    public void edit(String id){
        System.out.println("Hay nhap NXB moi: ");
        this.publisher=nhap.nextLine();
        while(true){
            try{
                System.out.println("Hay sua ngay nhap sach: ");
                this.entryDate=bd.parse(nhap.nextLine());
                break;
            }catch(ParseException e){
                System.out.println("Nhap sai, hay nhap lai!");
            }
        }
        System.out.println("Hay nhap gia niem yet moi: ");
        this.unitPrice=nhap.nextDouble();
        System.out.println("Hay nhap so luong moi: ");
        this.quantity=nhap.nextDouble();
        nhap.nextLine();
    }
    public void display(){
        System.out.println("ID: "+BookID+", NXB: "+publisher+", Ngay: "+bd.format(entryDate));
        System.out.println("Gia niem yet: "+unitPrice+", So luong: "+quantity);
    }
}
