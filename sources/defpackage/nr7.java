package defpackage;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.mobius.z;
import com.spotify.music.features.profile.entity.v;
import com.spotify.music.navigation.t;
import com.spotify.remoteconfig.s6;
import defpackage.fs7;
import defpackage.hs7;
import io.reactivex.s;
import io.reactivex.y;

/* renamed from: nr7  reason: default package */
public class nr7 {
    private final y a;
    private final y b;
    private final y c;
    private final t d;
    private final v e;
    private final at7 f;
    private final txc g;
    private final s6 h;

    public nr7(y yVar, y yVar2, y yVar3, t tVar, v vVar, at7 at7, txc txc, s6 s6Var) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yVar3;
        this.d = tVar;
        this.e = vVar;
        this.f = at7;
        this.g = txc;
        this.h = s6Var;
    }

    public MobiusLoop.g<hs7, gs7> a(s<np7> sVar) {
        ir7 ir7 = ir7.a;
        y yVar = this.a;
        t tVar = this.d;
        v vVar = this.e;
        at7 at7 = this.f;
        m f2 = i.f();
        f2.h(fs7.g.class, new os7(at7));
        f2.e(fs7.a.class, new is7(vVar), yVar);
        f2.e(fs7.d.class, new js7(vVar), yVar);
        f2.e(fs7.b.class, new ps7(vVar), yVar);
        f2.e(fs7.c.class, new ls7(vVar), yVar);
        f2.e(fs7.e.class, new ms7(vVar), yVar);
        f2.e(fs7.f.class, new ns7(tVar), yVar);
        MobiusLoop.f f3 = i.c(ir7, f2.i()).h(i.a(sVar.j0(rs7.a), this.g.a("offline").j0(new qs7("1")).j0(ss7.a))).b(new lq7(this)).d(new kq7(this)).f(b.g("profile entity view"));
        hs7.a j = hs7.a.j();
        j.e(this.h.b());
        return z.b(f3, j.a(), u92.b());
    }

    public /* synthetic */ ia2 b() {
        return new o(this.b);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.c);
    }
}
