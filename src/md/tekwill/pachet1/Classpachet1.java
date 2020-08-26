package md.tekwill.pachet1;

public class Classpachet1 {
    int nr;
    public void setNr(int nr){
        this.nr=nr;
        System.out.println("Metoda publica clasa pachet 1");
    }
    void printNr(){
        System.out.println("Metoda default clasa pachet 1");
    }
    private void printPrivat(){
        System.out.println("Metoda privata clasa pachet 1");
    }
}
