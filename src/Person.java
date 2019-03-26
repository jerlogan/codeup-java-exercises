public class Person {
   private String name;
   Person(String nameInput) {
       name = nameInput;
   }

   public String getName() {
       return name;
   }
   public void setName(String changedName) {
       name = changedName;
   }
   public void sayHello() {
       System.out.printf("hello %s!", name);
   }

    public static void main(String[] args) {
        Person p1 = new Person("Ralph");
        System.out.println(p1.getName());
        p1.setName("Jim");
        System.out.println(p1.getName());
        p1.sayHello();

        System.out.println();
    }
}
