package md.tekwill.pachetClasa6;

public class Clasa6 {
    int nr=20;

    public Clasa6 getNr() {
        return this;
    }

    public void printNr() {
        System.out.println("Numarul este egal cu: "+ nr);
    }

    public static void main(String[] args) {
        Clasa6 ob6=new Clasa6();
        ob6.getNr().printNr();
    }
}
