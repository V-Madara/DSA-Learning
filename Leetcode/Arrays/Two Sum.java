package Arrays;
import java.util.Arrays;
import java.util.Scanner;

class Solution {


        static public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    output[0]=i;
                    output[1]=j;
                }
            }
        }
        return output;
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Length of Array: ");
    int len = sc.nextInt();
    int[] nums =  new int[len];
    System.out.println("Enter the elements of the Array!");
    for(int i = 0;i<len;i++){
        nums[i]=sc.nextInt();
    }
    System.out.print("Enter the targeted element: ");
    int target = sc.nextInt();

    System.out.print("Output: "+Arrays.toString(twoSum(nums,target)));
    }
}