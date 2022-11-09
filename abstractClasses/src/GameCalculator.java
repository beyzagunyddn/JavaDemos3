public abstract class GameCalculator {
    public abstract void hesapla();
    // Ne demek; hesapla'yı kim inheritance ediyorsa hesaplayı içermek zorunda
    // fakat hesapla'yı override etmek zorunda
    //yani kadınlar için ayrı, erkekler için ayrı, çocuklar için ayrı hesaplama yapmak istiyorsak bunu kullanırız.


    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }

    //Ne demek; GameCalculator'ı kim kullanıyorsa gameOver'ı kullanmak zorunda

}
