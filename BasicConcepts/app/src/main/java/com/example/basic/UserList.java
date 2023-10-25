package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.basic.adapters.RecyclerUserAdapter;
import com.example.basic.data.NewUser;

import java.util.ArrayList;
import java.util.List;

public class UserList extends AppCompatActivity {

    private List<NewUser> userList = new ArrayList<>();

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_list);

        recyclerView = findViewById(R.id.recycler_view_user_list);
//add 5 users

        userList.add(new NewUser("Jai Shree Ram", 12, "ram@gmail.com", "Ok it is  good to hear this."));
        userList.add(new NewUser("Ankit", 13, "ankit@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("Shyam", 14, "shyam@gmail.com", "Ok it is  good to hear this."));
        userList.add(new NewUser("Ravi", 15, "ravi@gmail.com", "Ok it is  good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));
        userList.add(new NewUser("harsh", 16, "harsh@gmail.com", "Ok it  is good to hear this."));


//

        RecyclerUserAdapter recyclerUserAdapter = new RecyclerUserAdapter(userList, this);


        recyclerUserAdapter.setOnRemoveButtonListener((view, position) -> {
            Toast.makeText(this, "Removed Item " + position, Toast.LENGTH_SHORT).show();
            userList.remove(position);


        });

        recyclerUserAdapter.setOnCheckListener((view, isChecked, position) -> {
            Toast.makeText(this, "Item checked " + position + " " + isChecked, Toast.LENGTH_LONG).show();
        });


        recyclerView.setAdapter(recyclerUserAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}