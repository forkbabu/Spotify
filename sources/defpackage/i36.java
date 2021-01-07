package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: i36  reason: default package */
public final class i36 implements fjf<h36> {
    private final wlf<Context> a;
    private final wlf<SnackbarManager> b;

    public i36(wlf<Context> wlf, wlf<SnackbarManager> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h36(this.a.get(), this.b.get());
    }
}
