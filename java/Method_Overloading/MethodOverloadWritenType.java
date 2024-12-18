class MethodOverloadWritenType {

    int calc(int n){
        return n;
    }
    double calc(double n){
        return n;
    }
    String calc(String name){
        return name;
    }
    int calc(int a, int b){
        return a+b;
    }
    double calc(double a, double b){
        return a+b;
    }

    public static void main(String[] args){
        MethodOverloadWritenType mwt = new MethodOverloadWritenType();
        System.out.println(" its int n is : "+mwt.calc(1));
        System.out.println(" its double value is : => "+mwt.calc(69.696969));
        System.out.println(" name is : => "+mwt.calc("my name is seth"));
        System.out.println(" addition is => "+mwt.calc(69,96));
        System.out.println(" double addition is => "+mwt.calc(96.6699, 69.9966));
    }
}   