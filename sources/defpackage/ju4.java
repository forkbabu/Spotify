package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;

/* renamed from: ju4  reason: default package */
public final class ju4 implements fjf<iu4> {
    private final wlf<Context> a;
    private final wlf<SnackbarManager> b;

    public ju4(wlf<Context> wlf, wlf<SnackbarManager> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new iu4(this.a.get(), this.b.get());
    }
}
