public class PatternSingleton {

    private static PatternSingleton ourInstance = new PatternSingleton();

    private PatternFactory paternFac;
    private PatternStrategy paternStrategy;

    public static PatternSingleton getInstance() {
        return ourInstance;
    }

    private PatternSingleton() {
        paternFac = new PatternFactory();
        paternStrategy = new PatternStrategy();
    }

    public void doFactoryAndStrategy(String[] zakaz){

        for(String food : zakaz){
            if(food.equals("gamb")) {
                System.out.println(paternFac.getGamburger().getFood());
            }
            else if(food.equals("free")){
                System.out.println( paternFac.getKartoshka().getFood());
            }
        }

        paternStrategy.setVoice(new VoiceCat());
        paternStrategy.playVoice();

        paternStrategy.setVoice(new VoicePes());
        paternStrategy.playVoice();
    }

}
