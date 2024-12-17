class EncapMyself{
    private String name;
    private String bike;

    public String getN(){
        return name;
    }
    public String getB(){
        return bike;
    }
    public void setN(String a){
        this.name = a;
    }
    public void setB(String b){
        this.bike = b;
    }
    public static void main(String[] args){
        EncapMyself m1 = new EncapMyself();
        m1.setN("sun");
        m1.setB("10r");
        System.out.println(m1.getN());
        System.out.println(m1.getB());
    }
}