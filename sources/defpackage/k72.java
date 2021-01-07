package defpackage;

import com.google.android.exoplayer2.upstream.o;
import com.google.protobuf.u;
import com.spotify.mobile.android.video.exo.n;
import com.spotify.music.json.g;
import okhttp3.y;

/* renamed from: k72  reason: default package */
public final class k72 implements fjf<j72> {
    private final wlf<y> a;
    private final wlf<g> b;
    private final wlf<o> c;
    private final wlf<n> d;
    private final wlf<gl0<u>> e;

    public k72(wlf<y> wlf, wlf<g> wlf2, wlf<o> wlf3, wlf<n> wlf4, wlf<gl0<u>> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new j72(this.a, this.b, this.c, this.d, this.e);
    }
}
