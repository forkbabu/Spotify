package com.spotify.music.features.settings;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.f0;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;

public class u0 {
    private final w a;
    private final f0 b;

    u0(w wVar, f0 f0Var) {
        this.a = wVar;
        this.b = f0Var;
    }

    public z<Integer> a() {
        return this.a.a("public-toplist").j0(m0.a).N0(1).B0();
    }

    public a b(int i) {
        s<Response> a2 = this.b.a("public-toplist", Integer.toString(i));
        a2.getClass();
        return new io.reactivex.internal.operators.observable.z(a2);
    }
}
