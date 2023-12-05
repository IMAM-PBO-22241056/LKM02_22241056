package mahasiswa;

class mahasiswa{

//membuat data member dari class mahasiswa
String nama;
int angkatan;
String asal;


//konstruktor
public mahasiswa(){
    nama = "imam";
    angkatan = 1888;
    asal = "jakarta";  
}

// method ubah (mengubah nama nama yang berada dalam data member)
void ubah(String nma, int angtn, String asl){
    nama = nma;
    angkatan = angtn;
    asal = asl;
} 
 //method untuk inisialisasi mahasiswa
void cetak(){
    System.out.println("nama : " +nama);
    System.out.println("angkatan : " + angkatan);
    System.out.println("asal : " +asal);
}

}

//class dengan nama test mahasiswa
class testMahasiswa {
    public static void main(String[] args) throws Exception {
        //menginisialisasikan mahasiswa dengan "MHS"
        mahasiswa MHS = new mahasiswa();
        System.out.println("IDENTITAS AWAL : ");
        MHS.cetak();

        MHS.ubah( "maarif",  2004,   "lombok");
        System.out.println("\nIDENTITAS AKHIR : ");
        MHS.cetak();

    }
}


