package sg.edu.rp.c346.movielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    ArrayList<MovieList> movieList;
    CustomAdapter caMovie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMovie=(ListView)findViewById(R.id.listViewMovie);
        movieList = new ArrayList<MovieList>();

        caMovie = new CustomAdapter(this, R.layout.movie_list, movieList);
        lvMovie.setAdapter(caMovie);

        MovieList item1 = new MovieList("War for the Planet of the Apes","A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's");
        movieList.add(item1);
        MovieList item2 = new MovieList("King Kong","Movie about a giant ape, created by American filmmaker  Merian C. Cooper that first appear in 1930s.");
        movieList.add(item2);








    }
}
