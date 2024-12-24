class A extends Thread{
    public void run(){
        for(int i = 0;i < 100;i++){
            System.out.println(i +" hii everyone");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i < 100;i++){
            System.out.println(i +"   Hello every");
        }
    }
}
class ThreadExample1{
    public static void main(String[] args){
        A obj1 = new A();
        obj1.start();
        B obj2 = new B();
        obj2.start();
    }
}