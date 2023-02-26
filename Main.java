import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a word:");
    String word = sc.nextLine();

    int length= word.length();
    System.out.println(length);
    
  }
}