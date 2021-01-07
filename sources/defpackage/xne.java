package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.superbird.ota.model.f;
import defpackage.noe;
import io.reactivex.x;

/* renamed from: xne  reason: default package */
public class xne {
    private final x<f> a;

    public xne(x<f> xVar) {
        this.a = xVar;
    }

    public MobiusLoop.g<poe, ooe> a(poe poe, vne vne, yoe yoe) {
        ine ine = ine.a;
        x<f> xVar = this.a;
        m f = i.f();
        f.h(noe.b.class, woe.a);
        f.d(noe.c.class, new toe(xVar));
        f.d(noe.d.class, new xoe(xVar));
        f.d(noe.e.class, soe.a);
        f.d(noe.a.class, new roe(vne));
        return z42.b(i.c(ine, f.i()).h(i.a(yoe.b())).f(b.g("Superbird OTA")), poe);
    }
}
