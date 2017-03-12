public class PatternStrategy {
    private Voice voice;

    public PatternStrategy(){}

    public void setVoice(Voice voice) {
        this.voice = voice;
    }

    public void playVoice(){
        voice.say();
    }
}