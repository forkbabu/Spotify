package defpackage;

import com.spotify.android.flags.c;

/* renamed from: l55  reason: default package */
public final class l55 implements fjf<Boolean> {
    private final wlf<c> a;

    public l55(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(z42.y(this.a.get()));
    }
}
