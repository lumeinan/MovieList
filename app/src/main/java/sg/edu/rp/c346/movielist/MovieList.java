package sg.edu.rp.c346.movielist;

/**
 * Created by 15045617 on 17/7/2017.
 */

public class MovieList {
    private String name;
    private String description;

    public MovieList(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String toString() {
        return "MovieList{" +
                "name" + name + '\'' +
                "description='" + description + '\''+
                '}';
    }




}
