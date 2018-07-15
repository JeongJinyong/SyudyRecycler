package com.example.image.syudyrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

public class StGridRecyclerAdapter extends RecyclerView.Adapter<StGridRecyclerAdapter.ViewHoler> {

    Context mContext;
    ArrayList<RecyclerItem> recyclerItems;

    public StGridRecyclerAdapter(Context context, ArrayList arrayList) {
        mContext = context;
        recyclerItems = arrayList;
    }

    @NonNull
    @Override
    public StGridRecyclerAdapter.ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.s_glid_card_item, parent, false);
        StGridRecyclerAdapter.ViewHoler viewHoler = new StGridRecyclerAdapter.ViewHoler(view);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull StGridRecyclerAdapter.ViewHoler holder, int position) {
        RecyclerItem item = recyclerItems.get(position);
        holder.s_grid_card_img.setImageDrawable(item.getImg());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    class ViewHoler extends RecyclerView.ViewHolder {
        ImageView s_grid_card_img;

        public ViewHoler(View itemView) {
            super(itemView);
            s_grid_card_img = itemView.findViewById(R.id.s_grid_card_img);
        }
    }
}
