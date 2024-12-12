
//short end operators sum += num
class SumArray{
    public static void main(String[] args){
        int[] ar = {10,21,45,29,33};

        int sum = 0;
        for(int nbr : ar){
            sum += nbr;
        }
        System.out.println("Sum is "+sum);
    }
}