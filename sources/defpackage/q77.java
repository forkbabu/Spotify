package defpackage;

import android.app.Activity;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.music.libs.viewuri.c;
import java.util.Map;

/* renamed from: q77  reason: default package */
public final class q77 implements fjf<w51> {
    private final wlf<Activity> a;
    private final wlf<c.a> b;
    private final wlf<v> c;
    private final wlf<Map<String, a71>> d;

    public q77(wlf<Activity> wlf, wlf<c.a> wlf2, wlf<v> wlf3, wlf<Map<String, a71>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.c.get().a(this.a.get(), this.b.get()).a(this.d.get()).b().a();
    }
}
