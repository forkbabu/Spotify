package defpackage;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.playlistallsongs.logging.a;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.preview.v;
import defpackage.l16;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: n16  reason: default package */
public final class n16 implements l16.a {
    private final wlf<s16> a;
    private final wlf<a> b;
    private final wlf<y> c;
    private final wlf<v> d;
    private final wlf<s7a> e;
    private final wlf<t8a> f;
    private final wlf<ExplicitContentFacade> g;
    private final wlf<AgeRestrictedContentFacade> h;
    private final wlf<m8a> i;
    private final wlf<wec> j;
    private final wlf<c> k;
    private final wlf<h32> l;
    private final wlf<s<Boolean>> m;
    private final wlf<b42> n;
    private final wlf<t> o;
    private final wlf<d> p;

    public n16(wlf<s16> wlf, wlf<a> wlf2, wlf<y> wlf3, wlf<v> wlf4, wlf<s7a> wlf5, wlf<t8a> wlf6, wlf<ExplicitContentFacade> wlf7, wlf<AgeRestrictedContentFacade> wlf8, wlf<m8a> wlf9, wlf<wec> wlf10, wlf<c> wlf11, wlf<h32> wlf12, wlf<s<Boolean>> wlf13, wlf<b42> wlf14, wlf<t> wlf15, wlf<d> wlf16) {
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
        a(wlf10, 10);
        this.j = wlf10;
        a(wlf11, 11);
        this.k = wlf11;
        a(wlf12, 12);
        this.l = wlf12;
        a(wlf13, 13);
        this.m = wlf13;
        a(wlf14, 14);
        this.n = wlf14;
        a(wlf15, 15);
        this.o = wlf15;
        a(wlf16, 16);
        this.p = wlf16;
    }

    private static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    public l16 b(s sVar) {
        s16 s16 = this.a.get();
        a(s16, 1);
        a aVar = this.b.get();
        a(aVar, 2);
        y yVar = this.c.get();
        a(yVar, 3);
        v vVar = this.d.get();
        a(vVar, 4);
        s7a s7a = this.e.get();
        a(s7a, 5);
        t8a t8a = this.f.get();
        a(t8a, 6);
        ExplicitContentFacade explicitContentFacade = this.g.get();
        a(explicitContentFacade, 7);
        AgeRestrictedContentFacade ageRestrictedContentFacade = this.h.get();
        a(ageRestrictedContentFacade, 8);
        m8a m8a = this.i.get();
        a(m8a, 9);
        wec wec = this.j.get();
        a(wec, 10);
        c cVar = this.k.get();
        a(cVar, 11);
        h32 h32 = this.l.get();
        a(h32, 12);
        s<Boolean> sVar2 = this.m.get();
        a(sVar2, 13);
        b42 b42 = this.n.get();
        a(b42, 14);
        t tVar = this.o.get();
        a(tVar, 15);
        t tVar2 = tVar;
        d dVar = this.p.get();
        a(dVar, 16);
        a(sVar, 17);
        return new m16(s16, aVar, yVar, vVar, s7a, t8a, explicitContentFacade, ageRestrictedContentFacade, m8a, wec, cVar, h32, sVar2, b42, tVar2, dVar, sVar);
    }
}
