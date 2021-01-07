package defpackage;

import android.content.Context;
import com.spotify.music.features.freetierartist.datasource.y;

/* renamed from: c85  reason: default package */
public final class c85 implements fjf<b85> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<y> c;

    public c85(wlf<Context> wlf, wlf<String> wlf2, wlf<y> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b85(this.a.get(), this.b.get(), this.c.get());
    }
}
