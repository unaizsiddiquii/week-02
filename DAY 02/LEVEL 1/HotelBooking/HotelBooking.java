class HotelBooking {
  private String guestName;
  private String roomType;
  private int nights;

  // Default constructor
  public HotelBooking() {
    guestName = "Unknown";
    roomType = "Standard";
    nights = 1;
  }

  // Parameterized constructor
  public HotelBooking(String guestName, String roomType, int nights) {
    this.guestName = guestName;
    this.roomType = roomType;
    this.nights = nights;
  }

  // Copy constructor
  public HotelBooking(HotelBooking other) {
    this.guestName = other.guestName;
    this.roomType = other.roomType;
    this.nights = other.nights;
  }

  // Method to display booking details
  public void display() {
    System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
  }

  public static void main(String[] args) {
    // Default booking
    HotelBooking booking1 = new HotelBooking();
    booking1.display();

    // Parameterized booking
    HotelBooking booking2 = new HotelBooking("John Doe", "Deluxe", 3);
    booking2.display();

    // Copy of the parameterized booking
    HotelBooking booking3 = new HotelBooking(booking2);
    booking3.display();
  }
}
