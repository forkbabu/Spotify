package com.spotify.music.features.playlistentity.viewbinder;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Joiner;
import com.google.common.base.MoreObjects;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.spotify.music.features.playlistentity.additionaladapters.AdditionalAdapter;
import com.spotify.music.features.playlistentity.additionaladapters.p;
import com.spotify.music.features.playlistentity.configuration.LicenseLayout;
import com.spotify.music.features.playlistentity.configuration.PlaylistDataSourceConfiguration;
import com.spotify.music.features.playlistentity.configuration.b;
import com.spotify.music.features.playlistentity.configuration.c;
import com.spotify.music.features.playlistentity.configuration.i;
import com.spotify.music.features.playlistentity.empty.l;
import com.spotify.music.features.playlistentity.header.m0;
import com.spotify.music.features.playlistentity.o;
import com.spotify.music.features.playlistentity.t;
import com.spotify.music.features.playlistentity.trackcloud.b0;
import com.spotify.music.features.playlistentity.viewbinder.j0;
import com.spotify.pageloader.l0;
import com.spotify.pageloader.n0;
import com.spotify.pageloader.o0;
import com.spotify.playlist.formatlisttype.FormatListType;
import defpackage.as6;
import defpackage.b76;
import defpackage.d96;
import defpackage.ep6;
import defpackage.f86;
import defpackage.fs6;
import defpackage.hg6;
import defpackage.j86;
import defpackage.po6;
import defpackage.ts6;
import io.reactivex.d0;
import io.reactivex.internal.operators.completable.k;
import io.reactivex.internal.operators.single.n;
import io.reactivex.y;
import io.reactivex.z;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q0 {
    private xo6 A = new a(this);
    private gp6 B;
    private ip6 C;
    private Map<AdditionalAdapter.Position, List<ep6>> D;
    private l E;
    private final fs6 F;
    private zt6 G;
    private uh6 H;
    private b0 I;
    private m0 J;
    private d96 K;
    private j86 L;
    private ts6 M;
    private hg6 N;
    private p O;
    private f86 P;
    private as6 Q;
    private t.b R;
    private xda S = n.a;
    private y0 T = p.a;
    private final f0 a;
    private final wr6 b;
    private final String c;
    private final yr6 d;
    private final y e;
    private final y f;
    private final o g;
    private final l.a h;
    private final ap6 i;
    private final d0 j;
    private final b0.a k;
    private final ys2 l;
    private final d96.a m;
    private final j0.b n;
    private final j86.a o;
    private final po6.a p;
    private final ts6.a q;
    private final hg6.a r;
    private final p.a s;
    private final f86.a t;
    private final b76.a u;
    private final List<t> v = new ArrayList();
    private zo6 w;
    private lp6 x;
    private pp6 y;
    private np6 z;

    class a implements xo6 {
        a(q0 q0Var) {
        }

        @Override // defpackage.xo6
        public /* synthetic */ b.c a(b.c cVar) {
            return wo6.b(this, cVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ c b(c cVar) {
            return wo6.c(this, cVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ com.spotify.music.features.playlistentity.configuration.a c(com.spotify.music.features.playlistentity.configuration.a aVar) {
            return wo6.a(this, aVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ PlaylistDataSourceConfiguration.c d(PlaylistDataSourceConfiguration.c cVar) {
            return wo6.d(this, cVar);
        }

        @Override // defpackage.xo6
        public /* synthetic */ i.c e(i.c cVar) {
            return wo6.e(this, cVar);
        }
    }

    public q0(f0 f0Var, wr6 wr6, yr6 yr6, fs6.a aVar, o oVar, l.a aVar2, ap6 ap6, String str, d0 d0Var, b0.a aVar3, ys2 ys2, d96.a aVar4, j0.b bVar, j86.a aVar5, po6.a aVar6, ts6.a aVar7, hg6.a aVar8, p.a aVar9, y yVar, y yVar2, f86.a aVar10, b76.a aVar11) {
        this.a = f0Var;
        this.b = wr6;
        this.d = yr6;
        this.c = str;
        this.g = oVar;
        this.h = aVar2;
        this.e = yVar;
        this.f = yVar2;
        this.i = ap6;
        this.p = aVar6;
        this.j = d0Var;
        this.k = aVar3;
        this.l = ys2;
        this.m = aVar4;
        this.n = bVar;
        this.o = aVar5;
        this.u = aVar11;
        this.q = aVar7;
        this.r = aVar8;
        this.s = aVar9;
        this.t = aVar10;
        this.F = aVar.create();
    }

    private static String e(List<ep6> list) {
        return Joiner.on(',').join(FluentIterable.from(list).transform(a0.a));
    }

    public static void o(q0 q0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        q0Var.G.j0(q0Var.F.e());
        List<View> o2 = q0Var.J.o(layoutInflater, viewGroup, q0Var.G);
        RecyclerView recyclerView = q0Var.J.getRecyclerView();
        q0Var.F.i(recyclerView);
        q0Var.F.g(q0Var.J, o2);
        twd f2 = q0Var.F.f();
        p pVar = q0Var.O;
        if (pVar != null) {
            pVar.n(f2, recyclerView);
        }
        hg6 hg6 = q0Var.N;
        if (hg6 != null) {
            hg6.a(layoutInflater, viewGroup, f2);
        }
        p pVar2 = q0Var.O;
        if (pVar2 != null) {
            pVar2.p(layoutInflater, viewGroup, AdditionalAdapter.Position.AFTER_HEADER);
        }
        f86 f86 = q0Var.P;
        if (f86 != null) {
            f86.s(f2);
            q0Var.P.q(true);
        }
        j86 j86 = q0Var.L;
        if (j86 != null) {
            j86.a(layoutInflater, viewGroup, f2);
        }
        d96 d96 = q0Var.K;
        if (d96 != null) {
            q0Var.l.I1(d96.m());
            q0Var.F.h(q0Var.K.a(layoutInflater, viewGroup, f2));
        }
        ts6 ts6 = q0Var.M;
        if (ts6 != null) {
            ts6.a(layoutInflater, viewGroup, f2);
        }
        l lVar = q0Var.E;
        if (lVar != null) {
            q0Var.F.h(lVar.a(layoutInflater, viewGroup, f2));
        }
        p pVar3 = q0Var.O;
        if (pVar3 != null) {
            pVar3.p(layoutInflater, viewGroup, AdditionalAdapter.Position.BEFORE_TRACK_LIST);
        }
        uh6 uh6 = q0Var.H;
        if (uh6 != null) {
            uh6.a(layoutInflater, viewGroup, f2);
        }
        b0 b0Var = q0Var.I;
        if (b0Var != null) {
            b0Var.t(layoutInflater, viewGroup, q0Var.J.getRecyclerView(), f2);
        }
        p pVar4 = q0Var.O;
        if (pVar4 != null) {
            pVar4.p(layoutInflater, viewGroup, AdditionalAdapter.Position.AFTER_TRACK_LIST);
        }
    }

    private io.reactivex.a r() {
        if (this.v.isEmpty()) {
            return k.a;
        }
        ArrayList arrayList = new ArrayList();
        for (t tVar : this.v) {
            arrayList.add(tVar.g());
        }
        return io.reactivex.a.y(arrayList);
    }

    public j0 f(as6.a aVar) {
        return ((k0) this.n).b(this.F, new c0(aVar.g(), aVar.e(), aVar.b(), aVar.c()), new x(this), this.v);
    }

    public o0<as6> g() {
        return n0.b(z.h(new l(this)).D(q.a).P());
    }

    public t.b h() {
        return this.R;
    }

    public List<t> i() {
        return this.v;
    }

    public d0 j() {
        as6 as6 = this.Q;
        if (as6 == null || !(as6 instanceof as6.a)) {
            return this.d.e().s(new k(this));
        }
        return r().h(z.z(l0.b(this.Q)));
    }

    public z k(as6 as6, as6.a aVar) {
        return z.z(as6).B(this.f).A(z.a).s(new r(this)).B(this.e).s(new m(this, as6));
    }

    public /* synthetic */ z l(as6.e eVar) {
        return this.d.d(eVar).h(n.a);
    }

    public d0 m(as6 as6, as6.a aVar) {
        List<AdditionalAdapter> list;
        PlaylistDataSourceConfiguration g2 = this.j.g(aVar.e(), aVar.i());
        PlaylistDataSourceConfiguration.c d2 = this.A.d(g2.a());
        b76.a aVar2 = this.u;
        PlaylistDataSourceConfiguration.a i2 = g2.i();
        i2.b(d2);
        b76 a2 = aVar2.a(i2.a());
        po6 a3 = this.p.a(a2, this.j.f(aVar.e()));
        this.R = new s0(this, a3, a2);
        this.v.add(new t0(this, a3, a2, aVar));
        LicenseLayout e2 = aVar.e();
        boolean h2 = aVar.h();
        Map<String, String> i3 = aVar.i();
        o oVar = new o(e2);
        m0 a4 = this.x.d().get().a(new u0(this, e2, h2, oVar));
        this.J = a4;
        this.v.add(a4);
        if (this.G == null) {
            zt6 a5 = this.y.a().get().a(new v0(this, e2, i3, oVar));
            this.G = a5;
            this.v.add(a5);
        }
        this.G.r(this.J);
        b b2 = this.j.b(e2, i3);
        b.a d3 = b2.d();
        d3.c(this.A.a(b2.b()));
        b a6 = d3.a();
        if (a6.c() && this.N == null) {
            hg6 a7 = this.r.a(this.A.b(this.j.c()));
            this.N = a7;
            this.v.add(a7);
        }
        if (a6.a() && this.P == null) {
            f86 create = this.t.create();
            this.P = create;
            this.v.add(create);
        }
        if (a6.b().a() && this.L == null) {
            j86 create2 = this.o.create();
            this.L = create2;
            this.v.add(create2);
        }
        if (this.O == null) {
            w0 w0Var = new w0(this, e2, i3, oVar);
            HashMap hashMap = new HashMap();
            AdditionalAdapter.Position[] positionArr = AdditionalAdapter.i;
            for (AdditionalAdapter.Position position : positionArr) {
                ImmutableList.Builder builder = new ImmutableList.Builder();
                for (ep6 ep6 : (List) MoreObjects.firstNonNull(this.D.get(position), ImmutableList.of())) {
                    ep6.a b3 = ep6.b(position);
                    if (b3 instanceof ep6.a.d) {
                        list = ((ep6.a.d) b3).a().a(w0Var);
                    } else if (b3 instanceof ep6.a.C0592a) {
                        ((ep6.a.C0592a) b3).getClass();
                        throw null;
                    } else if (!(b3 instanceof ep6.a.c)) {
                        list = ImmutableList.of();
                    } else {
                        ((ep6.a.c) b3).getClass();
                        throw null;
                    }
                    builder.addAll((Iterable) list);
                }
                hashMap.put(position, builder.build());
            }
            p a8 = this.s.a(hashMap);
            this.O = a8;
            this.v.add(a8);
        }
        if (a6.b().c() && this.K == null) {
            d96 create3 = this.m.create();
            this.K = create3;
            this.v.add(create3);
        }
        if (this.M == null) {
            ts6 create4 = this.q.create();
            this.M = create4;
            this.v.add(create4);
        }
        if (a6.b().b() && this.E == null) {
            l create5 = this.h.create();
            this.E = create5;
            this.v.add(create5);
        }
        if (a6.f() && this.H == null) {
            np6 b4 = this.i.b(this.w);
            this.z = b4;
            uh6 a9 = b4.c().get().a(new x0(this, e2, i3, oVar));
            this.H = a9;
            this.v.add(a9);
        }
        if (a6.e() && this.I == null) {
            i k2 = this.j.k(e2);
            i.c e3 = this.A.e(k2.b());
            com.spotify.music.features.playlistallsongs.c a10 = this.j.a(e2, i3);
            com.spotify.music.features.playlistentity.configuration.a c2 = this.A.c(com.spotify.music.features.playlistentity.configuration.a.b(a10));
            b0.a aVar3 = this.k;
            i.a c3 = k2.c();
            c3.c(e3);
            b0 a11 = aVar3.a(c3.b(), c2.a(a10));
            this.I = a11;
            this.v.add(a11);
        }
        this.v.add(this.B.e().get().a(oVar));
        t.b bVar = this.R;
        if (bVar != null) {
            this.a.a(this.v, bVar);
        }
        this.T.d(aVar.f());
        LicenseLayout e4 = aVar.e();
        FormatListType a12 = aVar.d().a();
        String j2 = aVar.j();
        boolean isPresent = this.C.h(e4).isPresent();
        StringBuilder V0 = je.V0("\n-- Active plugins --\nConfigurations: ");
        V0.append(this.C.name());
        V0.append('\n');
        V0.append("Toolbar: ");
        V0.append(this.y.name());
        V0.append('\n');
        V0.append("Header: ");
        V0.append(this.x.name());
        V0.append('\n');
        V0.append("Playlist component: ");
        V0.append(this.B.name());
        V0.append('\n');
        V0.append("Item list: ");
        np6 np6 = this.z;
        je.A(V0, np6 != null ? np6.name() : "<none>", '\n', "Additional Adapters after headers: ");
        je.A(V0, e(this.D.get(AdditionalAdapter.Position.AFTER_HEADER)), '\n', "Additional Adapters before track list: ");
        je.A(V0, e(this.D.get(AdditionalAdapter.Position.BEFORE_TRACK_LIST)), '\n', "Additional Adapters after track list: ");
        V0.append(e(this.D.get(AdditionalAdapter.Position.AFTER_TRACK_LIST)));
        V0.append('\n');
        V0.append('\n');
        V0.append("License layout: ");
        V0.append(e4);
        V0.append(isPresent ? " (overridden!)" : "");
        V0.append('\n');
        V0.append("Raw Format list type: ");
        V0.append(j2);
        V0.append('\n');
        V0.append("Derived Format list type: ");
        V0.append(a12);
        V0.append('\n');
        V0.toString();
        ((n) this.S).getClass();
        this.Q = as6;
        return r().h(z.z(l0.b(as6)));
    }

    public d0 n(as6.a aVar) {
        zo6 g2 = this.i.g(aVar.d(), this.c);
        this.w = g2;
        this.C = this.i.e(g2);
        this.x = this.i.c(this.w);
        this.y = this.i.f(this.w);
        this.B = this.i.d(this.w);
        this.D = this.i.h(this.w);
        LicenseLayout e2 = aVar.e();
        this.A = this.C.f().get().a(e2);
        this.g.f(this.i.a(this.w, e2), aVar.j(), aVar.k(), aVar.g());
        return z.z(aVar);
    }

    public void p(Bundle bundle) {
        this.F.d(bundle);
    }

    public void q(Bundle bundle) {
        this.F.c(bundle);
    }

    public void s(y0 y0Var) {
        this.T = y0Var;
    }
}
