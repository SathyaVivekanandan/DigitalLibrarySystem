import java.util.*;
public class Library {
    ArrayList<Book> books=new ArrayList<>();
public void addBook(Book book) {
    for (Book b : books) {
        if (b.id == book.id) {
            System.out.println("Book ID already exists. Please use a different ID.");
            return;
        }
    }
    books.add(book);
    System.out.println("Book Added Successfully");
}
public void viewBooks(){
    if(books.isEmpty()){
        System.out.println("No books Available");
        return;
    }
    for (Book b:books){
        System.out.println(
            b.id+"|"+
            b.title+"|"+
            b.author+"|"+
            (b.issued ? " Issued":"Available"));
    }
}
public void searchBook(int id){
    for(Book b: books){
        if(b.id==id){
            System.out.println("Book Found");
            System.out.println("ID : "+b.id);
            System.out.println("Title :"+b.title);
            System.out.println("Author :"+b.author);
            System.out.println("Status :"+(b.issued ? "Issued":"Available"));
            return;
        }
    }
    System.out.println("Book Not Found");
}
public void issueBook(int id){
    for(Book b: books){
        if(b.id==id){
        if(b.issued){
            System.out.println("Book Already Issued");
        }
        else{
            b.issued=true;
            System.out.println("Book Issued Successfully");
        }
        return;
    }
    }
    System.out.println("Book not Found");
}
public void returnBook(int id){
    for(Book b:books){
        if(b.id==id){
            if(!b.issued){
                System.out.println("Book Already Available");
            }
            else{
                b.issued=false;
                System.out.println("Book returned Successfully");
            }
            return;
        }
    }
    System.out.println("Book Not Found");
}
public void deleteBook(int id){
    for(int i=0;i<books.size();i++){
        if(books.get(i).id==id){
            books.remove(i);
            System.out.println("Book Deleted Successfully");
            return;
        }
    }
    System.out.println("Book Not Found");
}
}
