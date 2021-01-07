package com.spotify.music.features.profile.saveprofile.effecthandlers;

import com.spotify.base.java.logging.Logger;
import io.reactivex.s;
import io.reactivex.subjects.PublishSubject;
import java.io.IOException;
import okhttp3.w;
import okio.f;
import okio.o;

class c0 extends okhttp3.c0 {
    private final okhttp3.c0 a;
    private final PublishSubject<Float> b = PublishSubject.h1();

    c0(okhttp3.c0 c0Var, y yVar) {
        this.a = c0Var;
    }

    @Override // okhttp3.c0
    public long a() {
        return this.a.a();
    }

    @Override // okhttp3.c0
    public w b() {
        return this.a.b();
    }

    @Override // okhttp3.c0
    public void f(f fVar) {
        f c = o.c(new d0(fVar, new g(this)));
        this.a.f(c);
        c.flush();
    }

    public void g(long j) {
        long j2;
        try {
            j2 = a();
        } catch (IOException unused) {
            Logger.d("Error getting content length", new Object[0]);
            j2 = 0;
        }
        this.b.onNext(Float.valueOf(Math.max(Math.min(((float) j) / ((float) Math.max(j2, 1L)), 1.0f), 0.0f)));
    }

    public s<Float> h() {
        return this.b.G0(Float.valueOf(0.0f));
    }
}
