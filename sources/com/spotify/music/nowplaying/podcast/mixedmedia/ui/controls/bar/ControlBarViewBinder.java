package com.spotify.music.nowplaying.podcast.mixedmedia.ui.controls.bar;

import android.view.ViewGroup;

public interface ControlBarViewBinder {

    public enum Mode {
        MUSIC,
        TALK
    }

    public interface a {
        void a(Mode mode, boolean z);

        void e(ControlBarViewBinder controlBarViewBinder);

        void stop();
    }

    void a(ViewGroup viewGroup);

    void b(Mode mode, boolean z);
}
