class Student{
    String name; 
    int reg;           // <--- instance variable    | instance variable is means variable in the class
    public Student(String name,int reg){
            this.name = name;   // <--- (this) is used for instance variable, so no confusion between object(local) variable and instance variable 
            this.reg = reg;
    }
    public void dispalayInfo(){
        System.out.println("Student reg id "+ reg);
        System.out.println("Student name "+ name);
    }

    public static void main(String[] args){
        Student s = new Student("pavan ",123);      //variable inside main class then it is local variable
        s.dispalayInfo();
    }
}