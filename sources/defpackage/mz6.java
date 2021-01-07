package defpackage;

import android.content.Context;
import com.spotify.music.features.playlistallsongs.f;

/* renamed from: mz6  reason: default package */
public final class mz6 implements fjf<lz6> {
    private final wlf<Context> a;
    private final wlf<String> b;
    private final wlf<w17> c;
    private final wlf<f> d;
    private final wlf<wec> e;

    public mz6(wlf<Context> wlf, wlf<String> wlf2, wlf<w17> wlf3, wlf<f> wlf4, wlf<wec> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lz6(this.a, this.b, this.c, this.d, this.e);
    }
}
