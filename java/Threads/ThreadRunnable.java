class A1 implements Runnable{
    public synchronized void run(){
        for(int i = 0;i < 100;i++){
            System.out.println(i +" hello everyone");
            try{
                Thread.sleep(30);
            }
            catch(Exception e){

            }
        }
    }
}
class B1 implements Runnable{
    public synchronized void run(){
        for(int i = 0;i < 100;i++){
            System.out.println(i +"  how are you");
        }
    }
}
public class ThreadRunnable{
    public static void main(String[] args){
        A1 obj1 = new A1();
        B1 obj2 = new B1();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}