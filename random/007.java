class Main
{
   public static void main(String[] args)
   {
      int a = 4;
      int b = 3;
      int[] nums = {1,2,3,4};

      try 
      {
         // nums[-1] = 2;
         if(b == 3)
            throw new Exception("hello");
         int r = a / b;
         System.out.println(r);

      }
      catch(ArithmeticException e)
      {
         System.out.println("Err 1");
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("Err 2");
      }
      catch(Exception e)
      {
         System.out.println("Err" + e);
      }
      finally 
      {
         System.out.println("hey");
      }

   }
}