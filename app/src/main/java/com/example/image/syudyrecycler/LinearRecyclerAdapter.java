package com.example.image.syudyrecycler;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LinearRecyclerAdapter extends RecyclerView.Adapter<LinearRecyclerAdapter.ViewHoler> {

    Context mContext;
    ArrayList<RecyclerItem> recyclerItems;

    public LinearRecyclerAdapter(Context context, ArrayList arrayList){
        mContext = context;
        recyclerItems = arrayList;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.linear_card_item,parent,false);
        ViewHoler viewHoler = new ViewHoler(view);
        return viewHoler;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        RecyclerItem item = recyclerItems.get(position);
        holder.linear_card_img.setImageDrawable(item.getImg());
        holder.linear_card_nm.setText(item.getNm());
        holder.linear_card_msg.setText(item.getMsg());
    }

    @Override
    public int getItemCount() {
        return recyclerItems.size();
    }

    class ViewHoler extends RecyclerView.ViewHolder{
        TextView linear_card_nm;
        TextView linear_card_msg;
        ImageView linear_card_img;

       public ViewHoler(View itemView) {
           super(itemView);
           linear_card_img = itemView.findViewById(R.id.linear_card_img);
           linear_card_msg = itemView.findViewById(R.id.linear_card_msg);
           linear_card_nm = itemView.findViewById(R.id.linear_card_nm);
       }
   }

}
