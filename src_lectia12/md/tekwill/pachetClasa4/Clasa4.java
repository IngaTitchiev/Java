package md.tekwill.pachetClasa4;

public class Clasa4 {
    int nr;
    String nume;
    public void Clasa4(){
        System.out.println("Constructor implicit");
    }
    public void Clasa4(int nr){
        this.Clasa4();
        this.nr=nr;
        System.out.println("Constructor cu un parametru");
        System.out.println(this.nr);

    }
    public void Clasa4(String nume, int nr){
        this.Clasa4(nr);
        this.nume=nume;
        System.out.println("Constructor cu doi parametri");
        System.out.println(this.nume+" "+this.nr);

    }

    public static void main(String[] args) {
        Clasa4 ob4=new Clasa4();
        ob4.Clasa4();
        ob4.Clasa4(34);
        ob4.Clasa4("Ion", 12);
    }
}
