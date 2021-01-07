package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import defpackage.d5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.m implements RecyclerView.x.b {
    private int B = -1;
    e[] C;
    y D;
    y E;
    private int F;
    private int G;
    private final s H;
    boolean I = false;
    boolean J = false;
    private BitSet K;
    int L = -1;
    int M = Integer.MIN_VALUE;
    c N = new c();
    private int O = 2;
    private boolean P;
    private boolean Q;
    private d R;
    private int S;
    private final Rect T = new Rect();
    private final b U = new b();
    private boolean V = true;
    private int[] W;
    private final Runnable X = new a();

    public static class LayoutParams extends RecyclerView.LayoutParams {
        e n;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
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

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.N1();
        }
    }

    /* access modifiers changed from: package-private */
    public class b {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            b();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.c) {
                i = StaggeredGridLayoutManager.this.D.i();
            } else {
                i = StaggeredGridLayoutManager.this.D.m();
            }
            this.b = i;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int a;
        int b;
        int c;
        int[] f;
        int n;
        int[] o;
        List<c.a> p;
        boolean q;
        boolean r;
        boolean s;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            if (this.c > 0) {
                parcel.writeIntArray(this.f);
            }
            parcel.writeInt(this.n);
            if (this.n > 0) {
                parcel.writeIntArray(this.o);
            }
            parcel.writeInt(this.q ? 1 : 0);
            parcel.writeInt(this.r ? 1 : 0);
            parcel.writeInt(this.s ? 1 : 0);
            parcel.writeList(this.p);
        }

        d(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            int readInt = parcel.readInt();
            this.c = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.n = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.o = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.q = parcel.readInt() == 1;
            this.r = parcel.readInt() == 1;
            this.s = parcel.readInt() == 1 ? true : z;
            this.p = parcel.readArrayList(c.a.class.getClassLoader());
        }

        public d(d dVar) {
            this.c = dVar.c;
            this.a = dVar.a;
            this.b = dVar.b;
            this.f = dVar.f;
            this.n = dVar.n;
            this.o = dVar.o;
            this.q = dVar.q;
            this.r = dVar.r;
            this.s = dVar.s;
            this.p = dVar.p;
        }
    }

    /* access modifiers changed from: package-private */
    public class e {
        ArrayList<View> a = new ArrayList<>();
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        int d = 0;
        final int e;

        e(int i) {
            this.e = i;
        }

        /* access modifiers changed from: package-private */
        public void a(View view) {
            LayoutParams j = j(view);
            j.n = this;
            this.a.add(view);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (j.e() || j.c()) {
                this.d = StaggeredGridLayoutManager.this.D.e(view) + this.d;
            }
        }

        /* access modifiers changed from: package-private */
        public void b() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams j = j(view);
            this.c = StaggeredGridLayoutManager.this.D.d(view);
            j.getClass();
        }

        /* access modifiers changed from: package-private */
        public void c() {
            View view = this.a.get(0);
            LayoutParams j = j(view);
            this.b = StaggeredGridLayoutManager.this.D.g(view);
            j.getClass();
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.a.clear();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.I) {
                return g(this.a.size() - 1, -1, true);
            }
            return g(0, this.a.size(), true);
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.I) {
                return g(0, this.a.size(), true);
            }
            return g(this.a.size() - 1, -1, true);
        }

        /* access modifiers changed from: package-private */
        public int g(int i, int i2, boolean z) {
            int m = StaggeredGridLayoutManager.this.D.m();
            int i3 = StaggeredGridLayoutManager.this.D.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int g = StaggeredGridLayoutManager.this.D.g(view);
                int d2 = StaggeredGridLayoutManager.this.D.d(view);
                boolean z2 = false;
                boolean z3 = !z ? g < i3 : g <= i3;
                if (!z ? d2 > m : d2 >= m) {
                    z2 = true;
                }
                if (z3 && z2 && (g < m || d2 > i3)) {
                    return StaggeredGridLayoutManager.this.o0(view);
                }
                i += i4;
            }
            return -1;
        }

        /* access modifiers changed from: package-private */
        public int h(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            b();
            return this.c;
        }

        public View i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.I && staggeredGridLayoutManager.o0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.I && staggeredGridLayoutManager2.o0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.I && staggeredGridLayoutManager3.o0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.I && staggeredGridLayoutManager4.o0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: package-private */
        public LayoutParams j(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: package-private */
        public int k(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            c();
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public void l() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            LayoutParams j = j(remove);
            j.n = null;
            if (j.e() || j.c()) {
                this.d -= StaggeredGridLayoutManager.this.D.e(remove);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void m() {
            View remove = this.a.remove(0);
            LayoutParams j = j(remove);
            j.n = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (j.e() || j.c()) {
                this.d -= StaggeredGridLayoutManager.this.D.e(remove);
            }
            this.b = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: package-private */
        public void n(View view) {
            LayoutParams j = j(view);
            j.n = this;
            this.a.add(0, view);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (j.e() || j.c()) {
                this.d = StaggeredGridLayoutManager.this.D.e(view) + this.d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.m.d p0 = RecyclerView.m.p0(context, attributeSet, i, i2);
        int i3 = p0.a;
        if (i3 == 0 || i3 == 1) {
            y(null);
            if (i3 != this.F) {
                this.F = i3;
                y yVar = this.D;
                this.D = this.E;
                this.E = yVar;
                t1();
            }
            o2(p0.b);
            boolean z = p0.c;
            y(null);
            d dVar = this.R;
            if (!(dVar == null || dVar.q == z)) {
                dVar.q = z;
            }
            this.I = z;
            t1();
            this.H = new s();
            this.D = y.b(this, this.F);
            this.E = y.b(this, 1 - this.F);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    private int M1(int i) {
        if (W() != 0) {
            if ((i < W1()) != this.J) {
                return -1;
            }
            return 1;
        } else if (this.J) {
            return 1;
        } else {
            return -1;
        }
    }

    private int O1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        return d0.a(yVar, this.D, T1(!this.V), S1(!this.V), this, this.V);
    }

    private int P1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        return d0.b(yVar, this.D, T1(!this.V), S1(!this.V), this, this.V, this.J);
    }

    private int Q1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        return d0.c(yVar, this.D, T1(!this.V), S1(!this.V), this, this.V);
    }

    private int R1(RecyclerView.s sVar, s sVar2, RecyclerView.y yVar) {
        int i;
        int i2;
        int i3;
        e eVar;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.K.set(0, this.B, true);
        if (this.H.i) {
            i = sVar2.e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (sVar2.e == 1) {
                i10 = sVar2.g + sVar2.b;
            } else {
                i10 = sVar2.f - sVar2.b;
            }
            i = i10;
        }
        p2(sVar2.e, i);
        if (this.J) {
            i2 = this.D.i();
        } else {
            i2 = this.D.m();
        }
        boolean z2 = false;
        while (true) {
            int i11 = sVar2.c;
            int i12 = -1;
            if (!(i11 >= 0 && i11 < yVar.c()) || (!this.H.i && this.K.isEmpty())) {
                break;
            }
            View g = sVar.g(sVar2.c);
            sVar2.c += sVar2.d;
            LayoutParams layoutParams = (LayoutParams) g.getLayoutParams();
            int b2 = layoutParams.b();
            int[] iArr = this.N.a;
            int i13 = (iArr == null || b2 >= iArr.length) ? -1 : iArr[b2];
            if (i13 == -1) {
                if (f2(sVar2.e)) {
                    i8 = this.B - 1;
                    i9 = -1;
                } else {
                    i12 = this.B;
                    i9 = 1;
                    i8 = 0;
                }
                e eVar2 = null;
                if (sVar2.e == 1) {
                    int m = this.D.m();
                    int i14 = Integer.MAX_VALUE;
                    while (i8 != i12) {
                        e eVar3 = this.C[i8];
                        int h = eVar3.h(m);
                        if (h < i14) {
                            i14 = h;
                            eVar2 = eVar3;
                        }
                        i8 += i9;
                    }
                } else {
                    int i15 = this.D.i();
                    int i16 = Integer.MIN_VALUE;
                    while (i8 != i12) {
                        e eVar4 = this.C[i8];
                        int k = eVar4.k(i15);
                        if (k > i16) {
                            eVar2 = eVar4;
                            i16 = k;
                        }
                        i8 += i9;
                    }
                }
                eVar = eVar2;
                c cVar = this.N;
                cVar.b(b2);
                cVar.a[b2] = eVar.e;
            } else {
                eVar = this.C[i13];
            }
            layoutParams.n = eVar;
            if (sVar2.e == 1) {
                v(g);
                z = false;
            } else {
                z = false;
                w(g, 0);
            }
            if (this.F == 1) {
                int i17 = this.G;
                int w0 = w0();
                int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                int i19 = z ? 1 : 0;
                int i20 = z ? 1 : 0;
                int i21 = z ? 1 : 0;
                d2(g, RecyclerView.m.X(i17, w0, i19, i18, z), RecyclerView.m.X(g0(), h0(), getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) layoutParams).height, true), z);
            } else {
                d2(g, RecyclerView.m.X(v0(), w0(), getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) layoutParams).width, true), RecyclerView.m.X(this.G, h0(), 0, ((ViewGroup.MarginLayoutParams) layoutParams).height, false), false);
            }
            if (sVar2.e == 1) {
                int h2 = eVar.h(i2);
                i5 = h2;
                i4 = this.D.e(g) + h2;
            } else {
                int k2 = eVar.k(i2);
                i4 = k2;
                i5 = k2 - this.D.e(g);
            }
            if (sVar2.e == 1) {
                layoutParams.n.a(g);
            } else {
                layoutParams.n.n(g);
            }
            if (!c2() || this.F != 1) {
                i6 = this.E.m() + (eVar.e * this.G);
                i7 = this.E.e(g) + i6;
            } else {
                i7 = this.E.i() - (((this.B - 1) - eVar.e) * this.G);
                i6 = i7 - this.E.e(g);
            }
            if (this.F == 1) {
                F0(g, i6, i5, i7, i4);
            } else {
                F0(g, i5, i6, i4, i7);
            }
            r2(eVar, this.H.e, i);
            h2(sVar, this.H);
            if (this.H.h && g.hasFocusable()) {
                this.K.set(eVar.e, false);
            }
            z2 = true;
        }
        if (!z2) {
            h2(sVar, this.H);
        }
        if (this.H.e == -1) {
            i3 = this.D.m() - Z1(this.D.m());
        } else {
            i3 = Y1(this.D.i()) - this.D.i();
        }
        if (i3 > 0) {
            return Math.min(sVar2.b, i3);
        }
        return 0;
    }

    private void U1(RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int i;
        int Y1 = Y1(Integer.MIN_VALUE);
        if (Y1 != Integer.MIN_VALUE && (i = this.D.i() - Y1) > 0) {
            int i2 = i - (-l2(-i, sVar, yVar));
            if (z && i2 > 0) {
                this.D.r(i2);
            }
        }
    }

    private void V1(RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int m;
        int Z1 = Z1(Integer.MAX_VALUE);
        if (Z1 != Integer.MAX_VALUE && (m = Z1 - this.D.m()) > 0) {
            int l2 = m - l2(m, sVar, yVar);
            if (z && l2 > 0) {
                this.D.r(-l2);
            }
        }
    }

    private int Y1(int i) {
        int h = this.C[0].h(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int h2 = this.C[i2].h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    private int Z1(int i) {
        int k = this.C[0].k(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int k2 = this.C[i2].k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.J
            if (r0 == 0) goto L_0x0009
            int r0 = r6.X1()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.W1()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r4 = r6.N
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.N
            r9.f(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r6.N
            r7.e(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.N
            r9.f(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r6.N
            r9.e(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.J
            if (r7 == 0) goto L_0x004d
            int r7 = r6.W1()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.X1()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.t1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a2(int, int, int):void");
    }

    private void d2(View view, int i, int i2, boolean z) {
        boolean z2;
        A(view, this.T);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        Rect rect = this.T;
        int s2 = s2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        Rect rect2 = this.T;
        int s22 = s2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + rect2.bottom);
        if (z) {
            z2 = H1(view, s2, s22, layoutParams);
        } else {
            z2 = F1(view, s2, s22, layoutParams);
        }
        if (z2) {
            view.measure(s2, s22);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0417, code lost:
        if (N1() != false) goto L_0x041b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01b9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e2(androidx.recyclerview.widget.RecyclerView.s r12, androidx.recyclerview.widget.RecyclerView.y r13, boolean r14) {
        /*
        // Method dump skipped, instructions count: 1081
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.e2(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    private boolean f2(int i) {
        if (this.F == 0) {
            if ((i == -1) != this.J) {
                return true;
            }
            return false;
        }
        if (((i == -1) == this.J) == c2()) {
            return true;
        }
        return false;
    }

    private void h2(RecyclerView.s sVar, s sVar2) {
        int i;
        int i2;
        if (sVar2.a && !sVar2.i) {
            if (sVar2.b != 0) {
                int i3 = 1;
                if (sVar2.e == -1) {
                    int i4 = sVar2.f;
                    int k = this.C[0].k(i4);
                    while (i3 < this.B) {
                        int k2 = this.C[i3].k(i4);
                        if (k2 > k) {
                            k = k2;
                        }
                        i3++;
                    }
                    int i5 = i4 - k;
                    if (i5 < 0) {
                        i2 = sVar2.g;
                    } else {
                        i2 = sVar2.g - Math.min(i5, sVar2.b);
                    }
                    i2(sVar, i2);
                    return;
                }
                int i6 = sVar2.g;
                int h = this.C[0].h(i6);
                while (i3 < this.B) {
                    int h2 = this.C[i3].h(i6);
                    if (h2 < h) {
                        h = h2;
                    }
                    i3++;
                }
                int i7 = h - sVar2.g;
                if (i7 < 0) {
                    i = sVar2.f;
                } else {
                    i = Math.min(i7, sVar2.b) + sVar2.f;
                }
                j2(sVar, i);
            } else if (sVar2.e == -1) {
                i2(sVar, sVar2.g);
            } else {
                j2(sVar, sVar2.f);
            }
        }
    }

    private void i2(RecyclerView.s sVar, int i) {
        for (int W2 = W() - 1; W2 >= 0; W2--) {
            View V2 = V(W2);
            if (this.D.g(V2) >= i && this.D.q(V2) >= i) {
                LayoutParams layoutParams = (LayoutParams) V2.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.n.a.size() != 1) {
                    layoutParams.n.l();
                    this.a.m(V2);
                    sVar.k(V2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void j2(RecyclerView.s sVar, int i) {
        while (W() > 0) {
            View V2 = V(0);
            if (this.D.d(V2) <= i && this.D.p(V2) <= i) {
                LayoutParams layoutParams = (LayoutParams) V2.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.n.a.size() != 1) {
                    layoutParams.n.m();
                    this.a.m(V2);
                    sVar.k(V2);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private void k2() {
        if (this.F == 1 || !c2()) {
            this.J = this.I;
        } else {
            this.J = !this.I;
        }
    }

    private void n2(int i) {
        s sVar = this.H;
        sVar.e = i;
        int i2 = 1;
        if (this.J != (i == -1)) {
            i2 = -1;
        }
        sVar.d = i2;
    }

    private void p2(int i, int i2) {
        for (int i3 = 0; i3 < this.B; i3++) {
            if (!this.C[i3].a.isEmpty()) {
                r2(this.C[i3], i, i2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void q2(int r5, androidx.recyclerview.widget.RecyclerView.y r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.s r0 = r4.H
            r1 = 0
            r0.b = r1
            r0.c = r5
            androidx.recyclerview.widget.RecyclerView$x r0 = r4.p
            r2 = 1
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0035
            int r6 = r6.a
            r0 = -1
            if (r6 == r0) goto L_0x0035
            boolean r0 = r4.J
            if (r6 >= r5) goto L_0x0022
            r5 = 1
            goto L_0x0023
        L_0x0022:
            r5 = 0
        L_0x0023:
            if (r0 != r5) goto L_0x002c
            androidx.recyclerview.widget.y r5 = r4.D
            int r5 = r5.n()
            goto L_0x0036
        L_0x002c:
            androidx.recyclerview.widget.y r5 = r4.D
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L_0x0037
        L_0x0035:
            r5 = 0
        L_0x0036:
            r6 = 0
        L_0x0037:
            androidx.recyclerview.widget.RecyclerView r0 = r4.b
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.p
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x005b
            androidx.recyclerview.widget.s r0 = r4.H
            androidx.recyclerview.widget.y r3 = r4.D
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.s r6 = r4.H
            androidx.recyclerview.widget.y r0 = r4.D
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.g = r0
            goto L_0x006b
        L_0x005b:
            androidx.recyclerview.widget.s r0 = r4.H
            androidx.recyclerview.widget.y r3 = r4.D
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.s r5 = r4.H
            int r6 = -r6
            r5.f = r6
        L_0x006b:
            androidx.recyclerview.widget.s r5 = r4.H
            r5.h = r1
            r5.a = r2
            androidx.recyclerview.widget.y r6 = r4.D
            int r6 = r6.k()
            if (r6 != 0) goto L_0x0082
            androidx.recyclerview.widget.y r6 = r4.D
            int r6 = r6.h()
            if (r6 != 0) goto L_0x0082
            r1 = 1
        L_0x0082:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    private void r2(e eVar, int i, int i2) {
        int i3 = eVar.d;
        if (i == -1) {
            int i4 = eVar.b;
            if (i4 == Integer.MIN_VALUE) {
                eVar.c();
                i4 = eVar.b;
            }
            if (i4 + i3 <= i2) {
                this.K.set(eVar.e, false);
                return;
            }
            return;
        }
        int i5 = eVar.c;
        if (i5 == Integer.MIN_VALUE) {
            eVar.b();
            i5 = eVar.c;
        }
        if (i5 - i3 >= i2) {
            this.K.set(eVar.e, false);
        }
    }

    private int s2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean B() {
        return this.F == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void B1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.F == 1) {
            i4 = RecyclerView.m.E(i2, rect.height() + paddingBottom, m0());
            i3 = RecyclerView.m.E(i, (this.G * this.B) + paddingRight, n0());
        } else {
            i3 = RecyclerView.m.E(i, rect.width() + paddingRight, n0());
            i4 = RecyclerView.m.E(i2, (this.G * this.B) + paddingBottom, m0());
        }
        this.b.setMeasuredDimension(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean C() {
        return this.F == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean D(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void F(int i, int i2, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        int i3;
        int i4;
        if (this.F != 0) {
            i = i2;
        }
        if (!(W() == 0 || i == 0)) {
            g2(i, yVar);
            int[] iArr = this.W;
            if (iArr == null || iArr.length < this.B) {
                this.W = new int[this.B];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.B; i6++) {
                s sVar = this.H;
                if (sVar.d == -1) {
                    i4 = sVar.f;
                    i3 = this.C[i6].k(i4);
                } else {
                    i4 = this.C[i6].h(sVar.g);
                    i3 = this.H.g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.W[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.W, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = this.H.c;
                if (i9 >= 0 && i9 < yVar.c()) {
                    ((o.b) cVar).a(this.H.c, this.W[i8]);
                    s sVar2 = this.H;
                    sVar2.c += sVar2.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int H(RecyclerView.y yVar) {
        return O1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int I(RecyclerView.y yVar) {
        return P1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I0(int i) {
        super.I0(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            e eVar = this.C[i2];
            int i3 = eVar.b;
            if (i3 != Integer.MIN_VALUE) {
                eVar.b = i3 + i;
            }
            int i4 = eVar.c;
            if (i4 != Integer.MIN_VALUE) {
                eVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.m(i);
        J1(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int J(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void J0(int i) {
        super.J0(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            e eVar = this.C[i2];
            int i3 = eVar.b;
            if (i3 != Integer.MIN_VALUE) {
                eVar.b = i3 + i;
            }
            int i4 = eVar.c;
            if (i4 != Integer.MIN_VALUE) {
                eVar.c = i4 + i;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int K(RecyclerView.y yVar) {
        return O1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int L(RecyclerView.y yVar) {
        return P1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean L1() {
        return this.R == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int M(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    /* access modifiers changed from: package-private */
    public boolean N1() {
        int i;
        if (!(W() == 0 || this.O == 0 || !this.r)) {
            if (this.J) {
                i = X1();
                W1();
            } else {
                i = W1();
                X1();
            }
            if (i == 0 && b2() != null) {
                this.N.a();
                this.q = true;
                t1();
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(RecyclerView recyclerView, RecyclerView.s sVar) {
        N0();
        Runnable runnable = this.X;
        RecyclerView recyclerView2 = this.b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.B; i++) {
            this.C[i].d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r8.F == 1) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        if (r8.F == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        if (c2() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        if (c2() == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View P0(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.s r11, androidx.recyclerview.widget.RecyclerView.y r12) {
        /*
        // Method dump skipped, instructions count: 333
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Q0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.s sVar = this.b.b;
        R0(accessibilityEvent);
        if (W() > 0) {
            View T1 = T1(false);
            View S1 = S1(false);
            if (T1 != null && S1 != null) {
                int o0 = o0(T1);
                int o02 = o0(S1);
                if (o0 < o02) {
                    accessibilityEvent.setFromIndex(o0);
                    accessibilityEvent.setToIndex(o02);
                    return;
                }
                accessibilityEvent.setFromIndex(o02);
                accessibilityEvent.setToIndex(o0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        if (this.F == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams S(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* access modifiers changed from: package-private */
    public View S1(boolean z) {
        int m = this.D.m();
        int i = this.D.i();
        View view = null;
        for (int W2 = W() - 1; W2 >= 0; W2--) {
            View V2 = V(W2);
            int g = this.D.g(V2);
            int d2 = this.D.d(V2);
            if (d2 > m && g < i) {
                if (d2 <= i || !z) {
                    return V2;
                }
                if (view == null) {
                    view = V2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams T(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    public View T1(boolean z) {
        int m = this.D.m();
        int i = this.D.i();
        int W2 = W();
        View view = null;
        for (int i2 = 0; i2 < W2; i2++) {
            View V2 = V(i2);
            int g = this.D.g(V2);
            if (this.D.d(V2) > m && g < i) {
                if (g >= m || !z) {
                    return V2;
                }
                if (view == null) {
                    view = V2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void U0(RecyclerView.s sVar, RecyclerView.y yVar, View view, d5 d5Var) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            T0(view, d5Var);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.F == 0) {
            e eVar = layoutParams2.n;
            if (eVar == null) {
                i2 = -1;
            } else {
                i2 = eVar.e;
            }
            d5Var.U(d5.c.a(i2, 1, -1, -1, false, false));
            return;
        }
        e eVar2 = layoutParams2.n;
        if (eVar2 == null) {
            i = -1;
        } else {
            i = eVar2.e;
        }
        d5Var.U(d5.c.a(-1, -1, i, 1, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void W0(RecyclerView recyclerView, int i, int i2) {
        a2(i, i2, 1);
    }

    /* access modifiers changed from: package-private */
    public int W1() {
        if (W() == 0) {
            return 0;
        }
        return o0(V(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void X0(RecyclerView recyclerView) {
        this.N.a();
        t1();
    }

    /* access modifiers changed from: package-private */
    public int X1() {
        int W2 = W();
        if (W2 == 0) {
            return 0;
        }
        return o0(V(W2 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        a2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int Z(RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.F == 1) {
            return this.B;
        }
        return super.Z(sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        a2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF b(int i) {
        int M1 = M1(i);
        PointF pointF = new PointF();
        if (M1 == 0) {
            return null;
        }
        if (this.F == 0) {
            pointF.x = (float) M1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) M1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        a2(i, i2, 4);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bb, code lost:
        if (r10 == r11) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cd, code lost:
        if (r10 == r11) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d1, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0098 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View b2() {
        /*
        // Method dump skipped, instructions count: 245
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        e2(sVar, yVar, true);
    }

    /* access modifiers changed from: package-private */
    public boolean c2() {
        return k0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d1(RecyclerView.y yVar) {
        this.L = -1;
        this.M = Integer.MIN_VALUE;
        this.R = null;
        this.U.b();
    }

    /* access modifiers changed from: package-private */
    public void g2(int i, RecyclerView.y yVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = X1();
            i2 = 1;
        } else {
            i3 = W1();
            i2 = -1;
        }
        this.H.a = true;
        q2(i3, yVar);
        n2(i2);
        s sVar = this.H;
        sVar.c = i3 + sVar.d;
        sVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.R = (d) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable i1() {
        int i;
        View view;
        int i2;
        int i3;
        int[] iArr;
        d dVar = this.R;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        dVar2.q = this.I;
        dVar2.r = this.P;
        dVar2.s = this.Q;
        c cVar = this.N;
        if (cVar == null || (iArr = cVar.a) == null) {
            dVar2.n = 0;
        } else {
            dVar2.o = iArr;
            dVar2.n = iArr.length;
            dVar2.p = cVar.b;
        }
        int i4 = -1;
        if (W() > 0) {
            if (this.P) {
                i = X1();
            } else {
                i = W1();
            }
            dVar2.a = i;
            if (this.J) {
                view = S1(true);
            } else {
                view = T1(true);
            }
            if (view != null) {
                i4 = o0(view);
            }
            dVar2.b = i4;
            int i5 = this.B;
            dVar2.c = i5;
            dVar2.f = new int[i5];
            for (int i6 = 0; i6 < this.B; i6++) {
                if (this.P) {
                    i2 = this.C[i6].h(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.D.i();
                    } else {
                        dVar2.f[i6] = i2;
                    }
                } else {
                    i2 = this.C[i6].k(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.D.m();
                    } else {
                        dVar2.f[i6] = i2;
                    }
                }
                i2 -= i3;
                dVar2.f[i6] = i2;
            }
        } else {
            dVar2.a = -1;
            dVar2.b = -1;
            dVar2.c = 0;
        }
        return dVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j1(int i) {
        if (i == 0) {
            N1();
        }
    }

    /* access modifiers changed from: package-private */
    public int l2(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (W() == 0 || i == 0) {
            return 0;
        }
        g2(i, yVar);
        int R1 = R1(sVar, this.H, yVar);
        if (this.H.b >= R1) {
            i = i < 0 ? -R1 : R1;
        }
        this.D.r(-i);
        this.P = this.J;
        s sVar2 = this.H;
        sVar2.b = 0;
        h2(sVar, sVar2);
        return i;
    }

    public void m2(int i) {
        y(null);
        if (i != this.O) {
            if (i == 0 || i == 2) {
                this.O = i;
                t1();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public void o2(int i) {
        y(null);
        if (i != this.B) {
            this.N.a();
            t1();
            this.B = i;
            this.K = new BitSet(this.B);
            this.C = new e[this.B];
            for (int i2 = 0; i2 < this.B; i2++) {
                this.C[i2] = new e(i2);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int r0(RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.F == 0) {
            return this.B;
        }
        return super.r0(sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int u1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        return l2(i, sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        d dVar = this.R;
        if (!(dVar == null || dVar.a == i)) {
            dVar.f = null;
            dVar.c = 0;
            dVar.a = -1;
            dVar.b = -1;
        }
        this.L = i;
        this.M = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        return l2(i, sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void y(String str) {
        RecyclerView recyclerView;
        if (this.R == null && (recyclerView = this.b) != null) {
            recyclerView.p(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean y0() {
        return this.O != 0;
    }

    /* access modifiers changed from: package-private */
    public static class c {
        int[] a;
        List<a> b;

        c() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.b = null;
        }

        /* access modifiers changed from: package-private */
        public void b(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public a c(int i) {
            List<a> list = this.b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                if (aVar.a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r2 = r4.b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r3 = r4.b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c.a) r3
                int r3 = r3.a
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r0 = r4.b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a> r3 = r4.b
                r3.remove(r2)
                int r0 = r0.a
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c.d(int):int");
        }

        /* access modifiers changed from: package-private */
        public void e(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.a, i, i3, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i4 = aVar.a;
                        if (i4 >= i) {
                            aVar.a = i4 + i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void f(int i, int i2) {
            int[] iArr = this.a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                b(i3);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<a> list = this.b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.b.get(size);
                        int i4 = aVar.a;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.b.remove(size);
                            } else {
                                aVar.a = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0043a();
            int a;
            int b;
            int[] c;
            boolean f;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c$a$a  reason: collision with other inner class name */
            static class C0043a implements Parcelable.Creator<a> {
                C0043a() {
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* Return type fixed from 'java.lang.Object[]' to match base method */
                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            a(Parcel parcel) {
                this.a = parcel.readInt();
                this.b = parcel.readInt();
                this.f = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.c = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // java.lang.Object
            public String toString() {
                StringBuilder V0 = je.V0("FullSpanItem{mPosition=");
                V0.append(this.a);
                V0.append(", mGapDir=");
                V0.append(this.b);
                V0.append(", mHasUnwantedGapAfter=");
                V0.append(this.f);
                V0.append(", mGapPerSpan=");
                V0.append(Arrays.toString(this.c));
                V0.append('}');
                return V0.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
                parcel.writeInt(this.f ? 1 : 0);
                int[] iArr = this.c;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.c);
            }

            a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.F = i2;
        o2(i);
        this.H = new s();
        this.D = y.b(this, this.F);
        this.E = y.b(this, 1 - this.F);
    }
}
