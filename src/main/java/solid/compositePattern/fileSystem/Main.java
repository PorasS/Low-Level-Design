package solid.compositePattern.fileSystem;

public class Main {

    public static void main(String[] args) {
        Directory movies = new Directory("Movies");
        FileSystem maverick = new File("Maverick");
        movies.add(maverick);
        Directory comedyMovies = new Directory("ComedyMovies");
        FileSystem hangover = new File("HangOver");
        comedyMovies.add(hangover);
        movies.add(comedyMovies);

        movies.ls();
    }


}
