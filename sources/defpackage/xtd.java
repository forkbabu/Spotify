package defpackage;

import com.spotify.pageloader.l0;
import io.reactivex.s;
import io.reactivex.schedulers.a;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: xtd  reason: default package */
public class xtd<T> implements w<l0<T>, l0<T>> {
    private final long a;
    private final y b;

    public xtd(long j) {
        y a2 = a.a();
        this.a = j;
        this.b = a2;
    }

    public /* synthetic */ v a(s sVar) {
        return s.c(sVar, s.v(s.i0(l0.c()).C(this.a, TimeUnit.MILLISECONDS, this.b), sVar));
    }

    @Override // io.reactivex.w
    public v<l0<T>> apply(s<l0<T>> sVar) {
        return sVar.t0(new wtd(this));
    }
}
