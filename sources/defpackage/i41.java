package defpackage;

import com.spotify.android.flags.c;

/* renamed from: i41  reason: default package */
public final class i41 implements fjf<Boolean> {
    private final wlf<c> a;

    public i41(wlf<c> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(z42.C(this.a.get()));
    }
}
