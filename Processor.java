
package DKV_4459;
import java.util.*;
import java.text.*;
public class Processor {
    public static void main(String[] args) {
        BookList danhsach=new BookList();
        Scanner nhap=new Scanner(System.in);
        while(true){
            System.out.println("Hay chon cac tac vu: ");
            System.out.println("1. Nhap thong tin.");
            System.out.println("2. In thong tin.");
            System.out.println("3. Cap nhap thong tin theo ID.");
            System.out.println("4. Xoa sach theo ID.");
            System.out.println("5. Tim sach theo ID");
            System.out.println("6. Thoat.");
            System.out.println();
            int chon=nhap.nextInt();
            nhap.nextLine();
            switch(chon){
                case 1: 
                    danhsach.addB();
                    break;
                case 2:
                    danhsach.diplayBook();
                    break;
                case 3: 
                    System.out.println("Hay nhap ID sach muon cap nhap: ");
                    String id=nhap.nextLine();
                    danhsach.updateB(id);
                    break;
                case 5: 
                    System.out.println("Hay nhap ID sach muon tim: ");
                    String ID=nhap.nextLine();
                    Book myb=danhsach.timBook(ID);
                    if(myb!=null){
                        System.out.println("Da thay.");
                        myb.display();
                    }else{
                        System.out.println("Khong tim thay sach.");
                    }
                    break;
                case 4:
                    System.out.println("Hay nhap ID sach muon xoa: ");
                    String Id=nhap.nextLine();
                    danhsach.deleteB(Id);
                    break;
                case 6:
                    System.out.println("Dang thoat.............");
                    System.out.println("Bye!!!!!");
            }
            if(chon==6){
                break;
            }
        }
    }
}
