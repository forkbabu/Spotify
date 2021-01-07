package com.spotify.music.features.collectionartist;

import com.spotify.android.glue.patterns.toolbarmenu.e0;
import com.spotify.android.glue.patterns.toolbarmenu.h0;
import com.spotify.libs.glue.custom.playbutton.c;
import com.spotify.mobile.android.util.ui.h;
import com.spotify.music.connection.l;
import com.spotify.music.explicitcontent.ExplicitContentFacade;
import com.spotify.music.features.collectionartist.adapter.a;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.RxFollowersCountResolver;
import com.spotify.music.libs.ageverification.AgeRestrictedContentFacade;
import com.spotify.music.navigation.t;
import com.spotify.music.premiummini.k;
import com.spotify.music.spotlets.offline.util.OffliningLogger;
import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.y;

public final class z {
    public static void A(CollectionArtistFragment collectionArtistFragment, ys2 ys2) {
        collectionArtistFragment.d1 = ys2;
    }

    public static void B(CollectionArtistFragment collectionArtistFragment, e0 e0Var) {
        collectionArtistFragment.L0 = e0Var;
    }

    public static void C(CollectionArtistFragment collectionArtistFragment, h0 h0Var) {
        collectionArtistFragment.a1 = h0Var;
    }

    public static void D(CollectionArtistFragment collectionArtistFragment, com.spotify.music.libs.performance.tracking.h0 h0Var) {
        collectionArtistFragment.J0 = h0Var;
    }

    public static void a(CollectionArtistFragment collectionArtistFragment, AgeRestrictedContentFacade ageRestrictedContentFacade) {
        collectionArtistFragment.R0 = ageRestrictedContentFacade;
    }

    public static void b(CollectionArtistFragment collectionArtistFragment, l22 l22) {
        collectionArtistFragment.c1 = l22;
    }

    public static void c(CollectionArtistFragment collectionArtistFragment, a aVar) {
        collectionArtistFragment.i1 = aVar;
    }

    public static void d(CollectionArtistFragment collectionArtistFragment, x9a x9a) {
        collectionArtistFragment.P0 = x9a;
    }

    public static void e(CollectionArtistFragment collectionArtistFragment, cqe cqe) {
        collectionArtistFragment.o1 = cqe;
    }

    public static void f(CollectionArtistFragment collectionArtistFragment, a0 a0Var) {
        collectionArtistFragment.m1 = a0Var;
    }

    public static void g(CollectionArtistFragment collectionArtistFragment, d0 d0Var) {
        collectionArtistFragment.h1 = d0Var;
    }

    public static void h(CollectionArtistFragment collectionArtistFragment, b42 b42) {
        collectionArtistFragment.b1 = b42;
    }

    public static void i(CollectionArtistFragment collectionArtistFragment, ExplicitContentFacade explicitContentFacade) {
        collectionArtistFragment.Q0 = explicitContentFacade;
    }

    public static void j(CollectionArtistFragment collectionArtistFragment, m mVar) {
        collectionArtistFragment.e1 = mVar;
    }

    public static void k(CollectionArtistFragment collectionArtistFragment, RxFollowersCountResolver rxFollowersCountResolver) {
        collectionArtistFragment.f1 = rxFollowersCountResolver;
    }

    public static void l(CollectionArtistFragment collectionArtistFragment, h hVar) {
        collectionArtistFragment.g1 = hVar;
    }

    public static void m(CollectionArtistFragment collectionArtistFragment, y yVar) {
        collectionArtistFragment.N0 = yVar;
    }

    public static void n(CollectionArtistFragment collectionArtistFragment, t tVar) {
        collectionArtistFragment.Y0 = tVar;
    }

    public static void o(CollectionArtistFragment collectionArtistFragment, OffliningLogger offliningLogger) {
        collectionArtistFragment.l1 = offliningLogger;
    }

    public static void p(CollectionArtistFragment collectionArtistFragment, bre bre) {
        collectionArtistFragment.n1 = bre;
    }

    public static void q(CollectionArtistFragment collectionArtistFragment, bec bec) {
        collectionArtistFragment.U0 = bec;
    }

    public static void r(CollectionArtistFragment collectionArtistFragment, c.a aVar) {
        collectionArtistFragment.j1 = aVar;
    }

    public static void s(CollectionArtistFragment collectionArtistFragment, PlayOrigin playOrigin) {
        collectionArtistFragment.O0 = playOrigin;
    }

    public static void t(CollectionArtistFragment collectionArtistFragment, g<PlayerState> gVar) {
        collectionArtistFragment.T0 = gVar;
    }

    public static void u(CollectionArtistFragment collectionArtistFragment, k kVar) {
        collectionArtistFragment.p1 = kVar;
    }

    public static void v(CollectionArtistFragment collectionArtistFragment, zec zec) {
        collectionArtistFragment.k1 = zec;
    }

    public static void w(CollectionArtistFragment collectionArtistFragment, l lVar) {
        collectionArtistFragment.M0 = lVar;
    }

    public static void x(CollectionArtistFragment collectionArtistFragment, com.spotify.music.settings.a aVar) {
        collectionArtistFragment.S0 = aVar;
    }

    public static void y(CollectionArtistFragment collectionArtistFragment, com.spotify.music.spotlets.scannables.c cVar) {
        collectionArtistFragment.K0 = cVar;
    }

    public static void z(CollectionArtistFragment collectionArtistFragment, jzc jzc) {
        collectionArtistFragment.Z0 = jzc;
    }
}
