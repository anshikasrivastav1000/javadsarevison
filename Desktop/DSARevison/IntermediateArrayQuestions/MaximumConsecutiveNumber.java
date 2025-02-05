package IntermediateArrayQuestions;

public class MaximumConsecutiveNumber {
    static int findMaxConsecutive(int nums[])
    {
      int count = 0;
      int maxi= 0;
      for(int i = 0; i< nums.length;i++)
      {
          if (nums[i] == 1){
              count++;
          }else
          {
              count = 0;
          }
          maxi = Math.max(maxi,count);
      }
      return  maxi;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        int ans = findMaxConsecutive(nums);
        System.out.println("The maximum  consecutive 1's are " + ans);
    }
}
