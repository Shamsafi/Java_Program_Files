public class Two_Matrices_Add {
    public static void main(String[] args) {
        int a[][] = {{1,3,4},{1,2,3},{2,5,8}};
        int b[][] = {{4,3,1},{3,2,1},{8,5,2}};

        int c[][] = new int[3][3];

        for(int i =0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j]);
            }
            System.out.println();
        }
    }
}
