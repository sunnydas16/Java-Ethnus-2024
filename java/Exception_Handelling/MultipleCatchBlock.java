class MultipleCatchBlock{
    public static void main(String[] args){
        try{
            int arr[] = {2,6,1};
            System.out.println(" index is "+arr[10]);

            int a = 10,b = 5;
            int res = a/b;
            System.out.println(res);
        
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Input must be correct ");
        }
        catch(ArithmeticException w){
            System.out.println(" Arithematic hai, exception");
        }
        catch(Exception ex){
            System.out.println(" Last hope of exception ");
        }
        System.out.println(" Everything is fine ");
    }
}