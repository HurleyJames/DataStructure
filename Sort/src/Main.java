import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int arr[]={43, 65, 4, 23, 6, 98, 2, 65, 7, 79};
        System.out.println("请选择要使用的排序方式：");
        System.out.println("1.冒泡排序 2.快速排序 3.选择排序 4.插入排序 5.希尔排序（交换式）2" +
                "6.希尔排序（移动式）");
        Scanner input=new Scanner(System.in);
        int i=input.nextInt();
        switch (i){
            case 1:
                BubbleSort.bubbleSort(arr);
                break;
            case 2:
                QuickSort.quickSort(arr,0,arr.length-1);
                break;
            case 3:
                SelectionSort.selectionSort(arr);
                break;
            case 4:
                InsertSort.insertSort(arr);
                break;
            case 5:
                ShellSort.shellSort1(arr);
                break;
            case 6:
                ShellSort.shellSort2(arr);
                break;
            default:
                break;
        }

        //输出排序后的数组
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
