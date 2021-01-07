package com.spotify.music.newplaying.scroll;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public interface NowPlayingWidget {

    public enum Type {
        BEHIND_THE_LYRICS,
        EXAMPLE,
        LYRICS,
        PODCAST_INSPECTOR,
        PODCAST_QNA,
        PODCAST_POLLS,
        STORYLINES,
        UP_NEXT,
        PODCAST_MORE_FOR_YOU
    }

    View a(LayoutInflater layoutInflater, ViewGroup viewGroup);

    void b();

    void onStart();

    void onStop();

    Type type();
}
