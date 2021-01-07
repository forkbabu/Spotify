package defpackage;

import androidx.fragment.app.o;
import com.spotify.music.features.freetierartist.discographysortandfilter.sort.b;

/* renamed from: h65  reason: default package */
public final class h65 implements fjf<g65> {
    private final wlf<o> a;
    private final wlf<b> b;

    public h65(wlf<o> wlf, wlf<b> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g65(this.a.get(), this.b.get());
    }
}
