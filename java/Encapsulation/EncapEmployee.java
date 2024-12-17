class EncapEmployee {
    private String name;
    private int empid;

    public String getName(){  
        return name;
    }
    public int getEmpid(){
        return empid;
    }
    
    public void setName(String n){
        this.name = n;
    }
    public void setEmpid(int num){
        this.empid = num;
    }

    public static void main(String[] args){
        EncapEmployee e1 = new EncapEmployee();
        e1.setName("sunny");
        e1.setEmpid(69);
        System.out.println(e1.getName());
        System.out.println(e1.getEmpid());
    }
}