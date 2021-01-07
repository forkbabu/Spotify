package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: ufa  reason: default package */
public final class ufa implements fjf<tfa> {
    private final wlf<SnackbarManager> a;

    public ufa(wlf<SnackbarManager> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tfa(this.a.get());
    }
}
