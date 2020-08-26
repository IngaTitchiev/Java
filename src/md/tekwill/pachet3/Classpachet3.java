package md.tekwill.pachet3;

import md.tekwill.ClassProprPrivate;
import md.tekwill.pachet1.Classpachet1;

public class Classpachet3 {
    int nr;
        public void setNr(int nr){
        this.nr=nr;
        System.out.println("Metoda publica clasa pachet 3");
    }
    void printNr(){
        System.out.println("Metoda default clasa pachet 3");
    }
    private void printPrivat(){
        System.out.println("Metoda privata clasa pachet 3");
    }

    public static void main(String[] args) {
        Classpachet1 obclasa1=new Classpachet1();
        obclasa1.setNr(30);
        //  obclasa1.printNr();//Make 'Classpachet1.printNr' public
        // obclasa1.printPrivat();//Make 'Classpachet1.printPrivat' public
        Classpachet3 obclasa3=new Classpachet3();
        obclasa3.setNr(20);
        obclasa3.printNr();
        obclasa3.printPrivat();
        ClassProprPrivate obproprprivate=new ClassProprPrivate();
        obproprprivate.getNr(20);//Make 'ClassProprPrivate.getNr' public
        obproprprivate.getNume("Ion");//Make 'ClassProprPrivate.getNume' public
        obproprprivate.printNrNume();// Make 'ClassProprPrivate.printNrNume' public

    }
}
