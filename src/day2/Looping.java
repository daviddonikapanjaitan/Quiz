package day2;

public class Looping {

    public static void main(String[] args) {
        String a, b, c;
        a = "xsis";
        b = "xsis";
        c =  "hello";
        /*if(a.equals(b)){
            System.out.println("object  string equal");
        }else{
            System.out.println("object string beda");
        }*/

        // negasi
        /*if(!a.equals(c)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }*/

        // siswa lebih dari pada 20 tahun dan ipk lebih dari 3.02 dan  kurang  dari 3.5
        int umur = 21;
        double ipk = 3.05;
        if(umur>20 && ipk>3.02 && ipk<3.5){
            System.out.println("found");
        }else {
            System.out.println("false");
        }
    }
}
