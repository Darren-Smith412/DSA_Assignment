/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.assignment;

//import java.util.Scanner;



/**
 *
 * //this class attempts to implement a linked list without the use of java collections
 * //the class looks to link data with the next and previous nodes.
 * 
 * @dsmith230
 */

public abstract class trackList implements IADTtrackList{
    
    private Track firstTrack;
    
    trackList(){
        
        firstTrack = null;
    }

    @Override
    public boolean isEmpty(){
     
          return(firstTrack == null);
    }
    
    public void insertFirstTrack(String trackId, String trackTitle, String artist, 
            String trackLength, String composer, String releaseDate,
            String album, String genre){
        
        Track newTrack = new Track(trackId, trackTitle, artist, trackLength, composer, releaseDate, album, genre);
        
        newTrack.next = firstTrack;
        firstTrack = newTrack;
        
    }

    @Override
    public Track removeFirst(){
        
        Track trackReference = firstTrack;
        
        if(!isEmpty()){
            
            firstTrack = firstTrack.next;
        } else{
            
            System.out.println("Empty List");
        }
        return trackReference;
    }
    
    @Override
    public void display(){
        
        Track trackLink = firstTrack;
        
        while(trackLink != null){
            
            trackLink.display();
            System.out.println("Next Track: " + trackLink.next);
            
            trackLink = trackLink.next;
            System.out.println();
        }
    }
    
    public Track findTitle(String trackTitle){
        
        Track trackTitleLink = firstTrack;
        
        if(!isEmpty()){
            
            while(trackTitleLink.trackTitle == null ? trackTitle != null : !trackTitleLink.trackTitle.equals(trackTitle)){
                
                if(trackTitleLink.next == null){
                    
                    return null;
                } else {
                    trackTitleLink = trackTitleLink.next;
                }
            }
        }else{
            System.out.println("Empty List");
        }
        return trackTitleLink;
    }
    
     public Track findArtist(String artist){
        
        Track artistLink = firstTrack;
        
        if(!isEmpty()){
            
            while(artistLink.artist == null ? artist != null : !artistLink.artist.equals(artist)){
                
                if(artistLink.next == null){
                    
                    return null;
                } else {
                    artistLink = artistLink.next;
                }
            }
        }else{
            System.out.println("Empty List");
        }
        return artistLink;
    }
    
    public Track displayGenre(String genre){
        
        Track genreLink = firstTrack;
        
        if(!isEmpty()){
            
            while(genreLink.artist == null ? genre != null : !genreLink.artist.equals(genre)){
                
                if(genreLink.next == null){
                    
                    return null;
                } else {
                    genreLink = genreLink.next;
                }
            }
        }else{
            System.out.println("Empty List");
        }
        return genreLink;
    }
    
    @Override
    public void displayAll(){
        
        Track trackLink = firstTrack;
        
        if(firstTrack == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Linked List: ");
        while(trackLink != null){
            System.out.print(trackLink.next + " ");
            trackLink = trackLink.next;
        }
        System.out.println();
    }
    @Override
    public void addTrack() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void displayTrack() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void searchTitle() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void searchArtist() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    void ascendingArtist() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void descendingArtist() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void availableTrack() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void displayAllArtists() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}


/*public class trackList<E> implements IADTtrackList{

    void addFirst(int trackId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    private static class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement(){
            return element;
        }        
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }
    
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public trackList(){};
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty()){
            return null;
        }
        return head.getElement();
    }
    public E last(){
        if(isEmpty()){
            return null;
        }
        return tail.getElement();
    }
    public void addFirst(E e){
        head = new Node<>(e, head);
        if(size == 0 ){
            tail = head;
        }
        size++;
        System.out.println("Added head node with'" + head.getElement() + "' element");
    }
    public void addLast(E e){
        Node<E> newNode = new Node<>(e, null);
        if(isEmpty()){
            head = newNode;
        }
        else{
            tail.setNext(newNode);
    }
    tail = newNode;
    size++;
    System.out.println("Added tail node with'" + tail.getElement() + "' element");
    }
    public E removeFirst(){
        if(isEmpty()){
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        if(size == 0){
            tail = null;
        }
        System.out.println("Removed head node with'" + answer+ "' element");
        return answer;
    }
    */

/*
   @Override
        public void addTrack(){
            
            
            /*@Override
            public boolean addTrack(String s) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
            */
            


/*
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
        
        
        //trackList.add(new Track(this.trackId, this.trackTitle, this.artist, this.trackLength, this.composer, this.releaseDate, this.album, this.genre));
        
        
        
        /*
        MyList.addFirst(trackId);
        MyList.addFirst(trackTitle);
        MyList.addFirst(artist);
        MyList.addFirst(trackLength);
        MyList.addFirst(composer);
        MyList.addFirst(releaseDate);
        MyList.addFirst(album);
        MyList.addFirst(genre);
            
            
            
            
        
        
    @Override
        public void displayTrack(){
            
        }
    @Override
        public void searchTitle(){
        
        }
    @Override
        public void searchArtist(){
        
        }
    @Override
        public void displayGenre(){
        
        }
    @Override
        public void displayAll(){
        
        } 
*/
