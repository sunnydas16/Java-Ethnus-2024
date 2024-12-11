class Stud{
    int age;
    String name;
    String gender;

    Stud(){
        System.out.println("This is default Student Constructor");
    }

    Stud(String name){
        this.name = name;
    }
    Stud(String name,int age){
        this.name = name;
        this.age  = age;
    }
    Stud(String name,int age,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void dispalayInfo(){
        System.out.println("name "+name +" age " +age +" gender "+gender);
    }


    public static void main(String[] args){
        Stud s1 = new Stud();
        Stud s2 = new Stud("sunny");
        Stud s3 = new Stud("pavan",69);
        Stud s4 = new Stud("xzz",69,"female");

        s1.dispalayInfo();
        s2.dispalayInfo();
        s3.dispalayInfo();
        s4.dispalayInfo();

    }
}