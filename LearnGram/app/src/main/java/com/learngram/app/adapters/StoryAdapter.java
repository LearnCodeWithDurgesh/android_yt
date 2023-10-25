package com.learngram.app.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.learngram.app.R;
import com.learngram.app.adapters.listeners.RemoveStoryListener;
import com.learngram.app.data.Story;

import java.util.List;

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.StoryViewHolder> {


    private List<Story> storyList;

    private Context context;

    private RemoveStoryListener removeStoryListener;

    public StoryAdapter(List<Story> storyList, Context context) {
        this.storyList = storyList;
        this.context = context;
    }


    public void setOnRemoveStoryListener(RemoveStoryListener listener) {
        this.removeStoryListener = listener;
    }

    @NonNull
    @Override
    public StoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_single_view, parent, false);
        StoryViewHolder storyViewHolder = new StoryViewHolder(view);
        return storyViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StoryViewHolder holder, int position) {
        Story story = storyList.get(position);
        holder.storyImage.setImageResource(story.getStoryImage());
        holder.storyUsername.setText(story.getUserName());
        holder.storyImage.setOnClickListener(view -> {
            this.removeStoryListener.removeStory(view, position);
        });

    }

    @Override
    public int getItemCount() {
        return storyList.size();
    }

    class StoryViewHolder extends RecyclerView.ViewHolder {
        private ImageView storyImage;
        private TextView storyUsername;

        public StoryViewHolder(@NonNull View itemView) {

            super(itemView);
            storyImage = itemView.findViewById(R.id.storyImage);
            storyUsername = itemView.findViewById(R.id.storyUsername);
        }
    }

}
