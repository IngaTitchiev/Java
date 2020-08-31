package md.tekwill.pachetClasa5;

public class Clasa5 {
    String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public static void main(String[] args) {
        Clasa5 ob5=new Clasa5();
        ob5.setNume("Maria");
        System.out.println("Numele este: "+ ob5.getNume());
    }
}
