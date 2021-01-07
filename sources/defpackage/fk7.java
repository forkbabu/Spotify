package defpackage;

import com.spotify.mobile.android.util.ui.h;

/* renamed from: fk7  reason: default package */
public final class fk7 implements fjf<ek7> {
    private final wlf<h> a;
    private final wlf<lqa> b;
    private final wlf<gk7> c;

    public fk7(wlf<h> wlf, wlf<lqa> wlf2, wlf<gk7> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ek7(this.a.get(), this.b.get(), this.c.get());
    }
}
