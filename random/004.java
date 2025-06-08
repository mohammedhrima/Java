class Demo {
   public static void main(String[] args) {
      Student s = new Student(4, "user");
      Student a = new Student();
      
      Student[] students = new Student[4];
      for(Student c : students)
         System.out.println(c);

      System.out.println(s);
   }
}

class Student {
   static int gid;
   int id;
   String name;

   Student()
   {
      id = ++gid;
      name = "student";
   };
   Student(int id, String name) {
      this.id = id;
      this.name = name;
   }

   @Override
   public String toString() {
      return "student: " + name + " has id: " + id;
   }

   public int getid() {
      return id;
   }

   public void setid(int id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

}
