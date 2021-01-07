package com.spotify.music.features.playlistallsongs;

import io.reactivex.s;
import io.reactivex.subjects.a;

public class i {
    private final a<Integer> a = a.h1();

    public s<Integer> a() {
        return this.a.E();
    }

    public void b(int i) {
        this.a.onNext(Integer.valueOf(i));
    }
}
