interface Computer 
{
   void compiler();
}

class Desktop implements Computer {
   public void compiler() {
      System.out.println("Compiling");
   }
}

class Laptop implements Computer {
   public void compiler() {
      System.out.println("Compiling");
   }
}

class Dev {
   public void code(Computer comp) {
      System.out.println("Coding...");
      comp.compiler();
   }
}

class Main {
   public static void main(String[] args) {
      Laptop lap = new Laptop();
      Computer desk = new Desktop();

      Dev dev = new Dev();

      dev.code(lap);
   }
}
