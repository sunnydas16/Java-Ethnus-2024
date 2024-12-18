class MethodOverlo{

    void dispaly(int n){
        System.out.println(" n is : "+n);
    }
    void display(double n){
        System.out.println(" double is : "+n);
    }
    void display(int a,int b){
        System.out.println(" a and b are "+a +" "+b);
    }
    void display(String name, int srno){
        System.out.println(" name is : "+name +" srno. is : "+srno);
    }

    public static void main(String[] args){
        MethodOverlo m = new MethodOverlo();
        m.dispaly(1111);
        m.display(12.3536);
        m.display(69,96);
        m.display("sunny",123);
        
    }
}