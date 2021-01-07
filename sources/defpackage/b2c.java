package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.navigation.t;

/* renamed from: b2c  reason: default package */
public final class b2c implements fjf<a2c> {
    private final wlf<SnackbarManager> a;
    private final wlf<t> b;

    public b2c(wlf<SnackbarManager> wlf, wlf<t> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new a2c(this.a.get(), this.b.get());
    }
}
