package defpackage;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.base.Supplier;
import com.spotify.instrumentation.InteractionIntent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.connect.instrumentation.e;
import com.spotify.libs.connect.model.DeviceType;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.y;
import java.lang.ref.WeakReference;

/* renamed from: fp4  reason: default package */
public class fp4 {
    private final WeakReference<hp4> a;
    private final dp4 b;
    private final g<PlayerState> c;
    private final qo4 d;
    private final oba e;
    private final Supplier<Integer> f;
    private final zp4 g;
    private final nq4 h;
    private final mba i;
    private final cfd j;
    private final y k;
    private final e l;
    private final io.reactivex.disposables.a m = new io.reactivex.disposables.a();
    s<PlayerState> n;
    boolean o;

    /* renamed from: fp4$a */
    class a extends GridLayoutManager.b {
        a() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int e(int i) {
            return fp4.this.b.c0(i);
        }
    }

    public fp4(hp4 hp4, dp4 dp4, g<PlayerState> gVar, qo4 qo4, oba oba, Supplier<Integer> supplier, zp4 zp4, nq4 nq4, mba mba, cfd cfd, y yVar, e eVar) {
        this.a = new WeakReference<>(hp4);
        this.b = dp4;
        this.c = gVar;
        this.d = qo4;
        this.e = oba;
        this.f = supplier;
        this.g = zp4;
        this.h = nq4;
        this.i = mba;
        this.j = cfd;
        this.k = yVar;
        this.l = eVar;
    }

    static String b(int i2, DeviceType deviceType) {
        StringBuilder W0 = je.W0("devices-list/", i2, "/item/");
        W0.append(deviceType.name());
        return W0.toString();
    }

    public static void e(fp4 fp4) {
        hp4 hp4 = fp4.a.get();
        if (hp4 != null) {
            fp4.q(hp4);
        }
    }

    public static void f(fp4 fp4, boolean z) {
        hp4 hp4 = fp4.a.get();
        if (hp4 != null) {
            fp4.k(z, hp4);
        }
    }

    public static void g(fp4 fp4, hp4 hp4) {
        fp4.b.U(true);
        fp4.b.n0(hp4.l());
        fp4.b.s0(new yo4(fp4));
        fp4.b.k0(new to4(fp4));
        fp4.b.j0(new cp4(hp4));
        dp4 dp4 = fp4.b;
        dp4.getClass();
        dp4.q0(new bp4(dp4));
        fp4.b.f0(fp4.f);
        fp4.b.g0(new ap4(fp4));
        fp4.b.i0(new zo4(fp4));
        fp4.b.m0(new xo4(fp4));
        fp4.b.r0(fp4.j.c());
    }

    public static void h(fp4 fp4, float f2) {
        hp4 hp4 = fp4.a.get();
        if (hp4 != null) {
            hp4.o(f2);
        }
    }

    public static void i(fp4 fp4, boolean z) {
        hp4 hp4 = fp4.a.get();
        if (hp4 != null) {
            fp4.p(z, hp4);
        }
    }

    public int c() {
        return this.f.get().intValue();
    }

    public void d(RecyclerView recyclerView, GridLayoutManager gridLayoutManager) {
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(this.b);
        gridLayoutManager.K2(new a());
    }

    public void j(com.spotify.libs.connect.model.a aVar, int i2, hp4 hp4) {
        int i3 = i2 + 1;
        this.e.b(aVar.getLoggingIdentifier(), je.I0(new StringBuilder(), b(i3, aVar.getType()), "/context-menu"), InteractionIntent.NAVIGATE, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1);
        hp4.a((GaiaDevice) aVar, i3);
    }

    public /* synthetic */ void k(boolean z, hp4 hp4) {
        if (z) {
            ((vt0) this.l.b()).n();
            hp4.q();
            return;
        }
        hp4.w();
    }

    public void l(com.spotify.libs.connect.model.a aVar, int i2) {
        this.e.b(aVar.getLoggingIdentifier(), b(i2 + 1, aVar.getType()), InteractionIntent.CONNECT, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1);
        if (this.o) {
            hp4 hp4 = this.a.get();
            if (hp4 != null) {
                hp4.p();
                return;
            }
            return;
        }
        this.m.b(this.d.c(aVar));
        hp4 hp42 = this.a.get();
        if (hp42 != null) {
            hp42.y();
        }
    }

    public void m(com.spotify.libs.connect.model.a aVar, int i2) {
        hp4 hp4 = this.a.get();
        if (hp4 != null) {
            j(aVar, i2, hp4);
        }
    }

    public void n(String str) {
        this.e.b("local_device", b(0, this.g.a()), InteractionIntent.CONNECT, PageIdentifiers.CONNECT_DEVICEPICKER, ViewUris.z1);
        ((zt0) this.l.a()).k();
        this.m.b(this.d.b());
        hp4 hp4 = this.a.get();
        if (hp4 != null) {
            hp4.y();
        }
    }

    public void o(PlayerState playerState) {
        boolean z;
        boolean z2 = false;
        if (playerState.track().isPresent()) {
            z2 = kxd.f(playerState.track().get());
            z = kxd.m(playerState.track().get());
        } else {
            z = false;
        }
        this.o = !playerState.track().isPresent();
        this.b.p0(z2, z);
        hp4 hp4 = this.a.get();
        if (hp4 != null) {
            q(hp4);
        }
    }

    public /* synthetic */ void p(boolean z, hp4 hp4) {
        int l2 = hp4.l();
        this.b.l0(!z);
        this.b.v0(l2);
    }

    public /* synthetic */ void q(hp4 hp4) {
        this.b.v0(hp4.l());
    }

    public void r() {
        g<PlayerState> gVar = this.c;
        this.n = je.Z(gVar, gVar);
        hp4 hp4 = this.a.get();
        if (hp4 != null) {
            g(this, hp4);
        }
        this.h.f(new wo4(this));
        this.h.g(new vo4(this));
    }

    public void s() {
        this.b.u0();
        this.h.i();
        this.m.f();
    }

    public void t() {
        this.m.b(this.d.a());
        this.m.b(this.n.o0(this.k).subscribe(new uo4(this)));
        this.b.t0();
        this.h.h();
    }

    public void u(float f2) {
        hp4 hp4 = this.a.get();
        if (hp4 != null) {
            hp4.o(f2);
        }
        this.h.e(f2);
        this.i.e(f2);
    }
}
