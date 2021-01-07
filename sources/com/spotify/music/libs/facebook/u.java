package com.spotify.music.libs.facebook;

import com.spotify.mobile.android.util.o0;
import com.spotify.music.C0707R;
import com.spotify.music.libs.facebook.o;
import com.spotify.rxjava2.p;
import io.reactivex.android.schedulers.a;

public class u {
    private final p a = new p();
    private final t b;
    private final o0 c;

    public u(t tVar, o0 o0Var) {
        this.b = tVar;
        this.c = o0Var;
    }

    public /* synthetic */ void a(o.b bVar) {
        this.c.c(C0707R.string.toast_merge_social_error, new Object[0]);
    }

    public void b() {
        this.a.b(this.b.events().J0(k.a).o0(a.b()).subscribe(new m(this)));
    }

    public void c() {
        this.a.a();
    }
}
