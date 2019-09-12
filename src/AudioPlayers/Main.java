package AudioPlayers;

public class Main {
    public static void main(String[] args){
        String song1 = "The Best Song";
        String[] playlist = {"The best song", "Good song", "Super Song"};

        Player1 player1 = new Player1(15);
        player1.playSong(song1);

        Player2 player2 = new Player2(10);
        player2.playSong(song1);

        Player3 player3 = new Player3(20);
        player3.playSong();
        player3.playAllSongs();

        Player4 player4 = new Player4(25);
        player4.playSong();
        player4.playAllSongs();

        Player5 player5 = new Player5(23);
        player5.playSong();
        player5.playAllSongs();

        Player6 player6 = new Player6(40);
        player6.playSong();
        player6.playAllSong();
        player6.shuffle();
        player6.playAllSong();

    }
}
