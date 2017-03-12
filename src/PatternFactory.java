public class PatternFactory {

    public Food getGamburger(){
        return new Gamburger();
    }

    public Food getKartoshka(){
        return new Kartoshka();
    }
}
