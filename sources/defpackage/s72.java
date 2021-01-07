package defpackage;

import com.google.common.base.Optional;
import com.google.protobuf.u;
import com.spotify.messages.BetamaxCDN;
import com.spotify.mobile.android.video.exo.n;
import java.io.IOException;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.p;
import org.json.JSONObject;

/* renamed from: s72  reason: default package */
public class s72 extends p {
    private final gl0<u> b;
    private final String c;
    private final n d;
    private final String e;
    private Optional<String> f = Optional.absent();
    private Optional<String> g = Optional.absent();
    private int h;
    private Optional<String> i = Optional.absent();
    private Optional<String> j = Optional.absent();
    private Optional<String> k = Optional.absent();
    private Optional<String> l = Optional.absent();
    private Optional<String> m = Optional.absent();
    private long n;
    private long o;
    private Optional<String> p = Optional.absent();
    private Optional<String> q = Optional.absent();

    public s72(gl0<u> gl0, n nVar, String str, String str2) {
        this.b = gl0;
        this.d = nVar;
        this.e = str;
        this.c = str2;
    }

    private void h() {
        String jSONObject = new JSONObject(this.d.e()).toString();
        BetamaxCDN.b x = BetamaxCDN.x();
        x.n(this.f.or((Optional<String>) ""));
        x.v(this.g.or((Optional<String>) ""));
        x.t(this.h);
        x.w(this.i.or((Optional<String>) ""));
        x.u(this.j.or((Optional<String>) ""));
        x.x(this.k.or((Optional<String>) ""));
        x.y(this.l.or((Optional<String>) ""));
        x.z(this.m.or((Optional<String>) ""));
        x.o(this.n);
        x.p(this.o);
        x.q(this.p.or((Optional<String>) ""));
        x.r(this.q.or((Optional<String>) ""));
        x.m(jSONObject);
        x.s(this.e);
        this.b.c((BetamaxCDN) x.build());
    }

    @Override // okhttp3.p
    public void a(e eVar) {
        h();
    }

    @Override // okhttp3.p
    public void b(e eVar, IOException iOException) {
        h();
    }

    @Override // okhttp3.p
    public void c(e eVar) {
        this.q = Optional.fromNullable(this.c.equals(eVar.i().k().toString()) ? "playlist" : "segment");
        this.j = Optional.fromNullable(eVar.i().k().toString());
        this.f = Optional.fromNullable(eVar.i().k().k());
        this.i = Optional.fromNullable(eVar.i().g());
    }

    @Override // okhttp3.p
    public void e(e eVar, long j2) {
        this.n = j2;
    }

    @Override // okhttp3.p
    public void g(e eVar, d0 d0Var) {
        this.g = Optional.fromNullable(d0Var.C().c("User-Agent"));
        this.o = d0Var.B() - d0Var.D();
        this.k = Optional.fromNullable(d0Var.w().toString());
        this.l = Optional.fromNullable(d0Var.h("X-Cache"));
        this.m = Optional.fromNullable(d0Var.h("X-Cache-Hits"));
        this.h = d0Var.f();
        this.p = Optional.fromNullable(d0Var.C().c("X-rid"));
    }
}
