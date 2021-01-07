package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: fc8  reason: default package */
public class fc8 extends cc8 implements ic8 {
    private final l81 n;
    private final jz1 o;
    private final c p;
    private final u98 q;
    private final cqe r;

    public fc8(l81 l81, jz1 jz1, dc8 dc8, c cVar, u98 u98, cqe cqe) {
        super(C0707R.id.search_impression_logger, dc8);
        this.o = jz1;
        this.p = cVar;
        this.q = u98;
        this.n = l81;
        this.r = cqe;
    }

    @Override // defpackage.ic8
    public void e(RecyclerView recyclerView) {
        g(recyclerView);
    }

    @Override // defpackage.ic8
    public /* synthetic */ void i(RecyclerView recyclerView) {
        hc8.a(this, recyclerView);
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cc8
    public void o(int i, s81 s81) {
        p81 logging = s81.logging();
        this.o.a(new da1(logging.string("ui:source"), this.q.c(), this.p.toString(), logging.string("ui:group"), (long) i, logging.string("ui:uri"), ImpressionLogger.ImpressionType.ITEM.toString(), ImpressionLogger.RenderType.LIST.toString(), (double) this.r.d()));
        this.n.a(s81);
    }
}
