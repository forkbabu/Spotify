package defpackage;

import android.content.res.Resources;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: l65  reason: default package */
public final class l65 implements fjf<k65> {
    private final wlf<SnackbarManager> a;
    private final wlf<Resources> b;

    public l65(wlf<SnackbarManager> wlf, wlf<Resources> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k65(this.a.get(), this.b.get());
    }
}
