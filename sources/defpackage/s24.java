package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import defpackage.w51;
import java.util.Map;

/* renamed from: s24  reason: default package */
public final class s24 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<Map<String, a71>> d;
    private final wlf<p71> e;
    private final wlf<m24> f;

    public s24(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<Map<String, a71>> wlf4, wlf<p71> wlf5, wlf<m24> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        w51.b b2 = this.c.get().a(this.a.get(), this.b.get()).c(this.e.get()).a(this.d.get()).b();
        b2.j(C0707R.id.hubs_assisted_curation_track, "ac:track", this.f.get());
        return b2.a();
    }
}
