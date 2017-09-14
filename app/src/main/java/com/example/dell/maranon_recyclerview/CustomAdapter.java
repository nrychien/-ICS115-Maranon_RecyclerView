package com.example.dell.maranon_recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by dell on 9/14/2017.
 */


public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.AndroidViewHolder> {
        ArrayList<AndroidVersion> AndroidVersionArrayList;

    public CustomAdapter(ArrayList<AndroidVersion> androidVersionArrayList) {
        this.AndroidVersionArrayList = androidVersionArrayList;
    }

    @Override
    public AndroidViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        AndroidViewHolder androidViewHolder = new AndroidViewHolder(view);
        return androidViewHolder;
    }

    @Override
    public void onBindViewHolder(AndroidViewHolder holder, int i) {
        AndroidVersion version = AndroidVersionArrayList.get(i);
        holder.logo.setImageResource(version.getLogo());
        holder.codename.setText(version.getCodename());
        holder.version.setText(version.getVersion());
        holder.api.setText(version.getApi());
        holder.date.setText(version.getDate());

    }

    @Override
    public int getItemCount() {
        return AndroidVersionArrayList.size();
    }

    public static class AndroidViewHolder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView codename, version, api, date;

        public AndroidViewHolder(View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.logo);
            codename = (TextView) itemView.findViewById(R.id.codename);
            version = (TextView) itemView.findViewById(R.id.version);
            api = (TextView) itemView.findViewById(R.id.api);
            date = (TextView) itemView.findViewById(R.id.date);
        }
    }
}
