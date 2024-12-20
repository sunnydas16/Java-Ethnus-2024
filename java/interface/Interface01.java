interface Animal{
    void sound();
    void sleep();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Bhou Bhou");
    }
    public void sleep(){
        System.out.println("dont sleep at night");
    }
}
class Cat extends Dog{
    public void sound(){
        System.out.println("I am billu");
    }
}
class Lion implements Animal{
    public void sound(){
        System.out.println("Roar ");
    }
    public void sleep(){
        System.out.println("10 hours");
    }
}
class Interface01{
    public static void main(String[] args){
        // Dog d = new Dog();
        // d.sleep();
        // d.sound();
        // Cat c = new Cat();
        // c.sound();
        
        // Lion l = new Lion();
        // l.sleep();
        // l.sound();

        Animal an = new Dog();
        an.sound();
        Animal a = new Lion();
        a.sound();
    }
}