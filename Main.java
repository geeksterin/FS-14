import java.io.*;
import java.util.*;

public class Main {

    public static void printTable(int n) {
        for(int i = 1; i <= 10; i ++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        System.out.println("***************************");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        printTable(scn.nextInt());
    }
    
    public static int getProfit(int CP, int SP, int units) {
        int profit = (SP - CP) * units - 100;
        return profit;
    } 

    
}