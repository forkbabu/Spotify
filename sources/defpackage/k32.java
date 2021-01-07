package defpackage;

import com.spotify.mobile.android.ui.contextmenu.z3;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.playlist.models.Episode;

/* renamed from: k32  reason: default package */
public final class k32 implements fjf<j32> {
    private final wlf<a0> a;
    private final wlf<d0> b;
    private final wlf<m8a> c;
    private final wlf<z3<Episode>> d;

    public k32(wlf<a0> wlf, wlf<d0> wlf2, wlf<m8a> wlf3, wlf<z3<Episode>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j32(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
