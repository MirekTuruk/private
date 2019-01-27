//package home.part2;
//
//public class HeapSort implements SortAlgorithm {
//    public HeapSort() {
//
//        public void sort(int[] array) {
//            int dlugoscTablicy = array.length;
//
//            for(int i = dlugoscTablicy / 2 - 1; i >= 0; i--) {
//          //  budujKopiec(array, dlugoscTablicy, i);
//            }
//        }
//        void budujKopiec(int tablica[], int dlugoscTablicy, int i) {
//            int largest = i;
//            int left = 2 * i + 1;
//            int right = 2 * i + 2;
//
//            if(left < dlugoscTablicy && tablica[i] > tablica[largest]) {
//                largest = left;
//
//            }
//            if(right < dlugoscTablicy && tablica[right] > tablica[largest]) {
//                largest = right;
//            }
//
//            if(largest != i) {
//                int temp = tablica[i];
//                tablica[i] = tablica[largest];
//                tablica[largest] = temp;
//
//              //  budujKopiec(tablica, dlugoscTablicy, largest);
//            }
//            for(int i = dlugoscTablicy - 1; i >= 0; i--) {
//                int temp =
//            }
//        }
//    }
//
//
//}
