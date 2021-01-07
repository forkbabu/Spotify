package defpackage;

import com.spotify.android.glue.components.toolbar.d;
import com.spotify.music.libs.collection.played.a;
import com.spotify.music.navigation.t;
import com.spotify.music.podcast.episode.util.h;

/* renamed from: vd7  reason: default package */
public final class vd7 implements fjf<ud7> {
    private final wlf<d> a;
    private final wlf<com.spotify.music.features.addtoplaylist.d> b;
    private final wlf<t> c;
    private final wlf<jzc> d;
    private final wlf<sd7> e;
    private final wlf<oa7> f;
    private final wlf<m8a> g;
    private final wlf<a> h;
    private final wlf<h> i;
    private final wlf<bre> j;

    public vd7(wlf<d> wlf, wlf<com.spotify.music.features.addtoplaylist.d> wlf2, wlf<t> wlf3, wlf<jzc> wlf4, wlf<sd7> wlf5, wlf<oa7> wlf6, wlf<m8a> wlf7, wlf<a> wlf8, wlf<h> wlf9, wlf<bre> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ud7(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
