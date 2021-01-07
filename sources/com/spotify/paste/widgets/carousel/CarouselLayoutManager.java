package com.spotify.paste.widgets.carousel;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.spotify.base.java.logging.Logger;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.carousel.h;
import java.util.ArrayList;
import java.util.List;

public class CarouselLayoutManager extends RecyclerView.m implements h {
    private int B;
    private int C;
    private int D;
    private int E;
    private g F;
    protected int G;
    protected int H = -1;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private final MeasureMode M;
    private boolean N;
    private int O;
    private final d P = new d(null);
    private boolean Q;
    private c R = new b();
    private final SparseArray<View> S = new SparseArray<>();
    private final List<View> T = new ArrayList();
    private final f U = new f(null);
    private h.a V;

    public static class CarouselLayoutParams extends RecyclerView.LayoutParams {
        public CarouselLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public CarouselLayoutParams(int i, int i2) {
            super(i, i2);
        }

        public CarouselLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: private */
    public enum LayoutDirections {
        NONE(0),
        START(-1),
        END(1);
        
        final int mShift;

        private LayoutDirections(int i) {
            this.mShift = i;
        }
    }

    public enum MeasureMode {
        SQUARE,
        FILL
    }

    protected enum ScrollDirection {
        NONE,
        START,
        END
    }

    /* access modifiers changed from: package-private */
    public class b implements c {
        b() {
        }
    }

    /* access modifiers changed from: package-private */
    public interface c {
    }

    /* access modifiers changed from: private */
    public static final class d {
        boolean a;
        boolean b;
        int c = -1;
        int d;

        d(a aVar) {
        }
    }

    protected static class e extends t {
        private final ScrollDirection q;

        public e(Context context, ScrollDirection scrollDirection) {
            super(context);
            this.q = scrollDirection;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public PointF a(int i) {
            int ordinal = this.q.ordinal();
            int i2 = 1;
            if (ordinal == 1) {
                i2 = -1;
            } else if (ordinal != 2) {
                i2 = 0;
            }
            return new PointF((float) i2, 0.0f);
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            return super.q(displayMetrics) * 2.0f;
        }
    }

    /* access modifiers changed from: private */
    public final class f {
        boolean a;
        int b;

        f(a aVar) {
        }
    }

    public CarouselLayoutManager(MeasureMode measureMode) {
        if (measureMode != null) {
            this.M = measureMode;
            return;
        }
        throw new IllegalArgumentException("MeasureMode must not be null!");
    }

    static int O1(CarouselLayoutManager carouselLayoutManager, int i) {
        return carouselLayoutManager.D + i;
    }

    private void R1(int i) {
        if (this.F != null) {
            for (int i2 = 0; i2 < W(); i2++) {
                View V2 = V(i2);
                V2.getClass();
                int X1 = X1(V2);
                float f2 = 1.0f;
                if (b0(V2) < getPaddingLeft() + X1) {
                    float paddingLeft = ((float) ((getPaddingLeft() + X1) - b0(V2))) / ((float) this.B);
                    if (paddingLeft <= 1.0f) {
                        f2 = paddingLeft;
                    }
                    this.F.c(V2, f2, i);
                } else {
                    float b0 = ((float) (b0(V2) - (getPaddingLeft() + X1))) / ((float) this.B);
                    if (b0 <= 1.0f) {
                        f2 = b0;
                    }
                    this.F.d(V2, f2, i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int S1(int i) {
        if (i0() != 0) {
            if (i > i0() - 1) {
                return i0() - 1;
            }
            if (i >= 0) {
                return i;
            }
        }
        return 0;
    }

    private void T1(LayoutDirections layoutDirections, RecyclerView.s sVar, RecyclerView.y yVar) {
        int i;
        if (W() != 0) {
            if (!this.P.b) {
                e2(false);
            }
            for (int i2 = 0; i2 < W(); i2++) {
                this.S.put(this.D + i2, V(i2));
            }
            for (int i3 = 0; i3 < this.S.size(); i3++) {
                O(this.S.valueAt(i3));
            }
        }
        this.D += layoutDirections.mShift;
        int i4 = 0;
        int i5 = -1;
        while (i4 < 3 && ((i = this.D + i4) < yVar.c() || yVar.e())) {
            View view = this.S.get(i);
            if (view == null) {
                view = sVar.g(i);
                if (view.getTag(C0707R.id.paste_carousel_tag) == null) {
                    view.setTag(C0707R.id.paste_carousel_tag, new a());
                }
                a2(view, i4);
                this.T.add(view);
                O(view);
                v(view);
            } else {
                this.T.add(view);
                this.S.remove(i);
                a2(view, i4);
                z(view, -1);
            }
            ((CarouselLayoutParams) view.getLayoutParams()).getClass();
            Y1();
            view.measure(View.MeasureSpec.makeMeasureSpec(this.B, 1073741824), View.MeasureSpec.makeMeasureSpec(this.C, 1073741824));
            if (((RecyclerView.LayoutParams) view.getLayoutParams()).a() == this.P.c) {
                i5 = i4;
            }
            i4++;
        }
        if (this.K || !this.P.a || i5 == -1) {
            i5 = this.G > 0 ? 1 : 0;
            d dVar = this.P;
            dVar.a = true;
            dVar.d = getPaddingLeft() + X1(this.T.get(i5));
            this.P.b = false;
        }
        int i6 = this.P.d;
        for (int i7 = i5 - 1; i7 >= 0; i7--) {
            i6 -= this.T.get(i7).getMeasuredWidth() + this.E;
        }
        for (View view2 : this.T) {
            int g0 = ((((g0() - getPaddingTop()) - getPaddingBottom()) - view2.getMeasuredHeight()) / 2) + getPaddingTop();
            ((CarouselLayoutParams) view2.getLayoutParams()).getClass();
            Y1();
            E0(view2, i6, g0, i6 + this.B, g0 + this.C);
            i6 += view2.getMeasuredWidth() + this.E;
        }
        for (int i8 = 0; i8 < this.S.size(); i8++) {
            sVar.k(this.S.valueAt(i8));
        }
        d dVar2 = this.P;
        dVar2.a = false;
        dVar2.b = false;
        dVar2.c = -1;
        this.S.clear();
        this.T.clear();
        R1(0);
    }

    private int U1() {
        int i = 0;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < W(); i3++) {
            View V2 = V(i3);
            V2.getClass();
            int abs = Math.abs(((Y1() / 2) + getPaddingLeft()) - (((d0(V2) - b0(V2)) / 2) + b0(V2)));
            if (abs < i2) {
                i = i3;
                i2 = abs;
            }
        }
        return i;
    }

    private int V1(int i, View view) {
        int i2;
        int i3 = 0;
        int v0 = (v0() - getPaddingRight()) - (view != null ? d0(view) : 0);
        if (view != null) {
            ((CarouselLayoutParams) view.getLayoutParams()).getClass();
            b bVar = (b) this.R;
            i2 = (CarouselLayoutManager.this.Y1() - CarouselLayoutManager.this.B) / 2;
        } else {
            i2 = 0;
        }
        int i4 = v0 - i2;
        if (Math.abs(i4) > 1) {
            i3 = i4;
        }
        return Math.max(-i, i3);
    }

    private int W1(int i, View view) {
        int i2 = 0;
        int paddingLeft = getPaddingLeft() + (-(view != null ? b0(view) : 0)) + X1(view);
        if (Math.abs(paddingLeft) > 1) {
            i2 = paddingLeft;
        }
        return Math.min(-i, i2);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int Y1() {
        int v0 = (v0() - getPaddingLeft()) - getPaddingRight();
        int i = this.O;
        if (v0 > i && i != 0) {
            this.P.a = false;
        }
        this.O = v0;
        return v0;
    }

    private void a2(View view, int i) {
        a aVar = (a) view.getTag(C0707R.id.paste_carousel_tag);
        g gVar = this.F;
        boolean z = false;
        if (gVar == null) {
            aVar.f((byte) 0);
        } else if (i == 0 && gVar.a() > 0 && this.G != 0) {
            aVar.f((byte) -1);
            aVar.d(this.F.a());
        } else if (i != 2 || this.F.b() <= 0) {
            aVar.f((byte) 0);
        } else {
            aVar.f((byte) 1);
            aVar.d(this.F.b());
        }
        if (i == this.G - this.D) {
            z = true;
        }
        aVar.g(z);
    }

    private void e2(boolean z) {
        View V2 = W() > 1 ? V(1) : V(0);
        V2.getClass();
        this.P.c = ((CarouselLayoutParams) V2.getLayoutParams()).a();
        this.P.d = b0(V2);
        d dVar = this.P;
        dVar.b = z;
        dVar.a = true;
        if (z) {
            int paddingLeft = getPaddingLeft() + X1(V2);
            d dVar2 = this.P;
            if (paddingLeft == dVar2.d && !this.Q) {
                dVar2.a = false;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean B() {
        return W() > 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean D(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof CarouselLayoutParams;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        if (i < i0()) {
            ScrollDirection scrollDirection = ScrollDirection.NONE;
            int i2 = this.G;
            if (i > i2) {
                scrollDirection = ScrollDirection.END;
            } else if (i < i2) {
                scrollDirection = ScrollDirection.START;
            }
            b bVar = (b) this.R;
            bVar.getClass();
            b bVar2 = new b(bVar, recyclerView.getContext(), scrollDirection);
            bVar2.m(i);
            J1(bVar2);
            this.G = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void K0(RecyclerView.e eVar, RecyclerView.e eVar2) {
        Logger.b("onAdapterChanged(oldAdapter='%s', newAdapter='%s')", eVar, eVar2);
        m1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        return new CarouselLayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams S(Context context, AttributeSet attributeSet) {
        return new CarouselLayoutParams(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams T(ViewGroup.LayoutParams layoutParams) {
        return new CarouselLayoutParams(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void W0(RecyclerView recyclerView, int i, int i2) {
        Logger.b("onItemsAdded(recyclerView='%s', positionStart='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2));
        if (W() != 0) {
            int i3 = this.G;
            if (i <= i3) {
                this.G = i3 + i2;
            }
            f fVar = this.U;
            if (fVar.a && i <= CarouselLayoutManager.this.U.b) {
                CarouselLayoutManager.this.U.b += i2;
            }
            this.L = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void X0(RecyclerView recyclerView) {
        Logger.b("onItemsChanged(recyclerView='%s')", recyclerView);
        this.K = true;
        this.L = true;
    }

    /* access modifiers changed from: protected */
    public int X1(View view) {
        if (view == null) {
            return 0;
        }
        ((CarouselLayoutParams) view.getLayoutParams()).getClass();
        b bVar = (b) this.R;
        return (CarouselLayoutManager.this.Y1() - CarouselLayoutManager.this.B) / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Y0(RecyclerView recyclerView, int i, int i2, int i3) {
        Logger.b("onItemsMoved(recyclerView='%s', from='%s', to='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        int i4 = i + i3;
        int i5 = this.G;
        if (i4 < i5) {
            if (i2 > i5) {
                this.G = i5 - i3;
            }
        } else if (i <= i5 && i4 >= i5) {
            this.G = (i2 - i) + i5;
        } else if (i > i5 && i2 <= i5) {
            this.G = i5 + i3;
        }
        this.L = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void Z0(RecyclerView recyclerView, int i, int i2) {
        Logger.b("onItemsRemoved(recyclerView='%s', positionStart='%s', itemCount='%s')", recyclerView, Integer.valueOf(i), Integer.valueOf(i2));
        if (W() != 0) {
            int i3 = i + i2;
            int i4 = i3 - 1;
            int i5 = this.G;
            if (i4 < i5) {
                this.G = i5 - i2;
            } else if (i <= i5 && i3 >= i5) {
                this.G = S1(i5);
            }
            f fVar = this.U;
            if (fVar.a) {
                int i6 = i3 - 1;
                int i7 = fVar.b;
                if (i6 < i7) {
                    fVar.b = i7 - i2;
                } else if (i <= i7 && i3 >= i7) {
                    fVar.b = CarouselLayoutManager.this.S1(i7);
                }
            }
            this.L = true;
        }
    }

    public boolean Z1() {
        return this.N;
    }

    @Override // com.spotify.paste.widgets.carousel.h
    public int a() {
        return this.D + U1();
    }

    public void b2(boolean z) {
        this.I = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        h.a aVar;
        int i;
        if (i0() == 0) {
            N(sVar);
            return;
        }
        if (yVar.b() && (i = this.H) != -1) {
            this.G = i;
        }
        if (this.G > i0() - 1) {
            this.G = i0() - 1;
        } else if (this.G < 0) {
            this.G = 0;
        }
        int i2 = this.G;
        if (i2 != 0) {
            this.D = i2 - 1;
        } else {
            this.D = i2;
        }
        if (W() != 0) {
            e2(true);
        }
        N(sVar);
        T1(LayoutDirections.NONE, sVar, yVar);
        this.K = false;
        this.H = -1;
        if (!yVar.e() && (aVar = this.V) != null) {
            uqb.f(((sqb) aVar).a, this.L);
        }
        this.L = false;
    }

    public void c2(boolean z) {
        this.J = z;
    }

    public void d2(g gVar) {
        this.F = gVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void e1(RecyclerView.s sVar, RecyclerView.y yVar, int i, int i2) {
        int i3 = 0;
        Logger.b("onMeasure(recycler='%s', state='%s', widthSpec='%s', heightSpec='%s')", sVar, yVar, Integer.valueOf(i), Integer.valueOf(i2));
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!(mode == Integer.MIN_VALUE || mode == 1073741824)) {
            size = n0();
        }
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        g gVar = this.F;
        if (gVar != null) {
            i3 = (this.F.b() + gVar.a()) * 2;
        }
        int i4 = paddingLeft - i3;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + i4;
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, paddingBottom);
        } else if (mode2 == 0) {
            size2 = paddingBottom;
        } else if (mode2 != 1073741824) {
            size2 = m0();
        }
        A1(size, size2);
        if (this.M == MeasureMode.SQUARE) {
            int min = Math.min(size2, i4);
            this.B = min;
            this.C = min;
        } else {
            this.B = i4;
            this.C = (size2 - getPaddingTop()) - getPaddingBottom();
        }
        this.E = (i4 - CarouselLayoutManager.this.B) / 2;
    }

    @Override // com.spotify.paste.widgets.carousel.h
    public int f() {
        return this.G;
    }

    @Override // com.spotify.paste.widgets.carousel.h
    public int g(int i, int i2) {
        if (Math.abs(i) < 1500) {
            return this.D + U1();
        }
        int i3 = this.G;
        if (i > 0) {
            if (!this.J) {
                i3++;
            }
        } else if (!this.I) {
            i3--;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return i3 > i0() + -1 ? i0() - 1 : i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j1(int i) {
        boolean z = i == 1;
        this.N = z;
        this.Q = i == 2;
        if (z && !this.U.a && W() > 0) {
            f fVar = this.U;
            fVar.b = O1(CarouselLayoutManager.this, (CarouselLayoutManager.this.W() <= 1 || CarouselLayoutManager.this.G <= 0) ? 0 : 1);
            fVar.a = true;
        }
        if (i == 0) {
            this.U.a = false;
        }
    }

    @Override // com.spotify.paste.widgets.carousel.h
    public void m(h.a aVar) {
        this.V = aVar;
    }

    @Override // com.spotify.paste.widgets.carousel.h
    public boolean q(int i) {
        View V2 = V(i - this.D);
        if (V2 != null) {
            if (b0(V2) == X1(V2) + (V2.getParent() instanceof CarouselView ? ((CarouselView) V2.getParent()).getPaddingLeft() : 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x010c  */
    @Override // androidx.recyclerview.widget.RecyclerView.m
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int u1(int r18, androidx.recyclerview.widget.RecyclerView.s r19, androidx.recyclerview.widget.RecyclerView.y r20) {
        /*
        // Method dump skipped, instructions count: 292
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.paste.widgets.carousel.CarouselLayoutManager.u1(int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$y):int");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        if (i < i0()) {
            this.D = Math.max(i - 1, 0);
            this.G = i;
            this.H = i;
            t1();
        }
    }
}
