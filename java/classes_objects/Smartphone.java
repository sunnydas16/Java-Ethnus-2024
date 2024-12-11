class Smartphone{
    String name;
    String model;
    int imei;

    public static void main (String[] args){
        Smartphone p = new Smartphone();
        p.name = "pavan";
        p.model= "air";
        p.imei = 100000;

        System.out.println(p.name);
        System.out.println(p.model);
        System.out.println(p.imei);

    }
}