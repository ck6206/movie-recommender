public class Movie {
    private String name;
    private String genre;
    private int minutes;
    private int rating;
    private String summary;
    
    public Movie(String n, String g, int m, int r, String s){
        name = n;
        genre = g;
        minutes = m;
        rating = r;
        summary = s;
    }

    public String toString(){
        return name+" is a "+genre+" movie. It is "+minutes+" minutes long, and has a "+rating+"% audience score on Rotten Tomatoes. "+summary;
    }

}