package defpackage;

import androidx.fragment.app.c;

/* renamed from: c4c  reason: default package */
public final class c4c implements fjf<b4c> {
    private final wlf<c> a;
    private final wlf<d4c> b;
    private final wlf<com.spotify.music.libs.viewuri.c> c;

    public c4c(wlf<c> wlf, wlf<d4c> wlf2, wlf<com.spotify.music.libs.viewuri.c> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b4c(this.a.get(), this.b.get(), this.c.get());
    }
}
