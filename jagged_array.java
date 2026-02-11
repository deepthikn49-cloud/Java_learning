class JaggedArraycase{
    public static void main(String[] args) {
        int n=5;
        int[][] staircase=new int[n][];

        for(int i=0;i<n;i++) {
            staircase[i]=new int[i+1];
            for(int j=0;j<=i;j++) {
                staircase[i][j]=j+1;
            }
        }
        System.out.println("staircase pattren:");
        for(int i=0;i<n;i++) {
            for(int j=0;j<staircase[i].length;j++) {
                System.out.print(staircase[i][j]+"  ");
            }
            System.out.println();
        }
    }
}