public class Duplicate_array {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,4,3,8,5,2,5,1};

        System.out.println("Duplicate array elements are:- ");
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }
            }
        }
    }
}
