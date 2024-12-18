class Transport{
    public void travel(){
        System.out.println("Travels anywhere");
    }
}
class Train extends Transport{
    public void goods(){
        System.out.println("Goods carrier");
    }
}
class Bus extends Transport{
    public void passenger(){
        System.out.println("Passengers travels in bus");
    }
}

class Hirerchical_ex2{
    public static void main(String[] args){
        Bus b = new Bus();
        b.passenger();
        b.travel();
        Train t = new Train();
        t.goods();
        t.travel();
    }
}