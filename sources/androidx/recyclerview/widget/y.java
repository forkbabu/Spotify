package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public abstract class y {
    protected final RecyclerView.m a;
    private int b = Integer.MIN_VALUE;
    final Rect c = new Rect();

    /* access modifiers changed from: package-private */
    public static class a extends y {
        a(RecyclerView.m mVar) {
            super(mVar, null);
        }

        @Override // androidx.recyclerview.widget.y
        public int d(View view) {
            return this.a.d0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.d(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.c0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int g(View view) {
            return this.a.b0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int h() {
            return this.a.v0();
        }

        @Override // androidx.recyclerview.widget.y
        public int i() {
            return this.a.v0() - this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.y
        public int j() {
            return this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.y
        public int k() {
            return this.a.w0();
        }

        @Override // androidx.recyclerview.widget.y
        public int l() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.y
        public int m() {
            return this.a.getPaddingLeft();
        }

        @Override // androidx.recyclerview.widget.y
        public int n() {
            return (this.a.v0() - this.a.getPaddingLeft()) - this.a.getPaddingRight();
        }

        @Override // androidx.recyclerview.widget.y
        public int p(View view) {
            this.a.u0(view, true, this.c);
            return this.c.right;
        }

        @Override // androidx.recyclerview.widget.y
        public int q(View view) {
            this.a.u0(view, true, this.c);
            return this.c.left;
        }

        @Override // androidx.recyclerview.widget.y
        public void r(int i) {
            this.a.I0(i);
        }
    }

    /* access modifiers changed from: package-private */
    public static class b extends y {
        b(RecyclerView.m mVar) {
            super(mVar, null);
        }

        @Override // androidx.recyclerview.widget.y
        public int d(View view) {
            return this.a.a0(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int e(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.c0(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int f(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            return this.a.d(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int g(View view) {
            return this.a.e0(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.y
        public int h() {
            return this.a.g0();
        }

        @Override // androidx.recyclerview.widget.y
        public int i() {
            return this.a.g0() - this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.y
        public int j() {
            return this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.y
        public int k() {
            return this.a.h0();
        }

        @Override // androidx.recyclerview.widget.y
        public int l() {
            return this.a.w0();
        }

        @Override // androidx.recyclerview.widget.y
        public int m() {
            return this.a.getPaddingTop();
        }

        @Override // androidx.recyclerview.widget.y
        public int n() {
            return (this.a.g0() - this.a.getPaddingTop()) - this.a.getPaddingBottom();
        }

        @Override // androidx.recyclerview.widget.y
        public int p(View view) {
            this.a.u0(view, true, this.c);
            return this.c.bottom;
        }

        @Override // androidx.recyclerview.widget.y
        public int q(View view) {
            this.a.u0(view, true, this.c);
            return this.c.top;
        }

        @Override // androidx.recyclerview.widget.y
        public void r(int i) {
            this.a.J0(i);
        }
    }

    y(RecyclerView.m mVar, a aVar) {
        this.a = mVar;
    }

    public static y a(RecyclerView.m mVar) {
        return new a(mVar);
    }

    public static y b(RecyclerView.m mVar, int i) {
        if (i == 0) {
            return new a(mVar);
        }
        if (i == 1) {
            return new b(mVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static y c(RecyclerView.m mVar) {
        return new b(mVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.b) {
            return 0;
        }
        return n() - this.b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.b = n();
    }
}
