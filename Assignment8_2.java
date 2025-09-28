// Write a generic static method to find minimum from an array of Number.
public class Assignment8_2 {
    public static <T extends Number> T findMinimum(T[] arr) {
        if(arr ==null || arr.length == 0){
            return null;
        }
        T min = arr[0];
        for(T element: arr){
            if(element.doubleValue()<min.doubleValue()){
                min = element;
            }
        }
        return min;
    }
    public static void main(String[] args){
        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        Double[] arr1 = {1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
        String[] arr2 = {"A","B","C","D","E","F","G","H","I"};
        System.out.println("Minimum of Integer class array: "+findMinimum(arr));
        System.out.println("Minimum of Double class array: "+findMinimum(arr1));
        //System.out.println("Minimum in String array: "+findMinimum(arr2)); // This will give compile time error because String is not a subclass of Number
        
    }
}
