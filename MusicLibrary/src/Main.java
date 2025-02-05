import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        MusicLibrary library = new MusicLibrary();
        library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new Song("CATCH THE RAINBOW", "RAINBOW"));
        library.addSong(new Song("IN SEARCH OF DEATH", "LOWTONE"));
        library.addSong(new Song("RIDE THE LIGHTNING", "METALICA"));
        library.addSong(new Song("HOLYWARS", "MEGADEATH"));
        library.addSong(new Song("MR.CROWLEY", "OZZY OSBORNE"));
        library.addSong(new Song("NAMDVILI MAMAKACURI SIYVARULI<3", "BREGVADZEEBI"));

        System.out.println("\n**Playing Random Song**");
        library.playRandom();
        System.out.println();
        library.playRandom();
        System.out.println();
        library.playRandom();
        System.out.println();
        library.playRandom();

    }
}