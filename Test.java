public class Test {
    public static void main(String[] params) {
        PrimaClasa ref=new PrimaClasa();
        byte b=60;
        byte c=120;
        int d;
        d=b*c;
        String str1="Un sir", str2="Alt sir";
        System.out.println(d);
        System.out.println(str1+str2);
        int count1 = 1;
        while (count1 <= 2) {
            int count2 = 1;
            while (count2 <= 3) {
                System.out.println("Here");
                count2++;
            }
            count1++;
        }
int k=1;
        byte delta=1;
        while(k>0&&k<100){
            if(k>=99){
                delta=-1;
            }else if(k<=1){delta=1;
            }
            k+=delta;
            System.out.println(k);
        }

        }
}
