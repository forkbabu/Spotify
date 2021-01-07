package com.spotify.mobile.android.rx;

import com.google.common.base.Optional;
import com.spotify.rxjava2.r;
import com.spotify.rxjava2.y;
import io.reactivex.s;
import java.util.List;
import java.util.Map;

public class w implements txc {
    private final s<Map<String, String>> a;
    private final rg0<List<y>> b;

    public w(s<Map<String, String>> sVar) {
        r rVar = new r(w.class.getSimpleName(), sVar);
        this.a = s.y(rVar);
        this.b = new i(rVar);
    }

    @Override // defpackage.txc
    public s<String> a(String str) {
        return this.a.j0(new f(str)).Q(a.a).j0(g.a).E();
    }

    @Override // defpackage.txc
    public s<Map<String, String>> b() {
        return this.a;
    }

    @Deprecated
    public s<Optional<String>> c(String str) {
        return this.a.j0(new e(str)).E();
    }

    public List<y> d() {
        return this.b.call();
    }
}
