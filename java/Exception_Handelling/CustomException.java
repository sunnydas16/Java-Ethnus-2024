class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
class CustomException{
    static void checkAge(int a) throws MyException{
        if(a < 18){
            throw new MyException(" Myexcp age is galat");
        }
        else{
            System.out.println(" valid age"+ a);
        }
    }
    
    public static void main(String[] args){
        try{
            checkAge(10);
        }
        catch(MyException me){
            System.out.println(" Exception caught "+me.getMessage());
        }
        System.out.println("This is complete program");
    }
}