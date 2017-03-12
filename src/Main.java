public class Main {

    public static void main(String[] args) {

        PatternSingleton instance = PatternSingleton.getInstance();
        instance.doFactoryAndStrategy(new String[]{"gamb", "free"});
    }

}
