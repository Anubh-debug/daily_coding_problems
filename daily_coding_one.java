/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*; 
import java.util.*; 
/**
 *
 * @author Anubh_sinha
 */
public class find_sum {
    public static void main(String args[])
    {
        int flag=0;
        Scanner anubhav = new Scanner(System.in);
        Hashtable<Integer, Integer> ht = new Hashtable<>(); //declaring hashtable to make amortized cost = 1;
        int[] array = {10,5,3,7,6,9,13};
        for(int i=0;i<array.length;i++)
        {
            ht.put(i, array[i]);
        }
        System.out.println("Enter the number whose sum exist or not you want to check: ");
        int x = anubhav.nextInt();
        for(int i=0;i<array.length;i++)
        {
            int y = Math.abs(x - array[i]);
            for(Map.Entry<Integer, Integer> e : ht.entrySet())
            {
                if(e.getKey() !=i && e.getValue() == y)
                {
                    System.out.println("True");
                    flag = 1;
                }
            }
            if(flag == 1)
                break;
        }
        if(flag == 0)
        {
            System.out.println("pair cannot be found.");
        }
    }
}

