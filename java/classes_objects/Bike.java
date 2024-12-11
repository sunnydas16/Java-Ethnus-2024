class Bike{
    String company;
    int cc;
    int price;
    String owner;

    public static void main(String[] args){
        Bike b = new Bike();
        b.company = "BMW";
        b.cc = 1000;
        b.price = 2400000;
        b.owner = "pavan";

        System.out.println(b.company);
        System.out.println(b.cc);
        System.out.println(b.price);        
        System.out.println(b.owner);        
    }
}