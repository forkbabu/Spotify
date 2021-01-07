package defpackage;

import com.spotify.music.features.browse.view.a;

/* renamed from: ba4  reason: default package */
public final class ba4 implements fjf<b91> {
    private final wlf<Boolean> a;
    private final wlf<a> b;

    public ba4(wlf<Boolean> wlf, wlf<a> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        b91 b91;
        boolean booleanValue = this.a.get().booleanValue();
        a aVar = this.b.get();
        if (booleanValue) {
            b91 = aVar.c();
        } else {
            b91 = aVar.b();
        }
        yif.g(b91, "Cannot return null from a non-@Nullable @Provides method");
        return b91;
    }
}
