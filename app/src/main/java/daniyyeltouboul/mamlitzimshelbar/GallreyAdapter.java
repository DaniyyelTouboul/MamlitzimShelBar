package daniyyeltouboul.mamlitzimshelbar;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Daniyyel on 06/05/2017.
 */

public class GallreyAdapter {


    public static class GalleryAdapter extends RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder> {

        private ArrayList<Gallery> galleries;
        private Context context;
        myGalleryAdapterListner listner;



        public void setListner(myGalleryAdapterListner listner) {
            this.listner = listner;
        }

        public GalleryAdapter(ArrayList<Gallery> galleries, Context context) {
            this.galleries = galleries;
            this.context = context;
        }

        @Override
        public int getItemCount() {
            return galleries.size();
        }

        public interface myGalleryAdapterListner {
            void onGalleryClick(int position, View view);

        }


        class GalleryViewHolder extends RecyclerView.ViewHolder {


            ImageView winnerPhoto;


            public GalleryViewHolder(final View itemView) {
                super(itemView);
                winnerPhoto = (ImageView)itemView.findViewById(R.id.winnerPhoto);


                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listner.onGalleryClick(getAdapterPosition(),view);
                    }
                });

            }
        }

        @Override
        public GalleryAdapter.GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_cell,parent,false);
            GalleryAdapter.GalleryViewHolder GalleryViewHolder = new GalleryAdapter.GalleryViewHolder(v);
            return GalleryViewHolder;
        }

        @Override
        public void onBindViewHolder(GalleryAdapter.GalleryViewHolder holder, int position) {
            Gallery Gallery = galleries.get(position);
            Picasso.with(context).load(galleries.get(position).getPhotoUrl()).resize(100,100).centerCrop().into(holder.winnerPhoto);
    }


        @Override
        public int getItemViewType(int position) {
            return 1;
        }
    }


}
