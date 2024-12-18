class Ecosystem{
    public void day(){
        System.out.println("Day and night");
    }
    public void weather(){
        System.out.println("Weather for all ");
    }
}
class Herbivores extends Ecosystem{
    public void veg(){
        System.out.println("Eats grass and plants");
    }
    public void water(){
        System.out.println("Drinks Water to live");
    }
}
class Carnivores extends Herbivores{
    public void nonveg(){
        System.out.println("Depends on living animal to eat");
    }
}

class MultiLevel_Inheritance{
    public static void main(String[] args){
        Carnivores c = new Carnivores();
        c.day();
    }
}