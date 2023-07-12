import java.io.*;
import java.util.*;

public class Main {
    public static void printTable(int n) {
        for(int i = 1; i <= 10; i ++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        System.out.println("***************************");
    }

    
    public static int getProfit(int CP, int SP, int units) {
        int profit = (SP - CP) * units - 100;
        return profit;
    } 

    // public static void main(String[] args) {
    //     Scanner scn = new Scanner(System.in);
    //     printTable(9);
    //     printTable(19);
    //     printTable(94);
    //     int CP = scn.nextInt();
    //     int myProfit = getProfit(CP, 10, 4000);
    //     System.out.println(myProfit);
    // }

    public static void printFLD(int n) {
        int ld = n % 10;
        while(n >= 10) n /= 10;
        int fd = n;
    }

    public static void main(String[] args) {
        int[] ritik = new int[5];
        
        for(int i = 0; i < ritik.length; i ++)
            ritik[i] = i * 10;

        for(int i = 0; i < ritik.length; i ++) 
            System.out.println(ritik[i]);
    }

}



