package defpackage;

import com.google.common.base.MoreObjects;
import com.spotify.music.libs.search.view.l;
import io.reactivex.BackpressureStrategy;
import io.reactivex.g;
import io.reactivex.internal.operators.flowable.FlowableDebounce;
import io.reactivex.y;

/* renamed from: k4b  reason: default package */
public class k4b {
    private final k8b a;
    private final y b;

    public k4b(k8b k8b, y yVar) {
        this.a = k8b;
        this.b = yVar;
    }

    public g<b7b> a(l lVar, f4b f4b, h5b h5b, String str, boolean z) {
        y yVar = this.b;
        g2b g2b = new g2b(f4b, lVar);
        BackpressureStrategy backpressureStrategy = BackpressureStrategy.LATEST;
        FlowableDebounce flowableDebounce = new FlowableDebounce(g.p(g2b, backpressureStrategy), new h2b(yVar));
        g1b g1b = g1b.a;
        g O = flowableDebounce.O(g1b);
        String h = lVar.h();
        if (!h.equals(str) || MoreObjects.isNullOrEmpty(h)) {
            O = O.b0(b7b.e(h));
        } else if (z) {
            O = O.b0(b7b.c(h));
        }
        return g.P(g.P(O, g.p(new y1b(new w3b(lVar), h5b), backpressureStrategy).O(g1b)), g.p(new o2b(lVar, this.a), backpressureStrategy));
    }
}
