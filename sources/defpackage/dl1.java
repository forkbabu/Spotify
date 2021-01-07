package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.rx.w;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.e;
import io.reactivex.z;

/* renamed from: dl1  reason: default package */
public class dl1 implements cl1 {
    private final w a;
    private final sxd b;
    private final vw0 c;
    private b d = c.a();

    dl1(w wVar, sxd sxd, vw0 vw0) {
        this.a = wVar;
        this.b = sxd;
        this.c = vw0;
    }

    public e a(Boolean bool) {
        if (bool.booleanValue()) {
            return io.reactivex.internal.operators.completable.b.a;
        }
        Logger.b("Fetching default on demand set.", new Object[0]);
        z<R> A = this.c.a().A(al1.a).A(bl1.a);
        sxd sxd = this.b;
        sxd.getClass();
        return A.t(new zk1(sxd));
    }

    @Override // defpackage.cl1
    public void start() {
        if (this.b.isEmpty()) {
            this.d = this.a.a("type").j0(new xk1("premium")).N0(1).B0().t(new yk1(this)).B().subscribe();
        }
    }

    @Override // defpackage.cl1
    public void stop() {
        this.d.dispose();
    }
}
