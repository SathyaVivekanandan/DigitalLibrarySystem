import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Library library=new Library();
        while(true){
            System.out.println("\n=====DIGITAL LIBRARY=====");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Exit");
            System.out.println("Enter Choice:");
            int choice =sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter Book Id: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title=sc.nextLine();
                    System.out.print("Enter Author Name:");
                    String author=sc.nextLine();
                    Book book=new Book(id,title,author);
                    library.addBook(book);
                    break;
                case 2:
                    library.viewBooks();
                    break;
                case 3:
                    System.out.println("Enter book ID to search: ");
                    int searchId=sc.nextInt();
                    library.searchBook(searchId);
                    break;
                case 4:
                    System.out.println("Enter Book ID to issue: ");
                    int issueId=sc.nextInt();
                    library.issueBook(issueId);
                    break;
                case 5:
                    System.out.println("Enter Book ID to return: ");
                    int returnId=sc.nextInt();
                    library.returnBook(returnId);
                    break;
                case 6:
                    System.out.println("Enter Book Id to Delete: ");
                    int deleteId=sc.nextInt();
                    library.deleteBook(deleteId);
                    break;
                case 7:
                    System.exit(0);
                    sc.close();
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
