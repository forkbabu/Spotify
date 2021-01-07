package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: svc  reason: default package */
public final class svc implements fjf<rvc> {
    private final wlf<SnackbarManager> a;

    public svc(wlf<SnackbarManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new rvc(this.a.get());
    }
}
