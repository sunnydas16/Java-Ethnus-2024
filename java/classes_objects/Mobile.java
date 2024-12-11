class Mobile{
    String model;
    String company;
    int imei;
    String owner;

    public static void main (String[] args){
        Mobile m = new Mobile();
        m.model="Oneplus";
        m.company="Oneplus";
        m.imei=12345;
        m.owner="pavan";
        System.out.println(m.model);
        System.out.println(m.company);
        System.out.println(m.imei);
        System.out.println(m.owner);
    }
}