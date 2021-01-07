package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import defpackage.cdd;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;

/* renamed from: xcd  reason: default package */
public class xcd {
    private final f4d a;
    private final g<SessionState> b;
    private final y c;
    private final y d;
    private final y e;

    /* renamed from: xcd$a */
    class a implements Callable<v<? extends edd>> {
        edd a;
        final /* synthetic */ edd b;

        a(edd edd) {
            this.b = edd;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends edd> call() {
            return s.i0(ddd.a()).q(i.d(xcd.a(xcd.this), (edd) MoreObjects.firstNonNull(this.a, this.b))).N(new tcd(this));
        }
    }

    public xcd(f4d f4d, g<SessionState> gVar, y yVar, y yVar2, y yVar3) {
        this.a = f4d;
        this.b = gVar;
        this.c = yVar;
        this.d = yVar2;
        this.e = yVar3;
    }

    static MobiusLoop.h a(xcd xcd) {
        wcd wcd = wcd.a;
        f4d f4d = xcd.a;
        g<SessionState> gVar = xcd.b;
        y yVar = xcd.c;
        m f = i.f();
        f.h(cdd.a.class, new gdd(f4d, yVar));
        f.h(cdd.b.class, new idd(gVar, yVar));
        return i.c(wcd, f.i()).b(new ucd(xcd)).d(new vcd(xcd));
    }

    public /* synthetic */ ia2 b() {
        return new o(this.d);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.e);
    }

    public s<edd> d() {
        return s.B(new a(edd.a));
    }
}
