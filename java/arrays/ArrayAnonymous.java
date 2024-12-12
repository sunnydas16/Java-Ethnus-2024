//Anonymous array

//array created without expilicitely assigning in to a variable
//Situation where you need to pass array as an argument to a method
//but no need to reference the array afterwords

//just for showing, purpose no any momory allocated
class ArrayAnonymous{

    static void printArray(int[] arr){
        for(int a : arr){
            System.out.print(" "+a);
        }
    }
    public static void main(String[] args){
        printArray(new int[] {10,20,50,33});
        printArray(new int[] {101,333,222,1000,21});
    }
}