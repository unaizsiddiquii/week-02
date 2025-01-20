class Person {
  private String name;
  private int age;

  // Default constructor
  public Person() {
      this.name = "Unknown";
      this.age = 0;
  }

  // Parameterized constructor
  public Person(String name, int age) {
      this.name = name;
      this.age = age;
  }

  // Copy constructor
  public Person(Person other) {
      this.name = other.name;
      this.age = other.age;
  }

  // Getter and Setter methods
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  public int getAge() {
      return age;
  }

  public void setAge(int age) {
      this.age = age;
  }

  // Method to display person details
  public void display() {
      System.out.println("Name: " + name + ", Age: " + age);
  }

  public static void main(String[] args) {
      // Create a person using the parameterized constructor
      Person person1 = new Person("Alice", 25);
      person1.display();

      // Clone person1 using the copy constructor
      Person person2 = new Person(person1);
      person2.display();

      // Modify the cloned person's details
      person2.setName("Bob");
      person2.setAge(30);

      // Display the updated details of the cloned person
      System.out.println("\nAfter modifying the cloned person's details:");
      person1.display(); // Original person remains unchanged
      person2.display();
  }
}
