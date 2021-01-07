package com.spotify.mobile.android.skiplimitpivot;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.h;
import okhttp3.d;
import okhttp3.d0;
import okhttp3.v;

public final class a implements v {
    @Override // okhttp3.v
    public d0 a(v.a aVar) {
        h.e(aVar, "chain");
        fof fof = (fof) aVar;
        d0 f = fof.f(fof.i());
        d.a aVar2 = new d.a();
        aVar2.b(7, TimeUnit.DAYS);
        d a = aVar2.a();
        d0.a s = f.s();
        s.o("Pragma");
        s.o("Cache-Control");
        s.h("Cache-Control", a.toString());
        d0 c = s.c();
        h.d(c, "response.newBuilder()\n  …g())\n            .build()");
        return c;
    }
}
