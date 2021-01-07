package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.playback.i;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;

/* renamed from: u17  reason: default package */
public final class u17 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v3> c;
    private final wlf<i> d;
    private final wlf<p71> e;
    private final wlf<v> f;

    public u17(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v3> wlf3, wlf<i> wlf4, wlf<p71> wlf5, wlf<v> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        p71 p71 = this.e.get();
        return this.f.get().a(this.a.get(), this.b.get()).c(p71).b(this.c.get(), p71).a(this.d.get()).a();
    }
}
