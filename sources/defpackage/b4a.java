package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.e;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.libs.bluetooth.l;
import defpackage.u4a;

/* renamed from: b4a  reason: default package */
public class b4a {
    private final m4a a;
    private final l b;
    private final o4a c;
    private final y3a d;
    private final g4a e;

    public b4a(m4a m4a, l lVar, o4a o4a, y3a y3a, g4a g4a) {
        this.a = m4a;
        this.b = lVar;
        this.c = o4a;
        this.d = y3a;
        this.e = g4a;
    }

    public MobiusLoop.g<w4a, v4a> a(w4a w4a) {
        m4a m4a = this.a;
        l lVar = this.b;
        o4a o4a = this.c;
        y3a y3a = this.d;
        g4a g4a = this.e;
        u3a u3a = u3a.a;
        m f = i.f();
        f.d(u4a.a.class, new x4a(m4a));
        return z.a(i.c(u3a, f.i()).h(i.a(lVar.c().Q(b5a.a).j0(c5a.a), o4a.b().Q(z4a.a).j0(a5a.a), y3a.a().j0(d5a.a), g4a.b().j0(y4a.a))).f(new e("CarDetection")), w4a, w3a.a, u92.b());
    }
}
