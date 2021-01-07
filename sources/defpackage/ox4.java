package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.glue.dialogs.g;
import com.spotify.music.libs.viewuri.c;

/* renamed from: ox4  reason: default package */
public final class ox4 implements fjf<nx4> {
    private final wlf<Context> a;
    private final wlf<c> b;
    private final wlf<dj9> c;
    private final wlf<SnackbarManager> d;
    private final wlf<g> e;
    private final wlf<kx4> f;

    public ox4(wlf<Context> wlf, wlf<c> wlf2, wlf<dj9> wlf3, wlf<SnackbarManager> wlf4, wlf<g> wlf5, wlf<kx4> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nx4(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
