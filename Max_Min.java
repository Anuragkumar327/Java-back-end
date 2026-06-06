public class Max_Min {
    public static void main(String[] args) {
        System.out.println(" Maximum and Minimum Array");
        int[] arr = {25,10,45,5,30};
        
        int max = arr[0];
        int min = arr[0];
        
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = "+min);
    }
}
