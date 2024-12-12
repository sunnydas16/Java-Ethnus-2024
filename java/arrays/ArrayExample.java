class ArrayExample{
    public static void main(String[] args){

        // int[] array = new int[5];
        // array[0] = 10;
        // array[1] = 20;
        // array[2] = 30;
        // array[3] = 40;
        // array[4] = 50;

         int[] array = {10,20,30,40,50}; // this is also valid

        for(int i = 0;i < array.length;i++){
            System.out.println("Elements are : "+array[i]);
        }
    }
}