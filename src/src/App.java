package src;

import java.util.Scanner;

public class App {

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    // get the no of book--> array size
    System.out.print("Enter the no. of books you want to privide: ");
    int noOfBooks = scanner.nextInt();
    //declare the array of book
    Book[] books = new Book[noOfBooks];
    int i = 0;
    //loop to get the books from the user
    for (i = 0; i < noOfBooks; i++) {
      books[i] = readBook(i);
    }
    //listing the books
    System.out.println("*****list of all the entered books*****");
    for (i = 0; i < noOfBooks; i++) {
      System.out.println("Book no: " + (i + 1));
      books[i].print();
      System.out.println("/////////////////////////////////////////////////");
      System.out.println();
    }
  }

  /**
   * method to read the entered book
   * @param i entered book number i
   * @return entered book
   */
  public static Book readBook(int i) {
    System.out.println("Provide book number: " + (i + 1));
    //choose the type of the book
    System.out.print(
      "Enter 1: to add a TextBook\nEnter 2:to add an AudioBook\nType here:"
    );
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    //loop for invalid choises
    while (choice < 1 || choice > 2) {
      System.out.println("invalid");
      System.out.print(
        "Enter 1: to add a TextBook\nEnter 2:to add an AudioBook\nType here:"
      );
      choice = scanner.nextInt();
    }
    //get the books' data
    System.out.println("Enter the book's Data: ");
    System.out.print("The title: ");
    String title = scanner.next();
    System.out.print("Price: ");
    double price = scanner.nextDouble();
    System.out.print("Release date: -year: ");
    int year = scanner.nextInt();
    System.out.print("-month: ");
    int month = scanner.nextInt();
    System.out.print("-day: ");
    int day = scanner.nextInt();

    //to get the Text/Audio book special data
    switch (choice) {
      case 1:
        return readTextBook(title, price, year, month, day);
      case 2:
        return readAudioBook(title, price, year, month, day);
    }
    return null;
  }

  /**
   * read the TextBook's special data from the user
   * @param title of the book
   * @param price of the book
   * @param year of release date of the book
   * @param month of release date of the book
   * @param day of release date of the book
   * @return entered TextBook
   */
  public static TextBook readTextBook(
    String title,
    double price,
    int year,
    int month,
    int day
  ) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("no. of pages: ");
    int noOfPages = scanner.nextInt();
    //a space
    System.out.println("/////////////////////////////////////////////////");
    System.out.println();
    return new TextBook(title, price, year, month, day, noOfPages);
  }

  /**
   * read the AudioBook's special data from the user
   * @param title of the book
   * @param price of the book 
   * @param year of release date of the book  
   * @param month of release date of the book
   * @param day of release date of the book
   * @return entered AudioBook
   */
  public static AudioBook readAudioBook(
    String title,
    double price,
    int year,
    int month,
    int day
  ) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Length in minutes: ");
    double lengthInMinutes = scanner.nextDouble();
    //a space
    System.out.println("/////////////////////////////////////////////////");
    System.out.println();
    return new AudioBook(title, price, year, month, day, lengthInMinutes);
  }
}
