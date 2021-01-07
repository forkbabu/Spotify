package defpackage;

import com.spotify.music.features.playlistentity.story.header.h0;
import com.spotify.music.features.playlistentity.story.header.p0;
import defpackage.zo6;

/* renamed from: et6  reason: default package */
public class et6 implements zo6.c {
    private final wlf<kt6> a;
    private final wlf<p0.a> b;
    private final wlf<ei6> c;
    private final wlf<h0> d;
    private final wlf<String> e;

    public et6(wlf<kt6> wlf, wlf<p0.a> wlf2, wlf<ei6> wlf3, wlf<h0> wlf4, wlf<String> wlf5) {
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
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i));
    }

    @Override // defpackage.zo6.c
    public zo6 create() {
        kt6 kt6 = this.a.get();
        a(kt6, 1);
        kt6 kt62 = kt6;
        p0.a aVar = this.b.get();
        a(aVar, 2);
        p0.a aVar2 = aVar;
        ei6 ei6 = this.c.get();
        a(ei6, 3);
        ei6 ei62 = ei6;
        wlf<h0> wlf = this.d;
        String str = this.e.get();
        a(str, 5);
        return new bt6(kt62, aVar2, ei62, wlf, str);
    }
}
