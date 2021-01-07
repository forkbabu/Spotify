package com.spotify.music.features.yourlibrary.musicpages;

import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class g1 {
    private final PublishSubject<s0> a = PublishSubject.h1();

    public void a() {
        this.a.onNext(s0.a());
    }

    public s<s0> b() {
        return this.a;
    }

    public void c(boolean z) {
        this.a.onNext(s0.u(z));
    }

    public void d(boolean z) {
        this.a.onNext(s0.x(z));
    }
}
