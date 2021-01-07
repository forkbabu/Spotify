package defpackage;

import android.content.res.Resources;
import com.spotify.mobile.android.util.connectivity.c0;

/* renamed from: uo5  reason: default package */
public final class uo5 implements fjf<to5> {
    private final wlf<Resources> a;
    private final wlf<c0> b;

    public uo5(wlf<Resources> wlf, wlf<c0> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new to5(this.a.get(), this.b.get());
    }
}
