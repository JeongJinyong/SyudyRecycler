package com.example.image.syudyrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class GridRecyclerAdapter extends RecyclerView.Adapter<GridRecyclerAdapter.ViewHoler> {

    Context mContext;
    ArrayList<RecyclerItem> recyclerItems;

    public GridRecyclerAdapter(Context context, ArrayList arrayList) {
        mContext = context;
        recyclerItems = arrayList;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_card_item, parent, false);
        GridRecyclerAdapter.ViewHoler viewHoler = new GridRecyclerAdapter.ViewHoler(view);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        RecyclerItem item = recyclerItems.get(position);
        holder.grid_card_img.setImageDrawable(item.getImg());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    class ViewHoler extends RecyclerView.ViewHolder {
        ImageView grid_card_img;

        public ViewHoler(View itemView) {
            super(itemView);
            grid_card_img = itemView.findViewById(R.id.grid_card_img);
        }
    }

}
