package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import defpackage.d5;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {
    boolean Q = false;
    int R = -1;
    int[] S;
    View[] T;
    final SparseIntArray U = new SparseIntArray();
    final SparseIntArray V = new SparseIntArray();
    b W = new a();
    final Rect X = new Rect();

    public static final class a extends b {
        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int d(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.b
        public int e(int i) {
            return 1;
        }
    }

    public static abstract class b {
        final SparseIntArray a = new SparseIntArray();
        final SparseIntArray b = new SparseIntArray();
        private boolean c = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* access modifiers changed from: package-private */
        public int b(int i, int i2) {
            if (!this.c) {
                return d(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.a.put(i, d);
            return d;
        }

        public int c(int i, int i2) {
            int e = e(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int e2 = e(i5);
                i3 += e2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = e2;
                }
            }
            return i3 + e > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r6, int r7) {
            /*
                r5 = this;
                int r0 = r5.e(r6)
                r1 = 0
                if (r0 != r7) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r5.c
                if (r2 == 0) goto L_0x0020
                android.util.SparseIntArray r2 = r5.a
                int r2 = a(r2, r6)
                if (r2 < 0) goto L_0x0020
                android.util.SparseIntArray r3 = r5.a
                int r3 = r3.get(r2)
                int r4 = r5.e(r2)
                int r4 = r4 + r3
                goto L_0x0030
            L_0x0020:
                r2 = 0
                r4 = 0
            L_0x0022:
                if (r2 >= r6) goto L_0x0033
                int r3 = r5.e(r2)
                int r4 = r4 + r3
                if (r4 != r7) goto L_0x002d
                r4 = 0
                goto L_0x0030
            L_0x002d:
                if (r4 <= r7) goto L_0x0030
                r4 = r3
            L_0x0030:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0033:
                int r0 = r0 + r4
                if (r0 > r7) goto L_0x0037
                return r4
            L_0x0037:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.b.d(int, int):int");
        }

        public abstract int e(int i);

        public void f(boolean z) {
            if (!z) {
                this.b.clear();
            }
            this.c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        J2(RecyclerView.m.p0(context, attributeSet, i, i2).b);
    }

    private void A2() {
        View[] viewArr = this.T;
        if (viewArr == null || viewArr.length != this.R) {
            this.T = new View[this.R];
        }
    }

    private int D2(RecyclerView.s sVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.W.c(i, this.R);
        }
        int d = sVar.d(i);
        if (d == -1) {
            return 0;
        }
        return this.W.c(d, this.R);
    }

    private int E2(RecyclerView.s sVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.W.b(i, this.R);
        }
        int i2 = this.V.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int d = sVar.d(i);
        if (d == -1) {
            return 0;
        }
        return this.W.b(d, this.R);
    }

    private int F2(RecyclerView.s sVar, RecyclerView.y yVar, int i) {
        if (!yVar.g) {
            return this.W.e(i);
        }
        int i2 = this.U.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int d = sVar.d(i);
        if (d == -1) {
            return 1;
        }
        return this.W.e(d);
    }

    private void H2(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int B2 = B2(layoutParams.n, layoutParams.o);
        if (this.B == 1) {
            i2 = RecyclerView.m.X(B2, i, i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, false);
            i3 = RecyclerView.m.X(this.D.n(), h0(), i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, true);
        } else {
            int X2 = RecyclerView.m.X(B2, i, i4, ((ViewGroup.MarginLayoutParams) layoutParams).height, false);
            int X3 = RecyclerView.m.X(this.D.n(), w0(), i5, ((ViewGroup.MarginLayoutParams) layoutParams).width, true);
            i3 = X2;
            i2 = X3;
        }
        I2(view, i2, i3, z);
    }

    private void I2(View view, int i, int i2, boolean z) {
        boolean z2;
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = H1(view, i, i2, layoutParams);
        } else {
            z2 = F1(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    private void L2() {
        int i;
        int i2;
        if (this.B == 1) {
            i2 = v0() - getPaddingRight();
            i = getPaddingLeft();
        } else {
            i2 = g0() - getPaddingBottom();
            i = getPaddingTop();
        }
        z2(i2 - i);
    }

    private void z2(int i) {
        int i2;
        int[] iArr = this.S;
        int i3 = this.R;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.S = iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.S == null) {
            super.B1(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.B == 1) {
            i4 = RecyclerView.m.E(i2, rect.height() + paddingBottom, m0());
            int[] iArr = this.S;
            i3 = RecyclerView.m.E(i, iArr[iArr.length - 1] + paddingRight, n0());
        } else {
            i3 = RecyclerView.m.E(i, rect.width() + paddingRight, n0());
            int[] iArr2 = this.S;
            i4 = RecyclerView.m.E(i2, iArr2[iArr2.length - 1] + paddingBottom, m0());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    /* access modifiers changed from: package-private */
    public int B2(int i, int i2) {
        if (this.B != 1 || !l2()) {
            int[] iArr = this.S;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.S;
        int i3 = this.R;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public int C2() {
        return this.R;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean D(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public b G2() {
        return this.W;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int I(RecyclerView.y yVar) {
        return super.I(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int J(RecyclerView.y yVar) {
        return super.J(yVar);
    }

    public void J2(int i) {
        if (i != this.R) {
            this.Q = true;
            if (i >= 1) {
                this.R = i;
                this.W.a.clear();
                t1();
                return;
            }
            throw new IllegalArgumentException(je.p0("Span count should be at least 1. Provided ", i));
        }
    }

    public void K2(b bVar) {
        this.W = bVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int L(RecyclerView.y yVar) {
        return super.L(yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public boolean L1() {
        return this.L == null && !this.Q;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int M(RecyclerView.y yVar) {
        return super.M(yVar);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void N1(RecyclerView.y yVar, LinearLayoutManager.c cVar, RecyclerView.m.c cVar2) {
        int i = this.R;
        for (int i2 = 0; i2 < this.R && cVar.b(yVar) && i > 0; i2++) {
            int i3 = cVar.d;
            ((o.b) cVar2).a(i3, Math.max(0, cVar.g));
            i -= this.W.e(i3);
            cVar.d += cVar.e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ca, code lost:
        if (r13 == (r2 > r15)) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00e6, code lost:
        if (r13 == (r2 > r8)) goto L_0x00e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f0  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View P0(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.s r25, androidx.recyclerview.widget.RecyclerView.y r26) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        if (this.B == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams S(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams T(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void U0(RecyclerView.s sVar, RecyclerView.y yVar, View view, d5 d5Var) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            T0(view, d5Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int D2 = D2(sVar, yVar, layoutParams2.b());
        if (this.B == 0) {
            d5Var.U(d5.c.a(layoutParams2.n, layoutParams2.o, D2, 1, false, false));
        } else {
            d5Var.U(d5.c.a(D2, 1, layoutParams2.n, layoutParams2.o, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void W0(RecyclerView recyclerView, int i, int i2) {
        this.W.a.clear();
        this.W.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void X0(RecyclerView recyclerView) {
        this.W.a.clear();
        this.W.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.W.a.clear();
        this.W.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int Z(RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.B == 1) {
            return this.R;
        }
        if (yVar.c() < 1) {
            return 0;
        }
        return D2(sVar, yVar, yVar.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        this.W.a.clear();
        this.W.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.W.a.clear();
        this.W.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        if (yVar.g) {
            int W2 = W();
            for (int i = 0; i < W2; i++) {
                LayoutParams layoutParams = (LayoutParams) V(i).getLayoutParams();
                int b2 = layoutParams.b();
                this.U.put(b2, layoutParams.o);
                this.V.put(b2, layoutParams.n);
            }
        }
        super.c1(sVar, yVar);
        this.U.clear();
        this.V.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public void d1(RecyclerView.y yVar) {
        this.L = null;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.M.d();
        this.Q = false;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View e2(RecyclerView.s sVar, RecyclerView.y yVar, int i, int i2, int i3) {
        S1();
        int m = this.D.m();
        int i4 = this.D.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View V2 = V(i);
            int o0 = o0(V2);
            if (o0 >= 0 && o0 < i3 && E2(sVar, yVar, o0) == 0) {
                if (((RecyclerView.LayoutParams) V2.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = V2;
                    }
                } else if (this.D.g(V2) < i4 && this.D.d(V2) >= m) {
                    return V2;
                } else {
                    if (view == null) {
                        view = V2;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void m2(RecyclerView.s sVar, RecyclerView.y yVar, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        View c;
        int l = this.D.l();
        boolean z2 = l != 1073741824;
        int i15 = W() > 0 ? this.S[this.R] : 0;
        if (z2) {
            L2();
        }
        boolean z3 = cVar.e == 1;
        int i16 = this.R;
        if (!z3) {
            i16 = E2(sVar, yVar, cVar.d) + F2(sVar, yVar, cVar.d);
        }
        int i17 = 0;
        while (i17 < this.R && cVar.b(yVar) && i16 > 0) {
            int i18 = cVar.d;
            int F2 = F2(sVar, yVar, i18);
            if (F2 <= this.R) {
                i16 -= F2;
                if (i16 < 0 || (c = cVar.c(sVar)) == null) {
                    break;
                }
                this.T[i17] = c;
                i17++;
            } else {
                throw new IllegalArgumentException(je.B0(je.X0("Item at position ", i18, " requires ", F2, " spans but GridLayoutManager has only "), this.R, " spans."));
            }
        }
        if (i17 == 0) {
            bVar.b = true;
            return;
        }
        if (z3) {
            i4 = 0;
            i3 = i17;
            i2 = 0;
            i = 1;
        } else {
            i4 = i17 - 1;
            i3 = -1;
            i2 = 0;
            i = -1;
        }
        while (i4 != i3) {
            View view = this.T[i4];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int F22 = F2(sVar, yVar, o0(view));
            layoutParams.o = F22;
            layoutParams.n = i2;
            i2 += F22;
            i4 += i;
        }
        float f = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i17; i20++) {
            View view2 = this.T[i20];
            if (cVar.k != null) {
                z = false;
                if (z3) {
                    t(view2);
                } else {
                    u(view2, 0);
                }
            } else if (z3) {
                v(view2);
                z = false;
            } else {
                z = false;
                w(view2, 0);
            }
            A(view2, this.X);
            H2(view2, l, z);
            int e = this.D.e(view2);
            if (e > i19) {
                i19 = e;
            }
            float f2 = (((float) this.D.f(view2)) * 1.0f) / ((float) ((LayoutParams) view2.getLayoutParams()).o);
            if (f2 > f) {
                f = f2;
            }
        }
        if (z2) {
            z2(Math.max(Math.round(f * ((float) this.R)), i15));
            i19 = 0;
            for (int i21 = 0; i21 < i17; i21++) {
                View view3 = this.T[i21];
                H2(view3, 1073741824, true);
                int e2 = this.D.e(view3);
                if (e2 > i19) {
                    i19 = e2;
                }
            }
        }
        for (int i22 = 0; i22 < i17; i22++) {
            View view4 = this.T[i22];
            if (this.D.e(view4) != i19) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.b;
                int i23 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
                int i24 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                int B2 = B2(layoutParams2.n, layoutParams2.o);
                if (this.B == 1) {
                    i14 = RecyclerView.m.X(B2, 1073741824, i24, ((ViewGroup.MarginLayoutParams) layoutParams2).width, false);
                    i13 = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    i13 = RecyclerView.m.X(B2, 1073741824, i23, ((ViewGroup.MarginLayoutParams) layoutParams2).height, false);
                    i14 = makeMeasureSpec;
                }
                I2(view4, i14, i13, true);
            }
        }
        bVar.a = i19;
        if (this.B == 1) {
            if (cVar.f == -1) {
                i8 = cVar.b;
                i7 = i8 - i19;
            } else {
                i7 = cVar.b;
                i8 = i19 + i7;
            }
            i6 = 0;
            i5 = 0;
        } else {
            if (cVar.f == -1) {
                int i25 = cVar.b;
                i6 = i25;
                i5 = i25 - i19;
            } else {
                int i26 = cVar.b;
                i5 = i26;
                i6 = i19 + i26;
            }
            i7 = 0;
            i8 = 0;
        }
        int i27 = 0;
        while (i27 < i17) {
            View view5 = this.T[i27];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.B != 1) {
                i7 = this.S[layoutParams3.n] + getPaddingTop();
                i8 = this.D.f(view5) + i7;
            } else if (l2()) {
                i6 = getPaddingLeft() + this.S[this.R - layoutParams3.n];
                i5 = i6 - this.D.f(view5);
            } else {
                int paddingLeft = getPaddingLeft() + this.S[layoutParams3.n];
                i12 = i8;
                i11 = i7;
                i9 = paddingLeft;
                i10 = this.D.f(view5) + paddingLeft;
                F0(view5, i9, i11, i10, i12);
                if (!layoutParams3.e() || layoutParams3.c()) {
                    bVar.c = true;
                }
                bVar.d |= view5.hasFocusable();
                i27++;
                i8 = i12;
                i7 = i11;
                i6 = i10;
                i5 = i9;
            }
            i12 = i8;
            i11 = i7;
            i10 = i6;
            i9 = i5;
            F0(view5, i9, i11, i10, i12);
            if (!layoutParams3.e()) {
            }
            bVar.c = true;
            bVar.d |= view5.hasFocusable();
            i27++;
            i8 = i12;
            i7 = i11;
            i6 = i10;
            i5 = i9;
        }
        Arrays.fill(this.T, (Object) null);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void n2(RecyclerView.s sVar, RecyclerView.y yVar, LinearLayoutManager.a aVar, int i) {
        L2();
        if (yVar.c() > 0 && !yVar.g) {
            boolean z = i == 1;
            int E2 = E2(sVar, yVar, aVar.b);
            if (z) {
                while (E2 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    E2 = E2(sVar, yVar, i3);
                }
            } else {
                int c = yVar.c() - 1;
                int i4 = aVar.b;
                while (i4 < c) {
                    int i5 = i4 + 1;
                    int E22 = E2(sVar, yVar, i5);
                    if (E22 <= E2) {
                        break;
                    }
                    i4 = i5;
                    E2 = E22;
                }
                aVar.b = i4;
            }
        }
        A2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int r0(RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.B == 0) {
            return this.R;
        }
        if (yVar.c() < 1) {
            return 0;
        }
        return D2(sVar, yVar, yVar.c() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int u1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        L2();
        A2();
        return super.u1(i, sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void v2(boolean z) {
        if (!z) {
            super.v2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        L2();
        A2();
        if (this.B == 0) {
            return 0;
        }
        return s2(i, sVar, yVar);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        int n = -1;
        int o = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int g() {
            return this.n;
        }

        public int h() {
            return this.o;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(i2, z);
        J2(i);
    }

    public GridLayoutManager(Context context, int i) {
        super(1, false);
        J2(i);
    }
}
