//Java Stdin and Stdout II
public class Test2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a =sc.nextInt();
    Double b=sc.nextDouble();
      sc.nextLine();
      String s = sc.nextLine();
      sc.close();
    

    System.out.println("String: " + s);
    System.out.println("Double: " + b);
    System.out.println("Int: " + a);
}
}
