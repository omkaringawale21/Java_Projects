package com.company;

class Library{
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are :");
        for (String book : this.books){
            if (book == null){continue;}
            System.out.println("* " + book);
        }
    }
    void issueBook(String book){
            try {
                for (int i=0; i<this.books.length; i++){
                  if (this.books[i].equals(book) ){
                      System.out.println("The book has been issued! " + book);
                      this.books[i] = null;
                      return;
                  }
                }
            }catch(NumberFormatException e){
                System.out.println(e);
            }

        System.out.println("This book does not exist");
    }

    void returnBook(String book){
        addBook(book);
    }
}

public class LibraryShoutouts {
    public static void main(String[] args){
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("C++");
        centralLibrary.addBook("My Strength!");
        centralLibrary.showAvailableBooks();

        centralLibrary.issueBook("Think and grow Rich");
        centralLibrary.showAvailableBooks();
        centralLibrary.returnBook("Think and grow Rich");
        centralLibrary.showAvailableBooks();

    }
}
