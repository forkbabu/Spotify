package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.prettylist.t;
import com.spotify.music.C0707R;
import com.spotify.paste.widgets.recyclerview.fastscroll.RecyclerViewFastScroller;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class StickyRecyclerView extends ViewGroup implements t {
    private final Set<t.a> A;
    private final c B;
    private boolean C;
    private boolean D;
    private final RecyclerViewFastScroller E;
    private boolean F;
    private boolean a;
    private int b;
    private final RecyclerView c;
    private final AbsListView.LayoutParams f;
    private final f n;
    private View o;
    private final Rect p;
    private View q;
    private final Paint r;
    private boolean s;
    private boolean t;
    private int u;
    private View v;
    private int w;
    private final int[] x;
    private final int[] y;
    private boolean z;

    public interface b {
        void e(int i);
    }

    private class c extends RecyclerView.l {
        c(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            int X = recyclerView.X(view);
            rect.setEmpty();
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            layoutManager.getClass();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                StringBuilder V0 = je.V0("The layout manager ");
                V0.append(layoutManager.getClass().getSimpleName());
                V0.append(" is not supported!");
                throw new IllegalArgumentException(V0.toString());
            } else if (((LinearLayoutManager) layoutManager).j2() == 1) {
                if (layoutManager instanceof GridLayoutManager) {
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                    X = gridLayoutManager.G2().c(X, gridLayoutManager.C2());
                }
                if (X == 0 && StickyRecyclerView.this.o.getVisibility() != 8) {
                    rect.top = StickyRecyclerView.this.getHeaderHeight();
                }
            } else {
                throw new IllegalStateException("Layout manager must be in vertical position");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void k(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
            if (StickyRecyclerView.this.r.getColor() != 0 && StickyRecyclerView.this.j()) {
                int headerTop = StickyRecyclerView.this.getHeaderTop();
                canvas.drawRect(0.0f, (float) headerTop, (float) StickyRecyclerView.this.o.getWidth(), (float) (StickyRecyclerView.this.o.getHeight() + headerTop), StickyRecyclerView.this.r);
            }
        }
    }

    private class d extends RecyclerView {
        private RecyclerView.e<?> O0;
        private boolean P0;
        private final RecyclerView.g Q0 = new a();

        class a extends RecyclerView.g {
            a() {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.g
            public void a() {
                if (d.this.O0.u() > 0) {
                    d dVar = d.this;
                    d.super.setAdapter(dVar.O0);
                    d.this.O0.W(this);
                    d.this.P0 = true;
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            super.n(StickyRecyclerView.this.n);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public void D0(RecyclerView.q qVar) {
            StickyRecyclerView.this.n.g(qVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public RecyclerView.e<?> getAdapter() {
            if (!this.P0) {
                return this.O0;
            }
            return super.getAdapter();
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public void n(RecyclerView.q qVar) {
            StickyRecyclerView.this.n.e(qVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public void setAdapter(RecyclerView.e eVar) {
            if (this.P0 || eVar == null) {
                super.setAdapter(eVar);
                return;
            }
            RecyclerView.e<?> eVar2 = this.O0;
            if (eVar2 != null) {
                eVar2.W(this.Q0);
            }
            if (eVar.u() == 0) {
                this.O0 = eVar;
                eVar.T(this.Q0);
                super.setAdapter(null);
                return;
            }
            this.P0 = true;
            super.setAdapter(eVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView
        public void u() {
            StickyRecyclerView.this.n.f();
        }
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        private boolean a;

        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        e(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt() != 0;
        }
    }

    /* access modifiers changed from: private */
    public class f extends RecyclerView.q implements Runnable {
        private List<RecyclerView.q> a;

        f(a aVar) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void a(RecyclerView recyclerView, int i) {
            if (!StickyRecyclerView.this.a) {
                StickyRecyclerView.this.m();
                List<RecyclerView.q> list = this.a;
                if (list != null) {
                    for (RecyclerView.q qVar : list) {
                        qVar.a(recyclerView, i);
                    }
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public void c(RecyclerView recyclerView, int i, int i2) {
            if (!StickyRecyclerView.this.a) {
                StickyRecyclerView.this.m();
                List<RecyclerView.q> list = this.a;
                if (list != null) {
                    for (RecyclerView.q qVar : list) {
                        qVar.c(recyclerView, i, i2);
                    }
                }
            }
        }

        public void e(RecyclerView.q qVar) {
            if (this.a == null) {
                this.a = new CopyOnWriteArrayList();
            }
            this.a.add(qVar);
        }

        public void f() {
            List<RecyclerView.q> list = this.a;
            if (list != null) {
                list.clear();
            }
        }

        public void g(RecyclerView.q qVar) {
            List<RecyclerView.q> list = this.a;
            if (list != null) {
                list.remove(qVar);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!StickyRecyclerView.this.a) {
                StickyRecyclerView.this.m();
            }
        }
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    private int getFirstVisibleDecoratedTopIncludingMargin() {
        RecyclerView.m layoutManager = this.c.getLayoutManager();
        int i = 0;
        if (layoutManager == null || layoutManager.W() == 0) {
            return 0;
        }
        View V = layoutManager.V(0);
        V.getClass();
        boolean z2 = this.c.Z(V) == 0;
        int e0 = layoutManager.e0(V);
        if (z2) {
            i = getHeaderHeight();
        }
        int i2 = e0 + i;
        return V.getLayoutParams() instanceof ViewGroup.MarginLayoutParams ? i2 - ((ViewGroup.MarginLayoutParams) V.getLayoutParams()).topMargin : i2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getHeaderHeight() {
        return this.f.height;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private int getHeaderTop() {
        return getFirstVisibleDecoratedTopIncludingMargin() - getHeaderHeight();
    }

    private int getHeaderTopIncludingStickiness() {
        if (l()) {
            return -getStickinessOffset();
        }
        return getHeaderTop();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean j() {
        RecyclerView.m layoutManager = this.c.getLayoutManager();
        layoutManager.getClass();
        if (layoutManager.W() == 0) {
            return true;
        }
        View V = layoutManager.V(0);
        V.getClass();
        if (this.c.Z(V) == 0) {
            return true;
        }
        return false;
    }

    private void k() {
        int stickinessOffset = getStickinessOffset();
        int min = j() ? Math.min(-getHeaderTop(), stickinessOffset) : stickinessOffset;
        float f2 = stickinessOffset != 0 ? ((float) min) / ((float) stickinessOffset) : 0.0f;
        for (t.a aVar : this.A) {
            aVar.a(min, f2);
        }
    }

    private boolean l() {
        return this.s && (!j() || getHeaderTop() < (-getStickinessOffset()));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m() {
        int headerTopIncludingStickiness = getHeaderTopIncludingStickiness() - this.o.getTop();
        int top = this.o.getTop();
        this.o.offsetTopAndBottom(headerTopIncludingStickiness);
        if (top != this.o.getTop()) {
            invalidate();
        }
        k();
    }

    private void setStickingToTop(boolean z2) {
        if (this.o != null && z2 != this.t) {
            this.t = z2;
            k();
        }
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void a(t.a aVar) {
        this.A.add(aVar);
    }

    public View getHeaderView() {
        return this.o;
    }

    public RecyclerView getRecyclerView() {
        return this.c;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public int getStickinessOffset() {
        return this.u;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.o == null || this.E.m()) {
            return false;
        }
        this.o.getHitRect(this.p);
        if (!this.p.contains((int) motionEvent.getX(), (int) motionEvent.getY()) || !this.c.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        this.z = true;
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013b  */
    @Override // android.view.ViewGroup, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4 = this.b;
        if (i4 > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        if (this.F) {
            this.o.forceLayout();
        }
        this.o.measure(i, i3);
        this.c.measure(i, i2);
        setMeasuredDimension(this.c.getMeasuredWidth(), this.c.getMeasuredHeight());
        this.f.width = this.o.getMeasuredWidth();
        this.f.height = this.o.getMeasuredHeight();
        int measuredHeight = this.c.getMeasuredHeight() - this.w;
        View view = this.v;
        if (view != null) {
            measuredHeight -= view.getMeasuredHeight() / 2;
        }
        this.E.measure(z42.B(), z42.A(measuredHeight));
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof e) {
            e eVar = (e) parcelable;
            super.onRestoreInstanceState(eVar.getSuperState());
            this.D = eVar.a;
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.a = this.D;
        return eVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.z) {
            z2 = this.c.onTouchEvent(motionEvent);
        } else {
            z2 = super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.z = false;
        }
        return z2;
    }

    public void setAutoHideHeader(boolean z2) {
        this.C = z2;
        requestLayout();
    }

    public void setFilterView(View view) {
        this.q = view;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setHeaderBackgroundColor(int i) {
        this.r.setColor(i);
        this.c.i0();
    }

    public void setHeaderHeight(int i) {
        this.b = i;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setHeaderView(View view) {
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        if (view == null) {
            view = new View(getContext());
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        this.o = view;
        addView(view);
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setSticky(boolean z2) {
        this.s = z2;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setStickyView(View view) {
        this.v = view;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.t
    public void setStickyViewOffset(int i) {
        this.w = i;
        requestLayout();
    }

    public void setUseFastScroll(boolean z2) {
        this.c.setVerticalScrollBarEnabled(!z2);
        this.E.setEnabled(z2);
    }

    public StickyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new AbsListView.LayoutParams(0, 0);
        this.n = new f(null);
        this.p = new Rect();
        this.r = new Paint();
        this.x = new int[2];
        this.y = new int[2];
        this.A = new HashSet();
        this.D = true;
        this.a = true;
        RecyclerView dVar = new d(context, attributeSet, i);
        this.c = dVar;
        dVar.setId(C0707R.id.legacy_header_sticky_inner_recycler);
        c cVar = new c(null);
        this.B = cVar;
        dVar.k(cVar, -1);
        dVar.setVerticalScrollBarEnabled(false);
        RecyclerViewFastScroller recyclerViewFastScroller = new RecyclerViewFastScroller(context, null);
        this.E = recyclerViewFastScroller;
        recyclerViewFastScroller.setRecyclerView(dVar);
        recyclerViewFastScroller.setVerticalScrollBarEnabled(true);
        recyclerViewFastScroller.setEnabled(false);
        addView(dVar);
        addView(recyclerViewFastScroller);
        this.a = false;
        View view = new View(getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        setHeaderView(view);
    }

    public static class DynamicBottomPaddingLinearLayoutManager extends LinearLayoutManager implements b {
        private int Q;
        private int R;
        private boolean S;
        private final Context T;
        private androidx.recyclerview.widget.t U;

        public DynamicBottomPaddingLinearLayoutManager(Context context, int i, boolean z) {
            super(i, z);
            this.T = context;
            this.U = new s(this, context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public void I1(RecyclerView recyclerView, RecyclerView.y yVar, int i) {
            this.U.m(i);
            J1(this.U);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public int Z1() {
            this.S = true;
            int Z1 = super.Z1();
            this.S = false;
            return Z1;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public int b2() {
            this.S = true;
            int b2 = super.b2();
            this.S = false;
            return b2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public void c1(RecyclerView.s sVar, RecyclerView.y yVar) {
            super.c1(sVar, yVar);
            int W = W();
            int i = 0;
            for (int i2 = 0; i2 < W; i2++) {
                View V = V(i2);
                V.getClass();
                i += V.getMeasuredHeight();
            }
            if (this.Q != i) {
                this.Q = i;
                super.c1(sVar, yVar);
            }
        }

        @Override // com.spotify.android.glue.patterns.prettylist.StickyRecyclerView.b
        public void e(int i) {
            this.R = i;
            t1();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m
        public int getPaddingBottom() {
            if (this.S || this.R == 0) {
                return super.getPaddingBottom();
            }
            int g0 = (g0() - this.Q) - this.R;
            if (g0 > 0) {
                return g0;
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.m
        public int w1(int i, RecyclerView.s sVar, RecyclerView.y yVar) {
            boolean z = true;
            View V = V(W() - 1);
            View V2 = V(0);
            if (V == null || V2 == null) {
                return super.w1(i, sVar, yVar);
            }
            boolean z2 = ((RecyclerView.LayoutParams) V.getLayoutParams()).a() == i0() - 1;
            if (((RecyclerView.LayoutParams) V2.getLayoutParams()).a() == 0 && V2.getTop() >= 0) {
                z = false;
            }
            if (!z2 || i <= 0 || !z) {
                return super.w1(i, sVar, yVar);
            }
            return super.w1(Math.max(0, Math.min(i, a0(V) - g0())), sVar, yVar);
        }

        public DynamicBottomPaddingLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
            super(context, attributeSet, i, i2);
            this.T = context;
            this.U = new s(this, context);
        }
    }
}
