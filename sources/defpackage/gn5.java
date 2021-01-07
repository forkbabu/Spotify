package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: gn5  reason: default package */
public final class gn5 implements fjf<fn5> {
    private final wlf<b61> a;
    private final wlf<e61> b;
    private final wlf<SnackbarManager> c;

    public gn5(wlf<b61> wlf, wlf<e61> wlf2, wlf<SnackbarManager> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new fn5(this.a.get(), this.b.get(), this.c.get());
    }
}
