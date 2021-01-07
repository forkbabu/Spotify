package defpackage;

import com.spotify.cosmos.android.cosmonaut.Cosmonaut;

/* renamed from: i01  reason: default package */
public final class i01 implements fjf<l01> {
    private final wlf<Cosmonaut> a;
    private final wlf<j01> b;

    public i01(wlf<Cosmonaut> wlf, wlf<j01> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    public static l01 a(Cosmonaut cosmonaut, Object obj) {
        return new l01(cosmonaut, (j01) obj);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l01(this.a.get(), this.b.get());
    }
}
