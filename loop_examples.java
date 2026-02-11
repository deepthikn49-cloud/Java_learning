class ForLoopExample{
      public static void main(String[] args) {
        for(int i=1;i<=5;i++) {
            System.out.println(i);
        }
      }
}

class ForLoopCountDown{
    public static void main(String[] args) {
        for(int i=5;i>=1;i--) {
            System.out.println(i);
        }
    }
}

class EvenNumber{
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}

class OddNumber{
    public static void main(String[] args) {
        for(int i=1;i<=50;i++) {
            if(i%2==1)
            {
                System.out.println(i);
            }
        }
    }
}

class EvenNumber2{
    public static void main(String[] args) {
        for(int i=2;i<=50;i=i+2) {
             System.out.println(i);
        }
    }
}

class  Sum{
    public static void main(String[] args) {
         int sum=0;
        for(int i=1;i<=10;i++) {
              
             {
                   sum=sum+i;
             }
        }
             System.out.println(sum);
        
    }
}

class DoWhileExample{
    public static void main(String[] args) {
        int i=1;

        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
