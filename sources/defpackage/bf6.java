package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: bf6  reason: default package */
public final class bf6 implements fjf<af6> {
    private final wlf<Context> a;
    private final wlf<SnackbarManager> b;

    public bf6(wlf<Context> wlf, wlf<SnackbarManager> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new af6(this.a.get(), this.b.get());
    }
}
