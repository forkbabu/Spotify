package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.y;

public class u extends f0 {
    private y d;
    private y e;

    private int i(View view, y yVar) {
        return ((yVar.e(view) / 2) + yVar.g(view)) - ((yVar.n() / 2) + yVar.m());
    }

    private int j(RecyclerView.m mVar, y yVar, int i, int i2) {
        int max;
        int[] c = c(i, i2);
        int W = mVar.W();
        float f = 1.0f;
        if (W != 0) {
            View view = null;
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < W; i5++) {
                View V = mVar.V(i5);
                int o0 = mVar.o0(V);
                if (o0 != -1) {
                    if (o0 < i3) {
                        view = V;
                        i3 = o0;
                    }
                    if (o0 > i4) {
                        view2 = V;
                        i4 = o0;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(yVar.d(view), yVar.d(view2)) - Math.min(yVar.g(view), yVar.g(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i4 - i3) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(c[0]) > Math.abs(c[1]) ? c[0] : c[1])) / f);
    }

    private View k(RecyclerView.m mVar, y yVar) {
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

    private y l(RecyclerView.m mVar) {
        y yVar = this.e;
        if (yVar == null || yVar.a != mVar) {
            this.e = new y.a(mVar);
        }
        return this.e;
    }

    private y m(RecyclerView.m mVar) {
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
            iArr[0] = i(view, l(mVar));
        } else {
            iArr[0] = 0;
        }
        if (mVar.C()) {
            iArr[1] = i(view, m(mVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.f0
    public View f(RecyclerView.m mVar) {
        if (mVar.C()) {
            return k(mVar, m(mVar));
        }
        if (mVar.B()) {
            return k(mVar, l(mVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.f0
    public int g(RecyclerView.m mVar, int i, int i2) {
        int i0;
        View f;
        int o0;
        int i3;
        PointF b;
        int i4;
        int i5;
        if (!(mVar instanceof RecyclerView.x.b) || (i0 = mVar.i0()) == 0 || (f = f(mVar)) == null || (o0 = mVar.o0(f)) == -1 || (b = ((RecyclerView.x.b) mVar).b(i0 - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (mVar.B()) {
            i4 = j(mVar, l(mVar), i, 0);
            if (b.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (mVar.C()) {
            i5 = j(mVar, m(mVar), 0, i2);
            if (b.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (mVar.C()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = o0 + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= i0 ? i3 : i6;
    }
}
