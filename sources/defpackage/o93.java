package defpackage;

import com.spotify.mobile.android.service.feature.q;

/* renamed from: o93  reason: default package */
public final class o93 implements fjf<Boolean> {
    private final wlf<q> a;

    public o93(wlf<q> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return Boolean.valueOf(this.a.get().a());
    }
}
