package com.spotify.music.libs.connect;

import com.spotify.libs.connect.ConnectManager;
import com.spotify.libs.connect.h;
import com.spotify.libs.connect.l;
import com.spotify.libs.connect.picker.view.d;
import com.spotify.libs.connect.picker.view.g;
import com.spotify.player.model.PlayerState;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;
import io.reactivex.y;

public class n implements g {
    private final l a;
    private final i b;
    private final s<PlayerState> c;
    private final h d;
    private final k4d e;
    private final y f;
    private final io.reactivex.disposables.a g = new io.reactivex.disposables.a();
    private final hg0<ConnectManager> h = new a();
    private final io.reactivex.functions.g<u3<d, com.spotify.music.sociallistening.models.b>> i = new b();

    class a implements hg0<ConnectManager> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // defpackage.hg0
        public void l(ConnectManager connectManager) {
            n.this.a.r().a();
            io.reactivex.disposables.a aVar = n.this.g;
            s o0 = s.n(n.this.d.a(n.this.a.r()), n.this.e.a(), a.a).o0(n.this.f);
            io.reactivex.functions.g gVar = n.this.i;
            n.this.getClass();
            aVar.b(o0.subscribe(gVar, e.a));
        }

        @Override // defpackage.hg0
        public void onDisconnected() {
        }
    }

    class b implements io.reactivex.functions.g<u3<d, com.spotify.music.sociallistening.models.b>> {
        b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.functions.g
        public void accept(u3<d, com.spotify.music.sociallistening.models.b> u3Var) {
            u3<d, com.spotify.music.sociallistening.models.b> u3Var2 = u3Var;
            F f = u3Var2.a;
            f.getClass();
            F f2 = f;
            S s = u3Var2.b;
            s.getClass();
            n.this.b.c(f2.b(), f2.a(), f2.c(), f2.e(), s);
        }
    }

    public n(i iVar, l lVar, io.reactivex.g<PlayerState> gVar, h hVar, k4d k4d, y yVar) {
        this.a = lVar;
        this.b = iVar;
        this.c = new v(gVar);
        this.d = hVar;
        this.e = k4d;
        this.f = yVar;
    }

    public static void j(n nVar, PlayerState playerState) {
        nVar.getClass();
        nVar.b.b(playerState.restrictions().disallowTransferringPlaybackReasons().isEmpty());
    }

    @Override // com.spotify.libs.connect.picker.view.g
    public void d() {
        this.g.f();
        this.a.j();
        this.a.q(this.h);
    }

    @Override // com.spotify.libs.connect.picker.view.g
    public void f() {
        this.a.p(this.h);
        this.a.i();
        this.g.b(this.c.o0(this.f).subscribe(new c(this), new d(this)));
    }

    public /* synthetic */ void k(Throwable th) {
        this.b.b(false);
    }
}
