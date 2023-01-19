package CLASS6_BINARY_SEARCH;

public class CLASS6_BINARY_SEARCH {
    public static class ShiftedArray_Leetcode33 {
        public static void main(String[] args) {
            System.out.println(search(new int[]{20,30,2,12,13,14,15},30) + " is the index of target");
        }
        public static int search(int[] array, int target) {
            if (array == null || array.length == 0) {
                return -1;
            }
    //        if (array.length == 1) {
    //            if (array[0] == target)
    //                return 0;
    //        }

            // Step 1: find turning point index
            int i;
            int turningPoint = array.length - 1; //{20,30,2,12,13,14,15},30
            for (i = 1; i <= array.length - 1; i++) {
                if (array[0] < array[i]) {

                } else {
                    System.out.println("Turning point is: " + (i - 1));
                    turningPoint = i - 1;
                    break; //需要！否则就会又一次进入for循环
                    //return i - 1; //不能有return, 会跳出整个function!
                } //********** 注意！如果没有这个括号把return扩起来，会输出0,因为程序会认为return不属于else
            }


            // Step 2: cut the array into 2 parts from the tuning point, then do the binary search for each part
            // 为节省TC, 判断一下是否有 tuning point，没有的话，进行一次binary search即可，TC = O(log(N))

            int result_1 = binarySearch(array, target, 0, turningPoint); //{20,30,2,12,13,14,15},30
            if (result_1 == -1) {
                int result_2 = binarySearch(array, target, turningPoint + 1, array.length - 1);
                return result_2;//?问：如果此处执行了return,会不会触发error因为不会reach 到后面几行？或者line 49?
            } else {
                return result_1;
            }

    //
    //        // post process: if only 1 ele in shifted part
    //        if (array[array.length - 1] == target) {
    //            return array.length - 1;
    //        }

            //return -1;//？问，不写的话会有compile error 'missing return'；但写了的话，要谨慎‘ never reach这条语句’的errir
        }

        public static int binarySearch(int[] array, int target, int left, int right) { // ？问：这个系统可以判断仅有1个元素的情况吗？可以

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (array[mid] == target) {
                    return mid;
                } else if (array[mid] > target) {
                    right = mid - 1;
                } else
                    left = mid + 1;
            }
            return -1;
        }
    }
}
