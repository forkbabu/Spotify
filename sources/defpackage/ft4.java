package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.connect.j;
import com.spotify.libs.connect.model.GaiaDevice;
import com.spotify.libs.connect.volume.controllers.p;
import io.reactivex.y;

/* renamed from: ft4  reason: default package */
public class ft4 {
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

    /* renamed from: ft4$a */
    public interface a {
    }

    /* renamed from: ft4$b */
    public interface b {
    }

    public ft4(j jVar, cs0 cs0, p pVar, zca zca, y yVar) {
        this.a = jVar;
        this.b = cs0;
        this.c = pVar;
        this.d = zca;
        this.e = yVar;
    }

    public static void b(ft4 ft4, GaiaDevice gaiaDevice) {
        ft4.getClass();
        boolean isSelf = gaiaDevice.isSelf();
        ft4.j = isSelf;
        boolean z = isSelf || gaiaDevice.supportsVolume();
        if (ft4.i != null) {
            Logger.b("Active device %s supports volume: %b", gaiaDevice.getName(), Boolean.valueOf(z));
            us4.g(((zr4) ft4.i).a, z);
        }
        if (ft4.j) {
            ft4.d(ft4.d.b());
            ft4.d.c(new et4(ft4));
            ft4.g.a();
            return;
        }
        ft4.g.b(ft4.b.d().G0(Float.valueOf(ft4.c.f())).Q(bt4.a).o0(ft4.e).subscribe(new ct4(ft4)));
        ft4.d.d();
    }

    /* access modifiers changed from: private */
    public void d(float f2) {
        Logger.b("New volume: %.2f", Float.valueOf(f2));
        a aVar = this.h;
        if (aVar != null) {
            ((rs4) aVar).a.o(f2);
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
        this.f.b(this.a.p(ft4.class.getSimpleName()).o0(this.e).subscribe(new dt4(this)));
    }

    public void i() {
        this.d.d();
        this.f.a();
        this.g.a();
    }
}
