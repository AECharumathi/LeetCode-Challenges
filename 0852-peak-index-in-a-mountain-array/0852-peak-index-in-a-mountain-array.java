class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        return findPeak(arr, 0, arr.length-1);
    }
    public int findPeak(int[] arr, int l, int r){
        while(l < r){
           int mid = l + (r- l) / 2;
           if(arr[mid] < arr[mid+1]){
               l =  mid+1;
           }else if ( arr[mid] > arr[mid+1])
            r = mid;
        }
        return l; 
    }
}