public class BinarySearch {
    public int binarySearch(int a[],int n,int x){
        int mid,low,high;
        low=0;
        high=n-1;

        //循环，每次缩小一半的范围
        while(low<=high){
            mid=(low+high)/2;
            if(a[mid]==x){
                return mid;
            }
            else if(a[mid]>x){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
}

