package com.spotify.music.podcastentityrow.playback;

import java.util.Comparator;

public final class c<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return xlf.a(Integer.valueOf(t2.u()), Integer.valueOf(t.u()));
    }
}
