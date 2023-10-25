package com.example.basic.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.basic.R;
import com.example.basic.data.NewUser;

import java.util.List;

public class RecyclerUserAdapter extends RecyclerView.Adapter<RecyclerUserAdapter.UserViewHolder> {

    private List<NewUser> userList;
    private Context context;

    RemoveButtonListener removeButtonListenerCallback;

    CheckBoxCheckListener checkBoxCheckListener;

    public RecyclerUserAdapter(List<NewUser> userList, Context context, RemoveButtonListener listener) {
        this.userList = userList;
        this.context = context;
        this.removeButtonListenerCallback = listener;
    }

    public RecyclerUserAdapter(List<NewUser> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }



    public void setOnRemoveButtonListener(RemoveButtonListener listener){
        this.removeButtonListenerCallback=listener;
    }

    public void setOnCheckListener(CheckBoxCheckListener listener){
        this.checkBoxCheckListener=listener;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

//        xml view--> java object
        View view = LayoutInflater.from(context).inflate(R.layout.new_user_list_item, parent, false);
        UserViewHolder userViewHolder = new UserViewHolder(view);
        return userViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        NewUser user = userList.get(position);
        holder.nameView.setText(user.getName());
        holder.emailView.setText(user.getEmail());
        holder.aboutView.setText(user.getAbout());
        holder.removeButton.setOnClickListener(view -> {
            this.removeButtonListenerCallback.removeButtonClicked(view, position);
            notifyDataSetChanged();
        });

        holder.checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
                this.checkBoxCheckListener.itemChecked(buttonView,isChecked,position);
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


//    view holder

    class UserViewHolder extends RecyclerView.ViewHolder {


        private TextView nameView, emailView, aboutView;
        private Button removeButton;
        private CheckBox checkBox;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            nameView = itemView.findViewById(R.id.name_view);
            emailView = itemView.findViewById(R.id.email_view);
            aboutView = itemView.findViewById(R.id.about_view);
            removeButton = itemView.findViewById(R.id.remove_button);
            checkBox=itemView.findViewById(R.id.checkBox);

        }
    }


}
