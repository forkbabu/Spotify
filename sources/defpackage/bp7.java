package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.b;
import com.spotify.mobius.rx2.i;
import com.spotify.mobius.rx2.m;
import com.spotify.mobius.rx2.o;
import com.spotify.music.libs.web.RxWebToken;
import defpackage.lp7;
import defpackage.mp7;
import defpackage.np7;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import java.util.concurrent.Callable;

/* renamed from: bp7  reason: default package */
public class bp7 {
    private final vo7 a;
    private final bqa b;
    private final at7 c;
    private final txc d;
    private final RxWebToken e;
    private final y f;
    private final y g;
    private final y h;

    /* access modifiers changed from: package-private */
    /* renamed from: bp7$a */
    public class a implements Callable<v<? extends np7>> {
        np7 a;
        final /* synthetic */ np7 b;

        a(np7 np7) {
            this.b = np7;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public v<? extends np7> call() {
            return s.i0(mp7.f.a).q(i.d(bp7.a(bp7.this), (np7) MoreObjects.firstNonNull(this.a, this.b))).N(new xo7(this));
        }
    }

    public bp7(vo7 vo7, bqa bqa, at7 at7, txc txc, RxWebToken rxWebToken, y yVar, y yVar2, y yVar3) {
        this.a = vo7;
        this.b = bqa;
        this.f = yVar;
        this.g = yVar2;
        this.h = yVar3;
        this.c = at7;
        this.d = txc;
        this.e = rxWebToken;
    }

    static MobiusLoop.h a(bp7 bp7) {
        ap7 ap7 = ap7.a;
        vo7 vo7 = bp7.a;
        bqa bqa = bp7.b;
        y yVar = bp7.f;
        at7 at7 = bp7.c;
        txc txc = bp7.d;
        RxWebToken rxWebToken = bp7.e;
        m f2 = i.f();
        f2.h(lp7.a.class, new eq7(vo7, yVar));
        f2.h(lp7.b.class, new rp7(bqa));
        f2.h(lp7.c.class, new vp7(at7));
        f2.h(lp7.d.class, new cq7(txc, yVar));
        f2.h(lp7.e.class, new up7(rxWebToken, yVar));
        return i.c(ap7, f2.i()).b(new zo7(bp7)).d(new yo7(bp7)).f(b.g("profile entity data"));
    }

    public /* synthetic */ ia2 b() {
        return new o(this.g);
    }

    public /* synthetic */ ia2 c() {
        return new o(this.h);
    }

    public s<np7> d(String str, String str2) {
        np7.a n = np7.a.n();
        n.o(str);
        n.c(str2);
        return s.B(new a(n.a()));
    }
}
