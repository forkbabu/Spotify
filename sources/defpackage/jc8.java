package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: jc8  reason: default package */
public class jc8 extends cc8 implements ic8 {
    private final jz1 n;
    private final l81 o;
    private final ifd p;
    private final c.a q;
    private final cqe r;

    public jc8(l81 l81, jz1 jz1, dc8 dc8, ifd ifd, c.a aVar, cqe cqe) {
        super(C0707R.id.search_impression_logger, dc8);
        this.o = l81;
        this.n = jz1;
        this.p = ifd;
        this.q = aVar;
        this.r = cqe;
    }

    @Override // defpackage.ic8
    public void e(RecyclerView recyclerView) {
        g(recyclerView);
    }

    @Override // defpackage.ic8
    public void i(RecyclerView recyclerView) {
        this.b = false;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            childAt.setTag(this.a, null);
            if (childAt instanceof RecyclerView) {
                i((RecyclerView) childAt);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.cc8
    public void o(int i, s81 s81) {
        p81 logging = s81.logging();
        this.n.a(new da1(logging.string("ui:source"), this.p.getName(), this.q.getViewUri().toString(), logging.string("ui:group"), (long) i, logging.string("ui:uri"), ImpressionLogger.ImpressionType.ITEM.toString(), ImpressionLogger.RenderType.LIST.toString(), (double) this.r.d()));
        this.o.a(s81);
    }
}
