package AlgoAndLeetCode;

public class LeetCode283 {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
        disp(nums);
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0 ; i<nums.length-1; i++){
          for(int j =0; j< nums.length-i-1; j++){
              if(nums[j] == 0){
                  swap(nums,j,j+1);
              }
          }
        }
    }
    public static void swap(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void disp(int [] nums){
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i] + " ");
        }
    }

}
