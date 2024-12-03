import java.util.Scanner;
public class Main
{

    //Animated
    static Movie spirit = new Movie("Spirited Away","Animated Adventure",135,96,"Spirited Away tells the story of Chihiro, a young girl who stumbles into a mystical world of spirits while moving to a new home and must work in a bathhouse to save her parents, who have been transformed into pigs. Along her journey, she discovers courage, kindness, and the value of self-reliance while navigating a realm filled with magic and mystery.");
    static Movie despic = new Movie("Despicable Me","Animated Comedy",95,83,"Despicable Me follows Gru, a supervillain who plans to steal the moon but finds his life transformed when he adopts three orphaned girls as part of his scheme. As the girls melt his heart, Gru discovers the joys of family and redefines his priorities, turning from villainy to fatherhood.");
    static Movie lego = new Movie("The Lego Movie","Animated Comedy",100,87,"The LEGO Movie follows Emmet, an ordinary LEGO figure who is mistakenly identified as the Special, a prophesied hero destined to save the LEGO universe from the evil Lord Business. Alongside a group of quirky allies, Emmet learns the power of creativity and teamwork, proving that anyone can make a difference.");
    static Movie[] animated = {spirit, despic, lego};

    //SciFi
    static Movie dune = new Movie("Dune: Part One","Science Fiction",166,90,"Dune tells the story of Paul Atreides, a young nobleman whose family is thrust into a deadly power struggle over the desert planet Arrakis, the sole source of the universe's most valuable resource, spice. As Paul discovers his destiny tied to the planet's mysterious people and ancient prophecies, he must navigate betrayal, politics, and survival to shape the future of the galaxy.");
    static Movie starwars = new Movie("Star Wars: A New Hope","Science Fiction Action",95,121,"Star Wars: A New Hope follows Luke Skywalker, a farm boy who joins the Rebel Alliance after discovering his destiny to fight the evil Galactic Empire. With the help of allies like Princess Leia, Han Solo, and Obi-Wan Kenobi, he embarks on a mission to destroy the Death Star and bring hope to the galaxy.");
    static Movie mib = new Movie("Men In Black","Science Fiction Comedy",98,80,"Men in Black follows Agent J, a rookie recruited into a secret organization that monitors extraterrestrial activity on Earth, as he partners with the seasoned Agent K to prevent an alien threat from destroying the planet. Together, they navigate bizarre encounters and uncover hidden truths while ensuring the world's obliviousness to alien life.");
    static Movie[] scifi = {dune,starwars,mib};

    //Horror
    static Movie smile = new Movie("Smile", "Horror", 115, 77,"Smile follows Dr. Rose Cotter, a therapist who becomes haunted by an eerie entity after witnessing a patient's unsettling death. As the sinister force manifests through terrifying smiles, Rose must confront her traumatic past to escape its deadly grip.");
    static Movie conjuring = new Movie("The Conjuring", "Horror", 112, 83,"The Conjuring tells the story of paranormal investigators Ed and Lorraine Warren, who help a family terrorized by a malevolent presence in their new farmhouse. As the Warrens uncover the dark history of the property, they risk their lives to confront the powerful entity and save the family.");
    static Movie child = new Movie("Child's Play", "Horror", 87, 65,"Child's Play follows a young boy named Andy who receives a seemingly harmless doll named Chucky, only to discover it is possessed by the soul of a serial killer. As Chucky embarks on a deadly rampage, Andy must convince others of the truth and stop the doll before it's too late.");
    static Movie[] horror = {smile,conjuring,child};

    //Romance  
    static Movie notebook = new Movie("The Notebook", "Romance", 121, 85,"The Notebook tells the story of Noah and Allie, two lovers from different social backgrounds whose relationship is tested by time, class differences, and family interference. Reunited years later, their deep connection endures as Noah reads their love story from a notebook, rekindling their passion and memories.");
    static Movie tenThings = new Movie("10 Things I Hate About You", "Romance", 97, 69,"10 Things I Hate About You centers on the romance between the independent and aloof Kat Stratford and the charming bad boy Patrick Verona, who is hired to date her so her younger sister can date. As Patrick and Kat's relationship deepens, they both confront their emotional baggage and find unexpected love.");
    static Movie allTheBoys = new Movie("To All The Boys I've Loved Before", "Romance", 99, 84,"To All the Boys I've Loved Before follows Lara Jean Covey, a high school student whose secret love letters to her past crushes are accidentally sent out, leading to unexpected romantic complications. As she navigates these new relationships, Lara Jean learns about love, self-discovery, and the importance of being true to herself.");
    static Movie[] romance = {notebook,tenThings,allTheBoys};

    //Action
    static Movie john = new Movie("John Wick", "Action Thriller", 101, 81,"John Wick follows a retired hitman seeking vengeance against those who wronged him, after the brutal murder of his beloved dog, a final gift from his late wife. As he unleashes his lethal skills, John Wick is drawn back into the violent underworld he once left behind.");
    static Movie dieHard = new Movie("Die Hard", "Action Adventure", 131,94,"Die Hard follows NYPD officer John McClane, who must save a building full of hostages, including his wife, after a group of terrorists take control of a Los Angeles skyscraper. As McClane uses his wits and resourcefulness to outsmart the criminals, he faces escalating danger in a high-stakes battle for survival.");
    static Movie endgame = new Movie("Avengers: Endgame", "Action Superhero", 182, 90,"Avengers: Endgame follows the surviving members of the Avengers as they attempt to undo the catastrophic effects of Thanos' snap by traveling back in time to collect the Infinity Stones. In an epic showdown, they confront Thanos one last time, leading to sacrifices, triumphs, and a new beginning for the Marvel universe.");
    static Movie[] action = {john,dieHard,endgame};

    //Comedy
    static Movie grownups = new Movie("Grown Ups", "Comedy Drama", 102, 62,"Grown Ups is a comedy about five childhood friends who reunite for a weekend after the death of their childhood basketball coach, reconnecting with their families and reminiscing about their past. As they embrace their old dynamics, they rediscover the importance of friendship, fun, and family bonds.");
    static Movie superbad = new Movie("Superbad", "Comedy", 119, 87,"Superbad is a coming-of-age comedy about two high school friends, Seth and Evan, who try to make the most of their last days before graduation by attempting to buy alcohol for a party in hopes of impressing their crushes. Their misadventures, fueled by awkwardness and youthful enthusiasm, lead to a night of chaos and unexpected growth.");
    static Movie stepbros = new Movie("Step Brothers", "Comedy", 98, 69,"Step Brothers is a comedy film about two middle-aged men, Brennan and Dale, who are forced to live together as stepbrothers when their single parents marry. Despite their childish behavior and constant conflicts, they eventually form an unlikely bond and learn to grow up.");
    static Movie[] comedy = {grownups, superbad, stepbros};

    static Movie[] genre;
    static String genre2;
    static String color;
    static String blue = "\u001B[34m";
    static String red = "\u001B[31m";
    static String yellow = "\u001B[33m";
    static String magenta = "\u001B[35m";
    static String cyan = "\u001B[36m";
    static String green = "\u001B[32m";
    static String reset = "\u001B[0m";



    static String[] goodBye = {"quit","exit","end"};

    static String[] nextRec = {"Ok, I have another recommendation:",
                                "Ok, here's another movie recommendation:",
                                "That's ok, I have more recs:",
                                "Alright, here's a new one:"};

    static String[] noUnderstand = {"Sorry, I don't understand what you're trying to say. Could you please say that again?",
                                        "Sorry, I'm a bit confused, could you try again?",
                                        "You're not making sense, I only know about movies.",
                                        "I only deal in movies, can you please try again?",
                                        "Talk to me about movies, I don't understand what you're saying."};
   
       public static void main(String[] args)
       {        
        System.out.println("Hey! I heard you're looking for a movie to watch. What genre are you interested in? I can recommend you"+red+" Horror,"+magenta+" Romance,"+green+" Comedy,"+cyan+" SciFi,"+blue+" Action"+reset+" or"+yellow+" Animated" +reset+" movies. (Type 'quit' to exit)");
        whatGenre();
       }

       public static String genreCheck(String statement)
         {
                 statement=statement.toLowerCase();
                 String response = "";
                 if (statement.indexOf("horror") >= 0
                        || statement.indexOf("scary") >= 0)
                 {
                        genre = horror;
                        genre2="horror";
                         response = "So you're looking for a"+red+" horror"+reset+" movie?";
                 }
                 else if (statement.indexOf("romance") >= 0)
                 {
                        genre = romance;
                        genre2="romance";
                         response = "So a"+magenta+ " romance"+reset+" movie is the move?";
                 }
                 else if (statement.indexOf("comedy") >= 0
                                || statement.indexOf("funny") >= 0)
                 {
                        genre = comedy;
                        genre2="comedy";
                         response = "So you want a laugh from a"+ green+" comedy"+ reset+" movie?";
                 }
                 else if (statement.indexOf("action") >= 0)
                 {
                        genre = action;
                        genre2="action";
                         response = "So you're looking for a thrill with some"+blue+" action? "+reset;
                 }
                 else if (statement.indexOf("scifi") >= 0 
                                || statement.indexOf("science fiction") >= 0
                                || statement.indexOf("sciencefiction") >= 0)
                 {
                        genre = scifi;
                        genre2="scifi";
                         response = "So you're looking for a"+cyan+" science fiction "+reset+"movie?";
                 }
                 else if (statement.indexOf("animated") >= 0)
                 {
                        genre = animated;
                        genre2="animated";
                         response = "So you're looking for some beautiful art paired with a great story in an"+yellow+" animated "+reset+"movie?";
                 }
                 else{
                        response=getRandomResponse(noUnderstand);
                 }
                 return response;
        }

        public static String getRandomResponse(String[] arr1){
                int dex = (int) (Math.random()*arr1.length);
                return arr1[dex];
        }

        public static void quitCheck(String statement){
                for(String x: goodBye){
                        if(statement.equals(x)){
                                System.out.println("Goodbye!");
                                System.exit(0);
                        }
                }
        }
        
        public static String yesNo(String statement){  
                    String end = "";
                    statement=statement.toLowerCase();
                    if (statement.indexOf("no") >= 0 || statement.indexOf("nah") >= 0 || statement.indexOf("nope") >= 0){
                        end="n";   
                    }
                    else if(statement.indexOf("yes") >= 0 || statement.indexOf("yea") >= 0 || statement.indexOf("yep") >= 0 || statement.indexOf("sure") >= 0){
                        end = "y";
                    }
                    return end;
        }
        
        public static void movieGiver(){
                Scanner in2 = new Scanner (System.in);
                boolean cont2=true;
                while(cont2){
                        String userResp1 = in2.nextLine(); 
                        quitCheck(userResp1);
                        if(yesNo(userResp1).equals("y")){
                                cont2=false;
                                System.out.println(" ");
                                System.out.println("Ok, great! I've got a couple recommendations. Here's the first one:");
                                cont2=false;
                                recommender();
                        }
                        else if(yesNo(userResp1).equals("n")){
                                cont2=false;
                                System.out.println("So what genre are you interested in?");
                                whatGenre();
                                movieGiver();
                        }     
                        else{
                                System.out.println(getRandomResponse(noUnderstand));
                        }           
                }
        }

        public static void whatGenre(){
                Scanner in = new Scanner (System.in);
                boolean cont = true;
                int count2 = 0;
                while(cont){
                        String userResp = in.nextLine();
                        quitCheck(userResp);
                        String g=genreCheck(userResp);
                        System.out.println(g);
                        for(String e : noUnderstand){
                                if(g!=e){
                                        count2++;
                                }
                        }
                        if(count2==noUnderstand.length){
                                cont=false;
                        }
                        else{
                                count2=0;
                        }
                }
                movieGiver();
        }

        public static void getGenreCol(String g){
                if(g.equals("horror")){
                    color=red;
                }
                else if(g.equals("action")){
                    color=blue;
                }
                else if(g.equals("scifi")){
                    color=cyan;
                }
                else if(g.equals("animated")){
                    color=yellow;
                }
                else if(g.equals("romance")){
                    color=magenta;
                }
                else if(g.equals("comedy")){
                    color=green;
                }
        }

        public static void recommender(){
                getGenreCol(genre2);
                Scanner in = new Scanner (System.in);
                int count = 0;
                boolean cont = true;
                boolean foundRec = false;
                while(cont){
                        System.out.println(genre[count].toString(color));
                        System.out.println(" ");
                        System.out.println("Does this one sound good?");
                        count++;
                        boolean cont3=true;
                        String userResp = in.nextLine();
                        while(cont3){
                                if(yesNo(userResp).equals("n") || yesNo(userResp).equals("y")){
                                        cont3=false;
                                }
                                else{
                                        System.out.println(getRandomResponse(noUnderstand));
                                        userResp=in.nextLine();
                                }
                        }
                        quitCheck(userResp);
                        if(yesNo(userResp).equals("y")){
                                cont=false;
                                foundRec=true;
                        }
                        else if(yesNo(userResp).equals("n")){     
                                if(count==3){
                                        System.out.println("Sorry, but I have no more recommendations of your chosen genre. Would you like to explore a new genre?");
                                        String userResp2 = in.nextLine();
                                        quitCheck(userResp2);
                                        boolean cont4 = true;
                                        while(cont4){
                                                if(yesNo(userResp2).equals("y") || yesNo(userResp2).equals("n")){
                                                        cont4=false;
                                                }
                                                else{
                                                        System.out.println(getRandomResponse(noUnderstand));
                                                        userResp2=in.nextLine();
                                                }
                                        }
                                        if(yesNo(userResp2).equals("y")){
                                                System.out.println(" ");
                                                System.out.println("What genre are you interested in? I can recommend you Horror, Romance, Comedy, SciFi, Action or Animated movies.");
                                                cont = false;
                                                whatGenre();
                                        }
                                        else{
                                                System.out.println("Ok! Since we can't help you any further on movies, here's a funny story: My wife asked me if I wanted to watch Dr. Strange for movie night, but I said no. I had Stranger Things to watch. Anyways, bye!");
                                                cont=false;
                                        }
                                }
                                else{
                                        System.out.println(" ");
                                        System.out.println(getRandomResponse(nextRec));
                                }
                        }
                }
                if(foundRec){
                        System.out.println("Ok, great! Hope you enjoy your movie!");
                        System.exit(0);
                }
        }
}
