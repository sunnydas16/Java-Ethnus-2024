
class Parent{
    void showMessage(){
        System.out.println("this is parent class");
    }
}
class Child extends Parent{
    void showMessage(){
        System.out.println("This is Child class ");
    }
}

class MethodOverriding {
    public static void main(String[] args){
        Child c = new Child();
        c.showMessage();
        Parent p = new Parent();
        p.showMessage();
    }
}