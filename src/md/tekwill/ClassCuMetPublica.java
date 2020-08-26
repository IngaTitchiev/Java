package md.tekwill;

import md.tekwill.pachet1.Classpachet1;
import md.tekwill.pachet3.Classpachet3;

public class ClassCuMetPublica {
    public void metodaPublica(){
        Classpachet3 obclasa3=new Classpachet3();
       // obclasa3.printPrivat();//Make 'Classpachet3.printPrivat' public
        Classpachet1 obclasa1= new Classpachet1();
      //  obclasa1.printPrivat();//Make 'Classpachet1.printPrivat' public
    }
}
