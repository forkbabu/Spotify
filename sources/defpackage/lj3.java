package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.g;

/* renamed from: lj3  reason: default package */
public final class lj3 implements fjf<kj3> {
    private final wlf<Context> a;
    private final wlf<dj9> b;
    private final wlf<SnackbarManager> c;
    private final wlf<g> d;

    public lj3(wlf<Context> wlf, wlf<dj9> wlf2, wlf<SnackbarManager> wlf3, wlf<g> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new kj3(this.a, this.b, this.c, this.d);
    }
}
