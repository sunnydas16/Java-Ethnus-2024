class DivisionByZero {
    public static void main(String[] args){
// exception comes in runtime 
    try{
        int a = 10;
        int b = 0;
        int result = a/b;
        System.out.println(" result " +result);
    }  
    catch(Exception e){
        System.out.println("Error hai: Division by zero is not allowed ");
    }
        System.out.println("program continue running here ");
    }
}