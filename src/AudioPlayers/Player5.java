package AudioPlayers;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Player5 {
    private final int price;
    String[] playlist = {"The best song", "Good song", "Super Song"};

    public Player5(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void playSong(){
        String[] playlistToPlay = Arrays.copyOf(playlist,1);
            System.out.println("Player5 - Playing: " + Arrays.toString(playlistToPlay));
    }

    public void playAllSongs(){
        for(int i =0; i<playlist.length; i++){
            System.out.println("Player5 - Playing: " + playlist[playlist.length-(i+1)] );
        }
    }

}
