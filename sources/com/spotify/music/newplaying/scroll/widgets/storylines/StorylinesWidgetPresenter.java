package com.spotify.music.newplaying.scroll.widgets.storylines;

import com.google.common.base.MoreObjects;
import com.google.common.base.Optional;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.storylines.model.StorylinesCardContent;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.mobile.android.storylines.model.b;
import com.spotify.mobile.android.storylines.ui.l;
import com.spotify.music.follow.j;
import com.spotify.music.follow.m;
import com.spotify.music.follow.resolver.f;
import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import defpackage.bob;
import defpackage.cob;
import io.reactivex.disposables.a;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

public class StorylinesWidgetPresenter implements l.a {
    private final hjd a;
    private final fjd b;
    private final t c;
    private final m d;
    private final y e;
    private final xn1<bob> f;
    private final qjd g;
    private final f h;
    private final g<PlayerState> i;
    private String j;
    private String k;
    private boolean l;
    private ContentLoadedState m;
    private final a n = new a();
    private l o;

    private enum ContentLoadedState {
        NOT_LOADED,
        LOADED_ONE_CARD,
        LOADED_MANY_CARDS
    }

    public StorylinesWidgetPresenter(g<PlayerState> gVar, hjd hjd, fjd fjd, t tVar, m mVar, xn1<bob> xn1, y yVar, qjd qjd, f fVar) {
        this.i = gVar;
        this.a = hjd;
        this.b = fjd;
        this.c = tVar;
        this.d = mVar;
        this.f = xn1;
        this.e = yVar;
        this.g = qjd;
        this.h = fVar;
    }

    public static s f(StorylinesWidgetPresenter storylinesWidgetPresenter, PlayerState playerState) {
        storylinesWidgetPresenter.getClass();
        String uri = playerState.track().get().uri();
        return storylinesWidgetPresenter.g.b(uri, playerState.playbackId().or((Optional<String>) "")).j0(c.a).G0((R) bob.c()).q(storylinesWidgetPresenter.g.a(uri) ^ true ? storylinesWidgetPresenter.f : m.a).r0(u.a).V(new k(storylinesWidgetPresenter), new n(playerState));
    }

    public /* synthetic */ void a(cob.c cVar) {
        this.o.f();
    }

    public void b(cob.b bVar) {
        StorylinesCardContent g2 = bVar.g();
        g2.getClass();
        ContentLoadedState contentLoadedState = ContentLoadedState.LOADED_MANY_CARDS;
        this.j = g2.getArtistUri();
        this.k = g2.getEntityUri();
        this.o.setArtistName(g2.getArtistName());
        this.o.setArtistAvatar(g2.getAvatarUri());
        l lVar = this.o;
        List<StorylinesCardImageModel> images = g2.getImages();
        b.a a2 = b.a();
        a2.c(this.k);
        a2.e(g2.getStorylineGid());
        a2.d(bVar.f().or((Optional<String>) ""));
        a2.a("");
        lVar.g(images, a2.b());
        this.o.setStorylinesContentVisible(true);
        ContentLoadedState contentLoadedState2 = g2.getImages().size() > 1 ? contentLoadedState : ContentLoadedState.LOADED_ONE_CARD;
        this.m = contentLoadedState2;
        if (!this.l || contentLoadedState2 != contentLoadedState) {
            this.o.a(false, false);
        } else {
            this.o.a(true, true);
        }
        Optional<j> e2 = bVar.e();
        e2.getClass();
        if (e2.isPresent()) {
            boolean g3 = e2.get().g();
            this.o.setFollowState(g3);
            String str = this.j;
            j jVar = e2.get();
            this.d.g(jVar);
            if (jVar.g() != g3) {
                this.d.e(str, g3);
                return;
            }
            return;
        }
        this.o.setFollowState(false);
    }

    public void c(cob.a aVar) {
        Throwable e2 = aVar.e();
        this.o.h();
        Logger.e(e2, "Storylines subscription error.", new Object[0]);
    }

    public void d(PlayerState playerState) {
        ContentLoadedState contentLoadedState = this.m;
        ContentLoadedState contentLoadedState2 = ContentLoadedState.NOT_LOADED;
        if (contentLoadedState != contentLoadedState2) {
            this.o.setStorylinesContentVisible(false);
            if (this.l && this.m == ContentLoadedState.LOADED_MANY_CARDS) {
                this.o.a(false, false);
            }
        }
        this.l = false;
        this.m = contentLoadedState2;
    }

    public /* synthetic */ s e(bob.b bVar) {
        return this.h.a(bVar.e().getArtistUri()).N0(1).j0(b.a).p0(s.i0(Optional.absent()));
    }

    public void g(int i2, double d2) {
        this.a.b(this.j, this.k, i2, d2);
        this.c.d(this.j);
    }

    public void h(int i2, double d2) {
        j c2;
        if (!MoreObjects.isNullOrEmpty(this.j) && (c2 = this.d.c(this.j)) != null) {
            boolean g2 = c2.g();
            String str = this.j;
            boolean z = !g2;
            this.d.g(c2);
            if (c2.g() != z) {
                this.d.e(str, z);
            }
            if (g2) {
                this.a.i(this.j, this.k, i2, d2);
            } else {
                this.a.d(this.j, this.k, i2, d2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        this.l = true;
        if (this.m == ContentLoadedState.LOADED_MANY_CARDS) {
            this.o.a(true, true);
        }
    }

    public void j(int i2, double d2) {
        if (this.l) {
            this.a.e(this.k, i2, d2);
            this.o.c(i2 + 1);
        }
    }

    public void k(int i2, double d2) {
        if (this.l) {
            this.a.f(this.k, i2, d2);
            this.o.c(i2 - 1);
        }
    }

    public void l(b bVar) {
        this.b.l(bVar.d(), bVar.b(), bVar.e(), bVar.c());
    }

    public void m(b bVar) {
        this.b.m(bVar.d(), bVar.b(), bVar.e(), bVar.c());
    }

    public void n(b bVar) {
        this.b.n(bVar.d(), bVar.b(), bVar.e(), bVar.c());
    }

    public void o(int i2, double d2) {
        this.a.h(this.k, i2, d2);
    }

    public void p(int i2, double d2) {
        this.a.c(this.k, i2, d2);
    }

    public void q(l lVar) {
        lVar.getClass();
        this.o = lVar;
        lVar.setListener(this);
        this.n.b(new v(this.i.u(o.a)).N(new e(this)).J0(new s(this)).o0(this.e).subscribe(new g(this), q.a));
    }

    public void r() {
        this.n.f();
        this.l = false;
        this.m = ContentLoadedState.NOT_LOADED;
    }
}
