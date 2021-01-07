package defpackage;

import com.spotify.music.features.playlistallsongs.i;
import com.spotify.music.settings.a;
import com.spotify.playlist.endpoints.d;
import defpackage.ffc;

/* renamed from: p16  reason: default package */
public final class p16 implements fjf<o16> {
    private final wlf<s16> a;
    private final wlf<a> b;
    private final wlf<d> c;
    private final wlf<i> d;
    private final wlf<ffc.a> e;
    private final wlf<q16> f;

    public p16(wlf<s16> wlf, wlf<a> wlf2, wlf<d> wlf3, wlf<i> wlf4, wlf<ffc.a> wlf5, wlf<q16> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o16(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
