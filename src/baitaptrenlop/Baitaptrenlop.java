
package baitaptrenlop;
import java.util.Scanner;

public class Baitaptrenlop {

   
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String n = keyboard.nextLine();
        
        System.out.println("Nhap tuoi: ");
        int n1 = keyboard.nextInt();
        
        System.out.println("Nhap nam sinh: ");
        int n2 = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("Nhap gioi tinh: ");
        String n3 = keyboard.nextLine();
        
        System.out.println("Nhap chuyen nganh: ");
        String n4 = keyboard.nextLine();
        
        System.out.println("Nhap GPA: ");
        double n5 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Nhap que quan: ");
        String n6 = keyboard.nextLine();
        System.out.println(" ");
        
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
    }
    
}
    
