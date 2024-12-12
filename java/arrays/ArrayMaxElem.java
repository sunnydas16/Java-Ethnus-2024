

class ArrayMaxElem{
    public static void main(String[] args){

        int[] arr = {20,40,44,20,11,50,88};
        int max = arr[0];

        for(int i=1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        System.out.println("Maximum value is => "+max);
    }
}