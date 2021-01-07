package defpackage;

import android.os.Bundle;
import com.spotify.playlist.endpoints.i;
import com.spotify.rxjava2.p;
import io.reactivex.a;
import io.reactivex.disposables.c;
import io.reactivex.e;
import io.reactivex.internal.operators.completable.b;

/* renamed from: wr6  reason: default package */
public class wr6 {
    private final cqe a;
    private final i b;
    private final p c = new p();
    private long d;

    public wr6(cqe cqe, i iVar) {
        this.a = cqe;
        this.b = iVar;
    }

    public e a(String str) {
        if (this.d == 0 || this.a.d() - this.d > 21600000) {
            return this.b.d(str).p(new hr6(this));
        }
        return b.a;
    }

    public /* synthetic */ void b() {
        this.d = this.a.d();
    }

    public void c(String str) {
        this.c.b(a.n(new gr6(this, str)).B().subscribe(fr6.a, ir6.a));
    }

    public void d(Bundle bundle) {
        if (bundle != null) {
            this.d = bundle.getLong(wr6.class.getName(), 0);
        }
    }

    public void e(Bundle bundle) {
        bundle.putLong(wr6.class.getName(), this.d);
    }

    public void f() {
        this.c.b(c.a());
    }
}
