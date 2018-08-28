/**
 * 希尔排序
 */
public class ShellSort {
    //针对有序序列在插入时采用交换法
    public static void shellSort1(int[] arr){
        //增量gap，并逐渐缩小增量
        for(int gap=arr.length/2;gap>0;gap/=2){
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for(int i=gap;i<arr.length;i++){
                int j=i;
                while(j-gap>=0&&arr[j]<arr[j-gap]){
                    Utils.swap(arr,j,j-gap);
                    j-=gap;
                }
            }
        }
    }

    //针对有序序列在插入时采用移动法
    public static void shellSort2(int[] arr){
        for(int gap=arr.length/2;gap>0;gap/=2){
            for(int i=gap;i<arr.length;i++){
                int j=i;
                int temp=arr[j];
                if(arr[j]<arr[j-gap]){
                    while(j-gap>=0&&temp<arr[j-gap]){
                        //移动法
                        arr[j]=arr[j-gap];
                        j-=gap;
                    }
                    arr[j]=temp;
                }
            }
        }
    }
}
