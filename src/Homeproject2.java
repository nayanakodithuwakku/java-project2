 class Homeproject2 {
    void car (int a){
        System.out.println("Java");
    }
    void car (int b,String c){
        System.out.println("Python");
    }
    void car (int x, int y){
        System.out.println("C");
    }
    void car (double z){
        System.out.println("Kotlin");
    }

     public static void main(String[] args) {
        Homeproject2 hp = new Homeproject2();
        hp.car(54);
        hp.car(4,"g");
        hp.car(54,5);
        hp.car(2.3);

     }
}
