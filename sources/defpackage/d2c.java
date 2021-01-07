package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.sleeptimer.n;
import com.spotify.music.sleeptimer.s;

/* renamed from: d2c  reason: default package */
public final class d2c implements fjf<c2c> {
    private final wlf<Context> a;
    private final wlf<y32> b;
    private final wlf<n> c;
    private final wlf<s> d;
    private final wlf<SnackbarManager> e;

    public d2c(wlf<Context> wlf, wlf<y32> wlf2, wlf<n> wlf3, wlf<s> wlf4, wlf<SnackbarManager> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static d2c a(wlf<Context> wlf, wlf<y32> wlf2, wlf<n> wlf3, wlf<s> wlf4, wlf<SnackbarManager> wlf5) {
        return new d2c(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new c2c(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
