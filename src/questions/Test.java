//package questions;
//
//import java.util.Arrays;
//
//public class Test {
    //    public static void main(String[] args) {
//        int[] arr={9,6,4,2,3,5,7,0,1};
//        System.out.println(missingNumber(arr));
//    }
//    static int missingNumber(int[] arr) {
//        for (int i = 0; i <= arr.length; i++) {
//            for (int j = 1; j < arr.length ; j++) {
//                if (arr[j] < arr[j - 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j - 1];
//                    arr[j - 1] = temp;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] != i) {
//                return i;
//            }
//        }
//        return arr.length;
//    }
//        int[][] accounts={{1,5},{7,3},{3,5}};
//        System.out.println(maximumWealth(accounts));
//    }
//    static int maximumWealth(int[][] accounts) {
//        int ans=0;;
//        for(int i=0; i<accounts.length; i++){
//            int sum=0;
//            for(int j=0; j<accounts[i].length; j++){
//                sum=sum+accounts[i][j];
//            }
//            ans=sum;
//        }
//        return ans;
//    }
//}
//    static void InsertionSort(int[] arr) {
//
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i - 1; j >= 0; j--) {
//                if (arr[j+1] < arr[j]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                } else {
//                    break;
//                    Math.min();
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,4,3,1,6,5,};
//
//        InsertionSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}