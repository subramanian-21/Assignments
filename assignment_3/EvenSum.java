public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,8,9,10,3};

        System.out.println(evenSum(arr));
    }
    static int evenSum(int[] arr){
        int n = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2 == 0) n+=arr[i];
        }
        return n;
    }
}
