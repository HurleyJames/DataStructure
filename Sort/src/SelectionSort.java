/**
 * 选择排序
 */
public class SelectionSort {
    public static void selectionSort(int[] arr){
        int min;
        //每次循环数组，找出最小的元素，放在数组前面
        for(int i=0;i<arr.length-1;i++){
            //假设最小元素的下标
            min=i;
            //将假设的最小元素与数组比较，交换出最小的元素下标
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min])
                    min=j;
            }
            if(i!=min){
                Utils.swap(arr,i,min);
            }
        }
    }

}
