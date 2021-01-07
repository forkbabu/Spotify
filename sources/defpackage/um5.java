package defpackage;

import com.spotify.music.features.listeninghistory.datasource.d;

/* renamed from: um5  reason: default package */
public final class um5 implements fjf<tm5> {
    private final wlf<Boolean> a;
    private final wlf<d> b;

    public um5(wlf<Boolean> wlf, wlf<d> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tm5(this.a.get().booleanValue(), this.b.get());
    }
}
