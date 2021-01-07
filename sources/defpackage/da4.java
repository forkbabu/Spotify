package defpackage;

import com.spotify.remoteconfig.i5;

/* renamed from: da4  reason: default package */
public final class da4 implements fjf<Boolean> {
    private final wlf<i5> a;

    public da4(wlf<i5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().b());
    }
}
