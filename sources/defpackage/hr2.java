package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import defpackage.gr2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.h;

/* renamed from: hr2  reason: default package */
public final class hr2 extends v<gr2, RecyclerView.b0> {
    private final kr2 n;
    private final qr2 o;
    private final nr2 p;

    /* renamed from: hr2$a */
    public static final class a extends m.d<gr2> {
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(gr2 gr2, gr2 gr22) {
            gr2 gr23 = gr2;
            gr2 gr24 = gr22;
            h.e(gr23, "oldItem");
            h.e(gr24, "newItem");
            return h.a(gr23, gr24);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(gr2 gr2, gr2 gr22) {
            gr2 gr23 = gr2;
            gr2 gr24 = gr22;
            h.e(gr23, "oldItem");
            h.e(gr24, "newItem");
            return h.a(gr23.getClass(), gr24.getClass()) && h.a(gr23.a(), gr24.a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hr2(kr2 kr2, qr2 qr2, nr2 nr2) {
        super(new a());
        h.e(kr2, "gridShelfViewHolderFactory");
        h.e(qr2, "shortcutsShelfViewHolderFactory");
        h.e(nr2, "shortcutsGridShelfViewHolderFactory");
        this.n = kr2;
        this.o = qr2;
        this.p = nr2;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        gr2 gr2 = (gr2) Y(i);
        if (gr2 instanceof gr2.a) {
            ((jr2) b0Var).h0(((gr2.a) gr2).b());
        } else if (gr2 instanceof gr2.c) {
            ((mr2) b0Var).h0(((gr2.c) gr2).b());
        } else if (gr2 instanceof gr2.b) {
            ((gr2.b) gr2).getClass();
            ((mr2) b0Var).h0(null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        if (i == 1) {
            jr2 b = this.n.b(viewGroup);
            h.d(b, "gridShelfViewHolderFactory.create(parent)");
            return b;
        } else if (i == 2) {
            pr2 b2 = this.o.b(viewGroup);
            h.d(b2, "shortcutsShelfViewHolderFactory.create(parent)");
            return b2;
        } else if (i == 3) {
            mr2 b3 = this.p.b(viewGroup);
            h.d(b3, "shortcutsGridShelfViewHolderFactory.create(parent)");
            return b3;
        } else {
            throw new IllegalStateException(je.q0("viewType: ", i, " not implemented."));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long v(int i) {
        gr2 gr2 = (gr2) Y(i);
        return (long) (gr2.getClass().getSimpleName() + gr2.a()).hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        gr2 gr2 = (gr2) Y(i);
        if (gr2 instanceof gr2.a) {
            return 1;
        }
        if ((gr2 instanceof gr2.c) || (gr2 instanceof gr2.b)) {
            return 3;
        }
        throw new NoWhenBranchMatchedException();
    }
}
