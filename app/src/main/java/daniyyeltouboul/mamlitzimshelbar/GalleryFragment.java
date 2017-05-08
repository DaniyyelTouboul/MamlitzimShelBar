package daniyyeltouboul.mamlitzimshelbar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by Daniyyel on 30/04/2017.
 */

public class GalleryFragment extends Fragment {

    final String imageUrl = "https://images.pexels.com/photos/207962/pexels-photo-207962.jpeg";
    private ArrayList<Gallery> galleries;
    private RecyclerView galleryRecyclerView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gallery_fragment,container,false);

        galleries = new ArrayList<Gallery>();


        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));
        galleries.add(new Gallery(imageUrl));

        galleryRecyclerView = (RecyclerView)view.findViewById(R.id.galleryRecycler);

        GridLayoutManager glm = new GridLayoutManager(this.getContext(),3);
        glm.setOrientation(GridLayoutManager.VERTICAL);
        galleryRecyclerView.setLayoutManager(glm);

        GallreyAdapter.GalleryAdapter galleryAdapter = new GallreyAdapter.GalleryAdapter(galleries,getContext());
        galleryRecyclerView.setAdapter((galleryAdapter));


        return view;
    }
}
