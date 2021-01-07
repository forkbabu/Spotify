package defpackage;

import com.spotify.mobile.android.sso.bakery.e;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import defpackage.qv1;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: rw1  reason: default package */
public final class rw1 {
    private static final long f = TimeUnit.MINUTES.toMillis(2);
    public static final /* synthetic */ int g = 0;
    private final y a;
    private final y b;
    private final yn1 c;
    private final e d;
    private final pw1 e;

    rw1(y yVar, y yVar2, yn1 yn1, e eVar, pw1 pw1) {
        this.a = yVar;
        this.b = yVar2;
        this.c = yn1;
        this.d = eVar;
        this.e = pw1;
    }

    public /* synthetic */ v a(qv1.i iVar) {
        return s.i0(rv1.a()).C(f, TimeUnit.MILLISECONDS, this.a);
    }

    public w<qv1, rv1> b(uw1 uw1) {
        m f2 = i.f();
        uw1.getClass();
        f2.b(qv1.j.class, new nw1(uw1));
        f2.e(qv1.f.class, new zv1(uw1), this.b);
        f2.e(qv1.g.class, new kw1(uw1), this.b);
        f2.e(qv1.h.class, new ew1(uw1), this.b);
        f2.e(qv1.c.class, new aw1(uw1), this.b);
        f2.e(qv1.a.class, new bw1(uw1), this.b);
        f2.e(qv1.b.class, new jw1(uw1), this.b);
        f2.h(qv1.e.class, new lw1(this.d));
        pw1 pw1 = this.e;
        pw1.getClass();
        f2.h(qv1.d.class, new yv1(pw1));
        f2.h(qv1.i.class, new dw1(this));
        f2.h(qv1.k.class, new iw1(this.c));
        return f2.i();
    }
}
