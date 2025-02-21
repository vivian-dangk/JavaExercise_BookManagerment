
package DKV_4459;
import java.util.*;
import java.text.*;
public class BookList {
    Scanner nhap= new Scanner(System.in);
    ArrayList<Book> danhsach = new ArrayList<>();
    public void addB(){
        System.out.println("Hay nhap tong so sach: ");
        int n=nhap.nextInt();
        nhap.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Hay nhap de phan loai (Text book/ Reference book): ");
            String loai=nhap.nextLine();
            if(loai.equalsIgnoreCase("text book")){
                TextBook mytext = new TextBook();
                mytext.addBook();
                danhsach.add(mytext);
            }else if(loai.equalsIgnoreCase("reference book")){
                ReferenceBook myrefe=new ReferenceBook();
                myrefe.addBook();
                danhsach.add(myrefe);
            }
        }
    }
    public void updateB(String id){
        for(Book bk: danhsach){
            if(bk.getID().equalsIgnoreCase(id)){
                bk.updateBook(id);
            }
        }
    }
    public void deleteB(String id){
        for(int i=danhsach.size();i>=0;i++){
            if(danhsach.get(i).getID().equalsIgnoreCase(id)){
                danhsach.remove(i);
            }
        }
    }
    public Book timBook(String id){
        for(Book mybook: danhsach){
            if(mybook.getID().equalsIgnoreCase(id)){
                return mybook;
            }
        }
        return null;
    }
    public void diplayBook(){
        for(Book myb: danhsach){
            myb.display();
        }
    }
}
