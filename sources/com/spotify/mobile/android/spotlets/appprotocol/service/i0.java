package com.spotify.mobile.android.spotlets.appprotocol.service;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.service.media.v1;
import com.spotify.mobile.android.service.media.z1;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.appprotocol.d4;
import com.spotify.mobile.android.spotlets.appprotocol.e4;
import com.spotify.mobile.android.spotlets.appprotocol.i4;
import com.spotify.mobile.android.spotlets.appprotocol.image.c;
import com.spotify.mobile.android.spotlets.appprotocol.t3;
import com.spotify.mobile.android.spotlets.appprotocol.u3;
import com.spotify.mobile.android.spotlets.appprotocol.v3;
import com.spotify.mobile.android.spotlets.appprotocol.w3;
import com.spotify.mobile.android.spotlets.appprotocol.y3;
import com.spotify.mobile.android.spotlets.appprotocol.z3;
import com.spotify.mobile.android.util.t;
import com.spotify.music.appprotocol.api.b;
import com.spotify.music.appprotocol.volume.k;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.json.g;
import com.spotify.music.libs.bluetooth.CategorizerResponse;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.g7;
import io.reactivex.y;
import java.util.Map;
import java.util.concurrent.Executors;

public class i0 implements hg0<v1>, d4.a {
    private final g A;
    private final pea B;
    private final y C;
    private final y D;
    private final t E;
    private final gf2 F;
    private final g7 G;
    private final a a;
    private final k0 b;
    private final u3 c;
    private final cqe f;
    private final String n;
    private final Handler o = new Handler(Looper.getMainLooper());
    private w3 p;
    private final z1 q;
    private final Context r;
    private final ls1 s;
    private final wlf<c> t;
    private final qq1 u;
    private final kd0 v;
    private final CategorizerResponse w;
    private final w x;
    private final io.reactivex.g<SessionState> y;
    private final io.reactivex.g<PlayerState> z;

    /* access modifiers changed from: package-private */
    public interface a {
        void c(i0 i0Var);

        void d(i0 i0Var);
    }

    public i0(Context context, ls1 ls1, wlf<c> wlf, qq1 qq1, y yVar, y yVar2, k0 k0Var, kd0 kd0, u3 u3Var, cqe cqe, String str, a aVar, CategorizerResponse categorizerResponse, t tVar, w wVar, io.reactivex.g<SessionState> gVar, io.reactivex.g<PlayerState> gVar2, g gVar3, gf2 gf2, g7 g7Var, pea pea, z1 z1Var) {
        this.r = context;
        this.s = ls1;
        this.b = k0Var;
        this.c = u3Var;
        this.f = cqe;
        this.n = str;
        this.a = aVar;
        this.t = wlf;
        this.u = qq1;
        this.v = kd0;
        this.w = categorizerResponse;
        this.x = wVar;
        this.y = gVar;
        this.z = gVar2;
        this.A = gVar3;
        this.B = pea;
        this.q = z1Var;
        this.C = yVar;
        this.D = yVar2;
        this.E = tVar;
        this.F = gf2;
        this.G = g7Var;
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.d4.a
    public void a(w3 w3Var) {
        this.o.post(new s(this));
    }

    @Override // com.spotify.mobile.android.spotlets.appprotocol.d4.a
    public void b(w3 w3Var, boolean z2) {
        if (z2) {
            this.o.post(new v(this));
        } else {
            this.o.post(new u(this));
        }
    }

    public String c() {
        return this.n;
    }

    public /* synthetic */ void d() {
        this.a.c(this);
    }

    public /* synthetic */ void e() {
        this.a.d(this);
    }

    public /* synthetic */ void f() {
        this.a.d(this);
    }

    public /* synthetic */ void g() {
        this.a.d(this);
    }

    public void h() {
        this.q.p(this);
        this.q.i();
    }

    public void i() {
        if (this.q.l()) {
            this.q.q(this);
            this.q.j();
        }
        w3 w3Var = this.p;
        if (w3Var != null && w3Var.d() != 2) {
            this.p.q();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // defpackage.hg0
    public void l(v1 v1Var) {
        v1 v1Var2 = v1Var;
        u3 u3Var = this.c;
        qq1 qq1 = this.u;
        i4 i4Var = new i4(new pq1(qq1.a()), u3Var, Executors.newSingleThreadExecutor(), this.D);
        e4 e4Var = new e4(this.r, this.s, v1Var2, new z3(b.b(0, 1, 2, 4, 8)), this.t.get(), null, this.C, this.v, this.x, this.y, this.z, this.f, this.B);
        w3 w3Var = new w3((t3) i4Var, e4Var, (Map<String, h0>) ImmutableMap.of("wampcra", new fq1(i4Var, this.f, this.A)), true, "bluetooth", "inter_app", this.w, this.b);
        this.p = w3Var;
        i4Var.t(new y3(new z(w3Var), new y(e4Var), new com.spotify.mobile.android.spotlets.appprotocol.util.b(w3Var), new v3(new w(e4Var))));
        if (this.G.b()) {
            this.F.b();
            w3 w3Var2 = this.p;
            w3Var2.getClass();
            i4Var.l("com.spotify.superbird", new y3(new z(w3Var2), new y(e4Var), new com.spotify.mobile.android.spotlets.appprotocol.util.b(this.p), this.F));
        }
        k kVar = new k(v1Var2, this.y, new a(e4Var), this.B);
        w3 w3Var3 = this.p;
        w3Var3.getClass();
        i4Var.l("com.spotify.volume", new y3(new z(w3Var3), t.a, new com.spotify.mobile.android.spotlets.appprotocol.util.b(this.p), kVar));
        i4Var.u(new d4(this.p, i4Var, this.b, this, this.E, this.f));
        this.c.start();
    }

    @Override // defpackage.hg0
    public void onDisconnected() {
        if (this.G.b()) {
            this.F.c();
        }
        i();
        this.o.post(new x(this));
    }
}
