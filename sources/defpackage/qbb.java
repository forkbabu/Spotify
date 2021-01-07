package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: qbb  reason: default package */
public final class qbb implements fjf<pbb> {
    private final wlf<SnackbarManager> a;

    public qbb(wlf<SnackbarManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new pbb(this.a.get());
    }
}
