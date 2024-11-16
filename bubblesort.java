//caratrd by Calvin Sites
//it uses a bubble to count to 100 and than adds all the number's up
//softwaredevelupment
public class bubblesort {
    public static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex){
        int temp;
        temp=arrayToSwap[lowerIndex];
        arrayToSwap[lowerIndex]=arrayToSwap[lowerIndex+1];
        arrayToSwap[lowerIndex+1]=temp;
        return arrayToSwap;
        }
   public static void printarray(int[] toprint){
       for(int n=0;n<toprint.length;n++){
           System.out.println(toprint[n]);
        }
    }
  public static void main(String[] args){
         int[] arrayToSort={1,3,4,5,1,23,57,126,4,543,345,23,12,45,67,97};// this creates the array.
         System.out.println("unsorted");
         printarray(arrayToSort);   
         for(int x=0; x<arrayToSort.length-1;x++){
             for(int j=0; j<arrayToSort.length-1 -x;j++){
                 if(arrayToSort[j]>arrayToSort[j+1]){
                     arrayToSort=swapTwoArrayElements(arrayToSort,j);
                 }
             }
         }
         System.out.println("sorted");
 printarray(arrayToSort);
  }
}