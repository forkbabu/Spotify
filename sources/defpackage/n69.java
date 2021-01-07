package defpackage;

import com.spotify.music.features.yourlibrary.musicpages.datasource.j3;
import io.reactivex.y;

/* renamed from: n69  reason: default package */
public final class n69 implements fjf<j3.a> {
    private final wlf<f8a> a;
    private final wlf<y> b;
    private final wlf<y> c;

    public n69(wlf<f8a> wlf, wlf<y> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new l69(new y7a(this.a.get(), this.b.get(), this.c.get()));
    }
}
