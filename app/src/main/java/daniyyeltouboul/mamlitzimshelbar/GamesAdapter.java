package daniyyeltouboul.mamlitzimshelbar;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Daniyyel on 30/04/2017.
 */

public class GamesAdapter extends RecyclerView.Adapter<GamesAdapter.GameViewHolder> {

    final String imageUrl = "http://www.atpworldtour.com/-/media/tennis/players/gladiator/2016/daniel_full_16.png";
    private ArrayList<Game> games;
    private Context context;
    myGameAdapterListner listner;



    public void setListner(myGameAdapterListner listner) {
        this.listner = listner;
    }

    public GamesAdapter(ArrayList<Game> games, Context context) {
        this.games = games;
        this.context = context;
    }

    @Override
    public int getItemCount() {
        return games.size();
    }

    public interface myGameAdapterListner {
        void onGameClick(int position, View view);


    }


    class GameViewHolder extends RecyclerView.ViewHolder {


        TextView userName;
        TextView fullName;
        TextView age;




        public GameViewHolder(final View itemView) {
            super(itemView);
            userName = (TextView) itemView.findViewById(R.id.userName);
            fullName = (TextView)itemView.findViewById(R.id.fullName);
            age = (TextView)itemView.findViewById(R.id.age);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listner.onGameClick(getAdapterPosition(),view);
                }
            });

        }
    }

    @Override
    public GameViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.games_cell,parent,false);
       GameViewHolder GameViewHolder = new GameViewHolder(v);
        return GameViewHolder;
    }

    @Override
    public void onBindViewHolder(GamesAdapter.GameViewHolder holder, int position) {
        Game Game = games.get(position);
        holder.userName.setText(Game.getUserName());
        holder.fullName.setText(Game.getName());
        holder.age.setText(Game.getAge());
    }


    @Override
    public int getItemViewType(int position) {
        return 1;
    }
}

