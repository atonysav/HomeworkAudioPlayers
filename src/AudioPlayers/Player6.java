package AudioPlayers;

import java.util.Random;

public class Player6 {

    private final int price;
    private final String[] playlist = {"The best song", "Good song", "Super Song"};
    OnPlay onPlay = new OnPlay();

    public Player6(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void shuffle(){
        Random rand = new Random();
        for(int i =0; i<playlist.length; i++){
            int randomIndex = rand.nextInt(playlist.length);
            String temp = playlist[i];
            playlist[i]=playlist[randomIndex];
            playlist[randomIndex]=temp;
        }
    }

    public void playSong(){
        onPlay.insertSong(playlist[0]);
    }

    public void playAllSong(){
        onPlay.insertSong(playlist);
    }
}
