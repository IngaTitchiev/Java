package md.tekwill.pachet2;

public class Casspachet2 {
    int nr;
    public void setNr(int nr){
        this.nr=nr;
        System.out.println("Metoda publica clasa pachet 2");
    }
    void printNr(){
        System.out.println("Metoda default clasa pachet 2");
    }
    private void printPrivat(){
        System.out.println("Metoda privata clasa pachet 2");
    }
}
