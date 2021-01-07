package defpackage;

import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.playlistentity.configuration.ItemListConfiguration;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.libs.podcast.download.a0;
import com.spotify.music.libs.podcast.download.d0;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.navigation.t;
import com.spotify.music.podcastentityrow.d;
import com.spotify.music.preview.v;
import defpackage.lh6;
import io.reactivex.y;

/* renamed from: nh6  reason: default package */
final class nh6 implements lh6.a {
    private final wlf<c> a;
    private final wlf<String> b;
    private final wlf<t> c;
    private final wlf<ph6> d;
    private final wlf<y> e;
    private final wlf<s7a> f;
    private final wlf<v> g;
    private final wlf<t8a> h;
    private final wlf<b42> i;
    private final wlf<h32> j;
    private final wlf<ExplicitContentFacade> k;
    private final wlf<AgeRestrictedContentFacade> l;
    private final wlf<ai6> m;
    private final wlf<nsb> n;
    private final wlf<m8a> o;
    private final wlf<a0> p;
    private final wlf<d0> q;
    private final wlf<bec> r;
    private final wlf<d> s;

    nh6(wlf<c> wlf, wlf<String> wlf2, wlf<t> wlf3, wlf<ph6> wlf4, wlf<y> wlf5, wlf<s7a> wlf6, wlf<v> wlf7, wlf<t8a> wlf8, wlf<b42> wlf9, wlf<h32> wlf10, wlf<ExplicitContentFacade> wlf11, wlf<AgeRestrictedContentFacade> wlf12, wlf<ai6> wlf13, wlf<nsb> wlf14, wlf<m8a> wlf15, wlf<a0> wlf16, wlf<d0> wlf17, wlf<bec> wlf18, wlf<d> wlf19) {
        b(wlf, 1);
        this.a = wlf;
        b(wlf2, 2);
        this.b = wlf2;
        b(wlf3, 3);
        this.c = wlf3;
        b(wlf4, 4);
        this.d = wlf4;
        b(wlf5, 5);
        this.e = wlf5;
        b(wlf6, 6);
        this.f = wlf6;
        b(wlf7, 7);
        this.g = wlf7;
        b(wlf8, 8);
        this.h = wlf8;
        b(wlf9, 9);
        this.i = wlf9;
        b(wlf10, 10);
        this.j = wlf10;
        b(wlf11, 11);
        this.k = wlf11;
        b(wlf12, 12);
        this.l = wlf12;
        b(wlf13, 13);
        this.m = wlf13;
        b(wlf14, 14);
        this.n = wlf14;
        b(wlf15, 15);
        this.o = wlf15;
        b(wlf16, 16);
        this.p = wlf16;
        b(wlf17, 17);
        this.q = wlf17;
        b(wlf18, 18);
        this.r = wlf18;
        b(wlf19, 19);
        this.s = wlf19;
    }

    private static <T> T b(T t, int i2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(je.p0("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ", i2));
    }

    @Override // defpackage.lh6.a
    public lh6 a(ItemListConfiguration itemListConfiguration) {
        c cVar = this.a.get();
        b(cVar, 1);
        String str = this.b.get();
        b(str, 2);
        t tVar = this.c.get();
        b(tVar, 3);
        ph6 ph6 = this.d.get();
        b(ph6, 4);
        y yVar = this.e.get();
        b(yVar, 5);
        s7a s7a = this.f.get();
        b(s7a, 6);
        v vVar = this.g.get();
        b(vVar, 7);
        t8a t8a = this.h.get();
        b(t8a, 8);
        b42 b42 = this.i.get();
        b(b42, 9);
        h32 h32 = this.j.get();
        b(h32, 10);
        ExplicitContentFacade explicitContentFacade = this.k.get();
        b(explicitContentFacade, 11);
        AgeRestrictedContentFacade ageRestrictedContentFacade = this.l.get();
        b(ageRestrictedContentFacade, 12);
        b(itemListConfiguration, 13);
        ai6 ai6 = this.m.get();
        b(ai6, 14);
        ai6 ai62 = ai6;
        nsb nsb = this.n.get();
        b(nsb, 15);
        m8a m8a = this.o.get();
        b(m8a, 16);
        m8a m8a2 = m8a;
        a0 a0Var = this.p.get();
        b(a0Var, 17);
        a0 a0Var2 = a0Var;
        d0 d0Var = this.q.get();
        b(d0Var, 18);
        d0 d0Var2 = d0Var;
        bec bec = this.r.get();
        b(bec, 19);
        bec bec2 = bec;
        d dVar = this.s.get();
        b(dVar, 20);
        return new mh6(cVar, str, tVar, ph6, yVar, s7a, vVar, t8a, b42, h32, explicitContentFacade, ageRestrictedContentFacade, itemListConfiguration, ai62, nsb, m8a2, a0Var2, d0Var2, bec2, dVar);
    }
}
