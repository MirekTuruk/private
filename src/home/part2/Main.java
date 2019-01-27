package home.part2;

import home.BubbleSort;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 6, 7, 21, 65, 34,};
        new BubbleSort().sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        int[] array2 = {3, 1, 5, 6, 7, 21, 65, 34, 8};
    //    new HeapSort().sort(array2);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + " ");
        }
     //   Silnia silnia = new Silnia();
        System.out.println("----------------");
      //  System.out.println(silnia.silniaRekurencja(n:5));
    }
    //IntBinaryOperator
}
