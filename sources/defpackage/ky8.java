package defpackage;

import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import com.spotify.voiceassistant.voice.results.o;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: ky8  reason: default package */
public final class ky8 implements fjf<jy8> {
    private final wlf<tx8> a;
    private final wlf<Boolean> b;
    private final wlf<y> c;
    private final wlf<wy8> d;
    private final wlf<qhf<SearchRequest, SearchResponse>> e;
    private final wlf<s<Boolean>> f;
    private final wlf<o> g;
    private final wlf<qx8> h;
    private final wlf<pea> i;

    public ky8(wlf<tx8> wlf, wlf<Boolean> wlf2, wlf<y> wlf3, wlf<wy8> wlf4, wlf<qhf<SearchRequest, SearchResponse>> wlf5, wlf<s<Boolean>> wlf6, wlf<o> wlf7, wlf<qx8> wlf8, wlf<pea> wlf9) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jy8(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
