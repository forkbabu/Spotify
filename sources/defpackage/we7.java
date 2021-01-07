package defpackage;

import com.spotify.android.flags.c;

/* renamed from: we7  reason: default package */
public final class we7 implements fjf<Boolean> {
    private final wlf<c> a;

    public we7(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(z42.C(this.a.get()));
    }
}
