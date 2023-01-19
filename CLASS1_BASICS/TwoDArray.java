package CLASS1_BASICS;

public class TwoDArray {
    public static void main(String[] args) {

        String[][] arr = new String[3][4];
        System.out.println(arr.length); //return 3, the row number
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + ' ');
            }
            System.out.println();

        }
/* result:
3
null null null null
null null null null
null null null null
 */


        // 2D array = an array of arrays

        String[][] cars = 	{
                {"Camaro","Corvette","Silverado"},
                {"Mustang","Ranger","F-150"},
                {"Ferrari","Lambo","Tesla"}
        }; //第二种declare方法： String[][] cares = new String[3][3] 然后接下面一坨，一个一个assign value的部分

		/*
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Ranger";
		cars[1][2] = "F-150";
		cars[2][0] = "Ferrari";
		cars[2][1] = "Lambo";
		cars[2][2] = "Tesla";
		*/

        for(int i=0; i<cars.length; i++) {
            System.out.println();
            for(int j=0; j<cars[i].length; j++) {
                System.out.print(cars[i][j]+" ");
            }
        }
    }
}

