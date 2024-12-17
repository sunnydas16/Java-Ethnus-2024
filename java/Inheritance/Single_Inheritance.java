class Animal{
    public void eats(){
        System.out.println("eats");
    }
}

class Dog extends Animal{
    public void barks(){
        System.out.println("dog barks");
    }
}

class Single_Inheritance{
    public static void main(String[] args){
        Dog d = new Dog();
        d.barks();
        d.eats();
    }
}