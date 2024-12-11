class Computer{
    String model;
    String company;
    int    year;
    String os;

    public static void main(String[] args){
        Computer c = new Computer();
        c.model="macbook";
        c.company="Apple";
        c.year = 2021;
        c.os="macos";

        System.out.println(c.model);
        System.out.println(c.company);
        System.out.println(c.year);
        System.out.println(c.os);     
    }
}