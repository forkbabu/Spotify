package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import androidx.recyclerview.widget.y;
import com.google.android.flexbox.d;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.m implements a, RecyclerView.x.b {
    private static final Rect a0 = new Rect();
    private int B;
    private int C;
    private int D;
    private int E;
    private int F = -1;
    private boolean G;
    private boolean H;
    private List<c> I = new ArrayList();
    private final d J = new d(this);
    private RecyclerView.s K;
    private RecyclerView.y L;
    private c M;
    private b N = new b(null);
    private y O;
    private y P;
    private d Q;
    private int R = -1;
    private int S = Integer.MIN_VALUE;
    private int T = Integer.MIN_VALUE;
    private int U = Integer.MIN_VALUE;
    private SparseArray<View> V = new SparseArray<>();
    private final Context W;
    private View X;
    private int Y = -1;
    private d.b Z = new d.b();

    /* access modifiers changed from: private */
    public class b {
        private int a;
        private int b;
        private int c;
        private int d = 0;
        private boolean e;
        private boolean f;
        private boolean g;

        b(a aVar) {
        }

        static void e(b bVar) {
            int i;
            int i2;
            if (FlexboxLayoutManager.this.s() || !FlexboxLayoutManager.this.G) {
                if (bVar.e) {
                    i = FlexboxLayoutManager.this.O.i();
                } else {
                    i = FlexboxLayoutManager.this.O.m();
                }
                bVar.c = i;
                return;
            }
            if (bVar.e) {
                i2 = FlexboxLayoutManager.this.O.i();
            } else {
                i2 = FlexboxLayoutManager.this.v0() - FlexboxLayoutManager.this.O.m();
            }
            bVar.c = i2;
        }

        static void i(b bVar, View view) {
            y yVar;
            if (FlexboxLayoutManager.this.C == 0) {
                yVar = FlexboxLayoutManager.this.P;
            } else {
                yVar = FlexboxLayoutManager.this.O;
            }
            if (FlexboxLayoutManager.this.s() || !FlexboxLayoutManager.this.G) {
                if (bVar.e) {
                    bVar.c = yVar.o() + yVar.d(view);
                } else {
                    bVar.c = yVar.g(view);
                }
            } else if (bVar.e) {
                bVar.c = yVar.o() + yVar.g(view);
            } else {
                bVar.c = yVar.d(view);
            }
            bVar.a = FlexboxLayoutManager.this.o0(view);
            int i = 0;
            bVar.g = false;
            int[] iArr = FlexboxLayoutManager.this.J.c;
            int i2 = bVar.a;
            if (i2 == -1) {
                i2 = 0;
            }
            int i3 = iArr[i2];
            if (i3 != -1) {
                i = i3;
            }
            bVar.b = i;
            if (FlexboxLayoutManager.this.I.size() > bVar.b) {
                bVar.a = ((c) FlexboxLayoutManager.this.I.get(bVar.b)).o;
            }
        }

        static void n(b bVar) {
            bVar.a = -1;
            bVar.b = -1;
            bVar.c = Integer.MIN_VALUE;
            boolean z = false;
            bVar.f = false;
            bVar.g = false;
            if (FlexboxLayoutManager.this.s()) {
                if (FlexboxLayoutManager.this.C == 0) {
                    if (FlexboxLayoutManager.this.B == 1) {
                        z = true;
                    }
                    bVar.e = z;
                    return;
                }
                if (FlexboxLayoutManager.this.C == 2) {
                    z = true;
                }
                bVar.e = z;
            } else if (FlexboxLayoutManager.this.C == 0) {
                if (FlexboxLayoutManager.this.B == 3) {
                    z = true;
                }
                bVar.e = z;
            } else {
                if (FlexboxLayoutManager.this.C == 2) {
                    z = true;
                }
                bVar.e = z;
            }
        }

        public String toString() {
            StringBuilder V0 = je.V0("AnchorInfo{mPosition=");
            V0.append(this.a);
            V0.append(", mFlexLinePosition=");
            V0.append(this.b);
            V0.append(", mCoordinate=");
            V0.append(this.c);
            V0.append(", mPerpendicularCoordinate=");
            V0.append(this.d);
            V0.append(", mLayoutFromEnd=");
            V0.append(this.e);
            V0.append(", mValid=");
            V0.append(this.f);
            V0.append(", mAssignedFromSavedState=");
            return je.O0(V0, this.g, '}');
        }
    }

    /* access modifiers changed from: private */
    public static class c {
        private int a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h = 1;
        private int i = 1;
        private boolean j;

        c(a aVar) {
        }

        static /* synthetic */ int i(c cVar) {
            int i2 = cVar.c;
            cVar.c = i2 + 1;
            return i2;
        }

        static /* synthetic */ int j(c cVar) {
            int i2 = cVar.c;
            cVar.c = i2 - 1;
            return i2;
        }

        static boolean m(c cVar, RecyclerView.y yVar, List list) {
            int i2;
            int i3 = cVar.d;
            return i3 >= 0 && i3 < yVar.c() && (i2 = cVar.c) >= 0 && i2 < list.size();
        }

        public String toString() {
            StringBuilder V0 = je.V0("LayoutState{mAvailable=");
            V0.append(this.a);
            V0.append(", mFlexLinePosition=");
            V0.append(this.c);
            V0.append(", mPosition=");
            V0.append(this.d);
            V0.append(", mOffset=");
            V0.append(this.e);
            V0.append(", mScrollingOffset=");
            V0.append(this.f);
            V0.append(", mLastScrollDelta=");
            V0.append(this.g);
            V0.append(", mItemDirection=");
            V0.append(this.h);
            V0.append(", mLayoutDirection=");
            return je.A0(V0, this.i, '}');
        }
    }

    private static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        private int a;
        private int b;

        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, (a) null);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        d() {
        }

        static void f(d dVar) {
            dVar.a = -1;
        }

        static boolean g(d dVar, int i) {
            int i2 = dVar.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder V0 = je.V0("SavedState{mAnchorPosition=");
            V0.append(this.a);
            V0.append(", mAnchorOffset=");
            return je.A0(V0, this.b, '}');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }

        d(Parcel parcel, a aVar) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        d(d dVar, a aVar) {
            this.a = dVar.a;
            this.b = dVar.b;
        }
    }

    public FlexboxLayoutManager(Context context) {
        m2(0);
        n2(1);
        if (this.E != 4) {
            m1();
            T1();
            this.E = 4;
            t1();
        }
        x1(true);
        this.W = context;
    }

    private static boolean C0(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    private boolean F1(View view, int i, int i2, RecyclerView.LayoutParams layoutParams) {
        return view.isLayoutRequested() || !B0() || !C0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) layoutParams).width) || !C0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) layoutParams).height);
    }

    private void T1() {
        this.I.clear();
        b.n(this.N);
        this.N.d = 0;
    }

    private int U1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        int c2 = yVar.c();
        X1();
        View Z1 = Z1(c2);
        View b2 = b2(c2);
        if (yVar.c() == 0 || Z1 == null || b2 == null) {
            return 0;
        }
        return Math.min(this.O.n(), this.O.d(b2) - this.O.g(Z1));
    }

    private int V1(RecyclerView.y yVar) {
        if (W() == 0) {
            return 0;
        }
        int c2 = yVar.c();
        View Z1 = Z1(c2);
        View b2 = b2(c2);
        if (!(yVar.c() == 0 || Z1 == null || b2 == null)) {
            int o0 = o0(Z1);
            int o02 = o0(b2);
            int abs = Math.abs(this.O.d(b2) - this.O.g(Z1));
            int[] iArr = this.J.c;
            int i = iArr[o0];
            if (!(i == 0 || i == -1)) {
                return Math.round((((float) i) * (((float) abs) / ((float) ((iArr[o02] - i) + 1)))) + ((float) (this.O.m() - this.O.g(Z1))));
            }
        }
        return 0;
    }

    private int W1(RecyclerView.y yVar) {
        int i;
        if (W() == 0) {
            return 0;
        }
        int c2 = yVar.c();
        View Z1 = Z1(c2);
        View b2 = b2(c2);
        if (yVar.c() == 0 || Z1 == null || b2 == null) {
            return 0;
        }
        View e2 = e2(0, W(), false);
        if (e2 == null) {
            i = -1;
        } else {
            i = o0(e2);
        }
        return (int) ((((float) Math.abs(this.O.d(b2) - this.O.g(Z1))) / ((float) ((d2() - i) + 1))) * ((float) yVar.c()));
    }

    private void X1() {
        if (this.O == null) {
            if (s()) {
                if (this.C == 0) {
                    this.O = y.a(this);
                    this.P = y.c(this);
                    return;
                }
                this.O = y.c(this);
                this.P = y.a(this);
            } else if (this.C == 0) {
                this.O = y.c(this);
                this.P = y.a(this);
            } else {
                this.O = y.a(this);
                this.P = y.c(this);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x02f7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int Y1(androidx.recyclerview.widget.RecyclerView.s r31, androidx.recyclerview.widget.RecyclerView.y r32, com.google.android.flexbox.FlexboxLayoutManager.c r33) {
        /*
        // Method dump skipped, instructions count: 1198
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.Y1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y, com.google.android.flexbox.FlexboxLayoutManager$c):int");
    }

    private View Z1(int i) {
        int i2;
        View f2 = f2(0, W(), i);
        if (f2 == null || (i2 = this.J.c[o0(f2)]) == -1) {
            return null;
        }
        return a2(f2, this.I.get(i2));
    }

    private View a2(View view, c cVar) {
        boolean s = s();
        int i = cVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View V2 = V(i2);
            if (!(V2 == null || V2.getVisibility() == 8)) {
                if (!this.G || s) {
                    if (this.O.g(view) <= this.O.g(V2)) {
                    }
                } else if (this.O.d(view) >= this.O.d(V2)) {
                }
                view = V2;
            }
        }
        return view;
    }

    private View b2(int i) {
        View f2 = f2(W() - 1, -1, i);
        if (f2 == null) {
            return null;
        }
        return c2(f2, this.I.get(this.J.c[o0(f2)]));
    }

    private View c2(View view, c cVar) {
        boolean s = s();
        int W2 = (W() - cVar.h) - 1;
        for (int W3 = W() - 2; W3 > W2; W3--) {
            View V2 = V(W3);
            if (!(V2 == null || V2.getVisibility() == 8)) {
                if (!this.G || s) {
                    if (this.O.d(view) >= this.O.d(V2)) {
                    }
                } else if (this.O.g(view) <= this.O.g(V2)) {
                }
                view = V2;
            }
        }
        return view;
    }

    private View e2(int i, int i2, boolean z) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View V2 = V(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int v0 = v0() - getPaddingRight();
            int g0 = g0() - getPaddingBottom();
            int b0 = b0(V2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) V2.getLayoutParams())).leftMargin;
            int e0 = e0(V2) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) V2.getLayoutParams())).topMargin;
            int d0 = d0(V2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) V2.getLayoutParams())).rightMargin;
            int a02 = a0(V2) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) V2.getLayoutParams())).bottomMargin;
            boolean z2 = false;
            boolean z3 = paddingLeft <= b0 && v0 >= d0;
            boolean z4 = b0 >= v0 || d0 >= paddingLeft;
            boolean z5 = paddingTop <= e0 && g0 >= a02;
            boolean z6 = e0 >= g0 || a02 >= paddingTop;
            if (!z ? !(!z4 || !z6) : !(!z3 || !z5)) {
                z2 = true;
            }
            if (z2) {
                return V2;
            }
            i3 += i4;
        }
        return null;
    }

    private View f2(int i, int i2, int i3) {
        X1();
        View view = null;
        if (this.M == null) {
            this.M = new c(null);
        }
        int m = this.O.m();
        int i4 = this.O.i();
        int i5 = i2 > i ? 1 : -1;
        View view2 = null;
        while (i != i2) {
            View V2 = V(i);
            int o0 = o0(V2);
            if (o0 >= 0 && o0 < i3) {
                if (((RecyclerView.LayoutParams) V2.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = V2;
                    }
                } else if (this.O.g(V2) >= m && this.O.d(V2) <= i4) {
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

    private int g2(int i, RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int i2;
        int i3;
        if (!s() && this.G) {
            int m = i - this.O.m();
            if (m <= 0) {
                return 0;
            }
            i2 = i2(m, sVar, yVar);
        } else {
            int i4 = this.O.i() - i;
            if (i4 <= 0) {
                return 0;
            }
            i2 = -i2(-i4, sVar, yVar);
        }
        int i5 = i + i2;
        if (!z || (i3 = this.O.i() - i5) <= 0) {
            return i2;
        }
        this.O.r(i3);
        return i3 + i2;
    }

    private int h2(int i, RecyclerView.s sVar, RecyclerView.y yVar, boolean z) {
        int i2;
        int m;
        if (s() || !this.G) {
            int m2 = i - this.O.m();
            if (m2 <= 0) {
                return 0;
            }
            i2 = -i2(m2, sVar, yVar);
        } else {
            int i3 = this.O.i() - i;
            if (i3 <= 0) {
                return 0;
            }
            i2 = i2(-i3, sVar, yVar);
        }
        int i4 = i + i2;
        if (!z || (m = i4 - this.O.m()) <= 0) {
            return i2;
        }
        this.O.r(-m);
        return i2 - m;
    }

    private int i2(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        int i2;
        if (W() == 0 || i == 0) {
            return 0;
        }
        X1();
        this.M.j = true;
        boolean z = !s() && this.G;
        int i3 = (!z ? i <= 0 : i >= 0) ? -1 : 1;
        int abs = Math.abs(i);
        this.M.i = i3;
        boolean s = s();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(v0(), w0());
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(g0(), h0());
        boolean z2 = !s && this.G;
        if (i3 == 1) {
            View V2 = V(W() - 1);
            this.M.e = this.O.d(V2);
            int o0 = o0(V2);
            View c2 = c2(V2, this.I.get(this.J.c[o0]));
            this.M.h = 1;
            c cVar = this.M;
            cVar.d = o0 + cVar.h;
            if (this.J.c.length <= this.M.d) {
                this.M.c = -1;
            } else {
                c cVar2 = this.M;
                cVar2.c = this.J.c[cVar2.d];
            }
            if (z2) {
                this.M.e = this.O.g(c2);
                this.M.f = this.O.m() + (-this.O.g(c2));
                c cVar3 = this.M;
                cVar3.f = cVar3.f >= 0 ? this.M.f : 0;
            } else {
                this.M.e = this.O.d(c2);
                this.M.f = this.O.d(c2) - this.O.i();
            }
            if ((this.M.c == -1 || this.M.c > this.I.size() - 1) && this.M.d <= getFlexItemCount()) {
                int i4 = abs - this.M.f;
                this.Z.a();
                if (i4 > 0) {
                    if (s) {
                        this.J.b(this.Z, makeMeasureSpec, makeMeasureSpec2, i4, this.M.d, -1, this.I);
                    } else {
                        this.J.b(this.Z, makeMeasureSpec2, makeMeasureSpec, i4, this.M.d, -1, this.I);
                    }
                    this.J.j(makeMeasureSpec, makeMeasureSpec2, this.M.d);
                    this.J.D(this.M.d);
                }
            }
        } else {
            View V3 = V(0);
            this.M.e = this.O.g(V3);
            int o02 = o0(V3);
            View a2 = a2(V3, this.I.get(this.J.c[o02]));
            this.M.h = 1;
            int i5 = this.J.c[o02];
            if (i5 == -1) {
                i5 = 0;
            }
            if (i5 > 0) {
                this.M.d = o02 - this.I.get(i5 - 1).h;
            } else {
                this.M.d = -1;
            }
            this.M.c = i5 > 0 ? i5 - 1 : 0;
            if (z2) {
                this.M.e = this.O.d(a2);
                this.M.f = this.O.d(a2) - this.O.i();
                c cVar4 = this.M;
                cVar4.f = cVar4.f >= 0 ? this.M.f : 0;
            } else {
                this.M.e = this.O.g(a2);
                this.M.f = this.O.m() + (-this.O.g(a2));
            }
        }
        c cVar5 = this.M;
        cVar5.a = abs - cVar5.f;
        int Y1 = this.M.f + Y1(sVar, yVar, this.M);
        if (Y1 < 0) {
            return 0;
        }
        if (z) {
            if (abs > Y1) {
                i2 = (-i3) * Y1;
                this.O.r(-i2);
                this.M.g = i2;
                return i2;
            }
        } else if (abs > Y1) {
            i2 = i3 * Y1;
            this.O.r(-i2);
            this.M.g = i2;
            return i2;
        }
        i2 = i;
        this.O.r(-i2);
        this.M.g = i2;
        return i2;
    }

    private int j2(int i) {
        int i2;
        boolean z = false;
        if (W() == 0 || i == 0) {
            return 0;
        }
        X1();
        boolean s = s();
        View view = this.X;
        int width = s ? view.getWidth() : view.getHeight();
        int v0 = s ? v0() : g0();
        if (k0() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                i2 = Math.min((v0 + this.N.d) - width, abs);
            } else if (this.N.d + i <= 0) {
                return i;
            } else {
                i2 = this.N.d;
            }
        } else if (i > 0) {
            return Math.min((v0 - this.N.d) - width, i);
        } else {
            if (this.N.d + i >= 0) {
                return i;
            }
            i2 = this.N.d;
        }
        return -i2;
    }

    private void k2(RecyclerView.s sVar, c cVar) {
        int W2;
        if (cVar.j) {
            int i = -1;
            if (cVar.i == -1) {
                if (cVar.f >= 0) {
                    this.O.h();
                    int unused = cVar.f;
                    int W3 = W();
                    if (W3 != 0) {
                        int i2 = W3 - 1;
                        int i3 = this.J.c[o0(V(i2))];
                        if (i3 != -1) {
                            c cVar2 = this.I.get(i3);
                            int i4 = i2;
                            while (true) {
                                if (i4 < 0) {
                                    break;
                                }
                                View V2 = V(i4);
                                int i5 = cVar.f;
                                if (!(s() || !this.G ? this.O.g(V2) >= this.O.h() - i5 : this.O.d(V2) <= i5)) {
                                    break;
                                }
                                if (cVar2.o == o0(V2)) {
                                    if (i3 <= 0) {
                                        W3 = i4;
                                        break;
                                    }
                                    i3 += cVar.i;
                                    cVar2 = this.I.get(i3);
                                    W3 = i4;
                                }
                                i4--;
                            }
                            while (i2 >= W3) {
                                q1(i2, sVar);
                                i2--;
                            }
                        }
                    }
                }
            } else if (cVar.f >= 0 && (W2 = W()) != 0) {
                int i6 = this.J.c[o0(V(0))];
                if (i6 != -1) {
                    c cVar3 = this.I.get(i6);
                    int i7 = 0;
                    while (true) {
                        if (i7 >= W2) {
                            break;
                        }
                        View V3 = V(i7);
                        int i8 = cVar.f;
                        if (!(s() || !this.G ? this.O.d(V3) <= i8 : this.O.h() - this.O.g(V3) <= i8)) {
                            break;
                        }
                        if (cVar3.p == o0(V3)) {
                            if (i6 >= this.I.size() - 1) {
                                i = i7;
                                break;
                            }
                            i6 += cVar.i;
                            cVar3 = this.I.get(i6);
                            i = i7;
                        }
                        i7++;
                    }
                    while (i >= 0) {
                        q1(i, sVar);
                        i--;
                    }
                }
            }
        }
    }

    private void l2() {
        int i;
        if (s()) {
            i = h0();
        } else {
            i = w0();
        }
        this.M.b = i == 0 || i == Integer.MIN_VALUE;
    }

    private void p2(int i) {
        if (i < d2()) {
            int W2 = W();
            this.J.l(W2);
            this.J.m(W2);
            this.J.k(W2);
            if (i < this.J.c.length) {
                this.Y = i;
                View V2 = V(0);
                if (V2 != null) {
                    this.R = o0(V2);
                    if (s() || !this.G) {
                        this.S = this.O.g(V2) - this.O.m();
                        return;
                    }
                    this.S = this.O.j() + this.O.d(V2);
                }
            }
        }
    }

    private void q2(b bVar, boolean z, boolean z2) {
        if (z2) {
            l2();
        } else {
            this.M.b = false;
        }
        if (s() || !this.G) {
            this.M.a = this.O.i() - bVar.c;
        } else {
            this.M.a = bVar.c - getPaddingRight();
        }
        this.M.d = bVar.a;
        this.M.h = 1;
        this.M.i = 1;
        this.M.e = bVar.c;
        this.M.f = Integer.MIN_VALUE;
        this.M.c = bVar.b;
        if (z && this.I.size() > 1 && bVar.b >= 0 && bVar.b < this.I.size() - 1) {
            c.i(this.M);
            this.M.d += this.I.get(bVar.b).h;
        }
    }

    private void r2(b bVar, boolean z, boolean z2) {
        if (z2) {
            l2();
        } else {
            this.M.b = false;
        }
        if (s() || !this.G) {
            this.M.a = bVar.c - this.O.m();
        } else {
            this.M.a = (this.X.getWidth() - bVar.c) - this.O.m();
        }
        this.M.d = bVar.a;
        this.M.h = 1;
        this.M.i = -1;
        this.M.e = bVar.c;
        this.M.f = Integer.MIN_VALUE;
        this.M.c = bVar.b;
        if (z && bVar.b > 0 && this.I.size() > bVar.b) {
            c.j(this.M);
            this.M.d -= this.I.get(bVar.b).h;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean B() {
        if (this.C == 0) {
            return s();
        }
        if (s()) {
            int v0 = v0();
            View view = this.X;
            if (v0 <= (view != null ? view.getWidth() : 0)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean C() {
        if (this.C == 0) {
            return !s();
        }
        if (s()) {
            return true;
        }
        int g0 = g0();
        View view = this.X;
        if (g0 > (view != null ? view.getHeight() : 0)) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean D(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int H(RecyclerView.y yVar) {
        return U1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int I(RecyclerView.y yVar) {
        return V1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.m(i);
        J1(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int J(RecyclerView.y yVar) {
        return W1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int K(RecyclerView.y yVar) {
        return U1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void K0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        m1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int L(RecyclerView.y yVar) {
        return V1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int M(RecyclerView.y yVar) {
        return W1(yVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void M0(RecyclerView recyclerView) {
        this.X = (View) recyclerView.getParent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(RecyclerView recyclerView, RecyclerView.s sVar) {
        N0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams S(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void W0(RecyclerView recyclerView, int i, int i2) {
        p2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        p2(Math.min(i, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        p2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void a1(RecyclerView recyclerView, int i, int i2) {
        p2(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.x.b
    public PointF b(int i) {
        if (W() == 0) {
            return null;
        }
        int i2 = i < o0(V(0)) ? -1 : 1;
        if (s()) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void b1(RecyclerView recyclerView, int i, int i2, Object obj) {
        a1(recyclerView, i, i2);
        p2(i);
    }

    @Override // com.google.android.flexbox.a
    public void c(View view, int i, int i2, c cVar) {
        A(view, a0);
        if (s()) {
            int q0 = q0(view) + l0(view);
            cVar.e += q0;
            cVar.f += q0;
            return;
        }
        int U2 = U(view) + t0(view);
        cVar.e += U2;
        cVar.f += U2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01f6  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c1(androidx.recyclerview.widget.RecyclerView.s r19, androidx.recyclerview.widget.RecyclerView.y r20) {
        /*
        // Method dump skipped, instructions count: 1031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.c1(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void d1(RecyclerView.y yVar) {
        this.Q = null;
        this.R = -1;
        this.S = Integer.MIN_VALUE;
        this.Y = -1;
        b.n(this.N);
        this.V.clear();
    }

    public int d2() {
        View e2 = e2(W() - 1, -1, false);
        if (e2 == null) {
            return -1;
        }
        return o0(e2);
    }

    @Override // com.google.android.flexbox.a
    public int getAlignContent() {
        return 5;
    }

    @Override // com.google.android.flexbox.a
    public int getAlignItems() {
        return this.E;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexDirection() {
        return this.B;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexItemCount() {
        return this.L.c();
    }

    @Override // com.google.android.flexbox.a
    public List<c> getFlexLinesInternal() {
        return this.I;
    }

    @Override // com.google.android.flexbox.a
    public int getFlexWrap() {
        return this.C;
    }

    @Override // com.google.android.flexbox.a
    public int getLargestMainSize() {
        if (this.I.size() == 0) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        int size = this.I.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.I.get(i2).e);
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int getMaxLine() {
        return this.F;
    }

    @Override // com.google.android.flexbox.a
    public int getSumOfCrossSize() {
        int size = this.I.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.I.get(i2).g;
        }
        return i;
    }

    @Override // com.google.android.flexbox.a
    public int h(int i, int i2, int i3) {
        return RecyclerView.m.X(v0(), w0(), i2, i3, B());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void h1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.Q = (d) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public Parcelable i1() {
        d dVar = this.Q;
        if (dVar != null) {
            return new d(dVar, (a) null);
        }
        d dVar2 = new d();
        if (W() > 0) {
            View V2 = V(0);
            dVar2.a = o0(V2);
            dVar2.b = this.O.g(V2) - this.O.m();
        } else {
            d.f(dVar2);
        }
        return dVar2;
    }

    @Override // com.google.android.flexbox.a
    public View j(int i) {
        View view = this.V.get(i);
        if (view != null) {
            return view;
        }
        return this.K.g(i);
    }

    @Override // com.google.android.flexbox.a
    public int k(int i, int i2, int i3) {
        return RecyclerView.m.X(g0(), h0(), i2, i3, C());
    }

    @Override // com.google.android.flexbox.a
    public int l(View view) {
        int i;
        int i2;
        if (s()) {
            i2 = t0(view);
            i = U(view);
        } else {
            i2 = l0(view);
            i = q0(view);
        }
        return i + i2;
    }

    public void m2(int i) {
        if (this.B != i) {
            m1();
            this.B = i;
            this.O = null;
            this.P = null;
            T1();
            t1();
        }
    }

    @Override // com.google.android.flexbox.a
    public void n(c cVar) {
    }

    public void n2(int i) {
        if (i != 2) {
            int i2 = this.C;
            if (i2 != i) {
                if (i2 == 0 || i == 0) {
                    m1();
                    T1();
                }
                this.C = i;
                this.O = null;
                this.P = null;
                t1();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("wrap_reverse is not supported in FlexboxLayoutManager");
    }

    @Override // com.google.android.flexbox.a
    public View o(int i) {
        return j(i);
    }

    public void o2(int i) {
        if (this.D != i) {
            this.D = i;
            t1();
        }
    }

    @Override // com.google.android.flexbox.a
    public void p(int i, View view) {
        this.V.put(i, view);
    }

    @Override // com.google.android.flexbox.a
    public int r(View view, int i, int i2) {
        int t0;
        int U2;
        if (s()) {
            t0 = l0(view);
            U2 = q0(view);
        } else {
            t0 = t0(view);
            U2 = U(view);
        }
        return U2 + t0;
    }

    @Override // com.google.android.flexbox.a
    public boolean s() {
        int i = this.B;
        return i == 0 || i == 1;
    }

    @Override // com.google.android.flexbox.a
    public void setFlexLines(List<c> list) {
        this.I = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int u1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (!s() || (this.C == 0 && s())) {
            int i2 = i2(i, sVar, yVar);
            this.V.clear();
            return i2;
        }
        int j2 = j2(i);
        this.N.d += j2;
        this.P.r(-j2);
        return j2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        this.R = i;
        this.S = Integer.MIN_VALUE;
        d dVar = this.Q;
        if (dVar != null) {
            d.f(dVar);
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (s() || (this.C == 0 && !s())) {
            int i2 = i2(i, sVar, yVar);
            this.V.clear();
            return i2;
        }
        int j2 = j2(i);
        this.N.d += j2;
        this.P.r(-j2);
        return j2;
    }

    public static class LayoutParams extends RecyclerView.LayoutParams implements b {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();
        private float n = 0.0f;
        private float o = 1.0f;
        private int p = -1;
        private float q = -1.0f;
        private int r;
        private int s;
        private int t = 16777215;
        private int u = 16777215;
        private boolean v;

        static class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // com.google.android.flexbox.b
        public boolean G0() {
            return this.v;
        }

        @Override // com.google.android.flexbox.b
        public int I() {
            return this.p;
        }

        @Override // com.google.android.flexbox.b
        public float M() {
            return this.o;
        }

        @Override // com.google.android.flexbox.b
        public int Q() {
            return this.r;
        }

        @Override // com.google.android.flexbox.b
        public int T0() {
            return this.t;
        }

        @Override // com.google.android.flexbox.b
        public int X1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.b
        public int a2() {
            return this.s;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.b
        public int e2() {
            return this.u;
        }

        @Override // com.google.android.flexbox.b
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.b
        public int getOrder() {
            return 1;
        }

        @Override // com.google.android.flexbox.b
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.b
        public int h0() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.b
        public void m0(int i) {
            this.s = i;
        }

        @Override // com.google.android.flexbox.b
        public float o0() {
            return this.n;
        }

        @Override // com.google.android.flexbox.b
        public float v0() {
            return this.q;
        }

        @Override // com.google.android.flexbox.b
        public void v1(int i) {
            this.r = i;
        }

        @Override // com.google.android.flexbox.b
        public int w1() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.n);
            parcel.writeFloat(this.o);
            parcel.writeInt(this.p);
            parcel.writeFloat(this.q);
            parcel.writeInt(this.r);
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            parcel.writeByte(this.v ? (byte) 1 : 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.b
        public int z1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        protected LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.n = parcel.readFloat();
            this.o = parcel.readFloat();
            this.p = parcel.readInt();
            this.q = parcel.readFloat();
            this.r = parcel.readInt();
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt();
            this.v = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.m.d p0 = RecyclerView.m.p0(context, attributeSet, i, i2);
        int i3 = p0.a;
        if (i3 != 0) {
            if (i3 == 1) {
                if (p0.c) {
                    m2(3);
                } else {
                    m2(2);
                }
            }
        } else if (p0.c) {
            m2(1);
        } else {
            m2(0);
        }
        n2(1);
        if (this.E != 4) {
            m1();
            T1();
            this.E = 4;
            t1();
        }
        x1(true);
        this.W = context;
    }
}
