package com.spotify.rxjava2;

import io.reactivex.s;
import io.reactivex.t;
import io.reactivex.u;
import java.util.List;

public class r<T> implements u<T> {
    private final String a;
    private final s<T> b;
    private final StackTraceElement[] c;
    private final z<T> d;

    public r(z<T> zVar, String str, s<T> sVar) {
        this.d = zVar;
        this.c = x.a();
        this.a = str;
        this.b = sVar;
    }

    public synchronized List<y> a() {
        return this.d.f();
    }

    @Override // io.reactivex.u
    public void subscribe(t<T> tVar) {
        this.d.a(this.a, this.c, this.b, tVar);
    }

    public r(String str, s<T> sVar) {
        this.d = new z<>();
        this.c = x.a();
        this.a = str;
        this.b = sVar;
    }
}
