/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.assignment;


import java.util.Scanner;                 
/**
 *
 * @author dsmith230
 */
public class Track extends trackList{
    
    private String trackId;
    String trackTitle;
    String artist;
    private String trackLength;
    private String composer;
    private String releaseDate;
    private String album;
    private String genre;
    private int choice;
    
    public Track next;
    public Track(String trackId, String trackTitle, String artist, 
            String trackLength, String composer, String releaseDate,
            String album, String genre){
            
        this.trackId = trackId;
        this.trackTitle = trackLength;
        this.artist = artist;
        this.trackLength = trackLength;
        this.composer = composer;
        this.releaseDate = releaseDate;
        this.album = album;
        this.genre = genre;
        
    }
    
    /**
     * Declaring the getter and setter variables and methods
     * @return The specific value assigned to each get/set method
     */
    @Override
    public String toString(){
        
        return trackTitle;
    }
    
    public String getTrackId(){
        return trackId;
    }
    public void setTrackId(String newTrackId){
        this.trackId = newTrackId;
    }
    
    public String getTrackTitle(){
        return trackTitle;
    }
    public void setTrackTitle(String newTrackTitle){
        this.trackTitle = newTrackTitle;
    }
    
    public String getArtist(){
        return artist;
    }
    public void setArtist(String newArtist){
        this.artist = newArtist;
    }
    
    public String getTrackLength(){
        return trackLength;
    }
    public void setTrackLength(String newTrackLength){
        this.trackLength = newTrackLength;
    }
    
    public String getComposer(){
        return composer;
    }
    public void setComposer(String newComposer){
        this.composer = newComposer;
    }
    
    public String getReleaseDate(){
        return releaseDate;
    }
    public void setReleaseDate(String newReleaseDate){
        this.releaseDate = newReleaseDate;
    }
    
    public String getAlbum(){
        return album;
    }
    public void setAlbum(String newAlbum){
        this.album = newAlbum;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String newGenre){
        this.genre = newGenre;
    }
    
    public int getChoice(){
        return choice;
    }
    public void setChoice(int newChoice){
        this.choice = newChoice;
    }
    
    
    /*public static void testTrack(){
    Track t = new Track("a1", "Title1", "Artist1", "1:00", "Composer1", 
        "1/1/2000", "Album1", "Genre1");
        
        System.out.println(t.getTrackId());
        System.out.println(t.getTrackTitle());  
        System.out.println(t.getArtist());
        System.out.println(t.getTrackLength());
        System.out.println(t.getComposer());
        System.out.println(t.getReleaseDate());
        System.out.println(t.getAlbum());
        System.out.println(t.getGenre());
        //testing the getters and setter methods
    }        */
      @Override
      public void display(){
          
          System.out.println("ID: " + trackId + "Title: " + trackTitle + "Artist: " 
                  + artist + "Track Length: " + trackLength + "Composer: " + composer 
                  + "Release Date: " + releaseDate + "Album: " + album + "Genre: " + genre);
      }
      /**
       * Generic display for all the attributes of a Track object
       */
    
      @Override
      public void trackList(){
          
      }
      @Override
      public void findArtist(){
          
      } 
      @Override
      public void findTitle(){
          
      }
      @Override
      public void insertFirstTrack(){
          
      }
      @Override
      public void displayGenre(){
          
      }
      @Override
      public void ascendingArtist(){
          
      }
      @Override
      public void descendingArtist(){
          
      }
      @Override
      public void availableTrack(){
          
      }
      @Override
      public void displayAllArtists(){
          
      }
      @Override
      public void addTrack(){
            
            /*
            @Override
            public boolean addTrack(String s) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            } */
            
            



        Scanner scan1 = new Scanner(System.in);
        
        System.out.println("What is the TrackId?");
        String trackId= scan1.next();
        trackId += scan1.nextLine();
        
        System.out.println("Please enter a Track Title.");
        String trackTitle = scan1.next();
        trackTitle += scan1.nextLine();
        
        System.out.println("Please enter the Artist.");
        String artist = scan1.next();
        artist += scan1.nextLine();
        
        System.out.println("Please enter the track length.");
        String trackLength = scan1.next();
        trackLength += scan1.nextLine();
        
        System.out.println("Please enter the composer.");
        String composer = scan1.next();
        composer += scan1.nextLine();
        
        System.out.println("Please enter the release date in format 00/00/00.");
        String releaseDate = scan1.next();
        releaseDate += scan1.nextLine();
        
        System.out.println("Please enter the name of the album.");
        String album = scan1.next();
        album += scan1.nextLine();
        
        System.out.println("Please enter the genre.");
        String genre = scan1.next();
        genre += scan1.nextLine();
        
        System.out.println("Thank you the data is as follows;");
        System.out.printf("%n");
        System.out.println("Track ID = " + this.trackId);
        System.out.printf("%n");
        System.out.println("Track Title = " + this.trackTitle);
        System.out.printf("%n");
        System.out.println("Artist = " + this.artist);
        System.out.printf("%n");
        System.out.println("Track Length = " + this.trackLength);
        System.out.printf("%n");
        System.out.println("Composer = " + this.composer);
        System.out.printf("%n");
        System.out.println("Release Date = " + this.releaseDate);
        System.out.printf("%n");
        System.out.println("Album = " + this.album);
        System.out.printf("%n");
        System.out.println("Genre = " + this.genre);
        System.out.printf("%n");
        
        
}
        
        
        //trackList.addFirst(new Track(this.trackId, this.trackTitle, this.artist, this.trackLength, this.composer, this.releaseDate, this.album, this.genre));
        
        
        
        /*
        MyList.addFirst(trackId);
        MyList.addFirst(trackTitle);
        MyList.addFirst(artist);
        MyList.addFirst(trackLength);
        MyList.addFirst(composer);
        MyList.addFirst(releaseDate);
        MyList.addFirst(album);
        MyList.addFirst(genre);
            
            */
            
            
        
        /**
         * //main method that allows the user to pick a task to enter data, traverse the linked list or binary tree 
         * @param args 
         */
    
    
    public static void main(String[] args){
        
       /* trackList theLinkedList = new trackList() {

            @Override
            public void trackList() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void insertFirstTrack() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void findTitle() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void findArtist() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void displayGenre() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        theLinkedList.insertFirstTrack("test0.1", "test0.2", "test0.3", "test0.4", "test0.5", "test0.6", "test0.7", "test0.8");
        theLinkedList.insertFirstTrack("test1.1", "test1.2", "test1.3", "test1.4", "test1.5", "test1.6", "test1.7", "test1.8");
        theLinkedList.insertFirstTrack("test2.1", "test2.2", "test2.3", "test2.4", "test2.5", "test2.6", "test2.7", "test2.8");
        
        theLinkedList.display();
        theLinkedList.findTitle("test1.2");
        
        //attemp at adding values in manually
        */
    
        
            //User interface for user input for the track attributes
            Scanner scan3 = new Scanner(System.in);
            System.out.println("Please type number for the action you require.");
            System.out.printf("%n");
            System.out.println("1:Add a new Track.");
            System.out.printf("%n");
            System.out.println("2:Display track.");
            System.out.printf("%n");
            System.out.println("3:Search for a track by it's title.");
            System.out.printf("%n");
            System.out.println("4:Search for a track by it's artist.");
            System.out.printf("%n");
            System.out.println("5:Display tracks by their genre.");
            System.out.printf("%n");
            System.out.println("6:Display all tracks.");
            System.out.printf("%n");
            System.out.println("7:Display all tracks in ascending Artist order.");
            System.out.printf("%n");
            System.out.println("8:Display all tracks in descending Artist order.");
            System.out.printf("%n");
            System.out.println("9:Display all tracks that are available for use.");
            System.out.printf("%n");
            System.out.println("10:Display all Artist names for all the Tracks.");
            System.out.printf("%n");
            int choice = scan3.nextInt();
            
            trackList listObj = new trackList() {

                @Override
                public void trackList() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void insertFirstTrack() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void findTitle() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void findArtist() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                @Override
                public void displayGenre() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }

                
            };
            
            
            switch (choice) {
                case 1:
                    listObj.addTrack();
                    break;
                case 2:
                    listObj.displayTrack();
                    break;
                case 3:
                    listObj.searchTitle();
                    break;
                case 4:
                    listObj.searchArtist();
                    break;
                case 5:
                    listObj.displayGenre();
                    break;
                case 6:
                    listObj.displayAll();
                    break;
                case 7:
                    listObj.ascendingArtist();
                    break;
                case 8:
                    listObj.descendingArtist();
                    break;
                case 9:
                    listObj.availableTrack();
                    break;
                case 10:
                    listObj.displayAllArtists();
                    break;
            } 
              
        }
        
    
    }