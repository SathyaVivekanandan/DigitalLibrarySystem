# Project Design Document

## Project Name

Digital Library System

## Design Overview

The Digital Library System is designed as a Java console-based application. It uses Object-Oriented Programming concepts to manage books, users, book issue operations, and return operations.

## Class Design

### 1. Book Class

The Book class stores details of each book.

**Attributes:**
- bookId
- title
- author
- availabilityStatus

**Methods:**
- Book()
- getBookId()
- getTitle()
- getAuthor()
- isAvailable()
- setAvailable()

### 2. Library Class

The Library class manages all library operations.

**Attributes:**
- ArrayList<Book> books

**Methods:**
- addBook()
- viewBooks()
- searchBook()
- issueBook()
- returnBook()

### 3. Main Class

The Main class controls program execution and displays the menu.

**Responsibilities:**
- Create Library object
- Display menu options
- Get user input using Scanner
- Call library methods based on user choice
- Exit the application

## Class Relationship

Main Class  
↓  
Library Class  
↓  
Book Class  

The Main class communicates with the Library class.  
The Library class stores and manages Book objects using ArrayList.

## Data Structure Used

ArrayList is used to store book objects because it allows dynamic addition, searching, and updating of books.

## Menu Design

1. Add Book  
2. View Available Books  
3. Search Book  
4. Issue Book  
5. Return Book  
6. Exit  

## Input Design

The application accepts input from the user using the Scanner class.

Examples:
- Book ID
- Book Title
- Author Name
- Menu Choice

## Output Design

The application displays messages in the console.

Examples:
- Book added successfully
- Book found
- Book issued successfully
- Book returned successfully
- Invalid choice

## Design Conclusion

The project design is simple, modular, and easy to maintain. Each class has a separate responsibility, which makes the application easier to understand and expand in the future.