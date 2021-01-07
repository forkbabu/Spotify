package com.spotify.music.libs.carmodeengine.util;

import android.app.Application;
import io.reactivex.s;
import io.reactivex.t;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class h0 implements g0 {
    private final Set<t<Boolean>> a = Collections.synchronizedSet(new HashSet(5));
    private final Application b;
    private final w52 c;

    h0(Application application, w52 w52) {
        this.b = application;
        this.c = w52;
    }

    @Override // com.spotify.music.libs.carmodeengine.util.g0
    public s<Boolean> a() {
        return s.y(new p(this)).E();
    }

    @Override // com.spotify.music.libs.carmodeengine.util.g0
    public void b() {
        boolean f = this.c.f(this.b, "android.permission.RECORD_AUDIO");
        for (t<Boolean> tVar : this.a) {
            if (!tVar.d()) {
                tVar.onNext(Boolean.valueOf(f));
            }
        }
    }

    public void c(t tVar) {
        this.a.add(tVar);
        tVar.onNext(Boolean.valueOf(this.c.f(this.b, "android.permission.RECORD_AUDIO")));
        tVar.e(new o(this, tVar));
    }

    public /* synthetic */ void d(t tVar) {
        this.a.remove(tVar);
    }
}
