class A extends Thread{
    public void run(){
        for(int i = 0;i < 50;i++){
            System.out.println(i +" hii everyone");
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException ex){

            }
        }

    }
}
class B extends Thread{
    public void run(){
        for(int i = 0;i < 50;i++){
            System.out.println(i +"   Hello every");
            try{
                Thread.sleep(20);
            }
            catch(InterruptedException ex){

            }

        }
    }
}
class ThreadSleepEx{
    public static void main(String[] args){
        A obj1 = new A();
        System.out.println(obj1.getPriority());
        System.out.println(Thread.MAX_PRIORITY);
        B obj2 = new B();
        obj1.start();
        try{
            Thread.sleep(50);
        }
        catch(InterruptedException ex){

        }
        
        obj2.start();
    }
}