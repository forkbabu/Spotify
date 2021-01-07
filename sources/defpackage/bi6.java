package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.g;

/* renamed from: bi6  reason: default package */
public final class bi6 implements fjf<ai6> {
    private final wlf<SnackbarManager> a;
    private final wlf<Context> b;
    private final wlf<g> c;

    public bi6(wlf<SnackbarManager> wlf, wlf<Context> wlf2, wlf<g> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ai6(this.a.get(), this.b.get(), this.c.get());
    }
}
