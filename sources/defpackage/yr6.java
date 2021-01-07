package defpackage;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.FluentIterable;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;
import com.spotify.music.features.playlistallsongs.c;
import com.spotify.music.features.playlistallsongs.f;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.q;
import com.spotify.music.features.playlistentity.viewbinder.d0;
import com.spotify.playlist.formatlisttype.FormatListType;
import com.spotify.playlist.formatlisttype.a;
import com.spotify.playlist.models.j;
import com.spotify.playlist.models.k;
import defpackage.as6;
import defpackage.zo6;
import io.reactivex.internal.operators.completable.b;
import io.reactivex.y;
import io.reactivex.z;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: yr6  reason: default package */
public class yr6 {
    private final String a;
    private final String b;
    private final o26 c;
    private final wq6 d;
    private final f e;
    private final y f;
    private final ap6 g;
    private final x46 h;
    private final qr6 i;
    private final a j;
    private final d0 k;
    private final xq6 l;
    private final txc m;
    private final q n;

    public yr6(String str, String str2, o26 o26, qr6 qr6, f fVar, x46 x46, ap6 ap6, y yVar, wq6 wq6, a aVar, d0 d0Var, xq6 xq6, txc txc, q qVar) {
        this.a = str;
        this.b = str2;
        this.c = o26;
        this.i = qr6;
        this.f = yVar;
        this.e = fVar;
        this.h = x46;
        this.g = ap6;
        this.d = wq6;
        this.j = aVar;
        this.k = d0Var;
        this.l = xq6;
        this.m = txc;
        this.n = qVar;
    }

    public as6 a(k kVar, Map map) {
        j j2 = kVar.j();
        LicenseLayout a2 = this.h.a(kVar, map);
        FormatListType a3 = this.j.a(kVar.j().g());
        Map<String, String> f2 = j2.f();
        zo6.b bVar = new zo6.b(j2.getUri(), a3, f2);
        ip6 e2 = this.g.e(this.g.i(bVar));
        LicenseLayout or = e2.h(a2).or((Optional<LicenseLayout>) a2);
        if (this.d.L1()) {
            this.d.E1();
            xo6 a4 = e2.f().get().a(or);
            c a5 = this.k.a(or, map);
            return new as6.e(j2.getUri(), a4.c(com.spotify.music.features.playlistentity.configuration.a.b(a5)).a(a5));
        }
        boolean k2 = kVar.k();
        String g2 = kVar.j().g();
        return new as6.a(j2.getUri(), or, new zo6.b(j2.getUri(), a3, f2), g2 == null ? "" : g2, (String) MoreObjects.firstNonNull(kVar.j().f().get("request_id"), ""), k2, map, j2.j(), FluentIterable.from(this.g.j()).transform(br6.a).toList(), this.g.g(bVar, this.b).getClass().getSimpleName());
    }

    public /* synthetic */ void b(as6.e eVar) {
        this.e.a(eVar.c(), eVar.b());
    }

    public io.reactivex.d0 c(Optional optional) {
        if (!optional.isPresent()) {
            return z.z(new as6.c(this.a));
        }
        String str = (String) optional.get();
        this.l.b(str);
        return this.c.a(str).h(z.R(this.i.a(str), this.m.b().Q(or6.a).N0(1).B0(), new nr6(this)).D(new pr6(str)));
    }

    public io.reactivex.a d(as6.e eVar) {
        return b.a.A(this.f).d(io.reactivex.a.u(new lr6(this, eVar)));
    }

    public z<as6> e() {
        z<R> zVar;
        String str = this.a;
        if (l0.z(str).q() == LinkType.PLAYLIST_FORMAT) {
            zVar = this.n.a(this.a).I(7, TimeUnit.SECONDS).A(mr6.a).D(new jr6(str));
        } else {
            zVar = z.z(Optional.of(str));
        }
        return zVar.s(new kr6(this));
    }
}
