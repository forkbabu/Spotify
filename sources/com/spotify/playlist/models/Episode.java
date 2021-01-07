package com.spotify.playlist.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.models.c;
import com.spotify.playlist.models.offline.a;

public abstract class Episode implements g, h {

    public enum MediaType {
        VODCAST,
        AUDIO,
        VIDEO,
        UNKNOWN;

        static {
            values();
        }
    }

    public enum Type {
        FULL,
        TRAILER,
        BONUS,
        UNKNOWN;

        static {
            values();
        }
    }

    public interface a {
        a A(int i);

        a B(ImmutableList<m> immutableList);

        a C(boolean z);

        a D(Covers covers);

        a E(n nVar);

        a F(MediaType mediaType);

        a G(Integer num);

        a H(boolean z);

        a a(boolean z);

        a b(boolean z);

        Episode build();

        a c(String str);

        a d(String str);

        a e(com.spotify.playlist.models.offline.a aVar);

        a f(String str);

        a i(String str);

        a j(PlayabilityRestriction playabilityRestriction);

        a k(String str);

        a l(int i);

        a m(boolean z);

        a n(boolean z);

        a o(String str);

        a p(e eVar);

        a q(boolean z);

        a r(Show show);

        a s(Covers covers);

        a t(ImmutableMap<String, String> immutableMap);

        a u(Type type);

        a v(boolean z);

        a w(String str);

        a x(boolean z);

        a y(String str);

        a z(Long l);
    }

    public static a a() {
        c.b bVar = new c.b();
        bVar.f("");
        c.b bVar2 = bVar;
        bVar2.d("");
        c.b bVar3 = bVar2;
        bVar3.l(0);
        c.b bVar4 = bVar3;
        bVar4.A(0);
        c.b bVar5 = bVar4;
        bVar5.r(null);
        c.b bVar6 = bVar5;
        bVar6.i(null);
        c.b bVar7 = bVar6;
        bVar7.v(false);
        c.b bVar8 = bVar7;
        bVar8.C(false);
        c.b bVar9 = bVar8;
        bVar9.w("");
        c.b bVar10 = bVar9;
        bVar10.G(null);
        c.b bVar11 = bVar10;
        bVar11.o(null);
        c.b bVar12 = bVar11;
        bVar12.c("");
        c.b bVar13 = bVar12;
        bVar13.a(false);
        c.b bVar14 = bVar13;
        bVar14.u(Type.UNKNOWN);
        c.b bVar15 = bVar14;
        bVar15.z(null);
        c.b bVar16 = bVar15;
        bVar16.n(false);
        c.b bVar17 = bVar16;
        bVar17.y("");
        c.b bVar18 = bVar17;
        bVar18.x(false);
        c.b bVar19 = bVar18;
        bVar19.q(false);
        c.b bVar20 = bVar19;
        bVar20.b(false);
        c.b bVar21 = bVar20;
        bVar21.H(false);
        c.b bVar22 = bVar21;
        bVar22.t(ImmutableMap.of());
        c.b bVar23 = bVar22;
        bVar23.F(MediaType.UNKNOWN);
        c.b bVar24 = bVar23;
        bVar24.s(Covers.a().a());
        c.b bVar25 = bVar24;
        bVar25.m(false);
        c.b bVar26 = bVar25;
        bVar26.D(Covers.a().a());
        c.b bVar27 = bVar26;
        bVar27.e(a.f.a);
        c.b bVar28 = bVar27;
        bVar28.j(PlayabilityRestriction.UNKNOWN);
        int i = ImmutableList.a;
        c.b bVar29 = bVar28;
        bVar29.B(new ImmutableList.Builder().build());
        c.b bVar30 = bVar29;
        bVar30.E(null);
        c.b bVar31 = bVar30;
        bVar31.p(null);
        return bVar31;
    }

    public static a b() {
        return new c.b();
    }

    public abstract boolean A();

    public abstract boolean B();

    public abstract boolean C();

    public abstract boolean D();

    public abstract boolean E();

    public abstract boolean F();

    public abstract Covers c();

    public abstract String d();

    public abstract Covers e();

    public abstract String f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract Long i();

    public abstract int j();

    public abstract String k();

    public abstract MediaType l();

    public abstract ImmutableMap<String, String> m();

    public abstract String n();

    public abstract com.spotify.playlist.models.offline.a o();

    public abstract PlayabilityRestriction p();

    public abstract n q();

    public abstract e r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract ImmutableList<m> v();

    public abstract Show w();

    public abstract Integer x();

    public abstract Type y();

    public abstract boolean z();
}
