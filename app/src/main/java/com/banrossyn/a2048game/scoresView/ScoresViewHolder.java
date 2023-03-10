package com.banrossyn.a2048game.scoresView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.banrossyn.a2048game.R;

public class ScoresViewHolder extends RecyclerView.ViewHolder{
    public TextView username, score, datetime, duration, country;
    public ImageView editImage, deleteImage, tweetImage, avatarImage;



    /**
     * View holder of my Score textView items
     * @param itemView
     */
    public ScoresViewHolder(View itemView, final OnItemClickListener listener){
        super(itemView);
        this.username = itemView.findViewById(R.id.playerRecycler);
        this.score = itemView.findViewById(R.id.scoreRecycler);
        this.datetime = itemView.findViewById(R.id.dateRecycler);
        this.duration = itemView.findViewById(R.id.durationRecycler);
        this.country = itemView.findViewById(R.id.countryRecycler);
        this.deleteImage = itemView.findViewById(R.id.imageDelete);
        this.editImage = itemView.findViewById(R.id.imageEdit);
        this.tweetImage = itemView.findViewById(R.id.tweetIt);
        this.avatarImage = itemView.findViewById(R.id.avatarItem);

        deleteImage.setOnClickListener(v -> {
            if (listener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onDeleteClick(position);
                }
            }
        });

        editImage.setOnClickListener(v -> {
            if (listener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onEditClick(position);
                }
            }

        });

        tweetImage.setOnClickListener(v -> {
            if (listener != null) {
                int position = getAdapterPosition();
                if (position != RecyclerView.NO_POSITION) {
                    listener.onTweetClick(position);
                }
            }
        });
    }
}
