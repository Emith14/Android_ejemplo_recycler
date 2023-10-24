package com.example.ejemplo_recycler.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ejemplo_recycler.MainActivity2;
import com.example.ejemplo_recycler.Models.ItemList;
import com.example.ejemplo_recycler.R;

import java.util.List;

public class ArtistAdapter extends RecyclerView.Adapter<ArtistAdapter.RecyclerHolder> {
private List<ItemList> items;

    public ArtistAdapter(List<ItemList> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemsss, parent, false);
        return new RecyclerHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
      ItemList item = items.get(position);
      holder.setData(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class RecyclerHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ImageView imgItem;
        private TextView tvArtist;
        private  TextView tvDescription;

        ItemList i;

        public RecyclerHolder(@NonNull View itemView){
            super(itemView);
            imgItem=itemView.findViewById(R.id.imgItem);
            tvArtist=itemView.findViewById(R.id.tvArtist);
            tvDescription=itemView.findViewById(R.id.tvDescription);
            itemView.setOnClickListener(this);
        }

        public void setData(ItemList il) {
          i=il;
          imgItem.setImageResource(i.getImgResource());
          tvArtist.setText(i.getArtist());
          tvDescription.setText(i.getDescription());
        }

        @Override
        public void onClick(View v) {

            String Artist= tvArtist.getText().toString();
            ItemList selectedItem = i;
            Intent i = new Intent(v.getContext(), MainActivity2.class);
            i.putExtra("Art", Artist);
            i.putExtra("ItemList", selectedItem);
            v.getContext().startActivity(i);
        }
    }
}
