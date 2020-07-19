package ru.alishev.springcourse;

public class MusicPlayer {
    private Music music;

    //InC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
