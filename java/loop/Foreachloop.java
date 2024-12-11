

//Only for Arrays

class Foreachloop{
    public static void main(String[] args){
        int number[] = {2,5,8,1,9,4};

        for(int range : number){
            System.out.println("Numbers : " + range);
        }
        System.out.print("length of array " +number.length);
    }
}