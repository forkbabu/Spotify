package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

/* renamed from: q24  reason: default package */
public final class q24 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<Map<String, a71>> c;
    private final wlf<i> d;
    private final wlf<v> e;
    private final wlf<m24> f;

    public q24(wlf<Context> wlf, wlf<c.a> wlf2, wlf<Map<String, a71>> wlf3, wlf<i> wlf4, wlf<v> wlf5, wlf<m24> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        v.b a2 = this.e.get().a(this.a.get(), this.b.get());
        int i = p71.a;
        w51.b a3 = a2.c(i71.b).a(this.c.get()).a(this.d.get());
        a3.j(C0707R.id.hubs_assisted_curation_track, "ac:track", this.f.get());
        return a3.a();
    }
}
