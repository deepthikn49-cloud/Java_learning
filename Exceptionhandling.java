class Exception1{
    public static void main(String[] args) {
        try{
            int a=10,b=0,c=a/b;
            System.out.println(c);
        }catch( ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}

class Exception2{
    public static void main(String[] args) {
        String str=null;
        try{
             System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("cannot call method on null object"+e.getMessage());
        }
        System.out.println("rest of the code");
    }
}

class Exception3{
    public static void main(String[] args) {
        int [] arr=new int[5];
        try{
            arr[5]=10;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound"+e.getMessage());
        }
        System.out.println("Program continues after handling the exception ");
    }
}

class Exception4{
    public static void main(String[] args) {
        String str="abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("cannot convert string to integer"+e.getMessage());
        }
        System.out.println("Program continues after handling the exception ");
    }
}

class Exception5{
    public static void main(String[] args) {
        try{
            int  result=10/0;
        
    }
    catch(ArithmeticException e){
        System.out.println("caught an arithematic exception:" + e.getMessage() );
    }
    finally{
        System.out.println("this block will always execute.");
    }
    System.out.println("Program continues after handling the exception ");

    }
}

class Exceptionthrow {
    public static void main(String[] args) {

        try {
            int a = -1;

            if (a < 0) {
                throw new IllegalArgumentException("Value cannot be negative: " + a);
            }

            System.out.println("Value is: " + a);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}



class Exceptionthrows{
    public static void main(String[] args) {
        try{
            methodThatThrowsException();
        }
        catch(Exception e){
            System.out.println(" caught an exception:"+e.getMessage());
        }
    }
    public static void methodThatThrowsException() throws Exception{
        throw new Exception("this is custom exception message");
    }
}

class myexception extends Exception{
    public myexception(String message){
        super(message);
    }
}
class ExceptionMyException{
    public static void main(String[] args) {
        try{
             validateAge(15);
        }
        catch(myexception e){
            System.out.println(" caught my  custom exception:"+e.getMessage());
        }
    }
    public static void validateAge(int age) throws myexception{
        if(age<18){
            throw new myexception("age must be at least 18. Provided age:"+age);
        }
    }
}