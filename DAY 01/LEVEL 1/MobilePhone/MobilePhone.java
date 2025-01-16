package MobilePhone;

//create class MobilePhone
public class MobilePhone {

  //instance variable
  private String brand;
  private String model;
  private double price;

  //constructor
  public MobilePhone(String brand, String model, double price) {

    this.brand = brand;
    this.model = model;
    this.price = price;

  }
  //display mobile phone details
  public void mobilePhoneDetails() {
    System.out.println("\nMobile Details---\n");
    System.out.println("Brand : " + brand);
    System.out.println("Model : " + model);
    System.out.println("Price : " + price);
  }

  public static void main(String[] args) {

    //object of mobilePhone class
    MobilePhone mobilePhone = new MobilePhone("iPhone", "15 pro", 69999);

    //calling method to display Details
    mobilePhone.mobilePhoneDetails();
    MobilePhone mobilePhone2 = new MobilePhone("OnePlus", "13R", 44999);
    mobilePhone2.mobilePhoneDetails();

  }
}
