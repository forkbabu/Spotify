package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.playlistentity.c0;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.datasource.sorting.b;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.command.options.PreparePlayOptions;
import com.spotify.playlist.endpoints.d;
import com.spotify.playlist.endpoints.exceptions.ForbiddenException;
import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import com.spotify.playlist.endpoints.policy.playlist.DecorationPolicy;
import com.spotify.playlist.endpoints.policy.playlist.HeaderPolicy;
import com.spotify.playlist.endpoints.policy.playlist.ListPolicy;
import com.spotify.playlist.endpoints.policy.playlist.Policy;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import com.spotify.playlist.models.l;
import com.spotify.playlist.models.o;
import defpackage.ffc;
import defpackage.g76;
import defpackage.h76;
import defpackage.y66;
import defpackage.z66;
import io.reactivex.e;
import io.reactivex.functions.d;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.z;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;

/* renamed from: d76  reason: default package */
final class d76 implements b76 {
    private static final Policy m;
    private static final Policy n;
    private static final Policy o;
    private static final Policy p;
    private static final ListPolicy q;
    private static final d<z66, z66> r = k66.a;
    public static final /* synthetic */ int s = 0;
    private final String b;
    private final com.spotify.playlist.endpoints.d c;
    private final com.spotify.music.settings.a d;
    private final PlaylistDataSourceConfiguration e;
    private final b f;
    private final ffc.a g;
    private final c0 h;
    private final io.reactivex.subjects.a<z66> i = io.reactivex.subjects.a.h1();
    private s<g76> j;
    private s<h76> k;
    private s<a> l;

    /* renamed from: d76$a */
    public static abstract class a {

        /* renamed from: d76$a$a  reason: collision with other inner class name */
        public interface AbstractC0588a {
        }

        public abstract z66 a();

        public abstract Optional<Integer> b();

        public abstract boolean c();

        public abstract AbstractC0588a d();
    }

    static {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Boolean bool = Boolean.TRUE;
        builder.mo51put("link", bool);
        builder.mo51put("name", bool);
        builder.mo51put("rowId", bool);
        builder.mo51put("inCollection", bool);
        builder.mo51put("isBanned", bool);
        builder.mo51put("isExplicit", bool);
        builder.mo51put("is19PlusOnly", bool);
        builder.mo51put("hasLyrics", bool);
        builder.mo51put("isPremiumOnly", bool);
        builder.mo51put("playable", bool);
        builder.mo51put("playabilityRestriction", bool);
        builder.mo51put("offline", bool);
        builder.mo51put("mediaTypeEnum", bool);
        builder.mo51put("formatListAttributes", bool);
        builder.mo51put("description", bool);
        builder.mo51put("covers", bool);
        builder.mo51put("freezeFrames", bool);
        builder.mo51put("duration", bool);
        builder.mo51put("imageUri", bool);
        builder.mo51put("isNew", bool);
        builder.mo51put("isPlayed", bool);
        builder.mo51put("lastPlayedAt", bool);
        builder.mo51put("timeLeft", bool);
        builder.mo51put("publishDate", bool);
        builder.mo51put("length", bool);
        builder.mo51put("previewId", bool);
        ImmutableMap H = je.H(builder, "isInListenLater", bool, "isMusicAndTalk", bool);
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        builder2.mo51put("name", bool);
        builder2.mo51put("covers", bool);
        ImmutableMap build = builder2.build();
        ImmutableMap.Builder builder3 = ImmutableMap.builder();
        builder3.mo51put("name", bool);
        builder3.mo51put("covers", bool);
        ImmutableMap build2 = builder3.build();
        ImmutableMap.Builder builder4 = ImmutableMap.builder();
        builder4.mo51put("link", bool);
        builder4.mo51put("name", bool);
        builder4.mo51put("image", bool);
        ImmutableMap H2 = je.H(builder4, "thumbnail", bool, "username", bool);
        ListPolicy.a builder5 = ListPolicy.builder();
        builder5.d(H);
        builder5.b(build);
        builder5.c(ImmutableMap.of("name", bool));
        builder5.a(H2);
        builder5.g(build2);
        builder5.f(ImmutableMap.of("artists", bool));
        ListPolicy e2 = builder5.e();
        q = e2;
        DecorationPolicy.a builder6 = DecorationPolicy.builder();
        builder6.c(e2);
        DecorationPolicy a2 = builder6.a();
        Policy.a builder7 = Policy.builder();
        builder7.b(a2);
        n = builder7.a();
        DecorationPolicy.a builder8 = DecorationPolicy.builder();
        builder8.c(e2);
        DecorationPolicy a3 = builder8.a();
        Policy.a builder9 = Policy.builder();
        builder9.b(a3);
        m = builder9.a();
        ImmutableMap.Builder builder10 = ImmutableMap.builder();
        builder10.mo51put("link", bool);
        builder10.mo51put("name", bool);
        builder10.mo51put("inCollection", bool);
        ImmutableMap H3 = je.H(builder10, "isBanned", bool, "mediaTypeEnum", bool);
        ImmutableMap of = ImmutableMap.of("name", bool);
        ListPolicy.a builder11 = ListPolicy.builder();
        builder11.d(H3);
        builder11.c(of);
        builder11.g(of);
        ListPolicy e3 = builder11.e();
        HeaderPolicy.a builder12 = HeaderPolicy.builder();
        builder12.a(ImmutableMap.of("link", bool));
        HeaderPolicy b2 = builder12.b();
        DecorationPolicy.a builder13 = DecorationPolicy.builder();
        builder13.c(e3);
        builder13.b(b2);
        DecorationPolicy a4 = builder13.a();
        Policy.a builder14 = Policy.builder();
        builder14.b(a4);
        o = builder14.a();
        ImmutableMap.Builder builder15 = ImmutableMap.builder();
        builder15.mo51put("link", bool);
        builder15.mo51put("name", bool);
        builder15.mo51put("followed", bool);
        builder15.mo51put("description", bool);
        builder15.mo51put("picture", bool);
        builder15.mo51put("published", bool);
        builder15.mo51put("duration", bool);
        builder15.mo51put("formatListAttributes", bool);
        builder15.mo51put("formatListType", bool);
        builder15.mo51put("canReportAnnotationAbuse", bool);
        builder15.mo51put("offline", bool);
        builder15.mo51put("syncProgress", bool);
        builder15.mo51put("hasExplicitContent", bool);
        builder15.mo51put("onlyContainsExplicit", bool);
        builder15.mo51put("containsEpisodes", bool);
        builder15.mo51put("containsTracks", bool);
        builder15.mo51put("containsAudioEpisodes", bool);
        builder15.mo51put("numberOfEpisodes", bool);
        builder15.mo51put("numberOfTracks", bool);
        builder15.mo51put("totalLength", bool);
        builder15.mo51put("ownedBySelf", bool);
        builder15.mo51put("addTime", bool);
        builder15.mo51put("collaborative", bool);
        builder15.mo51put("loaded", bool);
        ImmutableMap H4 = je.H(builder15, "lastModification", bool, "playable", bool);
        ImmutableMap.Builder builder16 = ImmutableMap.builder();
        builder16.mo51put("name", bool);
        builder16.mo51put("username", bool);
        builder16.mo51put("image", bool);
        ImmutableMap H5 = je.H(builder16, "thumbnail", bool, "link", bool);
        ImmutableMap.Builder builder17 = ImmutableMap.builder();
        builder17.mo51put("name", bool);
        builder17.mo51put("username", bool);
        ImmutableMap build3 = builder17.build();
        HeaderPolicy.a builder18 = HeaderPolicy.builder();
        builder18.a(H4);
        builder18.e(H5);
        builder18.d(build3);
        HeaderPolicy b3 = builder18.b();
        DecorationPolicy.a builder19 = DecorationPolicy.builder();
        builder19.b(b3);
        DecorationPolicy a5 = builder19.a();
        Policy.a builder20 = Policy.builder();
        builder20.b(a5);
        p = builder20.a();
    }

    public d76(com.spotify.playlist.endpoints.d dVar, String str, com.spotify.music.settings.a aVar, b bVar, ffc.a aVar2, c0 c0Var, PlaylistDataSourceConfiguration playlistDataSourceConfiguration) {
        this.b = str;
        this.d = aVar;
        this.e = playlistDataSourceConfiguration;
        this.f = bVar;
        this.c = dVar;
        this.g = aVar2;
        this.h = c0Var;
    }

    static /* synthetic */ e C(Throwable th) {
        if (n(th)) {
            return io.reactivex.internal.operators.completable.b.a;
        }
        return io.reactivex.a.t(th);
    }

    private Policy D(Policy policy) {
        ListPolicy listPolicy = policy.decorationPolicy().listPolicy();
        ListPolicy a2 = this.e.a().a();
        ListPolicy.a builder = listPolicy.toBuilder();
        builder.d(E(listPolicy.attributes(), a2.attributes()));
        builder.g(E(listPolicy.showAttributes(), a2.showAttributes()));
        builder.b(E(listPolicy.albumAttributes(), a2.albumAttributes()));
        builder.a(E(listPolicy.addedByAttributes(), a2.addedByAttributes()));
        builder.c(E(listPolicy.artistsAttributes(), a2.artistsAttributes()));
        ListPolicy e2 = builder.e();
        Policy.a builder2 = policy.toBuilder();
        DecorationPolicy.a builder3 = policy.decorationPolicy().toBuilder();
        builder3.c(e2);
        builder2.b(builder3.a());
        return builder2.a();
    }

    private static Map<String, Boolean> E(Map<String, Boolean> map, Map<String, Boolean> map2) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        builder.putAll(map);
        for (Map.Entry<String, Boolean> entry : map2.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                builder.put(entry);
            }
        }
        return builder.build();
    }

    /* access modifiers changed from: private */
    public d.b i(a aVar) {
        boolean z;
        z66 a2 = aVar.a();
        Optional<Integer> b2 = aVar.b();
        PlaylistDataSourceConfiguration playlistDataSourceConfiguration = this.e;
        Boolean d2 = playlistDataSourceConfiguration.a().d();
        d.b.a b3 = d.b.b();
        b3.l(a2.b() != null ? a2.b() : "");
        b3.k(a2.a());
        b3.e(playlistDataSourceConfiguration.c());
        b3.f(playlistDataSourceConfiguration.b());
        b3.h(b2.orNull());
        b3.c(playlistDataSourceConfiguration.a().c());
        b3.d(playlistDataSourceConfiguration.g());
        if (d2 != null) {
            z = d2.booleanValue();
        } else {
            z = aVar.c();
        }
        b3.j(Boolean.valueOf(z));
        return b3.b();
    }

    private s<g76> j(Policy policy, a aVar) {
        com.spotify.playlist.endpoints.d dVar = this.c;
        String str = this.b;
        d.b.a p2 = i(aVar).p();
        p2.g(D(policy));
        return dVar.a(str, p2.b()).q0(new w66(this)).j0(new o66(this, aVar));
    }

    private k k() {
        EmptyList emptyList = EmptyList.a;
        Boolean bool = Boolean.FALSE;
        k.a aVar = new k.a(0L, 0, new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727).d(), bool, 0, 0, 0, 0, 0L, bool, emptyList, bool, bool, emptyList, bool, bool);
        j.a a2 = j.a();
        a2.B(this.b);
        aVar.m(a2.d());
        return aVar.a();
    }

    private s<a> l() {
        if (this.l == null) {
            this.l = this.i.F(r).J0(new s66(this)).v0(1).h1();
        }
        return this.l;
    }

    private void m() {
        if (this.i.j1() == null) {
            ane d2 = this.e.h() ? this.f.d(this.b, c76.a, d.b.c.i) : null;
            io.reactivex.subjects.a<z66> aVar = this.i;
            z66.a aVar2 = new z66.a(null, null, 3);
            aVar2.b(d2);
            aVar.onNext(aVar2.a());
        }
    }

    private static boolean n(Throwable th) {
        return (th instanceof NotFoundException) || (th instanceof ForbiddenException);
    }

    static /* synthetic */ v p(Throwable th) {
        if (n(th)) {
            return s.i0(ImmutableList.of());
        }
        return s.P(th);
    }

    static /* synthetic */ v r(Throwable th) {
        if (n(th)) {
            return s.i0(0);
        }
        return s.P(th);
    }

    public v A(a aVar) {
        d.b.a p2 = i(aVar).p();
        p2.i(new qxd(0, 0));
        p2.g(p);
        return this.c.a(this.b, p2.b()).q0(new i66(this)).j0(new f66(aVar));
    }

    public /* synthetic */ e B(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map map, String str, String str2, d.b bVar) {
        return this.c.c(this.b, bVar, preparePlayOptions, playOrigin, map, str, str2);
    }

    @Override // defpackage.c76
    public z<d.b> a() {
        return l().T().A(new e66(this)).A(new v66(this));
    }

    @Override // defpackage.c76
    public s<h76> b() {
        if (this.k == null) {
            s<R> J0 = l().J0(new u66(this));
            DecorationPolicy.a builder = DecorationPolicy.builder();
            HeaderPolicy.a builder2 = HeaderPolicy.builder();
            builder2.a(ImmutableMap.of("followers", Boolean.TRUE));
            builder.b(builder2.b());
            DecorationPolicy a2 = builder.a();
            d.b.a b2 = d.b.b();
            Policy.a builder3 = Policy.builder();
            builder3.b(a2);
            b2.g(builder3.a());
            b2.i(new qxd(0, 0));
            this.k = s.n(J0, this.c.a(this.b, b2.b()).j0(x66.a).q0(n66.a).G0((R) 0), new g66(this)).v0(1).h1();
        }
        return this.k;
    }

    @Override // defpackage.b76
    public void c(Bundle bundle) {
        z66 j1 = this.i.j1();
        if (j1 != null) {
            bundle.putParcelable(c76.class.getName(), j1);
        }
    }

    @Override // defpackage.b76
    public void d(Bundle bundle) {
        z66 z66;
        if (!(bundle == null || (z66 = (z66) bundle.getParcelable(c76.class.getName())) == null)) {
            this.i.onNext(z66);
        }
        m();
    }

    @Override // defpackage.c76
    public void e(Optional<String> optional) {
        z66 j1 = this.i.j1();
        Assertion.f(j1, "Trying to set text filter \"%s\" too early.", optional);
        io.reactivex.subjects.a<z66> aVar = this.i;
        z66.a c2 = j1.c();
        c2.c(optional.orNull());
        aVar.onNext(c2.a());
    }

    @Override // defpackage.c76
    public void f(Optional<ane> optional) {
        z66 j1 = this.i.j1();
        Assertion.f(j1, "Trying to set sort order \"%s\" too early.", optional);
        if (this.e.h()) {
            this.f.e(this.b, optional.or((Optional<ane>) c76.a));
        }
        io.reactivex.subjects.a<z66> aVar = this.i;
        z66.a c2 = j1.c();
        c2.b(optional.orNull());
        aVar.onNext(c2.a());
    }

    @Override // defpackage.a76
    public io.reactivex.a g(PreparePlayOptions preparePlayOptions, PlayOrigin playOrigin, Map<String, String> map, String str, String str2) {
        return a().t(new j66(this, preparePlayOptions, playOrigin, map, str, str2)).D(m66.a);
    }

    @Override // defpackage.c76
    public s<g76> h() {
        if (this.j == null) {
            this.j = l().J0(new d66(this)).v0(1).h1();
        }
        return this.j;
    }

    public /* synthetic */ v o(Throwable th) {
        if (n(th)) {
            return s.i0(k());
        }
        return s.P(th);
    }

    @Override // defpackage.b76
    public void onStart() {
        m();
    }

    public /* synthetic */ v q(Throwable th) {
        if (n(th)) {
            return s.i0(k());
        }
        return s.P(th);
    }

    public /* synthetic */ v s(Throwable th) {
        if (n(th)) {
            return s.i0(k());
        }
        return s.P(th);
    }

    public g76 t(a aVar, k kVar) {
        List<l> list;
        List<l> items = kVar.getItems();
        List<o> l2 = kVar.l();
        g76.a aVar2 = new g76.a(0, null, null, null, 15);
        aVar2.c(items);
        if (this.e.g()) {
            list = FluentIterable.from(l2).transform(t66.a).toList();
        } else {
            list = Collections.emptyList();
        }
        aVar2.e(list);
        aVar2.d(items.size());
        aVar2.b(aVar.a());
        return aVar2.a();
    }

    public /* synthetic */ v u(z66 z66) {
        return this.d.a().j0(c66.a).E().j0(new h66(this, z66));
    }

    public /* synthetic */ a v(a aVar) {
        Optional<Integer> optional;
        boolean e2 = this.e.e();
        z66.a c2 = aVar.a().c();
        c2.c(e2 ? aVar.a().b() : null);
        z66 a2 = c2.a();
        boolean d2 = this.e.d();
        a.AbstractC0588a d3 = aVar.d();
        if (d2) {
            optional = aVar.b();
        } else {
            optional = Optional.absent();
        }
        y66.b bVar = (y66.b) d3;
        bVar.c(optional);
        bVar.b(a2);
        return bVar.a();
    }

    public a x(z66 z66, Boolean bool) {
        y66.b bVar = new y66.b();
        bVar.c(Optional.fromNullable(this.e.f()));
        bVar.d(bool.booleanValue());
        bVar.b(z66);
        return bVar.a();
    }

    public v y(a aVar) {
        s<R> sVar;
        int ordinal = this.e.a().b().ordinal();
        if (ordinal == 0) {
            d.b.a b2 = d.b.b();
            b2.i(new qxd(0, 0));
            b2.d(true);
            b2.g(D(m));
            d.b b3 = b2.b();
            if (this.e.g()) {
                sVar = this.c.a(this.b, b3).q0(new q66(this)).j0(l66.a);
            } else {
                sVar = s.i0(Collections.emptyList());
            }
            ffc a2 = this.g.a(this.b);
            d.b.a p2 = i(aVar).p();
            p2.d(false);
            p2.g(D(n));
            return s.n(((gfc) a2).o(p2.b(), this.h.b().G0(0)).q0(p66.a), sVar, new r66(aVar));
        } else if (ordinal == 1) {
            return j(n, aVar);
        } else {
            if (ordinal == 2) {
                return j(o, aVar);
            }
            StringBuilder V0 = je.V0("Unknown/Unsupported DecorationPolicy");
            V0.append(this.e.a().b());
            return s.P(new Throwable(V0.toString()));
        }
    }

    public h76 z(u3 u3Var, Integer num) {
        F f2 = u3Var.a;
        f2.getClass();
        F f3 = f2;
        S s2 = u3Var.b;
        s2.getClass();
        S s3 = s2;
        h76.a aVar = new h76.a(0, 0, 0, 0, 0, 0, false, false, false, false, null, null, 4095);
        aVar.m(f3.j());
        int unrangedLength = f3.getUnrangedLength();
        Integer f4 = this.e.f();
        if (f4 != null) {
            unrangedLength = Math.min(unrangedLength, f4.intValue());
        }
        aVar.k(unrangedLength);
        aVar.j(num.intValue());
        aVar.h(f3.f());
        aVar.e(f3.d());
        aVar.g(f3.e());
        aVar.b(f3.a());
        aVar.d(f3.c());
        aVar.c(f3.b());
        aVar.i(f3.h());
        aVar.l(f3.i());
        aVar.f(s3.a());
        return aVar.a();
    }
}
