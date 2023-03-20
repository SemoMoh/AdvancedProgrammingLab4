package src;

public class TextBook extends Book {

  //Data fields
  private int noOfPages;

  /**
   * TextBook constructor.
   * it will initialize the title, the no. of pages and the price with the given parameters.
   * it will initialize the release date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param noOfPages number of pages in the book
   * @param year year of the book
   * @param month month of the book
   * @param day day of the book
   */
  TextBook(
    String title,
    double price,
    int year,
    int month,
    int day,
    int noOfPages
  ) {
    super(title, price, year, month, day);
    this.noOfPages = noOfPages;
  }

  //Methods
  /**
   * A getter method to get the TextBook's no. of pages
   * @return int return the noOfPages
   */
  public int getNoOfPages() {
    return noOfPages;
  }

  /**
   * A setter method to set the TextBook's no. of pages
   * @param noOfPages the noOfPages to set
   */
  public void setNoOfPages(int noOfPages) {
    this.noOfPages = noOfPages;
  }

  ////////////////////////////////////////////////////////////////
  //Question 2 modifications

  /**
   * overridden toString method to get all the data of the TextBook
   */
  @Override
  public String toString() {
    return super.toString() + "Number of pages: " + this.noOfPages + "\n";
  }

  /**
   * to print all the TextBook's data using the toString method
   */
  @Override
  void print() {
    System.out.println("The TextBook's Data:");
    System.out.print(this.toString());
  }

  /**
   * overridden equals method to compare between two TextBooks,
   * it returns 1 if they both have the same title and release date and the no. of pages.
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
    } else if (!(o instanceof TextBook)) {
      return false;
    }
    //same data type
    else {
      //Cast the object to a TextBook to compare
      TextBook temp = (TextBook) o;
      //TextBooks are equal for the same title, release date and no of pages 
      if (
        this.getTitle() == temp.getTitle() &&
        this.getReleaseDate() == temp.getReleaseDate() &&
        this.getNoOfPages() == temp.getNoOfPages()
      ) {
        return true;
      } else {
        return false;
      }
    }
  }
}
