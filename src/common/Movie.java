package common;

import java.util.Objects;
import java.util.UUID;
/**
 * For practice, add the required equals, hashCode and toString methods. Then
 * add a Comparable interface for the "natural" default sort order. Remember,
 * consider what makes these objects unique? Also consider that only one
 * field can be used for sorting. What will you do?
 * 
 */
public class Movie  implements Comparable<Movie>{
    private String movieId;
    private String title;
    private String director;

    public Movie(String movieId, String title, String director){
        setMovieId(movieId); setTitle(title); setDirector(director);
    }
    
    public Movie(String title, String director){
        this(UUID.randomUUID().toString(), title,director);
    }
    
    public Movie() {
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.movieId);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Movie other = (Movie) obj;
        if (!Objects.equals(this.movieId, other.movieId)) {
            return false;
        }
        return true;
    }
    
    
    @Override
    public String toString(){
      return movieId + ": \"" + title + "\" by "  + director;
    }

    @Override
    public int compareTo(Movie target) {
        return movieId.compareTo(target.getMovieId());
    }
}
