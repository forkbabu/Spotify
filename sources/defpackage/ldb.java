package defpackage;

import com.spotify.music.lyrics.core.experience.presenter.controller.c;
import com.spotify.music.lyrics.core.experience.rx.a;

/* renamed from: ldb  reason: default package */
public final class ldb implements fjf<kdb> {
    private final wlf<a> a;
    private final wlf<c> b;
    private final wlf<cdb> c;

    public ldb(wlf<a> wlf, wlf<c> wlf2, wlf<cdb> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kdb(this.a.get(), this.b.get(), this.c.get());
    }
}
