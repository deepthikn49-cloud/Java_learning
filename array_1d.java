class Array1DPrint{
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};

        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}

class Array1DEnhanced{
    public static void main(String[] args) {
        int[] numbers={10,20,30,40,50};
        int sum=0;

        for(int num:numbers){
            sum=sum+num;

        }
        System.out.println("Sum:" +sum);
    }
}
class demo{
    public static void main(String[] args) {
        String[] playlist={"song1","song2","song3"};
         String[] playlist1=new String[3];
         playlist1[0]="song1";
         System.out.println(playlist1[0]);
         playlist1[1]="song2";
         System.out.println(playlist1[1]);
          
    }
}

class demo2{
    public static void main(String[] args) {
        int[] numbers={10,30,60,80};
        int target=30;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                target=numbers[i];
            }
        }
        System.out.println("target:" + target);
    }
}






