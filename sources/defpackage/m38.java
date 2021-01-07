package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.z;
import com.spotify.music.connection.l;
import defpackage.x38;

/* renamed from: m38  reason: default package */
public class m38 {
    private final l38 a;
    private final g48 b;
    private final l c;

    public m38(l38 l38, g48 g48, l lVar) {
        this.a = l38;
        this.b = g48;
        this.c = lVar;
    }

    public MobiusLoop.g<a48, y38> a(a48 a48) {
        k38 k38 = k38.a;
        l38 l38 = this.a;
        g48 g48 = this.b;
        l lVar = this.c;
        m f = i.f();
        f.h(x38.a.class, new f48(lVar, l38, g48));
        return z.b(i.c(k38, f.i()).e(j38.a).h(i.a(this.c.b().Q(i48.a).j0(h48.a))).b(h38.a).d(g38.a).f(b.g("Radio Hub Feature")), a48, u92.b());
    }
}
