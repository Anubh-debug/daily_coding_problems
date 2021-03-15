/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Anubh_sinha
 */
public class uber_interview_problem {
    public static void main(String args[])
    {
        //let the input be [1,2,3,4,5]
        int[] original = {1,2,3,4,5};
        int[] temp1 = new int[original.length]; //this array will hold the first product
        int[] temp2 = new int[original.length]; //this array will hold the second product
        temp1[0] = 1;
        temp2[original.length-1] = 1;
        for(int i=1;i<temp1.length;i++)
        {
            temp1[i] = temp1[i-1]*original[i-1];
        }
        for(int i=original.length-2;i>=0;i--)
        {
            temp2[i] = temp2[i+1]*original[i+1];
        }
        for(int i=0;i<original.length;i++)
        {
            original[i] = temp1[i]*temp2[i];
            System.out.print(original[i] + " ");
        }
    }
}
//output will be: 120 60 40 30 24
