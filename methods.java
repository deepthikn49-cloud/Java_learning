import java.util.Scanner;
class Example1{
    void hello(){
        System.out.println("Hello");
    }
    void add(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args){
        Example1 obj=new Example1();
        obj.hello();
        obj.add(10,20);

    }
      
         

    
}
class Exercise3{
    int getNumber() {
        return 10;
    }
    public static void main(String[] args){
        Exercise3 obj=new Exercise3();
        int result = obj.getNumber();
        System.out.println(result);
    }
}

class Example5{
    static void staticMethod() {
        System.out.println("I am static");
    }
    void instanceMethod() {
        System.out.println("I am instance");
    }
    public static void main(String[] args)
    {
        staticMethod();
        Example5 obj=new Example5();
        obj.instanceMethod();
    }
}

class Example6{
    void greet(String name){
        System.out.println("Hello  " +name);
    }
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name=scn.nextLine();

        Example6 obj=new Example6();
        obj.greet(name);
    }
}