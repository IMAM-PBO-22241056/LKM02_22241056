package mahasiswa;

class motor{
    String merk;
    int tahun;
    String noPolisi;
    String warna;
//konstruktor (menginisialisasi variabel-variabel instansi dimiliki oleh objek)
    motor(String merk, int tahun, String noPolisi, String warna){
        //kata kunci ths funsinya untuk merujuk pada nama yang berada dalam class motor
        this.merk=merk;
        this.tahun=tahun;
        this.noPolisi=noPolisi;
        this.warna=warna;
    }
//method dengan parameter tanpa return(nilai balik)
void showInfoMotor(){
    System.out.println("merk : "+this.merk);
    System.out.println("tahun : "+this.tahun);
    System.out.println("noPolisi : "+this.noPolisi);
    System.out.println("warna : "+this.warna);
    }
}

public class classmotor {
//inisialisasi dengan nama MotorKU
    public static void main(String[] args) {
        motor motorku = new motor("honda", 1998, "dk 999 eb","biru");
        motorku.showInfoMotor();
        
    }
}




