import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        reverse1(arr1);
        System.out.println();
        Integer[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        reverse2(arr2);

    }
    static void reverse1(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void reverse2(Integer a[])
    {
        System.out.println(Arrays.asList(a));
        Collections.reverse(Arrays.asList(a));
        System.out.println(Arrays.asList(a));
    }
}