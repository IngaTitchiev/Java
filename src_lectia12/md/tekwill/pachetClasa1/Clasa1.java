package md.tekwill.pachetClasa1;

public class Clasa1 {
   // int nr;
    //String nume;
    public void m1c1(){
        System.out.println("Metoda 1 Clasa 1");
        this.m2c1();
        this.m3c1();
    }
    public void m2c1(){
        System.out.println("Metoda 2 Clasa 1");
    }
    public void m3c1(){
        System.out.println("Metoda 3 Clasa 1");
    }

    public static void main(String[] args) {
       Clasa1 ob1=new Clasa1();
        ob1.m1c1();
   }
}
