public class reverse {
    public static void main(String[] args) {
    
        int[] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int temp;
        int n = Math.floorDiv(arr.length, 2);
        for(int i = 0 ;i<n; i++){
          // swap the value 
          temp = arr[i];
          arr[i] = arr[l-i-1];
          arr[l-i-1] = temp;
        }

        for(int Element : arr){
            System.out.println(Element);
        }
    }
}
