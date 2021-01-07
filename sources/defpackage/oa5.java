package defpackage;

import com.spotify.mobile.android.video.s;
import defpackage.r62;

/* renamed from: oa5  reason: default package */
public final class oa5 implements fjf<s> {
    private final wlf<r62.a> a;
    private final wlf<p62> b;

    public oa5(wlf<r62.a> wlf, wlf<p62> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a(this.b.get()).a();
    }
}
