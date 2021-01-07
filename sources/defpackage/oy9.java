package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: oy9  reason: default package */
public final class oy9 implements fjf<ny9> {
    private final wlf<SnackbarManager> a;
    private final wlf<dy9> b;

    public oy9(wlf<SnackbarManager> wlf, wlf<dy9> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ny9(this.a.get(), this.b.get());
    }
}
