package phase1.assisted_practice.sorting_and_searching;

public class BubbleSorting {

    public static void main(String[] args){

     int[] arr= {41 ,36 , 21 , 4 , 19 , 01 , 68 , 28 , 11 , 99 , 54};
     bubbleSort(arr);
     for(int i=0;i<arr.length;i++){

        System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int[] arr){
        int len = arr.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(arr[j-1]>arr[j]){
                temp = arr[j-1];
                arr[j-1]= arr[j];
                arr[j]= temp;
                }
            }
        }
    }

}