
class Animal{
    public void eats(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    public void barks(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    public void meow(){
        System.out.println("cat meows");
    }
}
class Hirerchical_Inheri{
    public static void main(String[] args){
        Dog d = new Dog();
        d.barks();
        d.eats();
        Cat c = new Cat();
        c.meow();
        c.eats();
    }
}