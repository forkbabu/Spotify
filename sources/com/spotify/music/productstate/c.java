package com.spotify.music.productstate;

import com.spotify.mobile.android.rx.w;
import io.reactivex.s;

public class c {
    private final w a;

    public c(w wVar) {
        this.a = wVar;
    }

    public s<Boolean> a() {
        s<String> a2 = this.a.a("ads");
        String d = AdsProductState.ENABLED.d();
        d.getClass();
        return a2.j0(new a(d));
    }

    public s<String> b() {
        s<String> a2 = this.a.a("ads");
        String d = AdsProductState.ENABLED.d();
        d.getClass();
        return a2.Q(new b(d));
    }
}
