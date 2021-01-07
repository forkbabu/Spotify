package com.spotify.mobile.android.service.media;

import android.os.Binder;
import com.spotify.mobile.android.service.media.error.c;
import com.spotify.mobile.android.service.media.search.e;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.p;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;

public class f2 implements e2 {
    private final g<SessionState> a;
    private final g<PlayerState> b;
    private final jz1 c;
    private final c d;
    private final w2 e;
    private final cl1 f;
    private final hv3 g;
    private final w1 h;
    private final ik1 i;
    private final b2 j;
    private final k2 k;
    private final q2 l;
    private final e m;
    private final p2 n;
    private final mk1 o;
    private final o4a p;
    private final a q = new a();
    private final p r = new p();
    private final y s;
    private boolean t;

    public class a extends Binder implements v1 {
        public a() {
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public ik1 A3() {
            return f2.this.i;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public p2 C0() {
            return f2.this.n;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public c I2() {
            return f2.this.d;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public q2 K0() {
            return f2.this.l;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public w1 T() {
            return f2.this.h;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public t2 Z1(yda yda) {
            return new u2(f2.this.b, yda, f2.this.g, f2.this.e, new pc1(f2.this.c), f2.this.p);
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public i2 Z2() {
            return f2.this.k;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public g<SessionState> a0() {
            return f2.this.a;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public e c3() {
            return f2.this.m;
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public s<lk1> i1() {
            return f2.this.o.a();
        }

        @Override // com.spotify.mobile.android.service.media.v1
        public b2 n2() {
            return f2.this.j;
        }
    }

    public f2(y yVar, g<SessionState> gVar, g<PlayerState> gVar2, jz1 jz1, hv3 hv3, w1 w1Var, ik1 ik1, b2 b2Var, k2 k2Var, q2 q2Var, e eVar, p2 p2Var, c cVar, w2 w2Var, cl1 cl1, mk1 mk1, o4a o4a) {
        this.s = yVar;
        this.a = gVar;
        this.b = gVar2;
        this.c = jz1;
        this.g = hv3;
        this.h = w1Var;
        this.i = ik1;
        this.j = b2Var;
        this.k = k2Var;
        this.l = q2Var;
        this.m = eVar;
        this.n = p2Var;
        this.d = cVar;
        this.e = w2Var;
        this.f = cl1;
        this.o = mk1;
        this.p = o4a;
    }

    @Override // com.spotify.mobile.android.service.media.e2
    public void a() {
        this.i.f();
        this.r.b(this.a.Q(this.s).subscribe(new w(this), v.a));
    }

    @Override // com.spotify.mobile.android.service.media.e2
    public v1 g() {
        return this.q;
    }

    @Override // com.spotify.mobile.android.service.media.e2
    public void j() {
        if (!this.t) {
            this.r.a();
            this.i.d();
            this.k.d();
            this.t = true;
        }
    }

    public /* synthetic */ void s(SessionState sessionState) {
        if (sessionState.loggedIn()) {
            this.f.start();
            this.i.start();
            this.n.start();
            return;
        }
        this.f.stop();
        this.i.stop();
        this.n.stop();
    }
}
