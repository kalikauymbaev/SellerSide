package com.example.satushyzerdeapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.satushyzerdeapp.R;

public class TovarInfoAdapter extends RecyclerView.Adapter<TovarInfoAdapter.viewHolder>{
    Context context;
    String[] tovarArraylist;

    public TovarInfoAdapter(Context context, String[]  tovarArraylist) {
        this.context = context;
        this.tovarArraylist = tovarArraylist;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tovar_img_recycler, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        String imgUrl = tovarArraylist[position];

        Glide.with(context)
                .load(imgUrl)
                .centerCrop()
                .placeholder(R.drawable.box)
                .into(holder.mImageRecyclerView);

//        String[] splitUrls = imgUrl.split(",");
//        Log.i("splitUrls", ""+splitUrls.length);
//        int size = splitUrls.length;
//        for (int i=0; i<splitUrls.length; i++){
//            Glide
//                    .with(context)
//                    .load(splitUrls[i])
//                    .centerCrop()
//                    .placeholder(R.drawable.box)
//                    .into(holder.mImageRecyclerView);
//        }

//        holder.mImageRecyclerView.setImageResource(Integer.parseInt(String.valueOf((tovarArraylist.get(position)))));
    }

    @Override
    public int getItemCount() {
        return tovarArraylist.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView mImageRecyclerView;

        public viewHolder(View itemView) {
            super(itemView);
            mImageRecyclerView = itemView.findViewById(R.id.upload_icon);
        }
    }
}