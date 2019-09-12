package AudioPlayers;

import java.util.Random;

public class OnPlay {

    public void insertSong(String[] playlist){
        for(int i=0; i<playlist.length; i++){
            IPlay.play(playlist[i]);
        }
    }

    public void insertSong(String song){
            IPlay.play(song);
    }
}
