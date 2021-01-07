package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.y;

/* renamed from: nq4  reason: default package */
public class nq4 {
    private final j a;
    private final cs0 b;
    private final p c;
    private final zca d;
    private final y e;
    private final com.spotify.rxjava2.p f = new com.spotify.rxjava2.p();
    private final com.spotify.rxjava2.p g = new com.spotify.rxjava2.p();
    private a h;
    private b i;
    private boolean j = true;

    /* renamed from: nq4$a */
    public interface a {
    }

    /* renamed from: nq4$b */
    public interface b {
    }

    public nq4(j jVar, cs0 cs0, p pVar, zca zca, y yVar) {
        this.a = jVar;
        this.b = cs0;
        this.c = pVar;
        this.d = zca;
        this.e = yVar;
    }

    public static void b(nq4 nq4, GaiaDevice gaiaDevice) {
        nq4.getClass();
        boolean isSelf = gaiaDevice.isSelf();
        nq4.j = isSelf;
        boolean z = isSelf || gaiaDevice.supportsVolume();
        if (nq4.i != null) {
            Logger.b("Active device %s supports volume: %b", gaiaDevice.getName(), Boolean.valueOf(z));
            fp4.f(((vo4) nq4.i).a, z);
        }
        if (nq4.j) {
            nq4.d(nq4.d.b());
            nq4.d.c(new iq4(nq4));
            nq4.g.a();
            return;
        }
        nq4.g.b(nq4.b.d().G0(Float.valueOf(nq4.c.f())).Q(kq4.a).o0(nq4.e).subscribe(new lq4(nq4)));
        nq4.d.d();
    }

    /* access modifiers changed from: private */
    public void d(float f2) {
        Logger.b("New volume: %.2f", Float.valueOf(f2));
        a aVar = this.h;
        if (aVar != null) {
            fp4.h(((wo4) aVar).a, f2);
        }
    }

    public void e(float f2) {
        if (this.j) {
            this.d.e(f2);
        } else {
            this.c.g(Float.valueOf(f2));
        }
    }

    public void f(a aVar) {
        this.h = aVar;
    }

    public void g(b bVar) {
        this.i = bVar;
    }

    public void h() {
        this.f.b(this.a.p(nq4.class.getSimpleName()).o0(this.e).subscribe(new jq4(this)));
    }

    public void i() {
        this.d.d();
        this.f.a();
        this.g.a();
    }
}
