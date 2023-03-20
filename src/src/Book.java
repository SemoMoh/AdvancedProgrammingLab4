package src;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Book {

  //Data fields
  private int id;
  private String title;
  private LocalDate releaseDate;
  private double price;
  private static int idCounter = 1;

  /**
   * Book constructor.
   * it will initialize the title and the price with the given parameters.
   * it will initialize the release date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param year year of release date
   * @param month month of release date
   * @param day day of release date
   */
  Book(String title, double price, int year, int month, int day) {
    this.id = idCounter;
    idCounter++;
    this.title = title;
    this.price = price;
    this.releaseDate = LocalDate.of(year, month, day);
  }

  //Methods
  /**
   * A getter method to get the book's id
   * @return int return the id
   */
  public int getId() {
    return id;
  }

  /**
   * A setter method to set the book's id.
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * A getter method to get the book's title
   * @return String return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * A setter method to set the book's id
   * @param title the title to set
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * A getter method to get the book's release date
   * @return LocalDate return the releaseDate
   */
  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  /**
   * A setter method to set the book's release date
   * @param year the year to set
   * @param month the month to set
   * @param day the day to set
   */
  public void setReleaseDate(int year, int month, int day) {
    this.releaseDate = LocalDate.of(year, month, day);
  }

  /**
   * A getter method to get the book's price
   * @return double return the price
   */
  public double getPrice() {
    return price;
  }

  /**
   * A setter method to set the book's price
   * @param price the price to set
   */
  public void setPrice(double price) {
    this.price = price;
  }

  /////////////////////////////////////////////////////////////////////////////
  //Question 2 modifications

  /**
   * overridden toString method to get all the data of the Book
   */
  @Override
  public String toString() {
    //to format the date as (day, month, year)
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(
      "dd, MM, YYYY"
    );
    return (
      "ID: " +
      this.id +
      " . Title: " +
      this.title +
      " .\nPrice: " +
      this.price +
      " . Release Date: " +
      dateTimeFormatter.format(this.releaseDate)+"\n"
    );
  }

  /**
   * to print all the book's data using the toString method
   */
  void print() {
    System.out.print("the Books' data"+this.toString());
  }

  /**
   * overridden equals method to compare between two books,
   * it returns 1 if they both have the same title and release date.
   * We have to keep the parameter as in the original equals method 
   * so that we achieve the concept of override.
   * @param Object any object you want to compare
   * @return 1 if they are equal, 0 otherwise
   */
  @Override
  public boolean equals(Object o) {
    //the same object (same refernce)
    if (this == o) {
      return true;
      //different data type
    } else if (!(o instanceof Book)) {
      return false;
    }
    //same data type
    else {
      //Cast the object to a Book to compare
      Book temp = (Book) o;
      //Books are equal for the same title and release date
      if (this.title == temp.title && this.releaseDate == temp.releaseDate) {
        return true;
      } else {
        return false;
      }
    }
  }
}
