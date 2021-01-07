package defpackage;

import com.spotify.remoteconfig.i5;

/* renamed from: af4  reason: default package */
public final class af4 implements fjf<ze4> {
    private final wlf<i5> a;

    public af4(wlf<i5> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ze4(this.a.get());
    }
}
