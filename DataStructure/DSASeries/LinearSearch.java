package DSASeries;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class LinearSearch {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        int nums[] = {2,7,11,15,4,20,67,56};
        int searchNumber =100;
        int found =0;
        for (int i = 0; i <nums.length; i++) {
            if(searchNumber == nums[i])
            {
              found = i;
            }   
        }
        System.out.println("value found at " + found);
    }
}
