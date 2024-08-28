public class lab24 {
    public static void main(String[] args) throws Exception {
        int arr[][]={{1,2,3},{2,4,5},{7,5,1}};
        for(int i =0;i<arr.length;i++){
            int sum=0; // declare sum outside the inner loop
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
                sum +=arr[i][j];
            }
            System.out.println("Sum of row "+(i+1)+ ": " +sum);
        }
    }
}
