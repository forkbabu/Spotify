package defpackage;

import com.spotify.mobile.android.spotlets.bixbyhomecards.models.ContentItem;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.h;
import io.reactivex.s;
import io.reactivex.v;
import java.util.Queue;

/* renamed from: dt1  reason: default package */
public class dt1 {
    private final bt1 a;
    private h<Object> b;

    public dt1(bt1 bt1) {
        this.a = bt1;
    }

    public /* synthetic */ void a() {
        this.b = null;
    }

    public /* synthetic */ void b(h hVar) {
        this.b = hVar;
        hVar.onNext(0);
        hVar.e(new xs1(this));
    }

    public /* synthetic */ v c(Object obj) {
        return this.a.a().q0(ys1.a);
    }

    public s<Queue<ContentItem>> d() {
        if (this.b == null) {
            return new io.reactivex.internal.operators.observable.v(g.p(new ws1(this), BackpressureStrategy.DROP)).W(new zs1(this), false, Integer.MAX_VALUE);
        }
        throw new IllegalStateException("Only one observer per instance is allowed");
    }

    public void e() {
        h<Object> hVar = this.b;
        if (hVar != null) {
            hVar.onNext(0);
        }
    }
}
