class Z extends Thread{
    public void run(){
        for(int i = 0;i < 10;i++){
            System.out.println(" hi everyone");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException ex){
                
            }
        }
    }
}
class Y extends Thread{
    public void  run(){
        for(int i = 0;i < 10;i++){
            System.out.println("Hello aap");
        }
    }
}
class ThreadsEx1{
    public static void main(String[] args){
        Z ob1 = new Z();
        ob1.start();
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException er){

        }
        Y ob2 = new Y();
        ob2.start();
    }
}