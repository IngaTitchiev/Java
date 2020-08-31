package md.tekwill.pachetClasa3;

public class Clasa3 {
    int nr;
    String nume;
   public void Clasa3(){
        System.out.println("Constructor implicit");
    }
    public void Clasa3(int nr, String nume){
       this.nr=nr;
       this.nume=nume;
        System.out.println("Constructor cu parametri");
        System.out.println(this.nr+ " "+ this.nume);

    }
    public void Clasa3(String nume, int nr){
        this.nr=nr;
        this.nume=nume;
        System.out.println("Constructor cu parametri inversati");
        System.out.println(this.nume+ " "+ this.nr);

    }

    public static void main(String[] args) {
       Clasa3 ob3=new Clasa3();
        ob3.Clasa3();
        ob3.Clasa3(3,"ion");
        ob3.Clasa3("Maria", 23);
    }
}
