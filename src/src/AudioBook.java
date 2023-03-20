package src;

public class AudioBook extends Book {

  //Data fields
  private double lengthInMinutes;

  /**
   * AudioBook constructor.
   * it will initialize the title, the length in minutes and the price with the given parameters.
   * it will initialize the realease date with the given date parameters.
   * it will initialize the id with the currently book number.
   * @param title title of the book
   * @param price price of the book
   * @param lengthInMinutes length in minutes of the book
   * @param year year of the book
   * @param month month of the book
   * @param day day of the book
   */
  AudioBook(
    String title,
    double price,
    int year,
    int month,
    int day,
    double lengthInMinutes
  ) {
    super(title, price, year, month, day);
    this.lengthInMinutes = lengthInMinutes;
  }

  //Methods
  /**
   * A getter method to get the AudioBook's length in minutes
   * @return double return the lengthInMinutes
   */
  public double getLengthInMinutes() {
    return lengthInMinutes;
  }

  /**
   * A setter method to set the AudioBook's length in minutes
   * @param lengthInMinutes the lengthInMinutes to set
   */
  public void setLengthInMinutes(double lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  ////////////////////////////////////////////////////////////////
  //Question 2 modifications

  /**
   * overridden toString method to get all the data of the AudioBook
   */
  @Override
  public String toString() {
    return (
      super.toString() + "length in minutes: " + this.lengthInMinutes + "\n"
    );
  }

  /**
   * to print all the AudioBook's data using toString method
   */
  @Override
  void print() {
    System.out.println("The AudioBook's Data:");
    System.out.print(this.toString());
  }

  /**
   * overridden equals method to compare between two AudioBooks,
   * it returns 1 if they both have the same title and release date and the length in minutes.
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
    } else if (!(o instanceof AudioBook)) {
      return false;
    }
    //same data type
    else {
      //Cast the object to an AudioBook to compare
      AudioBook temp = (AudioBook) o;
      //AudioBooks are equal for the same title, release date and length in minutes
      if (
        this.getTitle() == temp.getTitle() &&
        this.getReleaseDate() == temp.getReleaseDate() &&
        this.getLengthInMinutes() == temp.getLengthInMinutes()
      ) {
        return true;
      } else {
        return false;
      }
    }
  }
}
