class Demo {
   public static void main(String[] args) {
      // System.out.println("hello from demo");
      User user = new superUser();
      user.thrown();
      // user.name = "test";
      System.out.println(user.getName());
   }
}

class User {
   private String name;
   int age;
   static int id = 15;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public User() {
      name = "user";
      age = 15;
   }

   public void pressed() {
      System.out.println("pressed");
   }

   public void thrown() {
      System.out.println("thrown");
   }

   public void thrown(String str) {
      System.out.println("thrown 2");
   }

}

public class superUser extends User {
   public void thrown() {
      System.out.println("super thrown");
   }
}

