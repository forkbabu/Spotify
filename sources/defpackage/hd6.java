package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.playlistentity.homemix.header.mixtuning.o;

/* renamed from: hd6  reason: default package */
public final class hd6 implements fjf<gd6> {
    private final wlf<Context> a;
    private final wlf<o> b;
    private final wlf<SnackbarManager> c;

    public hd6(wlf<Context> wlf, wlf<o> wlf2, wlf<SnackbarManager> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new gd6(this.a, this.b, this.c);
    }
}
