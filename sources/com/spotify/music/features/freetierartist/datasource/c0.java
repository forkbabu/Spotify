package com.spotify.music.features.freetierartist.datasource;

import com.spotify.music.follow.j;
import com.spotify.music.follow.l;
import com.spotify.music.follow.m;
import io.reactivex.h;

public class c0 {
    private final m a;

    public c0(m mVar) {
        mVar.getClass();
        this.a = mVar;
    }

    public /* synthetic */ void a(String str, j jVar, h hVar) {
        n nVar = new n(hVar);
        hVar.e(new l(this, str, nVar));
        this.a.b(str, nVar);
        j c = this.a.c(str);
        if (c != null) {
            jVar = c;
        }
        this.a.g(jVar);
    }

    public /* synthetic */ void b(String str, l lVar) {
        this.a.d(str, lVar);
    }

    public void c(String str, boolean z) {
        str.getClass();
        j c = this.a.c(str);
        if (c != null && c.f() != z) {
            this.a.f(str, z);
        }
    }

    public void d(String str, boolean z) {
        str.getClass();
        j c = this.a.c(str);
        if (c != null && c.g() != z) {
            this.a.e(str, z);
        }
    }
}
