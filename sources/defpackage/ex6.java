package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.v;

/* renamed from: ex6  reason: default package */
public final class ex6 implements fjf<dx6> {
    private final wlf<wt6> a;
    private final wlf<SnackbarManager> b;
    private final wlf<v> c;

    public ex6(wlf<wt6> wlf, wlf<SnackbarManager> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dx6(this.a.get(), this.b.get(), this.c.get());
    }
}
