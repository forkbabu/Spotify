package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.v;

/* renamed from: zu6  reason: default package */
public final class zu6 implements fjf<yu6> {
    private final wlf<wt6> a;
    private final wlf<SnackbarManager> b;
    private final wlf<h0> c;
    private final wlf<v> d;

    public zu6(wlf<wt6> wlf, wlf<SnackbarManager> wlf2, wlf<h0> wlf3, wlf<v> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yu6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
