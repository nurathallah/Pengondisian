public class kondisi_1 {
    public static void main(String[] args) {

    int usia= 20;
    double totalBelanja= 165000 ;

    if ( usia<18){
        System.out.println("Akses dibatasi: Dibawah 18 tahun.");
    } else if(totalBelanja >=150000){
        System.out.println("Akses diberikan + diskon 15%");
    } else{
        System.out.println("akses diberikan, tanpa diskon");
    }
}
}