package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.m implements p.h, RecyclerView.x.b {
    int B;
    private c C;
    y D;
    private boolean E;
    private boolean F;
    boolean G;
    private boolean H;
    private boolean I;
    int J;
    int K;
    d L;
    final a M;
    private final b N;
    private int O;
    private int[] P;

    /* access modifiers changed from: package-private */
    public static class a {
        y a;
        int b;
        int c;
        boolean d;
        boolean e;

        a() {
            d();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            int i;
            if (this.d) {
                i = this.a.i();
            } else {
                i = this.a.m();
            }
            this.c = i;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.o() + this.a.d(view);
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int o = this.a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - o) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e2 = this.c - this.a.e(view);
                    int m = this.a.m();
                    int min = e2 - (Math.min(this.a.g(view) - m, 0) + m);
                    if (min < 0) {
                        this.c = Math.min(i2, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int m2 = g - this.a.m();
            this.c = g;
            if (m2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - o) - this.a.d(view))) - (this.a.e(view) + g);
                if (i3 < 0) {
                    this.c -= Math.min(m2, -i3);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder V0 = je.V0("AnchorInfo{mPosition=");
            V0.append(this.b);
            V0.append(", mCoordinate=");
            V0.append(this.c);
            V0.append(", mLayoutFromEnd=");
            V0.append(this.d);
            V0.append(", mValid=");
            return je.O0(V0, this.e, '}');
        }
    }

    /* access modifiers changed from: protected */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        protected b() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class c {
        boolean a = true;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h = 0;
        int i = 0;
        int j;
        List<RecyclerView.b0> k = null;
        boolean l;

        c() {
        }

        public void a(View view) {
            int b2;
            int size = this.k.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.k.get(i3).a;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.e() && (b2 = (layoutParams.b() - this.d) * this.e) >= 0 && b2 < i2) {
                    view2 = view3;
                    if (b2 == 0) {
                        break;
                    }
                    i2 = b2;
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).b();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean b(RecyclerView.y yVar) {
            int i2 = this.d;
            return i2 >= 0 && i2 < yVar.c();
        }

        /* access modifiers changed from: package-private */
        public View c(RecyclerView.s sVar) {
            List<RecyclerView.b0> list = this.k;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.k.get(i2).a;
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (!layoutParams.e() && this.d == layoutParams.b()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View g2 = sVar.g(this.d);
            this.d += this.e;
            return g2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        int a;
        int b;
        boolean c;

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

        /* access modifiers changed from: package-private */
        public boolean a() {
            return this.a >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c ? 1 : 0);
        }

        d(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.c = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.a = dVar.a;
            this.b = dVar.b;
            this.c = dVar.c;
        }
    }

    public LinearLayoutManager(Context context) {
        this(1, false);
    }

    private int O1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        S1();
        return d0.a(yVar, this.D, X1(!this.I, true), W1(!this.I, true), this, this.I);
    }

    private int P1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        S1();
        return d0.b(yVar, this.D, X1(!this.I, true), W1(!this.I, true), this, this.I, this.G);
    }

    private int Q1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        S1();
        return d0.c(yVar, this.D, X1(!this.I, true), W1(!this.I, true), this, this.I);
    }

    private View V1(RecyclerView.s sVar, RecyclerView.y yVar) {
        return e2(sVar, yVar, 0, W(), yVar.c());
    }

    private View a2(RecyclerView.s sVar, RecyclerView.y yVar) {
        return e2(sVar, yVar, W() - 1, -1, yVar.c());
    }

    private int f2(int i, RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int i2;
        int i3 = this.D.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -s2(-i3, sVar, yVar);
        int i5 = i + i4;
        if (!z || (i2 = this.D.i() - i5) <= 0) {
            return i4;
        }
        this.D.r(i2);
        return i2 + i4;
    }

    private int g2(int i, RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int m;
        int m2 = i - this.D.m();
        if (m2 <= 0) {
            return 0;
        }
        int i2 = -s2(m2, sVar, yVar);
        int i3 = i + i2;
        if (!z || (m = i3 - this.D.m()) <= 0) {
            return i2;
        }
        this.D.r(-m);
        return i2 - m;
    }

    private View h2() {
        return V(this.G ? 0 : W() - 1);
    }

    private View i2() {
        return V(this.G ? W() - 1 : 0);
    }

    private void o2(RecyclerView.s sVar, c cVar) {
        if (cVar.a && !cVar.l) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                int W = W();
                if (i >= 0) {
                    int h = (this.D.h() - i) + i2;
                    if (this.G) {
                        for (int i3 = 0; i3 < W; i3++) {
                            View V = V(i3);
                            if (this.D.g(V) < h || this.D.q(V) < h) {
                                p2(sVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = W - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View V2 = V(i5);
                        if (this.D.g(V2) < h || this.D.q(V2) < h) {
                            p2(sVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int W2 = W();
                if (this.G) {
                    int i7 = W2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View V3 = V(i8);
                        if (this.D.d(V3) > i6 || this.D.p(V3) > i6) {
                            p2(sVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < W2; i9++) {
                    View V4 = V(i9);
                    if (this.D.d(V4) > i6 || this.D.p(V4) > i6) {
                        p2(sVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    private void p2(RecyclerView.s sVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    q1(i3, sVar);
                }
                return;
            }
            while (i > i2) {
                q1(i, sVar);
                i--;
            }
        }
    }

    private void r2() {
        if (this.B == 1 || !l2()) {
            this.G = this.F;
        } else {
            this.G = !this.F;
        }
    }

    private void w2(int i, int i2, boolean z, RecyclerView.y yVar) {
        int i3;
        this.C.l = q2();
        this.C.f = i;
        int[] iArr = this.P;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        M1(yVar, iArr);
        int max = Math.max(0, this.P[0]);
        int max2 = Math.max(0, this.P[1]);
        if (i == 1) {
            z2 = true;
        }
        c cVar = this.C;
        int i5 = z2 ? max2 : max;
        cVar.h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.h = this.D.j() + i5;
            View h2 = h2();
            c cVar2 = this.C;
            if (this.G) {
                i4 = -1;
            }
            cVar2.e = i4;
            int o0 = o0(h2);
            c cVar3 = this.C;
            cVar2.d = o0 + cVar3.e;
            cVar3.b = this.D.d(h2);
            i3 = this.D.d(h2) - this.D.i();
        } else {
            View i22 = i2();
            c cVar4 = this.C;
            cVar4.h = this.D.m() + cVar4.h;
            c cVar5 = this.C;
            if (!this.G) {
                i4 = -1;
            }
            cVar5.e = i4;
            int o02 = o0(i22);
            c cVar6 = this.C;
            cVar5.d = o02 + cVar6.e;
            cVar6.b = this.D.g(i22);
            i3 = (-this.D.g(i22)) + this.D.m();
        }
        c cVar7 = this.C;
        cVar7.c = i2;
        if (z) {
            cVar7.c = i2 - i3;
        }
        cVar7.g = i3;
    }

    private void x2(int i, int i2) {
        this.C.c = this.D.i() - i2;
        c cVar = this.C;
        cVar.e = this.G ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void y2(int i, int i2) {
        this.C.c = i2 - this.D.m();
        c cVar = this.C;
        cVar.d = i;
        cVar.e = this.G ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean B() {
        return this.B == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean C() {
        return this.B == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void F(int i, int i2, RecyclerView.y yVar, RecyclerView.m.c cVar) {
        if (this.B != 0) {
            i = i2;
        }
        if (W() != 0 && i != 0) {
            S1();
            w2(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
            N1(yVar, this.C, cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void G(int i, RecyclerView.m.c cVar) {
        boolean z;
        int i2;
        d dVar = this.L;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            r2();
            z = this.G;
            i2 = this.J;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.L;
            z = dVar2.c;
            i2 = dVar2.a;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.O && i2 >= 0 && i2 < i; i4++) {
            ((o.b) cVar).a(i2, 0);
            i2 += i3;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean G1() {
        boolean z;
        if (!(h0() == 1073741824 || w0() == 1073741824)) {
            int W = W();
            int i = 0;
            while (true) {
                if (i >= W) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = V(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
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
    public int K(RecyclerView.y yVar) {
        return O1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int L(RecyclerView.y yVar) {
        return P1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean L1() {
        return this.L == null && this.E == this.H;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int M(RecyclerView.y yVar) {
        return Q1(yVar);
    }

    /* access modifiers changed from: protected */
    public void M1(RecyclerView.y yVar, int[] iArr) {
        int i;
        int n = yVar.a != -1 ? this.D.n() : 0;
        if (this.C.f == -1) {
            i = 0;
        } else {
            i = n;
            n = 0;
        }
        iArr[0] = n;
        iArr[1] = i;
    }

    /* access modifiers changed from: package-private */
    public void N1(RecyclerView.y yVar, c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.d;
        if (i >= 0 && i < yVar.c()) {
            ((o.b) cVar2).a(i, Math.max(0, cVar.g));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(RecyclerView recyclerView, RecyclerView.s sVar) {
        N0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View P0(View view, int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        int R1;
        View view2;
        View view3;
        r2();
        if (W() == 0 || (R1 = R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        S1();
        w2(R1, (int) (((float) this.D.n()) * 0.33333334f), false, yVar);
        c cVar = this.C;
        cVar.g = Integer.MIN_VALUE;
        cVar.a = false;
        T1(sVar, cVar, yVar, true);
        if (R1 == -1) {
            if (this.G) {
                view2 = c2(W() - 1, -1);
            } else {
                view2 = c2(0, W());
            }
        } else if (this.G) {
            view2 = c2(0, W());
        } else {
            view2 = c2(W() - 1, -1);
        }
        if (R1 == -1) {
            view3 = i2();
        } else {
            view3 = h2();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public View Q(int i) {
        int W = W();
        if (W == 0) {
            return null;
        }
        int o0 = i - o0(V(0));
        if (o0 >= 0 && o0 < W) {
            View V = V(o0);
            if (o0(V) == i) {
                return V;
            }
        }
        return super.Q(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Q0(AccessibilityEvent accessibilityEvent) {
        RecyclerView.s sVar = this.b.b;
        R0(accessibilityEvent);
        if (W() > 0) {
            accessibilityEvent.setFromIndex(Y1());
            accessibilityEvent.setToIndex(b2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public int R1(int i) {
        if (i == 1) {
            return (this.B != 1 && l2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.B != 1 && l2()) ? -1 : 1;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    return (i == 130 && this.B == 1) ? 1 : Integer.MIN_VALUE;
                }
                if (this.B == 0) {
                    return 1;
                }
                return Integer.MIN_VALUE;
            } else if (this.B == 1) {
                return -1;
            } else {
                return Integer.MIN_VALUE;
            }
        } else if (this.B == 0) {
            return -1;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    /* access modifiers changed from: package-private */
    public void S1() {
        if (this.C == null) {
            this.C = new c();
        }
    }

    /* access modifiers changed from: package-private */
    public int T1(RecyclerView.s sVar, c cVar, RecyclerView.y yVar, boolean z) {
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            o2(sVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.N;
        while (true) {
            if ((!cVar.l && i3 <= 0) || !cVar.b(yVar)) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            m2(sVar, yVar, cVar, bVar);
            if (!bVar.b) {
                int i4 = cVar.b;
                int i5 = bVar.a;
                cVar.b = (cVar.f * i5) + i4;
                if (!bVar.c || cVar.k != null || !yVar.g) {
                    cVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    cVar.g = i7;
                    int i8 = cVar.c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    o2(sVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public int U1() {
        View d2 = d2(0, W(), true, false);
        if (d2 == null) {
            return -1;
        }
        return o0(d2);
    }

    /* access modifiers changed from: package-private */
    public View W1(boolean z, boolean z2) {
        if (this.G) {
            return d2(0, W(), z, z2);
        }
        return d2(W() - 1, -1, z, z2);
    }

    /* access modifiers changed from: package-private */
    public View X1(boolean z, boolean z2) {
        if (this.G) {
            return d2(W() - 1, -1, z, z2);
        }
        return d2(0, W(), z, z2);
    }

    public int Y1() {
        View d2 = d2(0, W(), false, true);
        if (d2 == null) {
            return -1;
        }
        return o0(d2);
    }

    public int Z1() {
        View d2 = d2(W() - 1, -1, true, false);
        if (d2 == null) {
            return -1;
        }
        return o0(d2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF b(int i) {
        if (W() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < o0(V(0))) {
            z = true;
        }
        if (z != this.G) {
            i2 = -1;
        }
        if (this.B == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    public int b2() {
        View d2 = d2(W() - 1, -1, false, true);
        if (d2 == null) {
            return -1;
        }
        return o0(d2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x022d  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0180  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c1(androidx.recyclerview.widget.RecyclerView.s r17, androidx.recyclerview.widget.RecyclerView.y r18) {
        /*
        // Method dump skipped, instructions count: 1090
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    /* access modifiers changed from: package-private */
    public View c2(int i, int i2) {
        int i3;
        int i4;
        S1();
        View view = null;
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            f fVar = this.a;
            if (fVar != null) {
                return fVar.d(i);
            }
            return null;
        }
        y yVar = this.D;
        f fVar2 = this.a;
        if (fVar2 != null) {
            view = fVar2.d(i);
        }
        if (yVar.g(view) < this.D.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.B == 0) {
            return this.n.a(i, i2, i4, i3);
        }
        return this.o.a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d1(RecyclerView.y yVar) {
        this.L = null;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.M.d();
    }

    /* access modifiers changed from: package-private */
    public View d2(int i, int i2, boolean z, boolean z2) {
        S1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.B == 0) {
            return this.n.a(i, i2, i4, i3);
        }
        return this.o.a(i, i2, i4, i3);
    }

    /* access modifiers changed from: package-private */
    public View e2(RecyclerView.s sVar, RecyclerView.y yVar, int i, int i2, int i3) {
        S1();
        int m = this.D.m();
        int i4 = this.D.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View V = V(i);
            int o0 = o0(V);
            if (o0 >= 0 && o0 < i3) {
                if (((RecyclerView.LayoutParams) V.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = V;
                    }
                } else if (this.D.g(V) < i4 && this.D.d(V) >= m) {
                    return V;
                } else {
                    if (view == null) {
                        view = V;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.L = (d) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.p.h
    public void i(View view, View view2, int i, int i2) {
        RecyclerView recyclerView;
        if (this.L == null && (recyclerView = this.b) != null) {
            recyclerView.p("Cannot drop a view during a scroll or layout calculation");
        }
        S1();
        r2();
        int o0 = o0(view);
        int o02 = o0(view2);
        char c2 = o0 < o02 ? (char) 1 : 65535;
        if (this.G) {
            if (c2 == 1) {
                t2(o02, this.D.i() - (this.D.e(view) + this.D.g(view2)));
            } else {
                t2(o02, this.D.i() - this.D.d(view2));
            }
        } else if (c2 == 65535) {
            t2(o02, this.D.g(view2));
        } else {
            t2(o02, this.D.d(view2) - this.D.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable i1() {
        d dVar = this.L;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (W() > 0) {
            S1();
            boolean z = this.E ^ this.G;
            dVar2.c = z;
            if (z) {
                View h2 = h2();
                dVar2.b = this.D.i() - this.D.d(h2);
                dVar2.a = o0(h2);
            } else {
                View i2 = i2();
                dVar2.a = o0(i2);
                dVar2.b = this.D.g(i2) - this.D.m();
            }
        } else {
            dVar2.a = -1;
        }
        return dVar2;
    }

    public int j2() {
        return this.B;
    }

    public boolean k2() {
        return this.F;
    }

    /* access modifiers changed from: protected */
    public boolean l2() {
        return k0() == 1;
    }

    /* access modifiers changed from: package-private */
    public void m2(RecyclerView.s sVar, RecyclerView.y yVar, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View c2 = cVar.c(sVar);
        if (c2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) c2.getLayoutParams();
        if (cVar.k == null) {
            if (this.G == (cVar.f == -1)) {
                v(c2);
            } else {
                w(c2, 0);
            }
        } else {
            if (this.G == (cVar.f == -1)) {
                t(c2);
            } else {
                u(c2, 0);
            }
        }
        H0(c2, 0, 0);
        bVar.a = this.D.e(c2);
        if (this.B == 1) {
            if (l2()) {
                i5 = v0() - getPaddingRight();
                i4 = i5 - this.D.f(c2);
            } else {
                i4 = getPaddingLeft();
                i5 = this.D.f(c2) + i4;
            }
            if (cVar.f == -1) {
                int i6 = cVar.b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.a;
            } else {
                int i7 = cVar.b;
                i3 = i7;
                i2 = i5;
                i = bVar.a + i7;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.D.f(c2) + paddingTop;
            if (cVar.f == -1) {
                int i8 = cVar.b;
                i2 = i8;
                i3 = paddingTop;
                i = f;
                i4 = i8 - bVar.a;
            } else {
                int i9 = cVar.b;
                i3 = paddingTop;
                i2 = bVar.a + i9;
                i = f;
                i4 = i9;
            }
        }
        F0(c2, i4, i3, i2, i);
        if (layoutParams.e() || layoutParams.c()) {
            bVar.c = true;
        }
        bVar.d = c2.hasFocusable();
    }

    /* access modifiers changed from: package-private */
    public void n2(RecyclerView.s sVar, RecyclerView.y yVar, a aVar, int i) {
    }

    /* access modifiers changed from: package-private */
    public boolean q2() {
        return this.D.k() == 0 && this.D.h() == 0;
    }

    /* access modifiers changed from: package-private */
    public int s2(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (W() == 0 || i == 0) {
            return 0;
        }
        S1();
        this.C.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        w2(i2, abs, true, yVar);
        c cVar = this.C;
        int T1 = cVar.g + T1(sVar, cVar, yVar, false);
        if (T1 < 0) {
            return 0;
        }
        if (abs > T1) {
            i = i2 * T1;
        }
        this.D.r(-i);
        this.C.j = i;
        return i;
    }

    public void t2(int i, int i2) {
        this.J = i;
        this.K = i2;
        d dVar = this.L;
        if (dVar != null) {
            dVar.a = -1;
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int u1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.B == 1) {
            return 0;
        }
        return s2(i, sVar, yVar);
    }

    public void u2(int i) {
        if (i == 0 || i == 1) {
            y(null);
            if (i != this.B || this.D == null) {
                y b2 = y.b(this, i);
                this.D = b2;
                this.M.a = b2;
                this.B = i;
                t1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(je.p0("invalid orientation:", i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        this.J = i;
        this.K = Integer.MIN_VALUE;
        d dVar = this.L;
        if (dVar != null) {
            dVar.a = -1;
        }
        t1();
    }

    public void v2(boolean z) {
        y(null);
        if (this.H != z) {
            this.H = z;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (this.B == 0) {
            return 0;
        }
        return s2(i, sVar, yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void y(String str) {
        RecyclerView recyclerView;
        if (this.L == null && (recyclerView = this.b) != null) {
            recyclerView.p(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean y0() {
        return true;
    }

    public LinearLayoutManager(int i, boolean z) {
        this.B = 1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.L = null;
        this.M = new a();
        this.N = new b();
        this.O = 2;
        this.P = new int[2];
        u2(i);
        y(null);
        if (z != this.F) {
            this.F = z;
            t1();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.B = 1;
        this.F = false;
        this.G = false;
        this.H = false;
        this.I = true;
        this.J = -1;
        this.K = Integer.MIN_VALUE;
        this.L = null;
        this.M = new a();
        this.N = new b();
        this.O = 2;
        this.P = new int[2];
        RecyclerView.m.d p0 = RecyclerView.m.p0(context, attributeSet, i, i2);
        u2(p0.a);
        boolean z = p0.c;
        y(null);
        if (z != this.F) {
            this.F = z;
            t1();
        }
        v2(p0.d);
    }
}
