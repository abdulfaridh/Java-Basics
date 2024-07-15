public class Movie {
    private String title;
    private String studio;
    private String rating;

    
    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

  
    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    
    public static Movie[] getPG(Movie[] movies) {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                count++;
            }
        }

        Movie[] pgMovies = new Movie[count];
        int index = 0;
        for (Movie movie : movies) {
            if (movie.rating.equals("PG")) {
                pgMovies[index] = movie;
                index++;
            }
        }

        return pgMovies;
    }

   
    public static void main(String[] args) {
        
        Movie casinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG-13");

      
        Movie inception = new Movie("Inception", "Warner Bros.", "PG-13");
        Movie toyStory = new Movie("Toy Story", "Pixar", "PG");
        Movie up = new Movie("Up", "Pixar", "PG");

        Movie[] movies = {casinoRoyale, inception, toyStory, up};

     
        Movie[] pgMovies = Movie.getPG(movies);
        System.out.println("PG Movies:");
        for (Movie movie : pgMovies) {
            System.out.println(movie.title);
        }
    }
}
