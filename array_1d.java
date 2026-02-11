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



