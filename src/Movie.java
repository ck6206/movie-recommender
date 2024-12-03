public class Movie {
    private String name;
    private String genre;
    private int minutes;
    private int rating;
    private String summary;
    private String reset = "\u001B[0m";
    
    public Movie(String n, String g, int m, int r, String s){
        name = n;
        genre = g;
        minutes = m;
        rating = r;
        summary = s;
    }

    public String toString(String g){
        return g+name+reset+" is a "+g+genre+reset+" movie. It is "+g+minutes+reset+" minutes long, and has a "+g+rating+"% "+reset+"audience score on Rotten Tomatoes. "+summary;
    }
}