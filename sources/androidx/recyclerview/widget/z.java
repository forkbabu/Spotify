package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;

public class z extends f0 {
    private y d;
    private y e;

    class a extends t {
        a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView.x
        public void l(View view, RecyclerView.y yVar, RecyclerView.x.a aVar) {
            z zVar = z.this;
            int[] b = zVar.b(zVar.a.getLayoutManager(), view);
            int i = b[0];
            int i2 = b[1];
            int r = r(Math.max(Math.abs(i), Math.abs(i2)));
            if (r > 0) {
                aVar.d(i, i2, r, this.j);
            }
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public int s(int i) {
            return Math.min(100, super.s(i));
        }
    }

    private int i(View view, y yVar) {
        return ((yVar.e(view) / 2) + yVar.g(view)) - ((yVar.n() / 2) + yVar.m());
    }

    private View j(RecyclerView.m mVar, y yVar) {
        int W = mVar.W();
        View view = null;
        if (W == 0) {
            return null;
        }
        int n = (yVar.n() / 2) + yVar.m();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < W; i2++) {
            View V = mVar.V(i2);
            int abs = Math.abs(((yVar.e(V) / 2) + yVar.g(V)) - n);
            if (abs < i) {
                view = V;
                i = abs;
            }
        }
        return view;
    }

    private y k(RecyclerView.m mVar) {
        y yVar = this.e;
        if (yVar == null || yVar.a != mVar) {
            this.e = new y.a(mVar);
        }
        return this.e;
    }

    private y l(RecyclerView.m mVar) {
        y yVar = this.d;
        if (yVar == null || yVar.a != mVar) {
            this.d = new y.b(mVar);
        }
        return this.d;
    }

    @Override // androidx.recyclerview.widget.f0
    public int[] b(RecyclerView.m mVar, View view) {
        int[] iArr = new int[2];
        if (mVar.B()) {
            iArr[0] = i(view, k(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.C()) {
            iArr[1] = i(view, l(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.f0
    public t e(RecyclerView.m mVar) {
        if (!(mVar instanceof RecyclerView.x.b)) {
            return null;
        }
        return new a(this.a.getContext());
    }

    @Override // androidx.recyclerview.widget.f0
    public View f(RecyclerView.m mVar) {
        if (mVar.C()) {
            return j(mVar, l(mVar));
        }
        if (mVar.B()) {
            return j(mVar, k(mVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    public int g(RecyclerView.m mVar, int i, int i2) {
        y yVar;
        PointF b;
        int i0 = mVar.i0();
        if (i0 == 0) {
            return -1;
        }
        View view = null;
        if (mVar.C()) {
            yVar = l(mVar);
        } else {
            yVar = mVar.B() ? k(mVar) : null;
        }
        if (yVar == null) {
            return -1;
        }
        int W = mVar.W();
        boolean z = false;
        View view2 = null;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < W; i5++) {
            View V = mVar.V(i5);
            if (V != null) {
                int i6 = i(V, yVar);
                if (i6 <= 0 && i6 > i3) {
                    view2 = V;
                    i3 = i6;
                }
                if (i6 >= 0 && i6 < i4) {
                    view = V;
                    i4 = i6;
                }
            }
        }
        int i7 = 1;
        boolean z2 = !mVar.B() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return mVar.o0(view);
        }
        if (!(z2 || view2 == null)) {
            return mVar.o0(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int o0 = mVar.o0(view);
        int i02 = mVar.i0();
        if ((mVar instanceof RecyclerView.x.b) && (b = ((RecyclerView.x.b) mVar).b(i02 - 1)) != null && (b.x < 0.0f || b.y < 0.0f)) {
            z = true;
        }
        if (z == z2) {
            i7 = -1;
        }
        int i8 = o0 + i7;
        if (i8 < 0 || i8 >= i0) {
            return -1;
        }
        return i8;
    }
}
