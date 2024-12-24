public class ThrowExample {
    static void checkEligibility(int a){
        if(a < 18){
            throw new ArithmeticException(" not eligible ");
        }
        else{
            System.out.println("Elegible hai");
        }
    }
    public static void main(String[] args){
        try{
            checkEligibility(16);
        }
        catch(Exception exp){
            System.out.println("Exception catched"+exp.getMessage());
        }
        System.out.println("System.is running fine");
    }
}