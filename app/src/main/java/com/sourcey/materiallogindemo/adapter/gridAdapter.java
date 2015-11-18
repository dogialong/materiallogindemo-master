package com.sourcey.materiallogindemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sourcey.materiallogindemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vivhp_000 on 11/17/2015.
 */
public class gridAdapter extends RecyclerView.Adapter<gridAdapter.ViewHolder> {

    List<Grid_Items> mItems;


    public gridAdapter() {
        super();
        mItems = new ArrayList<Grid_Items>();
        Grid_Items gridItems = new Grid_Items();
        gridItems.setName("Bàn 1");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

        gridItems = new Grid_Items();
        gridItems.setName("Bàn 2");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

        gridItems = new Grid_Items();
        gridItems.setName("Bàn 3");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

        gridItems = new Grid_Items();
        gridItems.setName("Bàn 4");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

        gridItems = new Grid_Items();
        gridItems.setName("Bàn 5");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

        gridItems = new Grid_Items();
        gridItems.setName("Bàn 6");
        gridItems.setThumbnail(R.drawable.tables);
        mItems.add(gridItems);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Grid_Items items = mItems.get(position);
        holder.tvspecies.setText(items.getName());
        holder.imgThumbnail.setImageResource(items.getThumbnail());
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView imgThumbnail;
        public TextView tvspecies;

        public ViewHolder(View itemView) {

            super(itemView);
            imgThumbnail = (ImageView) itemView.findViewById(R.id.img_thumbnail);
            tvspecies = (TextView) itemView.findViewById(R.id.tv_species);
        }
    }

}
