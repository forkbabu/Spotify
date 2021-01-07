package com.spotify.music.nowplaying.drivingmode.view.pivot;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

public class PivotListLayoutManager extends RecyclerView.m {
    private final b B;
    private RecyclerView C;
    private Rect D;
    private Optional<Integer> E = Optional.absent();
    private Optional<Integer> F = Optional.absent();
    private int G = -1;
    private int H;
    private View I;
    private int J;
    private boolean K;
    private int L;
    private int M;
    private a N;
    private int O = -1;

    private class a extends t {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.x
        public PointF a(int i) {
            return i > PivotListLayoutManager.this.C.X(PivotListLayoutManager.this.I) ? new PointF(0.0f, 1.0f) : new PointF(0.0f, -1.0f);
        }

        @Override // androidx.recyclerview.widget.t
        public int p(int i, int i2, int i3, int i4, int i5) {
            return PivotListLayoutManager.this.J - i2;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.t
        public float q(DisplayMetrics displayMetrics) {
            return super.q(displayMetrics) * 2.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    PivotListLayoutManager(b bVar) {
        this.B = bVar;
    }

    private int P1() {
        if (T1()) {
            return (R1() - this.G) / this.H;
        }
        return (int) Math.ceil((double) (((float) (Math.abs(this.G) + this.D.height())) / ((float) this.H)));
    }

    private void Q1(RecyclerView.s sVar) {
        N(sVar);
        if (!this.K) {
            View g = sVar.g(0);
            H0(g, 0, 0);
            this.H = c0(g);
            this.C.getHitRect(this.D);
            int height = (this.D.height() + this.H) / 2;
            this.J = height;
            this.G = height - ((i0() - 2) * this.H);
            int i0 = this.J - (i0() * this.H);
            if (this.G < 0) {
                this.E = Optional.of(Integer.valueOf(i0));
                this.G = this.J;
                while (true) {
                    int i = this.G;
                    if (i <= 0) {
                        break;
                    }
                    this.G = i - this.H;
                }
            } else {
                this.E = Optional.of(Integer.valueOf(i0));
            }
            if (this.E.isPresent()) {
                this.F = Optional.of(Integer.valueOf(((i0() - 1) * this.H) + this.J));
            }
            this.M = this.G;
            int i2 = this.O;
            if (i2 != -1) {
                U1(i2);
            }
            this.K = true;
        }
        int i3 = this.G;
        int P1 = P1();
        int i4 = 0;
        while (i4 < P1) {
            View g2 = sVar.g((this.L + i4) % i0());
            v(g2);
            H0(g2, 0, 0);
            int c0 = c0(g2) + i3;
            F0(g2, getPaddingLeft(), i3, d(g2) + getPaddingLeft(), c0);
            if (this.D.height() / 2 > i3 && this.D.height() / 2 <= c0) {
                if (this.I != g2) {
                    PivotListRecyclerView pivotListRecyclerView = PivotListRecyclerView.this;
                    pivotListRecyclerView.a1((q) pivotListRecyclerView.a0(g2));
                }
                this.I = g2;
            }
            i4++;
            i3 = c0;
        }
        for (RecyclerView.b0 b0Var : ImmutableList.copyOf((Collection) sVar.f())) {
            sVar.k(b0Var.a);
        }
    }

    private int R1() {
        return (i0() * this.H) + this.G;
    }

    private boolean T1() {
        return this.E.isPresent() || this.F.isPresent();
    }

    private void U1(int i) {
        if (!T1()) {
            this.G = this.M;
            int P1 = i - (P1() / 2);
            if (P1 <= 0) {
                P1 += i0();
            }
            this.L = P1;
            return;
        }
        this.G = this.J - ((i + 1) * this.H);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean C() {
        return W() > 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
        if (i >= 0 && i < i0() && this.K) {
            this.N.m(i);
            J1(this.N);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void M0(RecyclerView recyclerView) {
        this.C = recyclerView;
        this.D = new Rect();
        this.N = new a(recyclerView.getContext());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void O0(RecyclerView recyclerView, RecyclerView.s sVar) {
        N0();
        n1(sVar);
        sVar.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public RecyclerView.LayoutParams R() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* access modifiers changed from: package-private */
    public View S1() {
        return this.I;
    }

    public void V1(int i) {
        this.O = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
        N(sVar);
        if (i0() != 0) {
            this.L = 0;
            this.G = -1;
            this.E = Optional.absent();
            this.F = Optional.absent();
            this.K = false;
            Q1(sVar);
            if (!yVar.e()) {
                PivotListRecyclerView.T0(PivotListRecyclerView.this);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void v1(int i) {
        if (i >= 0 && i < i0() && this.K) {
            U1(i);
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
        if (yVar.d() == 0) {
            i = (int) (((float) i) * 1.0f);
        }
        boolean z = true;
        if (i > 0 && this.E.isPresent() && this.G - i <= this.E.get().intValue()) {
            int intValue = this.G - this.E.get().intValue();
            this.G = this.E.get().intValue();
            Q1(sVar);
            return -intValue;
        }
        if (i >= 0 || !this.F.isPresent() || R1() - i <= this.F.get().intValue()) {
            z = false;
        }
        if (z) {
            int R1 = R1() - this.F.get().intValue();
            this.G -= R1;
            Q1(sVar);
            return -R1;
        }
        this.G -= i;
        if (T1()) {
            Q1(sVar);
            return i;
        } else if (W() == 0) {
            return i;
        } else {
            View V = V(0);
            V.getClass();
            int o0 = o0(V);
            while (true) {
                int i2 = this.G;
                if (i2 <= 0) {
                    break;
                }
                this.G = i2 - this.H;
                o0--;
                if (o0 == -1) {
                    o0 = i0() - 1;
                }
            }
            while (true) {
                int i3 = this.G;
                int i4 = this.H;
                if (i3 <= (-i4)) {
                    this.G = i3 + i4;
                    o0++;
                } else {
                    this.L = o0;
                    Q1(sVar);
                    return i;
                }
            }
        }
    }
}
