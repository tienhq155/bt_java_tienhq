import java.util.Scanner;
public class bai62_64 {
    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
    System.out.println("nhập A");
    double a = scanner.nextDouble();
    System.out.println("nhập b");
    double b = scanner.nextDouble();
    System.out.println("nhập c");
    double c = scanner.nextDouble();
    
    if( a == 0){
        if(b == 0){
            System.out.println("Phương trình vô số nghiệm");
        }
        else{
            System.out.println("Phương trình vô nghiệm");
        }
    }
    else{
        double x = -b/a;
        System.out.println("Nghiệm của phương trình là: " + x);
    }
    //---------------------------------------------------------------------------------
    double delta = b*b - 4*a*c;
    if(delta < 0){
        System.out.println("Phương trình vô nghiệm");
    }
    else if(delta == 0){
        double x = -b/(2*a);
        System.out.println("Phương trình có nghiệm kép: " + x);
    }
    else{
        double x1 = (-b + Math.sqrt(delta)) / (2*a);
        double x2 = (-b - Math.sqrt(delta)) / (2*a);
        System.out.println("Phương trình có hai nghiệm phân biệt: " + x1 + " và " + x2);
    }
    //---------------------------------------------------------------------------------
    double delta1 = b*b - 4*a*c;
    if(delta1 < 0){
        System.out.println("Phương trình vô nghiệm");
    }
    else if(delta1 == 0){
        double x = -b/(2*a);
        System.out.println("Phương trình có nghiệm kép: " + x);
    }
    else{
        double x1 = (-b + Math.sqrt(delta1)) / (2*a);
        double x2 = (-b - Math.sqrt(delta1)) / (2*a);
        System.out.println("Phương trình có hai nghiệm phân biệt: " + x1 + " và " + x2);
    }
}
}
