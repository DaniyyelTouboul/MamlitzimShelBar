package daniyyeltouboul.mamlitzimshelbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Daniyyel on 30/04/2017.
 */

public class GamesFragment extends Fragment {
    @Nullable
    private ArrayList<Game> games;
    private RecyclerView recyclerView;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.games_fragment,container,false);
        games = new ArrayList<Game>();

        games.add(new Game("Usja42", "Falcon Johns","22"));
        games.add(new Game("missy4", "Missy Laurens","17"));
        games.add(new Game("Osama", "Ben Laden","45"));
        games.add(new Game("Usja42", "Falcon Johns","22"));
        games.add(new Game("missy4", "Missy Laurens","17"));
        games.add(new Game("Osama", "Ben Laden","45"));
        games.add(new Game("Usja42", "Falcon Johns","22"));
        games.add(new Game("missy4", "Missy Laurens","17"));
        games.add(new Game("Osama", "Ben Laden","45"));



        recyclerView = (RecyclerView)view.findViewById(R.id.gamesRecycler);

        LinearLayoutManager lim = new LinearLayoutManager(getContext());
        lim.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(lim);

        GamesAdapter gamesAdapter = new GamesAdapter(games,getContext());
        recyclerView.setAdapter(gamesAdapter);


        return view;
    }
}
