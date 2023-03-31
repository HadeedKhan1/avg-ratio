import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("RATIO Calculator");
    Scanner scE = new Scanner(System.in);
    System.out.println("Enter Event");
    String event = scE.nextLine();
    System.out.println("Enter Fastest solve time");
    double fastest = scE.nextDouble();
    System.out.println("Enter Average Time");
    double avg = scE.nextDouble();
    System.out.println("Your Fastest to Average ratio is: " + (fastest / avg));
  }
}