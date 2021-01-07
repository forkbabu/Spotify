package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

public abstract class f0 extends RecyclerView.o {
    RecyclerView a;
    private Scroller b;
    private final RecyclerView.q c = new a();

    class a extends RecyclerView.q {
        boolean a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0 && this.a) {
                this.a = false;
                f0.this.h();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class b extends t {
        b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.x
        public void l(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            f0 f0Var = f0.this;
            RecyclerView recyclerView = f0Var.a;
            if (recyclerView != null) {
                int[] b = f0Var.b(recyclerView.getLayoutManager(), view);
                int i = b[0];
                int i2 = b[1];
                int r = r(Math.max(Math.abs(i), Math.abs(i2)));
                if (r > 0) {
                    aVar.d(i, i2, r, this.j);
                }
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.D0(this.c);
                this.a.setOnFlingListener(null);
            }
            this.a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.a.n(this.c);
                this.a.setOnFlingListener(this);
                this.b = new Scroller(this.a.getContext(), new DecelerateInterpolator());
                h();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public int[] c(int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.b.getFinalX(), this.b.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.x d(RecyclerView.m mVar) {
        return e(mVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public t e(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new b(this.a.getContext());
    }

    public abstract View f(RecyclerView.m mVar);

    public abstract int g(RecyclerView.m mVar, int i, int i2);

    /* access modifiers changed from: package-private */
    public void h() {
        RecyclerView.m layoutManager;
        View f;
        RecyclerView recyclerView = this.a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (f = f(layoutManager)) != null) {
            int[] b2 = b(layoutManager, f);
            if (b2[0] != 0 || b2[1] != 0) {
                this.a.M0(b2[0], b2[1], null, Integer.MIN_VALUE, false);
            }
        }
    }
}
