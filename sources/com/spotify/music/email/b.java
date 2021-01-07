package com.spotify.music.email;

import io.reactivex.subjects.a;
import kotlin.jvm.internal.h;

public final class b implements a {
    private final a<String> a;

    public b() {
        a<String> h1 = a.h1();
        h.d(h1, "BehaviorSubject.create()");
        this.a = h1;
    }

    @Override // com.spotify.music.email.a
    public void a(String str) {
        h.e(str, "email");
        this.a.onNext(str);
    }
}
