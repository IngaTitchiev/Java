public class Test_Student {
public static void main(String[] args){
Student st1=new Student();
    System.out.println("1. Obiecte ale clasei Student");
    System.out.println("Punctul 1.1");
    System.out.println(st1.seteazaGrupa(12));
    System.out.println("Punctul 1.2");
st1.seteazaNumePrenume("Ionas","Vasile");
    System.out.println("Punctul 1.3");
    st1.printNume();
    st1.printPrenume();
    System.out.println("Punctul 1.4 cod litera "+st1.printCodAscii('d'));
    System.out.println(suma(5));
    nr_pare(5);
    printHeloo();
    nr_impare(5);
}
public static int suma(int n){
   int suma=0;
    System.out.println("2. Suma numerelor pina la "+n);
    for (int i=0;i<n;i++){
    suma+=i;

} return suma;
}
    public static void nr_pare(int n){
        System.out.println("3. Numere pare pina la "+n);
        for (int i=0;i<n;i++){
           if (i%2==0) System.out.print(i+" ");;

        }
        System.out.println();
    }
    public static void printHeloo(){
        System.out.println("4. Afisarea cuvantului Heloo");
    for (int i=0;i<10;i++)
        System.out.println("Heloo");
    }
    public static void nr_impare(int n){
        System.out.println("5. Numere impare pina la "+n);
        for (int i=0;i<n;i++){
            if (i%2!=0) System.out.print(i+" ");;

        }
        System.out.println();
    }
}
