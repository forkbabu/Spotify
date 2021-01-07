package defpackage;

import com.spotify.mobile.android.hubframework.defaults.m;
import com.spotify.mobile.android.spotlets.common.recyclerview.c;

/* renamed from: pf7  reason: default package */
public final class pf7 implements fjf<of7> {
    private final wlf<i61> a;
    private final wlf<m> b;
    private final wlf<c> c;

    public pf7(wlf<i61> wlf, wlf<m> wlf2, wlf<c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new of7(this.a.get(), this.b.get(), this.c.get());
    }
}
