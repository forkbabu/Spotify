package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.i;
import com.spotify.playlist.endpoints.v;

/* renamed from: qy6  reason: default package */
public final class qy6 implements fjf<py6> {
    private final wlf<SnackbarManager> a;
    private final wlf<i> b;
    private final wlf<v> c;

    public qy6(wlf<SnackbarManager> wlf, wlf<i> wlf2, wlf<v> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new py6(this.a.get(), this.b.get(), this.c.get());
    }
}
