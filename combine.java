/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Tsebiso.Nzinzama
 */
import java.util.ArrayList;
import java.util.Arrays;
public class combine {
    
    public static int[] combine(int[] arr, int[] arr2) {
        
        ArrayList<Integer> combine = new ArrayList<>();
        int min = Math.min(arr.length, arr2.length);

        
        for (int i = 0; i < min; i++) {
            combine.add(arr[i]);
            combine.add(arr2[i]);
        }

        
        if (arr.length > min) {
            for (int i = min; i < arr.length; i++) {
                combine.add(arr[i]);
            }
        } else if (arr2.length > min) {
            for (int i = min; i < arr2.length; i++) {
                combine.add(arr2[i]);
            }
        }

        
        int[] result = new int[combine.size()];
        for (int i = 0; i < combine.size(); i++) {
            result[i] = combine.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 45};
        int[] arr2 = {1, 2, 3};
        int[] result = combine(arr, arr2);
        System.out.println(Arrays.toString(result));
    }
    
}


