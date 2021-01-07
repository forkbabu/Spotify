package defpackage;

import android.os.Build;
import com.spotify.mobile.android.service.plugininterfaces.b;
import com.spotify.mobile.android.service.plugininterfaces.d;
import com.spotify.remoteconfig.z6;
import com.spotify.rxjava2.q;
import io.reactivex.s;
import io.reactivex.z;

/* renamed from: cw8  reason: default package */
public class cw8 implements d, b {
    private final aw8 a;
    private final ajf<ua1> b;
    private final uv8 c;
    private final wv8 f;
    private final z<p62> n;
    private final l6a o;
    private final ajf<z6> p;
    private final q q = new q();

    cw8(aw8 aw8, ajf<ua1> ajf, wv8 wv8, uv8 uv8, z<p62> zVar, l6a l6a, ajf<z6> ajf2) {
        this.a = aw8;
        this.b = ajf;
        this.f = wv8;
        this.c = uv8;
        this.n = zVar;
        this.o = l6a;
        this.p = ajf2;
    }

    public static void b(cw8 cw8, p62 p62) {
        cw8.a.a(p62, cw8.p.get().c());
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void a() {
        this.f.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.b
    public void c() {
        this.f.d();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void d() {
        this.c.b();
        this.q.a(this.n.subscribe(new tv8(this)));
        q qVar = this.q;
        s<Boolean> b2 = this.o.b();
        aw8 aw8 = this.a;
        aw8.getClass();
        qVar.a(b2.subscribe(new qv8(aw8)));
        if (this.p.get().c() && Build.VERSION.SDK_INT >= 18) {
            this.b.get().d(this.p.get().a());
        }
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public void g() {
        if (this.p.get().c()) {
            this.b.get().j();
        }
        this.q.c();
        this.c.c();
    }

    @Override // com.spotify.mobile.android.service.plugininterfaces.d
    public String name() {
        return "BetamaxPlayer";
    }
}
