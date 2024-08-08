package OOPS.assignment_5.sort;

public class SortAlgo implements Sortable{

    @Override
    public void bubbleSort(int[] arr) {
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr.length;j++){
                if(arr[i] < arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j] ;
        arr[j] = temp;
    }

    @Override
    public void quickSort(int[] arr) {
        quick(arr, 0, arr.length-1);
    }
    private void quick(int[] arr,int start, int end){
        if(start >= end) return;

        int s = start;
        int e = end;
        int m = s+(e-s)/2;

        int pivot  = arr[m];

        while (s <= e){
            while (arr[s] < pivot) s++;
            while (arr[e] > pivot) e--;
            if(s <= e){
                swap(arr, s, e);
                s++;e--;
            }
        }
        quick(arr, start, e);
        quick(arr, s, end);
    }

    @Override
    public void mergeSort(int[] arr) {
        splitMergeArray(arr, 0, arr.length);
    }
    private void splitMergeArray(int[] arr, int start, int end){
        if(end - start == 1){
            return;
        }
        int mid = start+(end-start)/2;

        splitMergeArray(arr, start, mid);
        splitMergeArray(arr, mid, end);

        mergeArray(arr, start, mid, end);
    }
    private void mergeArray(int[] arr, int start, int mid, int end) {
        int[] res=  new int[end - start];

        int i= start;
        int j = mid;
        int k = 0;

        while (i< mid&& j < end){
            if(arr[i] < arr[j]){
                res[k++] = arr[i++];
            }else {
                res[k++] = arr[j++];
            }
        }
        while (i< mid){
            res[k++] = arr[i++];
        }
        while(j < end){
            res[k++] = arr[j++];
        }
        for(i = 0;i<res.length;i++){
            arr[start+i] = res[i];
        }
    }
    
}
