package Sorting;
public class bubble {
    public static void Bs(int arr[]){
         for(int turn = 0; turn < arr.length - 1; turn++){
            for(int j=0;j<arr.length-1-turn;j++){
               if(arr[j]>arr[j+1]){
                  int t = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = t;
               }
            }
         }
    }
    public static void print(int arr[]){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
       int arr[] = {5,3,1,4,2};
       Bs(arr);
       print(arr);
    }
}
