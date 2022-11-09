public class Main {
    public static void main(String[] args) {
     BaseKrediManager[] krediManagers = new BaseKrediManager[]{new OgretmenKrediManager(), new TarımKrediManager(), new OgrenciKrediManager()} ;


     for (BaseKrediManager krediManager : krediManagers){
         System.out.println(krediManager.hesapla(1000));
     }

    }

    // ana fikir: bir class'ın overriding yapmasını istiyorsan extends edilen ana sınıfın
    // public kısmının yanına final dersen hiçbir şey yapamaz
    // aksi takdirde ana class olan basekredimanagerin kurallarını
    // istediğimiz class çok rahat bir şekilde uymayabilir.

}