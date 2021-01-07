package com.spotify.music.marquee.trigger;

import androidx.fragment.app.Fragment;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;

public class d0 implements xs2 {
    private String a = "";
    private final PublishSubject<c0> b = PublishSubject.h1();

    @Override // defpackage.xs2
    public void a(Fragment fragment, String str) {
        if (!str.equals(this.a)) {
            this.b.onNext(new b0(str));
            this.a = str;
        }
    }

    public s<c0> b() {
        return this.b;
    }
}
