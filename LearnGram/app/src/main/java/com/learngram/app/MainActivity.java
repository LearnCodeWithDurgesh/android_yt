package com.learngram.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Toast;

import com.learngram.app.adapters.PostAdapter;
import com.learngram.app.adapters.StoryAdapter;
import com.learngram.app.data.Post;
import com.learngram.app.data.Story;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView storyRecyclerView;
    private List<Story> storyList;

    private RecyclerView postRecyclerView;

    private List<Post> postList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();

        StoryAdapter storyAdapter = new StoryAdapter(storyList, this);
        storyRecyclerView.setAdapter(storyAdapter);
        storyRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        storyAdapter.setOnRemoveStoryListener((view, position) -> {
//            Toast.makeText(this, "Remove story " + position, Toast.LENGTH_SHORT).show();
            storyList.remove(position);
            storyAdapter.notifyDataSetChanged();
//            what to do when image of story clicked
        });


        PostAdapter postAdapter = new PostAdapter(postList, this);
        postRecyclerView.setAdapter(postAdapter);
        postRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void initialize() {
        this.storyRecyclerView = findViewById(R.id.story_container);
        this.postRecyclerView = findViewById(R.id.single_post);
        this.storyList = new ArrayList<>();
        this.postList = new ArrayList<>();
//        creating few default stories
        this.storyList.add(new Story(12, "Durgesh...", R.drawable.story1));
        this.storyList.add(new Story(13, "Harsh...", R.drawable.story2));
        this.storyList.add(new Story(14, "Ravi Kumar...", R.drawable.story3));
        this.storyList.add(new Story(15, "Ankit K...", R.drawable.story4));
        this.storyList.add(new Story(16, "Amardeep...", R.drawable.story5));
        this.storyList.add(new Story(17, "Samardeep...", R.drawable.story6));
        this.storyList.add(new Story(18, "Ankita...", R.drawable.story1));
        this.storyList.add(new Story(19, "Priyanshu...", R.drawable.story2));
//        adding items to post list

        this.postList.add(new Post(1,
                R.drawable.profile,
                R.drawable.story1,
                "This is first post caption", "sponsored",
                "40 liked",
                "View all 5 comments", "Durgesh Kumar Tiwari"));
        this.postList.add(new Post(2,
                R.drawable.profile,
                R.drawable.story5,
                "This is  second post caption", "sponsored",
                "16 liked",
                "View all 2 comments", "Vandna Tiwari"));

    }

}
