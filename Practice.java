package main.java.com.mycompany.javaquestions;

/**
 * practice
 */
import java.util.*;
public class practice {
    static Scanner scr = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello World in vs code editor");
        System.out.println("Is this realy exciting as Netbeans Ide to code?");
        int[] arr = {5, 8 , 6, 15, 13};
        int n = arr.length; 
        for(int i=0; i<n; i++) {
            for(int j =0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                for(int x: arr) System.out.print(x);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();
    }
}