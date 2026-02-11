class Check_Numbers{
    public static void main(String[] args) {
         int a=20;
        if(a<0)
        {
            System.out.println("Given number is negative");
        }
        if(a>0)
        {
        System.out.println("Given number is positive");
        }
        else {
            System.out.println("Given number is Zero");
        }

    }
}

class LargestOfThree{
    public static void main(String[] args) {
        int a=20;
        int b=30;
        int c=50;

        if(a>=b && a>=c)
        {
            System.out.println("a is Largest");
        }
        else if(b>=a && b>=c)
        {
          System.out.println("b is Largest");  
        }
        else
        {
            System.out.println("c is Largest");
        }

    }
}

class Checking_string{
    public static void main(String[] args) {
      String a= new String("apple");  
      String b= new String("apple"); 
      System.out.println(a==b);
    }
}

class Array{
    public static void main(String[] args) {
        int[][] num={{10,20},{30,40}}; {
            System.out.println(num[0][0]);
        }

    }
}


