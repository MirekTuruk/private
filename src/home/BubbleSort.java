package home;

public class BubbleSort {

    public static void main(String[] args) {

        int[] array = {3,1,5,6,7,21,65,34,8};
        new BubbleSort().sort(array);
        sortBubble(array);
        for (int i = 0; i < array.length; i++)  {
            System.out.print(array[i]);

        }
    }

    public void sort(int[] array) {
    }

    public static void sortBubble(int[] array) {
        int temp;
      //  for (int i = 0; i < array.length = 1; i++) {
        for (int j = 1; j < array.length - 1; j++) {
            if (array[j - 1] > array[j]) {
                temp = array[j -1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
        }

    }


