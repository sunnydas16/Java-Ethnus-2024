class Student{
    String name;
    int    rollno;
    String branch;
    int    age;

    public static void main(String[] args){
        Student s1 = new Student();
        s1.name="pavan";
        s1.rollno=111;
        s1.branch="cse";
        s1.age = 69;

        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.branch);
        System.out.println(s1.age);
    }
}