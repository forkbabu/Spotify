package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.i;
import com.spotify.music.settings.a;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import defpackage.ffc;
import defpackage.j16;
import io.reactivex.s;
import io.reactivex.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: o16  reason: default package */
public class o16 {
    private static final Policy h;
    private static final ListPolicy i;
    private static final Policy j;
    public static final /* synthetic */ int k = 0;
    private final s16 a;
    private final a b;
    private final d c;
    private final i d;
    private final ffc.a e;
    private final q16 f;
    private s<k16> g;

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        ImmutableMap H = je.H(builder, "name", bool, "covers", bool);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("name", bool);
        builder2.mo51put("covers", bool);
        ImmutableMap build = builder2.build();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("link", bool);
        builder3.mo51put("name", bool);
        builder3.mo51put("rowId", bool);
        builder3.mo51put("previewId", bool);
        builder3.mo51put("inCollection", bool);
        builder3.mo51put("isBanned", bool);
        builder3.mo51put("isExplicit", bool);
        builder3.mo51put("is19PlusOnly", bool);
        builder3.mo51put("playable", bool);
        builder3.mo51put("playabilityRestriction", bool);
        builder3.mo51put("available", bool);
        builder3.mo51put("isPremiumOnly", bool);
        builder3.mo51put("covers", bool);
        builder3.mo51put("freezeFrames", bool);
        builder3.mo51put("mediaTypeEnum", bool);
        builder3.mo51put("formatListAttributes", bool);
        builder3.mo51put("description", bool);
        builder3.mo51put("publishDate", bool);
        builder3.mo51put("offline", bool);
        builder3.mo51put("length", bool);
        ImmutableMap H2 = je.H(builder3, "isInListenLater", bool, "isMusicAndTalk", bool);
        ImmutableMap.Builder builder4 = ImmutableMap.builder();
        builder4.mo51put("link", bool);
        builder4.mo51put("name", bool);
        builder4.mo51put("image", bool);
        ImmutableMap H3 = je.H(builder4, "thumbnail", bool, "username", bool);
        ListPolicy.a builder5 = ListPolicy.builder();
        builder5.d(H2);
        builder5.b(H);
        builder5.c(ImmutableMap.of("name", bool));
        builder5.a(H3);
        builder5.g(build);
        ListPolicy e2 = builder5.e();
        i = e2;
        HeaderPolicy.a builder6 = HeaderPolicy.builder();
        builder6.a(ImmutableMap.of("link", bool));
        HeaderPolicy b2 = builder6.b();
        DecorationPolicy.a builder7 = DecorationPolicy.builder();
        builder7.b(b2);
        builder7.c(e2);
        DecorationPolicy a2 = builder7.a();
        Policy.a builder8 = Policy.builder();
        builder8.b(a2);
        h = builder8.a();
        ImmutableMap.Builder builder9 = ImmutableMap.builder();
        builder9.mo51put("name", bool);
        builder9.mo51put("isWritable", bool);
        builder9.mo51put("collaborative", bool);
        ImmutableMap H4 = je.H(builder9, "ownedBySelf", bool, "picture", bool);
        HeaderPolicy.a builder10 = HeaderPolicy.builder();
        builder10.a(H4);
        builder10.e(ImmutableMap.of());
        builder10.d(ImmutableMap.of());
        HeaderPolicy b3 = builder10.b();
        DecorationPolicy.a builder11 = DecorationPolicy.builder();
        builder11.b(b3);
        builder11.c(e2);
        DecorationPolicy a3 = builder11.a();
        Policy.a builder12 = Policy.builder();
        builder12.b(a3);
        j = builder12.a();
    }

    public o16(s16 s16, a aVar, d dVar, i iVar, ffc.a aVar2, q16 q16) {
        this.a = s16;
        this.b = aVar;
        this.c = dVar;
        this.d = iVar;
        this.e = aVar2;
        this.f = q16;
    }

    public /* synthetic */ v a(String str, Boolean bool) {
        boolean z;
        c s = this.a.s();
        Optional fromNullable = Optional.fromNullable(s.f());
        Optional fromNullable2 = Optional.fromNullable(s.b());
        d.b.a b2 = d.b.b();
        b2.e(Boolean.FALSE);
        b2.c(s.e());
        if (fromNullable2.isPresent()) {
            z = !((Boolean) fromNullable2.get()).booleanValue();
        } else {
            z = bool.booleanValue();
        }
        b2.j(Boolean.valueOf(z));
        b2.i(fromNullable.isPresent() ? new qxd(0, ((Integer) fromNullable.get()).intValue()) : null);
        b2.g(h);
        return ((gfc) this.e.a(str)).o(b2.b(), this.d.a());
    }

    public k16 b(k kVar, List list) {
        j16.b bVar = new j16.b();
        bVar.c(kVar.j());
        q16 q16 = this.f;
        List<o> l = kVar.l();
        q16.getClass();
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(l.size());
        for (o oVar : l) {
            String uri = oVar.getUri();
            if (!hashSet.contains(uri)) {
                hashSet.add(uri);
                l.a a2 = l.a();
                a2.g(oVar);
                arrayList.add(a2.b());
            }
        }
        bVar.d(arrayList);
        bVar.b(list);
        return bVar.a();
    }

    public s<k16> c() {
        if (this.g == null) {
            s<R> E = this.b.a().j0(a16.a).E();
            String a2 = this.a.a();
            d.b.a b2 = d.b.b();
            b2.i(new qxd(0, 0));
            b2.d(true);
            b2.g(j);
            this.g = s.n(this.c.a(a2, b2.b()), E.J0(new h16(this, a2)), new i16(this)).v0(1).h1();
        }
        return this.g;
    }
}
