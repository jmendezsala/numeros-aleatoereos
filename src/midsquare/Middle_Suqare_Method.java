/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsquare;
import java.util.Random;
import java.util.Scanner;
 
 
public class Middle_Suqare_Method
{
    static int a[] = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};
    static int middleSquareNumber(int numb, int dig)
            
    {
        int sqn = numb*numb, next_num=0;
        int trim = (dig/2);
        sqn = sqn / a[trim];
        for(int i=0; i<dig; i++)
        {
            next_num += (sqn%(a[trim]))*(a[i]);
            sqn = sqn/100;
        }
        return next_num;
    }
    public static void main(String args[])
    {
        System.out.println("ingrese los numeros: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int end;
 
        int start= end =1;
 
        start = a[n-1];
        end = a[n]; 
 
        Random rand = new Random();
        int numbero = rand.nextInt(end-start)+start;
        System.out.print("los numerosn aleatoreos son:\n" +numbero+", ");
        int new_numbero=0;
        for(int i=0; i<15; i++)
        {
            numbero = Middle_Suqare_Method.middleSquareNumber(numbero, n);
            System.out.print(numbero+", ");
        }
        System.out.print("...");
 
        sc.close();
    }
}
    

