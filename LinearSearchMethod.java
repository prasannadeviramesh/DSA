public class LinearSearchMethod {
    public static int Linearsearch(int []arr, int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers={90,87,65,78,67,45,34,12,34,56};
        int result=Linearsearch(numbers, 56);
        if(result== -1){
            System.out.println("Element Not found");
        }
        else{
            System.out.println("targeted value is found : " +numbers[result]);
        }

    }
}
