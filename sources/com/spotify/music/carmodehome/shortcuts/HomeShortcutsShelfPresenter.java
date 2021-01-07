package com.spotify.music.carmodehome.shortcuts;

import com.spotify.music.carmodehome.model.HomeShelf;
import com.spotify.music.carmodehome.model.b;
import com.spotify.music.carmodehome.shortcuts.e;
import com.spotify.music.navigation.t;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.y;
import java.util.List;
import kotlin.collections.d;
import kotlin.jvm.internal.h;

public final class HomeShortcutsShelfPresenter implements e.a {
    private int a = -1;
    private final p b = new p();
    private PlayerState c;
    private HomeShelf d;
    private final t e;
    private final g<PlayerState> f;
    private final y g;
    private final List<e> h;
    private final dr2 i;

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.List<? extends com.spotify.music.carmodehome.shortcuts.e> */
    /* JADX WARN: Multi-variable type inference failed */
    public HomeShortcutsShelfPresenter(t tVar, g<PlayerState> gVar, y yVar, List<? extends e> list, dr2 dr2) {
        h.e(tVar, "navigator");
        h.e(gVar, "playerStateFlowable");
        h.e(yVar, "mainScheduler");
        h.e(list, "viewBinders");
        h.e(dr2, "homeUbiLogger");
        this.e = tVar;
        this.f = gVar;
        this.g = yVar;
        this.h = list;
        this.i = dr2;
        for (e eVar : list) {
            eVar.f(this);
        }
    }

    public static final void b(HomeShortcutsShelfPresenter homeShortcutsShelfPresenter, PlayerState playerState) {
        homeShortcutsShelfPresenter.c = playerState;
        HomeShelf homeShelf = homeShortcutsShelfPresenter.d;
        if (homeShelf != null) {
            int i2 = 0;
            for (T t : homeShelf.b()) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    if (ar9.c(playerState, t.a())) {
                        homeShortcutsShelfPresenter.h.get(i2).g();
                    } else {
                        homeShortcutsShelfPresenter.h.get(i2).e();
                    }
                    i2 = i3;
                } else {
                    d.L();
                    throw null;
                }
            }
            return;
        }
        h.k("homeShelf");
        throw null;
    }

    @Override // com.spotify.music.carmodehome.shortcuts.e.a
    public void a(e eVar) {
        h.e(eVar, "viewBinder");
        int indexOf = this.h.indexOf(eVar);
        HomeShelf homeShelf = this.d;
        if (homeShelf != null) {
            b bVar = (b) d.n(homeShelf.b(), indexOf);
            if (bVar != null) {
                dr2 dr2 = this.i;
                HomeShelf homeShelf2 = this.d;
                if (homeShelf2 != null) {
                    dr2.a(homeShelf2.a(), this.a, bVar.c(), indexOf, bVar.a());
                    this.e.d(bVar.a());
                    return;
                }
                h.k("homeShelf");
                throw null;
            }
            return;
        }
        h.k("homeShelf");
        throw null;
    }

    public final void c(HomeShelf homeShelf, int i2) {
        h.e(homeShelf, "homeShelf");
        if (this.h.size() >= homeShelf.b().size()) {
            this.d = homeShelf;
            this.a = i2;
            int i3 = 0;
            for (T t : this.h) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    T t2 = t;
                    HomeShelf homeShelf2 = this.d;
                    if (homeShelf2 != null) {
                        if (homeShelf2.b().size() <= i3) {
                            t2.b();
                        } else {
                            t2.a();
                            HomeShelf homeShelf3 = this.d;
                            if (homeShelf3 != null) {
                                b bVar = homeShelf3.b().get(i3);
                                t2.setTitle(bVar.c());
                                t2.c(h.a(bVar.b().b(), "circular"));
                                t2.d(bVar.b());
                                t2.e();
                                PlayerState playerState = this.c;
                                if (playerState != null ? ar9.c(playerState, bVar.a()) : false) {
                                    t2.g();
                                } else {
                                    t2.e();
                                }
                            } else {
                                h.k("homeShelf");
                                throw null;
                            }
                        }
                        i3 = i4;
                    } else {
                        h.k("homeShelf");
                        throw null;
                    }
                } else {
                    d.L();
                    throw null;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void d() {
        this.b.b(this.f.Q(this.g).subscribe(new h(new HomeShortcutsShelfPresenter$onViewAvailable$1(this))));
    }

    public final void e() {
        this.b.a();
    }
}
