package defpackage;

import com.spotify.music.lyrics.core.experience.rx.a;

/* renamed from: ddb  reason: default package */
public final class ddb implements fjf<cdb> {
    private final wlf<a> a;

    public ddb(wlf<a> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cdb(this.a.get());
    }
}
