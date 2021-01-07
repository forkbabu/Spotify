package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.base.java.logging.Logger;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.providers.h;
import com.spotify.libs.connect.u;
import com.spotify.music.connection.OfflineState;
import com.spotify.music.features.connectui.picker.frictionlessjoin.FrictionlessJoinManager;
import com.spotify.music.features.connectui.picker.frictionlessjoin.model.DeviceExposureStatus;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.a;
import com.spotify.music.features.connectui.picker.frictionlessjoin.ui.b;
import com.spotify.music.features.connectui.picker.ui.ListeningOnView;
import com.spotify.music.features.connectui.picker.ui.e;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.sociallistening.models.JoinType;
import com.spotify.music.sociallistening.models.Participant;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.player.model.PlayerState;
import com.spotify.rxjava2.q;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.util.List;

/* renamed from: us4  reason: default package */
public class us4 {
    private final ws4 a;
    private final ss4 b;
    private final g<PlayerState> c;
    private final sr4 d;
    private final oba e;
    private final ft4 f;
    private final mba g;
    private final cfd h;
    private final y i;
    private final e j;
    private final q k;
    private final com.spotify.music.features.connectui.picker.ui.e l;
    private final wt4 m;
    private final c n;
    private final u o;
    private final yu0 p;
    private final hs0 q;
    private final FrictionlessJoinManager r;
    private final b s;
    private final h t;
    private b.a u;
    s<PlayerState> v;
    boolean w;
    private final q x = new q();

    public us4(ws4 ws4, ss4 ss4, g<PlayerState> gVar, sr4 sr4, oba oba, ft4 ft4, mba mba, cfd cfd, y yVar, e eVar, wt4 wt4, com.spotify.music.features.connectui.picker.ui.e eVar2, c cVar, yu0 yu0, u uVar, hs0 hs0, FrictionlessJoinManager frictionlessJoinManager, b bVar, h hVar) {
        this.a = ws4;
        this.b = ss4;
        this.c = gVar;
        this.d = sr4;
        this.e = oba;
        this.f = ft4;
        this.g = mba;
        this.h = cfd;
        this.i = yVar;
        this.j = eVar;
        this.n = cVar;
        this.o = uVar;
        this.k = new q();
        this.m = wt4;
        this.l = eVar2;
        this.p = yu0;
        this.q = hs0;
        this.r = frictionlessJoinManager;
        this.s = bVar;
        this.t = hVar;
    }

    private void E(com.spotify.music.sociallistening.models.b bVar) {
        e.b bVar2;
        if (f(bVar)) {
            List<Participant> d2 = bVar.d();
            b.a.C0222b bVar3 = new b.a.C0222b(d2);
            y(bVar3);
            this.s.g(bVar3);
            this.l.i(new e.b.a(d2));
            return;
        }
        List<Participant> d3 = bVar.d();
        int size = d3.size();
        b.a.C0221a aVar = new b.a.C0221a(d3);
        y(aVar);
        this.s.g(aVar);
        com.spotify.music.features.connectui.picker.ui.e eVar = this.l;
        if (size > 1) {
            bVar2 = new e.b.a(d3);
        } else {
            bVar2 = new e.b.C0226b(false, 1);
        }
        eVar.i(bVar2);
    }

    static String c(int i2, DeviceType deviceType) {
        StringBuilder W0 = je.W0("devices-list/", i2, "/item/");
        W0.append(deviceType.name());
        return W0.toString();
    }

    private void d() {
        this.s.a();
        this.l.i(new e.b.C0226b(false, 1));
    }

    private static boolean f(com.spotify.music.sociallistening.models.b bVar) {
        return !bVar.h() && bVar.d().size() >= 2;
    }

    public static void g(us4 us4, boolean z) {
        if (z) {
            ((vt0) us4.j.b()).n();
            us4.a.q();
            return;
        }
        us4.a.w();
    }

    public static void h(us4 us4, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c cVar) {
        us4.s.d(cVar.a() == DeviceExposureStatus.EXPOSED);
    }

    public static void i(us4 us4, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c cVar) {
        DeviceExposureStatus deviceExposureStatus = DeviceExposureStatus.EXPOSED;
        DeviceExposureStatus deviceExposureStatus2 = DeviceExposureStatus.NOT_EXPOSABLE;
        com.spotify.music.sociallistening.models.b g2 = us4.r.g();
        boolean z = true;
        if (g2 != null) {
            us4.E(g2);
            if (f(g2)) {
                return;
            }
            if (cVar.a() == deviceExposureStatus2) {
                us4.d();
                return;
            }
            b bVar = us4.s;
            if (cVar.a() != deviceExposureStatus) {
                z = false;
            }
            bVar.d(z);
        } else if (cVar.a() == deviceExposureStatus2) {
            us4.d();
        } else {
            us4.s.b();
            b bVar2 = us4.s;
            if (cVar.a() != deviceExposureStatus) {
                z = false;
            }
            bVar2.d(z);
        }
    }

    public static void k(us4 us4, com.spotify.music.features.connectui.picker.frictionlessjoin.model.c cVar) {
        us4.s.d(cVar.a() != DeviceExposureStatus.NOT_EXPOSED);
    }

    public static void p(us4 us4, com.spotify.music.sociallistening.models.b bVar) {
        us4.getClass();
        kotlin.jvm.internal.h.e(bVar, "$this$isParticipantLeaving");
        if (!(bVar.l() || (!bVar.h() && bVar.d().isEmpty()))) {
            GaiaDevice b2 = us4.t.b();
            if (b2 == null || b2.isSelf()) {
                us4.d();
            } else {
                us4.E(bVar);
            }
        }
    }

    private void y(b.a aVar) {
        GaiaDevice b2 = this.t.b();
        b.a aVar2 = this.u;
        boolean z = aVar2 == null || !aVar2.getClass().equals(aVar.getClass());
        this.u = aVar;
        if (z && b2 != null) {
            if (aVar instanceof b.a.C0222b) {
                ((vt0) this.j.b()).i(b2.getLoggingIdentifier(), b2.getJoinToken());
            }
            if (aVar instanceof b.a.C0221a) {
                ((vt0) this.j.b()).j(b2.getLoggingIdentifier());
            }
        }
    }

    /* access modifiers changed from: private */
    public void z(boolean z) {
        if (this.h.g()) {
            this.b.p0(z);
            this.a.c1();
        } else if (z) {
            this.a.R();
        } else {
            this.a.c1();
        }
    }

    public void A() {
        g<PlayerState> gVar = this.c;
        this.v = je.Z(gVar, gVar);
        ss4 ss4 = this.b;
        ss4.getClass();
        ss4.n0(new vr4(ss4));
        ss4 ss42 = this.b;
        ss42.getClass();
        ss42.g0(new qs4(ss42));
        ss4 ss43 = this.b;
        ss43.getClass();
        ss43.k0(new wr4(ss43));
        this.b.c0(new fs4(this));
        this.b.f0(new hs4(this));
        this.b.i0(new ds4(this));
        this.b.l0(this.h.c());
        this.b.m0(this.h.g());
        ft4 ft4 = this.f;
        ws4 ws4 = this.a;
        ws4.getClass();
        ft4.f(new rs4(ws4));
        this.f.g(new zr4(this));
    }

    public void B() {
        this.x.c();
    }

    public void C() {
        this.b.r0();
        this.f.i();
        this.k.c();
    }

    public void D() {
        this.k.a(this.d.a());
        this.k.a(this.v.o0(this.i).subscribe(new es4(this)));
        this.k.a(this.m.e().o0(this.i).subscribe(new ls4(this)));
        this.k.a(this.m.b().o0(this.i).subscribe(new gs4(this)));
        this.k.a(this.n.a().o0(this.i).subscribe(new ks4(this)));
        this.b.q0();
        this.f.h();
        if (this.q.a()) {
            this.x.a(this.r.a().subscribe(new os4(this)));
        }
    }

    public void F(float f2) {
        this.a.o(f2);
        this.f.e(f2);
        this.g.e(f2);
    }

    public void a(a aVar) {
        this.s.e(aVar);
        this.s.a();
        this.s.f(new js4(this));
        this.s.c(new ms4(this));
    }

    public void b(ListeningOnView listeningOnView) {
        this.l.j(listeningOnView);
    }

    public void e(RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.b);
    }

    public /* synthetic */ void l() {
        this.r.i();
        GaiaDevice b2 = this.t.b();
        if (b2 != null) {
            ((zt0) this.j.a()).g(b2.getLoggingIdentifier());
        }
    }

    public void m(boolean z) {
        GaiaDevice b2;
        if (!this.q.a() || (b2 = this.t.b()) == null) {
            return;
        }
        if (z) {
            this.x.a(this.r.n(b2.getPhysicalIdentifier()).B(this.i).subscribe(new as4(this), new xr4(this)));
            ((zt0) this.j.a()).e(b2.getLoggingIdentifier());
            return;
        }
        this.x.a(this.r.h(b2.getPhysicalIdentifier()).B(this.i).subscribe(new is4(this), new ns4(this)));
        ((zt0) this.j.a()).d(b2.getLoggingIdentifier());
    }

    public /* synthetic */ void n(Throwable th) {
        Logger.e(th, th.getMessage(), new Object[0]);
        this.s.a();
    }

    public /* synthetic */ void o(GaiaDevice gaiaDevice) {
        this.a.a(gaiaDevice, -1);
    }

    public /* synthetic */ void q(GaiaDevice gaiaDevice, int i2) {
        this.e.b(gaiaDevice.getLoggingIdentifier(), je.I0(new StringBuilder(), c(i2, gaiaDevice.getType()), "/context-menu"), InteractionIntent.NAVIGATE, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1);
        ((zt0) this.j.a()).h(gaiaDevice.getLoggingIdentifier(), i2);
        this.a.a(gaiaDevice, i2);
    }

    public /* synthetic */ void r(GaiaDevice gaiaDevice, int i2) {
        this.r.l(gaiaDevice.getJoinToken(), false, JoinType.c);
        Logger.b("Successfully joined to session", new Object[0]);
        ((zt0) this.j.a()).f(gaiaDevice.getLoggingIdentifier(), gaiaDevice.getJoinToken(), i2);
    }

    public /* synthetic */ void s(GaiaDevice gaiaDevice, int i2) {
        if (this.o.b() && !gaiaDevice.isSelf()) {
            this.p.c(gaiaDevice.getPhysicalIdentifier(), bs4.a);
        }
        this.e.b(gaiaDevice.getLoggingIdentifier(), c(i2, gaiaDevice.getType()), InteractionIntent.CONNECT, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1);
        if (this.w) {
            this.a.p();
            return;
        }
        if (gaiaDevice.isSelf()) {
            ((zt0) this.j.a()).k();
            this.k.a(this.d.b());
        } else {
            ((zt0) this.j.a()).n(gaiaDevice.getLoggingIdentifier(), i2);
            this.k.a(this.d.c(gaiaDevice));
        }
        this.a.y();
    }

    public /* synthetic */ void t(Throwable th) {
        this.s.d(false);
        Logger.e(th, th.getMessage(), new Object[0]);
    }

    public /* synthetic */ void u(Throwable th) {
        this.s.d(true);
        Logger.e(th, th.getMessage(), new Object[0]);
    }

    public void v(GaiaDevice gaiaDevice) {
        this.l.d(gaiaDevice);
        this.l.f(gaiaDevice);
        this.l.g(gaiaDevice);
        this.l.b(new ps4(this));
        if (!this.q.a()) {
            return;
        }
        if (gaiaDevice.isSelf()) {
            d();
        } else {
            this.x.a(this.r.e(gaiaDevice.getPhysicalIdentifier()).B(this.i).subscribe(new cs4(this), new yr4(this)));
        }
    }

    public /* synthetic */ void w(OfflineState offlineState) {
        z(!offlineState.offline());
    }

    public void x(PlayerState playerState) {
        boolean z = false;
        boolean f2 = playerState.track().isPresent() ? kxd.f(playerState.track().get()) : false;
        this.w = !playerState.track().isPresent();
        this.b.j0(f2);
        this.b.b0();
        if (playerState.isPaused()) {
            this.l.a();
        } else {
            this.l.h();
        }
        if (playerState.track().isPresent() && kxd.m(playerState.track().get())) {
            z = true;
        }
        if (z) {
            this.l.e();
        } else {
            this.l.c();
        }
    }
}
