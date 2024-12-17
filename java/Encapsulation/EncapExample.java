class EncapExample{
    private String name = "sunny";
    private int age = 69;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        EncapExample e1 = new EncapExample();
        e1.getName();
        System.out.println("name is : "+e1.getName());
        System.out.println("age is : "+e1.getAge());
    }
}