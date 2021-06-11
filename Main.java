import java.util.Scanner;


class Main {
  public static void main(String[] args) {
    System.out.println("Enter a number:");
    Scanner number = new Scanner(System.in);
    String data = number.nextLine();
    int info =  Integer.parseInt(data);
    System.out.println(info);
    if(info > 1000) {
      System.out.println("Number is over 1000");
    }
    for(int a = info; a <= 1000; a = a + 10) {
      System.out.println(a);
    }
  }
}
