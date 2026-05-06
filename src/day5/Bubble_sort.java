package day5;

import java.util.Arrays;
import java.util.Scanner;
// take every highest element from the array and place at the very end
public class Bubble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length");
        int n = sc.nextInt();

        System.out.print("Enter elements: ");
        int[] elements = new int[n];
        for(int start=0;start<n;start++){
            elements[start] = sc.nextInt();
        }

        int[] result = bubble_sort(elements,n);
        System.out.println("Sorted array: "+ Arrays.toString(result));
    }

    private static int[] bubble_sort(int[] elements, int n) {

        for(int start=0;start<n-1;start++){
            int iswapped = 0;
            for(int end=0;end<n-start-1;end++){
                if(elements[end]>elements[end+1]){
                    int current = elements[end];
                    elements[end] = elements[end+1];
                    elements[end+1] = current;
                    iswapped = 1;
                }
            }
            if(iswapped == 0){
                break;
            }
        }
        return elements;
    }
}
