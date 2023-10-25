package com.example.basic.adapters;


import android.view.View;

@FunctionalInterface
public interface RemoveButtonListener {
    void removeButtonClicked(View view,int position);
}
