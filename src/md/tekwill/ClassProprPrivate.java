package md.tekwill;

public class ClassProprPrivate {
    private int nr;
    private String nume;
   public void getNr(int nr){
        this.nr=nr;
    }
   public void getNume(String nume){
        this.nume=nume;
    }
   public void printNrNume(){
        System.out.println(nr);
        System.out.println(nume);
    }

}
