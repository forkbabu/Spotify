package defpackage;

import android.content.Context;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.features.playlistentity.w;
import com.spotify.playlist.endpoints.v;
import io.reactivex.y;

/* renamed from: ia6  reason: default package */
public final class ia6 implements fjf<ha6> {
    private final wlf<ba6> a;
    private final wlf<v> b;
    private final wlf<ea6> c;
    private final wlf<w> d;
    private final wlf<String> e;
    private final wlf<y> f;
    private final wlf<SnackbarManager> g;
    private final wlf<Context> h;

    public ia6(wlf<ba6> wlf, wlf<v> wlf2, wlf<ea6> wlf3, wlf<w> wlf4, wlf<String> wlf5, wlf<y> wlf6, wlf<SnackbarManager> wlf7, wlf<Context> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ha6(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
