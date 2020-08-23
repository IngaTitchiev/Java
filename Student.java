public class Student {
    String nume;
    String prenume;
    int grupa;
    long anul_nasterii;

    int damiGrupa() {
        return grupa;
    }

    int seteazaGrupa(int argGrupa) {
        grupa = argGrupa;
           return grupa;
    }

    void seteazaNumePrenume(String Nume, String Prenume) {
        nume = Nume;
        prenume=Prenume;
    }

    void printNumePrenume(String Nume, String Prenume) {
        System.out.println("Nume" + Nume + "Prenume" + Prenume);
    }

    void printNume() {
        System.out.println(nume);
    }
    void printPrenume() {
        System.out.println(prenume);
    }
    int printCodAscii(char litera) {
        return litera;
    }
}