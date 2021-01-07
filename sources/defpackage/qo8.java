package defpackage;

import android.view.View;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.y;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.PageIndicator;
import com.spotify.music.features.tasteonboarding.artistpicker.view.recyclerview.ShelfGridRecyclerView;

/* renamed from: qo8  reason: default package */
public class qo8 extends u {
    public static final /* synthetic */ int n = 0;
    private ShelfGridRecyclerView f;
    private a g;
    private y h;
    private Scroller i;
    private b j;
    private int k = -1;
    private int l;
    private int m;

    /* access modifiers changed from: private */
    /* renamed from: qo8$a */
    public class a {
        private final boolean a;

        a(int i) {
            this.a = i != 1 ? false : true;
        }

        static int a(a aVar, View view) {
            if (qo8.this.h == null) {
                throw new IllegalStateException("OrientationHelper must be not null");
            } else if (!aVar.a) {
                return qo8.this.h.g(view) - q4.r(qo8.this.f);
            } else {
                return (q4.r(qo8.this.f) + qo8.this.h.d(view)) - qo8.this.f.getWidth();
            }
        }

        /* access modifiers changed from: package-private */
        public int[] b(LinearLayoutManager linearLayoutManager, int i) {
            int[] iArr = new int[2];
            int Y1 = linearLayoutManager.Y1();
            if (qo8.this.h != null) {
                if (i > Y1) {
                    iArr[0] = -qo8.this.h.g(linearLayoutManager.Q(i));
                } else if (this.a) {
                    iArr[0] = ((Y1 - i) * qo8.this.l) + qo8.this.h.d(linearLayoutManager.Q(linearLayoutManager.b2()));
                } else {
                    iArr[0] = qo8.this.h.g(linearLayoutManager.Q(Y1)) - ((Y1 - i) * qo8.this.l);
                }
            }
            return iArr;
        }

        /* access modifiers changed from: package-private */
        public int c(GridLayoutManager gridLayoutManager, int i) {
            int r;
            int i2 = qo8.this.m;
            if (i < 0) {
                i2 *= -1;
            }
            boolean z = this.a;
            if (z) {
                i2 *= -1;
            }
            boolean z2 = true;
            boolean z3 = i < 0;
            if (z) {
                z2 = z3;
            } else if (z3) {
                z2 = false;
            }
            if (z2) {
                r = qo8.r(qo8.this, gridLayoutManager.Y1());
            } else {
                r = qo8.r(qo8.this, gridLayoutManager.b2());
            }
            return r + i2;
        }
    }

    /* renamed from: qo8$b */
    public interface b {
    }

    static int r(qo8 qo8, int i2) {
        return i2 - (i2 % qo8.m);
    }

    private int s(int i2) {
        return i2 - (i2 % this.m);
    }

    private void t(GridLayoutManager gridLayoutManager) {
        View V;
        if (this.l == 0 && (V = gridLayoutManager.V(0)) != null) {
            this.l = V.getWidth();
            this.m = this.f.getNumOfItemsInPage();
        }
    }

    @Override // androidx.recyclerview.widget.f0
    public void a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            this.f = (ShelfGridRecyclerView) recyclerView;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            gridLayoutManager.getClass();
            if (gridLayoutManager.B()) {
                this.h = y.a(gridLayoutManager);
                this.g = new a(q4.o(this.f));
                this.i = new Scroller(this.f.getContext(), mo8.a);
                t(gridLayoutManager);
            } else {
                throw new IllegalStateException("RecyclerView must be scrollable");
            }
        }
        super.a(recyclerView);
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.f0
    public int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        a aVar = this.g;
        if (aVar != null) {
            iArr[0] = a.a(aVar, view);
            b bVar = this.j;
            if (bVar != null) {
                ((PageIndicator) bVar).b(mVar.o0(view));
            }
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.f0
    public View f(RecyclerView.m mVar) {
        int i2;
        a aVar;
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mVar;
        int Y1 = gridLayoutManager.Y1();
        if (Y1 == -1) {
            i2 = -1;
        } else {
            t(gridLayoutManager);
            if (Y1 >= this.k) {
                i2 = gridLayoutManager.U1();
                if (i2 == -1 || i2 % this.m != 0) {
                    i2 = s(this.m + Y1);
                }
            } else {
                int s = s(Y1);
                if (gridLayoutManager.Q(s) == null && (aVar = this.g) != null) {
                    int[] b2 = aVar.b(gridLayoutManager, this.k);
                    this.f.L0(b2[0], b2[1], mo8.a);
                }
                i2 = s;
            }
            this.k = Y1;
        }
        if (i2 == -1) {
            return null;
        }
        return mVar.Q(i2);
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.f0
    public int g(RecyclerView.m mVar, int i2, int i3) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) mVar;
        t(gridLayoutManager);
        Scroller scroller = this.i;
        if (scroller == null) {
            return -1;
        }
        scroller.fling(0, 0, i2, i3, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        a aVar = this.g;
        if (aVar == null || i2 == 0) {
            return -1;
        }
        return aVar.c(gridLayoutManager, this.i.getFinalX());
    }

    public void u(b bVar) {
        this.j = bVar;
    }
}
