
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        

    }
    
    public static int smallest(int[] array) {
        int small = array[0];
        for (int integer : array) {
            if (small > integer) {
                small = integer;
            }
        }
        return small;
    }
    
    public static int indexOfSmallest(int[] array){
        int small = MainProgram.smallest(array);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == small) {
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for ( int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        array[index1] = array[index2];
        array[index2] = helper;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfSmallestFrom(array, i));
        }
    }

}
