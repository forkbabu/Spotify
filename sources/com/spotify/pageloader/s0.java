package com.spotify.pageloader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface s0 {
    View getView();

    void i(Context context, ViewGroup viewGroup, LayoutInflater layoutInflater);

    void start();

    void stop();
}
