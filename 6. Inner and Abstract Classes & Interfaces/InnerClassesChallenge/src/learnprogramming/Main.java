package learnprogramming;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.32);
        album.addSong("Love don't mean a thing", 4.59);
        album.addSong("Holy man", 5.20);
        album.addSong("Hold on", 2.30);
        album.addSong("Lady double dealer", 3.25);
        album.addSong("You can't do it right", 3.34);
        album.addSong("High ball shooter", 4.21);
        album.addSong("The gypsy", 4.40);
        album.addSong("Soldier of fortune", 3.50);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Track 1", 5.34);
        album.addSong("Track 2", 3.34);
        album.addSong("Track 3", 4.14);
        album.addSong("Track 4", 2.53);
        album.addSong("Track 5", 3.43);
        album.addSong("Track 6", 4.01);
        album.addSong("Track 7", 4.11);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("You can't do it right", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("The gypsy", playList);
        albums.get(0).addToPlaylist("Speed king", playList);    //does not exist
        albums.get(1).addToPlaylist(5, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(26, playList);     //there is no track 26

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end og the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = false;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list song in the playlist\n" +
                "5 - print available actions\n" +
                "6 - delete current song from playlist.");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("________________________");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("________________________");

    }
}
