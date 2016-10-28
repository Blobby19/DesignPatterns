package fr.itv95.adapter;

/**
 * Created by Luc on 13/10/2016.
 */
public class Main {

    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "test.mp3");
        audioPlayer.play("vlc", "test.vlc");
        audioPlayer.play("mp4", "test.mp4");
        audioPlayer.play("avi", "test.avi");
    }

}
