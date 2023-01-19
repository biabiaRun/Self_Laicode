package CLASS3_ARRAY;

public class Array {
    public static void main(String[] args) {
//        System.out.println(display()[0]); //如果单纯打印display（）只会出现地址；但可通过这个地址自由做任何operation，比如access第一个元素
//        int[] arr = {1,4,2,0,-1,-3}; //第一种写法
//        System.out.println(arr);
//        int[] arr2 = new int[]{1, 4};
//        System.out.println(findMin(new int[]{1,4,2,0,-1,-3})); //第二种写法
        //System.out.println(findMin({1,4,2,0,-1,-3}); //为什么不行？
        System.out.println(reverseArray(new int[]{1}));//哪怕只有1个元素，l<r or l<= r都不影响
                                                 // l<=r虽然不报错，但多余，时间复杂度多1；就不要写

    }

    static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) { //该if block也可用三目运算符写：min = arr[i] < min? arr[i]: min;
                min = arr[i];
            }
        }
        return min;
    }

    static int[] reverseArray(int[] arr) {
        // assume array is non-null
        int l = 0;
        int r = arr.length - 1;
        while(l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }


    static int[] display() {
        int[] arr  = {1001,2,3,4,};
        //System.out.println(arr); //[I@2f92e0f4
        return arr;
        //for (int i : arr) { //enhanced for loop
        //    System.out.print(i + " ");
        //}
    }
}
