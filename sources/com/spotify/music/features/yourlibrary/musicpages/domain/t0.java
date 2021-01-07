package com.spotify.music.features.yourlibrary.musicpages.domain;

import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableListIterator;
import com.spotify.mobius.e0;
import com.spotify.mobius.s;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.r0;
import com.spotify.music.features.yourlibrary.musicpages.domain.s0;
import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.music.features.yourlibrary.musicpages.pages.MusicPageId;
import com.spotify.music.features.yourlibrary.musicpages.pages.a;
import com.spotify.music.features.yourlibrary.musicpages.pages.f;
import com.spotify.music.features.yourlibrary.musicpages.prefs.domain.PagePrefs;
import com.spotify.music.yourlibrary.interfaces.YourLibraryTabsCollapseState;
import defpackage.di9;
import defpackage.mpd;

public final class t0 {
    private static ImmutableSet<r0> a(MusicPagesModel musicPagesModel) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo60add((Object[]) new r0[]{c(musicPagesModel), new r0.p0(false), new r0.q0(false), new r0.C0262r0(YourLibraryTabsCollapseState.EXPANDED, false), new r0.j0()});
        if (musicPagesModel.j()) {
            builder.mo53add((ImmutableSet.Builder) new r0.z0(false));
        } else {
            builder.mo53add((ImmutableSet.Builder) new r0.w0(false));
        }
        return builder.build();
    }

    private static ImmutableList<mpd.b> b(MusicPagesModel musicPagesModel) {
        String str;
        if (!musicPagesModel.m().q() || musicPagesModel.l() == MusicPagesModel.LoadingState.LOADED_EMPTY) {
            return ImmutableList.of();
        }
        int i = ImmutableList.a;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        UnmodifiableListIterator<di9.b> listIterator = musicPagesModel.m().h().b().listIterator();
        while (listIterator.hasNext()) {
            di9.b next = listIterator.next();
            String e = next.e();
            boolean z = musicPagesModel.a().isPresent() && ((Boolean) MoreObjects.firstNonNull(musicPagesModel.a().get().get(e), Boolean.FALSE)).booleanValue();
            mpd.b.a b = mpd.b.b();
            b.d(e);
            b.a(z);
            if (z) {
                str = next.b();
            } else {
                str = next.g();
            }
            b.e(str);
            b.c(z ? next.a() : next.f());
            builder.mo53add((ImmutableList.Builder) b.b());
        }
        return builder.build();
    }

    private static r0 c(MusicPagesModel musicPagesModel) {
        ImmutableMap<String, String> immutableMap;
        Optional<PagePrefs> p = musicPagesModel.p();
        if (p.isPresent()) {
            immutableMap = ImmutableMap.copyOf(p.get().options());
        } else {
            immutableMap = ImmutableMap.of();
        }
        x3.a b = x3.b();
        b.h(musicPagesModel.x());
        b.g(musicPagesModel.w());
        x3.b.a a = x3.b.a();
        a.c(z42.F(musicPagesModel.b().or((Optional<qpd>) musicPagesModel.m().c()).a()));
        a.e(musicPagesModel.u() || !musicPagesModel.t().isEmpty());
        a.d(musicPagesModel.t());
        a.b(musicPagesModel.a().or((Optional<ImmutableMap<String, Boolean>>) musicPagesModel.m().b()));
        b.c(a.a());
        b.f(immutableMap);
        Optional<Boolean> s = musicPagesModel.s();
        Boolean bool = Boolean.FALSE;
        b.a(!s.or((Optional<Boolean>) bool).booleanValue());
        b.e(musicPagesModel.r().or((Optional<Boolean>) bool).booleanValue());
        b.d(musicPagesModel.k().orNull());
        return new r0.i1(b.b());
    }

    public static s<MusicPagesModel, r0> d(MusicPagesModel musicPagesModel) {
        if (!musicPagesModel.j()) {
            mpd o = musicPagesModel.o();
            String f = musicPagesModel.m().h().f();
            mpd.a g = o.g();
            g.e(f);
            mpd a = g.a();
            String g2 = musicPagesModel.m().h().g();
            mpd.a g3 = a.g();
            g3.f(g2);
            mpd a2 = g3.a();
            ImmutableList<mpd.b> b = b(musicPagesModel);
            mpd.a g4 = a2.g();
            g4.d(b);
            mpd a3 = g4.a();
            MusicPagesModel.a v = musicPagesModel.v();
            v.n(a3);
            musicPagesModel = v.c();
        }
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo60add((Object[]) new r0[]{new r0.d(w(musicPagesModel), musicPagesModel.m().c(), ImmutableList.copyOf(Collections2.transform((Iterable) musicPagesModel.m().h().h(), (Function) f.a))), new r0.k0(w(musicPagesModel), musicPagesModel.m().b(), ImmutableList.copyOf(Collections2.transform((Iterable) musicPagesModel.m().h().b(), (Function) a.a)), musicPagesModel.m().k()), new r0.l0(w(musicPagesModel))});
        return s.c(musicPagesModel, builder.build());
    }

    private static boolean e(MusicPagesModel musicPagesModel) {
        return musicPagesModel.g() && musicPagesModel.s().isPresent() && musicPagesModel.b().isPresent() && musicPagesModel.a().isPresent() && musicPagesModel.p().isPresent();
    }

    static e0 f(MusicPagesModel musicPagesModel, s0.y yVar) {
        MusicItem.f s = yVar.Q().s();
        return e0.a(z42.l(new r0.y0(w(musicPagesModel), s.e(), Optional.of(Boolean.toString(!s.f())))));
    }

    static e0 g(MusicPagesModel musicPagesModel, s0.t tVar) {
        if (musicPagesModel.g() == tVar.Q()) {
            return e0.h();
        }
        boolean Q = tVar.Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.f(Q);
        MusicPagesModel c = v.c();
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        MusicPagesModel.LoadingState l = c.l();
        if (tVar.Q() && !c.u() && (l == MusicPagesModel.LoadingState.LOADED || l == MusicPagesModel.LoadingState.LOADED_EMPTY)) {
            builder.mo53add((ImmutableSet.Builder) new r0.j0());
        }
        if (e(c)) {
            builder.mo53add((ImmutableSet.Builder) c(c));
        }
        return e0.g(c, builder.build());
    }

    static e0 h(MusicPagesModel musicPagesModel, s0.f0 f0Var) {
        if (!musicPagesModel.u()) {
            return e0.h();
        }
        MusicPagesModel v = v(musicPagesModel);
        return e0.g(v, a(v));
    }

    static e0 i(MusicPagesModel musicPagesModel, s0.g0 g0Var) {
        String Q = g0Var.Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.s(Q);
        MusicPagesModel c = v.c();
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (e(c)) {
            builder.mo60add((Object[]) new r0[]{c(c), new r0.u0(false)});
        }
        return e0.g(c, builder.build());
    }

    static e0 j(MusicPagesModel musicPagesModel, s0.d0 d0Var) {
        qpd Q = d0Var.Q();
        if (musicPagesModel.b().or((Optional<qpd>) qpd.b).equals(Q)) {
            return e0.h();
        }
        MusicPagesModel.a v = musicPagesModel.v();
        v.b(Optional.of(Q));
        MusicPagesModel c = v.c();
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        if (e(c)) {
            builder.mo53add((ImmutableSet.Builder) c(c));
        }
        builder.mo53add((ImmutableSet.Builder) new r0.t0(w(c), Q));
        return e0.g(c, builder.build());
    }

    static e0 k(MusicPagesModel musicPagesModel, s0.e0 e0Var) {
        qpd qpd;
        Optional tryFind = Collections2.tryFind(musicPagesModel.m().h().h(), new z(e0Var));
        if (tryFind.isPresent()) {
            qpd = qpd.b(z42.E(((di9.d) tryFind.get()).c()));
        } else {
            qpd = musicPagesModel.m().c();
        }
        MusicPagesModel.a v = musicPagesModel.v();
        v.b(Optional.of(qpd));
        MusicPagesModel c = v.c();
        if (e(c)) {
            return e0.g(c, z42.l(c(c)));
        }
        return e0.f(c);
    }

    static e0 l(MusicPagesModel musicPagesModel, s0.z zVar) {
        r0.s0 s0Var = new r0.s0(w(musicPagesModel), zVar.R(), zVar.Q());
        if (musicPagesModel.j()) {
            return e0.a(z42.l(s0Var));
        }
        return e0.a(z42.l(s0Var, new r0.o(zVar.R(), zVar.Q().booleanValue())));
    }

    static e0 m(MusicPagesModel musicPagesModel, s0.c0 c0Var) {
        boolean Q = c0Var.Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.r(Optional.of(Boolean.valueOf(Q)));
        MusicPagesModel c = v.c();
        if (e(c)) {
            return e0.g(c, z42.l(c(c)));
        }
        return e0.f(c);
    }

    static e0 n(MusicPagesModel musicPagesModel, s0.g gVar) {
        ImmutableMap<String, Boolean> Q = gVar.Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.a(Optional.of(Q));
        MusicPagesModel c = v.c();
        mpd o = c.o();
        ImmutableList<mpd.b> b = b(c);
        mpd.a g = o.g();
        g.d(b);
        mpd a = g.a();
        MusicPagesModel.a v2 = c.v();
        v2.n(a);
        MusicPagesModel c2 = v2.c();
        if (e(c2)) {
            return e0.g(c2, z42.l(c(c2)));
        }
        return e0.f(c2);
    }

    static e0 o(MusicPagesModel musicPagesModel, s0.u uVar) {
        PagePrefs Q = uVar.Q();
        MusicPagesModel.a v = musicPagesModel.v();
        v.o(Optional.of(Q));
        MusicPagesModel c = v.c();
        if (e(c)) {
            return e0.g(c, z42.l(c(c)));
        }
        return e0.f(c);
    }

    static e0 p(MusicPagesModel musicPagesModel, s0.b bVar) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.mo53add((ImmutableSet.Builder) new r0.b(w(musicPagesModel)));
        builder.mo53add((ImmutableSet.Builder) new r0.e());
        return e0.a(builder.build());
    }

    static e0 q(MusicPagesModel musicPagesModel, s0.c cVar) {
        int i = ImmutableSet.a;
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        String b = cVar.Q().b();
        builder.mo53add((ImmutableSet.Builder) new r0.s0(w(musicPagesModel), b, Boolean.FALSE));
        builder.mo53add((ImmutableSet.Builder) new r0.f(b));
        return e0.a(builder.build());
    }

    static e0 r(MusicPagesModel musicPagesModel, s0.h0 h0Var) {
        MusicPagesModel.a v = musicPagesModel.v();
        v.t(h0Var.Q());
        MusicPagesModel c = v.c();
        return e0.g(c, z42.l(c(c)));
    }

    static e0 s(MusicPagesModel musicPagesModel, s0.n0 n0Var) {
        MusicPagesModel.a v = musicPagesModel.v();
        v.v(n0Var.R());
        v.u(n0Var.Q());
        MusicPagesModel c = v.c();
        if (e(c)) {
            return e0.g(c, z42.l(c(c)));
        }
        return e0.f(c);
    }

    static e0 t(MusicPagesModel musicPagesModel, s0.o oVar) {
        if (musicPagesModel.k().isPresent() && musicPagesModel.k().get().booleanValue() == oVar.Q()) {
            return e0.h();
        }
        MusicPagesModel.a v = musicPagesModel.v();
        v.j(Optional.of(Boolean.valueOf(oVar.Q())));
        v.q(Optional.of(Boolean.valueOf(musicPagesModel.h() && oVar.Q())));
        MusicPagesModel c = v.c();
        if (e(c)) {
            return e0.g(c, z42.l(c(c)));
        }
        return e0.f(c);
    }

    static e0 u(MusicPagesModel musicPagesModel, s0.a aVar) {
        if (musicPagesModel.u()) {
            MusicPagesModel v = v(musicPagesModel);
            int i = ImmutableSet.a;
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            builder.mo53add((ImmutableSet.Builder) new r0.a());
            builder.addAll((Iterable) a(v));
            return e0.g(v, builder.build());
        }
        MusicPagesModel.a v2 = musicPagesModel.v();
        v2.h(false);
        return e0.f(v2.c());
    }

    private static MusicPagesModel v(MusicPagesModel musicPagesModel) {
        MusicPagesModel.a v = musicPagesModel.v();
        v.t(!musicPagesModel.j() && musicPagesModel.u());
        v.s("");
        v.h(false);
        return v.c();
    }

    private static String w(MusicPagesModel musicPagesModel) {
        if (musicPagesModel.m().k() == MusicPageId.FOLDER) {
            return "spotify:playlists";
        }
        String orNull = musicPagesModel.m().t().orNull();
        orNull.getClass();
        return orNull;
    }
}
