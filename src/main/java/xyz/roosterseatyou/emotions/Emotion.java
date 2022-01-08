package xyz.roosterseatyou.emotions;

import xyz.roosterseatyou.emotions.causes.EmotionCause;
import xyz.roosterseatyou.humans.Human;

public class Emotion {
    private Human human;
    private EmotionCause cause;
    private int lasts;

    public Emotion(Human human, EmotionCause cause){
        this.human = human;
        this.cause = cause;
        
    }

    public Emotion(Human human, EmotionCause cause, int lasts){
        this.human = human;
        this.cause = cause;
        this.lasts = lasts;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public EmotionCause getCause() {
        return cause;
    }

    public void setCause(EmotionCause cause) {
        this.cause = cause;
    }

    public int getLasts() {
        return lasts;
    }

    public void setLasts(int lasts) {
        this.lasts = lasts;
    }
}
