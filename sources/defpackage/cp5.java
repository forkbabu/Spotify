package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;

/* renamed from: cp5  reason: default package */
public final class cp5 implements fjf<w51> {
    private final wlf<Context> a;
    private final wlf<c.a> b;
    private final wlf<v3> c;
    private final wlf<v> d;
    private final wlf<p71> e;

    public cp5(wlf<Context> wlf, wlf<c.a> wlf2, wlf<v3> wlf3, wlf<v> wlf4, wlf<p71> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        v vVar = this.d.get();
        p71 p71 = this.e.get();
        return vVar.a(this.a.get(), this.b.get()).c(p71).b(this.c.get(), p71).b().a();
    }
}
