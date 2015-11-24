package com.example.joker.viewpractice.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.joker.viewpractice.R;

/**
 * Created by xiufengwang on 2015/11/20.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] array;

    public RecyclerAdapter(final String[] array) {
        this.array = array;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mText;

        public ViewHolder(final View itemView) {
            super(itemView);
            mText = (TextView) itemView.findViewById(R.id.card_text);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_layout, null);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mText.setText(array[position]);
    }

    @Override
    public int getItemCount() {
        return array.length;
    }
}
