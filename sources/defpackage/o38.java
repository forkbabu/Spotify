package defpackage;

import android.content.Context;
import com.spotify.mobile.android.hubframework.defaults.v;
import com.spotify.mobile.android.ui.contextmenu.v3;
import com.spotify.music.libs.viewuri.c;

/* renamed from: o38  reason: default package */
public final class o38 implements fjf<w51> {
    private final wlf<v> a;
    private final wlf<Context> b;
    private final wlf<c.a> c;
    private final wlf<v3> d;
    private final wlf<p71> e;

    public o38(wlf<v> wlf, wlf<Context> wlf2, wlf<c.a> wlf3, wlf<v3> wlf4, wlf<p71> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().a(this.b.get(), this.c.get()).b(this.d.get(), this.e.get()).b().a();
    }
}
