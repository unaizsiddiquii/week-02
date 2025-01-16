public class MovieTicket {

  private String movieName;
  private String seatNumber;
  private double price;

  // Constructor
  public MovieTicket(String movieName) {
    this.movieName = movieName;
    this.seatNumber = null;
    this.price = 0.0;
  }

  // Method to book a ticket
  public void bookTicket(String seatNumber, double price) {
    if (this.seatNumber == null) {

      this.seatNumber = seatNumber;
      this.price = price;

      System.out.println("Ticket booked successfully for " + movieName + ".");
    } else {
      System.out.println("This ticket has already been booked.");
    }

  }

  // Method to display ticket details
  public void displayTicket() {

    System.out.println("Movie Name: " + this.movieName);
    System.out.println("Seat Number: " + this.seatNumber);
    System.out.println("Price: " + this.price);

  }

  public static void main(String[] args) {

    MovieTicket movieTicket = new MovieTicket("KGF 2");

    // book ticket
    movieTicket.bookTicket("399", 250);
    // displaying the ticket details
    movieTicket.displayTicket();

    // Attempting to book the ticket again
    movieTicket.bookTicket("400", 300);

  }
}
