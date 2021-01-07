package com.spotify.music.playlist.extender;

import com.spotify.mobile.android.util.l0;
import com.spotify.music.playlist.extender.g0;
import com.spotify.music.playlist.extender.v;
import io.reactivex.functions.a;

public final /* synthetic */ class n implements a {
    public final /* synthetic */ g0.b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ v.a.AbstractC0321a d;

    public /* synthetic */ n(g0.b bVar, String str, int i, v.a.AbstractC0321a aVar) {
        this.a = bVar;
        this.b = str;
        this.c = i;
        this.d = aVar;
    }

    @Override // io.reactivex.functions.a
    public final void run() {
        g0.b bVar = this.a;
        String str = this.b;
        int i = this.c;
        v.a.AbstractC0321a aVar = this.d;
        g0.r(g0.this).f(l0.z(str).i());
        g0.k(g0.this);
        g0.l(g0.this).a(g0.e(g0.this), str, i);
        g0.b(g0.this).j0(str);
        aVar.a(true);
    }
}
