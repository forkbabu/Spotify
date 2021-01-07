package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.e;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.libs.carmodeengine.util.y;
import defpackage.z6a;
import io.reactivex.s;

/* renamed from: n5a  reason: default package */
public class n5a {
    private final p5a a;
    private final b6a b;
    private final y5a c;
    private final j4a d;
    private final o6a e;
    private final c6a f;
    private final y g;
    private final io.reactivex.y h;
    private final s<Boolean> i;

    n5a(p5a p5a, b6a b6a, j4a j4a, y5a y5a, o6a o6a, c6a c6a, y yVar, io.reactivex.y yVar2, s<Boolean> sVar) {
        this.a = p5a;
        this.b = b6a;
        this.d = j4a;
        this.c = y5a;
        this.e = o6a;
        this.f = c6a;
        this.g = yVar;
        this.h = yVar2;
        this.i = sVar;
    }

    public MobiusLoop.g<c7a, a7a> a(c7a c7a) {
        i5a i5a = i5a.a;
        b6a b6a = this.b;
        o6a o6a = this.e;
        c6a c6a = this.f;
        m f2 = i.f();
        f2.d(z6a.c.class, new f7a(b6a));
        o6a.getClass();
        f2.b(z6a.b.class, new g7a(o6a));
        f2.b(z6a.d.class, new h7a(o6a));
        f2.d(z6a.a.class, new e7a(c6a));
        MobiusLoop.f b2 = i.c(i5a, f2.i()).d(new f5a(this)).b(new e5a(this));
        p5a p5a = this.a;
        j4a j4a = this.d;
        y5a y5a = this.c;
        c6a c6a2 = this.f;
        return z.b(b2.h(i.a(c6a2.b().j0(o7a.a), c6a2.f().j0(j7a.a), p5a.c().j0(i7a.a), j4a.b().j0(n7a.a), y5a.a().j0(l7a.a), this.g.c().j0(k7a.a), this.i.j0(m7a.a))).f(new e("CarModeEngine")), c7a, u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.h);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.h);
    }
}
