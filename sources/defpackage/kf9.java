package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.songsmetadata.c;
import com.spotify.music.json.g;

/* renamed from: kf9  reason: default package */
public final class kf9 implements fjf<jf9> {
    private final wlf<lf9> a;
    private final wlf<c> b;
    private final wlf<String> c;
    private final wlf<g> d;

    public kf9(wlf<lf9> wlf, wlf<c> wlf2, wlf<String> wlf3, wlf<g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jf9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
