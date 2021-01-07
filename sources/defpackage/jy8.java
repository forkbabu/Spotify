package defpackage;

import com.spotify.voiceassistant.player.models.SearchRequest;
import com.spotify.voiceassistant.player.models.SearchResponse;
import com.spotify.voiceassistant.voice.results.o;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: jy8  reason: default package */
public class jy8 {
    private final wlf<tx8> a;
    private final wlf<Boolean> b;
    private final wlf<y> c;
    private final wlf<wy8> d;
    private final wlf<qhf<SearchRequest, SearchResponse>> e;
    private final wlf<s<Boolean>> f;
    private final wlf<o> g;
    private final wlf<qx8> h;
    private final wlf<pea> i;

    public jy8(wlf<tx8> wlf, wlf<Boolean> wlf2, wlf<y> wlf3, wlf<wy8> wlf4, wlf<qhf<SearchRequest, SearchResponse>> wlf5, wlf<s<Boolean>> wlf6, wlf<o> wlf7, wlf<qx8> wlf8, wlf<pea> wlf9) {
        a(wlf, 1);
        this.a = wlf;
        a(wlf2, 2);
        this.b = wlf2;
        a(wlf3, 3);
        this.c = wlf3;
        a(wlf4, 4);
        this.d = wlf4;
        a(wlf5, 5);
        this.e = wlf5;
        a(wlf6, 6);
        this.f = wlf6;
        a(wlf7, 7);
        this.g = wlf7;
        a(wlf8, 8);
        this.h = wlf8;
        a(wlf9, 9);
        this.i = wlf9;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public iy8 b(wx8 wx8, mx8 mx8) {
        tx8 tx8 = this.a.get();
        a(tx8, 1);
        tx8 tx82 = tx8;
        Boolean bool = this.b.get();
        a(bool, 2);
        boolean booleanValue = bool.booleanValue();
        y yVar = this.c.get();
        a(yVar, 3);
        y yVar2 = yVar;
        wy8 wy8 = this.d.get();
        a(wy8, 4);
        wy8 wy82 = wy8;
        qhf<SearchRequest, SearchResponse> qhf = this.e.get();
        a(qhf, 5);
        qhf<SearchRequest, SearchResponse> qhf2 = qhf;
        s<Boolean> sVar = this.f.get();
        a(sVar, 6);
        s<Boolean> sVar2 = sVar;
        o oVar = this.g.get();
        a(oVar, 7);
        o oVar2 = oVar;
        qx8 qx8 = this.h.get();
        a(qx8, 8);
        qx8 qx82 = qx8;
        pea pea = this.i.get();
        a(pea, 9);
        a(wx8, 10);
        a(mx8, 11);
        return new iy8(tx82, booleanValue, yVar2, wy82, qhf2, sVar2, oVar2, qx82, pea, wx8, mx8);
    }
}
