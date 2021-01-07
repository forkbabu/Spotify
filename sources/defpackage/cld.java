package defpackage;

import com.google.protobuf.u;
import com.spotify.messages.CarThingConnectDisconnectEvent;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.g7;
import com.spotify.superbird.pitstop.audioconnectivity.g;
import io.reactivex.disposables.a;
import io.reactivex.l;
import io.reactivex.s;

/* renamed from: cld  reason: default package */
public class cld implements d {
    private final g7 a;
    private final vne b;
    private final npe c;
    private final a f = new a();
    private final s<Boolean> n;
    private final l<String> o;
    private final com.spotify.superbird.pitstop.accessoryconnectivity.a p;
    private final com.spotify.superbird.pitstop.battery.a q;
    private final g r;
    private final ekd s;
    private final gl0<u> t;

    public cld(g7 g7Var, vne vne, npe npe, s<Boolean> sVar, l<String> lVar, com.spotify.superbird.pitstop.accessoryconnectivity.a aVar, com.spotify.superbird.pitstop.battery.a aVar2, g gVar, ekd ekd, gl0<u> gl0) {
        this.a = g7Var;
        this.b = vne;
        this.c = npe;
        this.n = sVar;
        this.o = lVar;
        this.p = aVar;
        this.q = aVar2;
        this.r = gVar;
        this.s = ekd;
        this.t = gl0;
    }

    public void a(Boolean bool) {
        if (bool.booleanValue()) {
            gl0<u> gl0 = this.t;
            CarThingConnectDisconnectEvent.b i = CarThingConnectDisconnectEvent.i();
            i.m(true);
            gl0.c(i.build());
            this.q.c();
            this.r.d();
            this.p.e();
            a aVar = this.f;
            l<String> lVar = this.o;
            ekd ekd = this.s;
            ekd.getClass();
            aVar.b(lVar.subscribe(new pkd(ekd)));
            return;
        }
        gl0<u> gl02 = this.t;
        CarThingConnectDisconnectEvent.b i2 = CarThingConnectDisconnectEvent.i();
        i2.m(false);
        gl02.c(i2.build());
        this.q.d();
        this.r.e();
        this.p.f();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        if (this.a.b()) {
            this.c.e();
            this.f.b(this.n.subscribe(new xkd(this), wkd.a));
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.a.b()) {
            this.b.o();
            this.c.f();
            this.q.d();
            this.f.f();
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "SuperbirdPlugin";
    }
}
