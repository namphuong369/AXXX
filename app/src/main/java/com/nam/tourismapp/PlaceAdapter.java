package com.nam.tourismapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PlaceAdapter extends RecyclerView.Adapter<PlaceAdapter.ViewHolder> {
    List<Place> list;
    Context context;
    boolean isShow;
    public PlaceAdapter(List<Place> list, Context context,boolean isShow) {
        this.list = list;
        this.context = context;
        this.isShow=isShow;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Place place=list.get(position);
        ViewGroup.LayoutParams params = holder.iv1.getLayoutParams();
        ViewGroup.LayoutParams layoutParams=new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        if(isShow)
        {
            params.height=240;

        }else{
            holder.layout_item.setLayoutParams(layoutParams);
        }
        holder.iv1.setImageResource(place.getImage());
        holder.t1.setText(place.getTitle());
        holder.t2.setText(place.getContent());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener{
        ImageView iv1;
        LinearLayout layout,layout_item;
        TextView t1,t2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv1=itemView.findViewById(R.id.iv1);
            layout=itemView.findViewById(R.id.layout_linear);
            layout_item=itemView.findViewById(R.id.layout_item);
            t1=itemView.findViewById(R.id.t1);
            t2=itemView.findViewById(R.id.t2);
            if(isShow)
            {
                layout.setVisibility(View.VISIBLE);
            }else{
                layout.setVisibility(View.GONE);
            }
            itemView.setOnClickListener(this);
        }
        @Override
        public void onClick(View view) {
            listener.onItemClick(getAdapterPosition(), view);
        }
    }
    private ClickListener listener;

    public void setItemClickListener(ClickListener clickListener) {
        listener = clickListener;
    }

    public interface ClickListener {
        void onItemClick(int position, View v);
    }
}
