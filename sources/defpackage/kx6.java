package defpackage;

import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* renamed from: kx6  reason: default package */
public final class kx6 implements fjf<jx6> {
    private final wlf<wt6> a;
    private final wlf<y> b;
    private final wlf<SnackbarManager> c;
    private final wlf<v> d;

    public kx6(wlf<wt6> wlf, wlf<y> wlf2, wlf<SnackbarManager> wlf3, wlf<v> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jx6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
