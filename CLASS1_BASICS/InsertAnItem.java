package CLASS1_BASICS;

public class InsertAnItem {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 7};
        //insert(arr, 2, 4);
        int[] result = insert(arr, 2, 4);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static int[] insert(int[] arr, int pos, int value) {
        int[] newArr = new int[5];
        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }
        newArr[pos] = value;
        for (int i = pos + 1; i < newArr.length; i++) {
            newArr[i] = arr[pos];
            pos++;
        }
//        for (int i : newArr) {
//            System.out.print(i + ",");
//        }
        return newArr;

     /*
    public static  int[] insert(int[] arr, int element, int position) {
        int[] new_arr = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            new_arr[i] = arr[i];
        }
        new_arr[position] = element;
        for (int i = position; i < arr.length; i++) {
            new_arr[i + 1] = arr[i];
        }
        return new_arr;
    }

     */

    }
}


