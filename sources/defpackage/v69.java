package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.util.l0;

/* renamed from: v69  reason: default package */
public final class v69 implements fjf<String> {
    private final wlf<String> a;

    public v69(wlf<String> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return MoreObjects.nullToEmpty(l0.a(this.a.get()).B());
    }
}
