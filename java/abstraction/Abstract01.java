abstract class College{
    abstract void timing();

    void lectures(){
        System.out.println("Lectures are hapenning");
    }
}
class Students extends College{
    void timing(){
        System.out.println("Timing is 10 to 5 ");
    }
    // void names(){
    //     System.out.println("students have name");
    // }
}
class Teachers extends College{
    void timing(){
        System.out.println("9 to 5");
    }
    // void details(){
    //     System.out.println("students details");
    // }
} 
class Abstract01 {
    public static void main(String[] args){
        College c = new Students();
        College ca = new Teachers(); 
        c.timing();
        c.lectures();
        ca.timing();
        ca.lectures(); //--> not possible
    }
}