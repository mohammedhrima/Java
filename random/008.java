import java.util.*;

class Main
{
   public static void main(String[]args)
   {
      ArrayList<Integer> nums = new ArrayList<Integer>();
      nums.add(4);
      nums.add(2);
      nums.add(3);

      for(int n : nums)
         System.out.println(n);
      
      System.out.println(nums);

   }
}