package com.spotify.android.glue.patterns.header;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.os.f;
import androidx.core.os.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderAccessoryBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueNoHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.GlueScrollingViewBehavior;
import com.spotify.android.glue.patterns.header.behavior.HeaderBehavior;
import com.spotify.android.glue.patterns.header.headers.GlueNoHeaderView;
import com.spotify.android.glue.patterns.prettylist.u;
import com.spotify.android.paste.app.d;
import com.spotify.music.C0707R;

public class GlueHeaderLayout extends CoordinatorLayout {
    private boolean I;
    private u J;
    private boolean K;
    private final Drawable L;

    /* access modifiers changed from: private */
    public static class a extends View.BaseSavedState {
        public static final Parcelable.Creator<a> CREATOR = f.a(new C0147a());
        private CoordinatorLayout.g a;

        /* renamed from: com.spotify.android.glue.patterns.header.GlueHeaderLayout$a$a  reason: collision with other inner class name */
        static class C0147a implements g<a> {
            C0147a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // androidx.core.os.g
            public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            /* Return type fixed from 'java.lang.Object[]' to match base method */
            @Override // androidx.core.os.g
            public a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.os.Parcelable, android.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.a, i);
        }

        protected a(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.a = (CoordinatorLayout.g) parcel.readParcelable(classLoader);
        }
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getTranslucentAreaHeight() {
        return d.c(getContext());
    }

    public void A(boolean z) {
        View C = C(false);
        C.getClass();
        com.spotify.android.glue.patterns.header.headers.a aVar = (com.spotify.android.glue.patterns.header.headers.a) C;
        HeaderBehavior headerBehavior = (HeaderBehavior) ((CoordinatorLayout.e) aVar.getView().getLayoutParams()).c();
        if (headerBehavior != null) {
            headerBehavior.o(this, aVar, z);
        }
    }

    public View B() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((CoordinatorLayout.e) childAt.getLayoutParams()).c() instanceof GlueHeaderAccessoryBehavior) {
                return childAt;
            }
        }
        return null;
    }

    public View C(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof com.spotify.android.glue.patterns.header.headers.a) {
                return childAt;
            }
        }
        if (z) {
            return null;
        }
        throw new IllegalStateException("Must have a Behaving header");
    }

    public boolean D() {
        return this.I;
    }

    public void E(boolean z) {
        RecyclerView recyclerView;
        View C = C(false);
        C.getClass();
        com.spotify.android.glue.patterns.header.headers.a aVar = (com.spotify.android.glue.patterns.header.headers.a) C;
        HeaderBehavior headerBehavior = (HeaderBehavior) ((CoordinatorLayout.e) aVar.getView().getLayoutParams()).c();
        if (headerBehavior != null) {
            headerBehavior.v(this, aVar, z);
        }
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                recyclerView = null;
                break;
            }
            View childAt = getChildAt(i);
            if (childAt instanceof RecyclerView) {
                recyclerView = (RecyclerView) childAt;
                break;
            }
            i++;
        }
        if (recyclerView != null) {
            if (z) {
                recyclerView.N0(0);
                return;
            }
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                ((LinearLayoutManager) layoutManager).t2(0, 0);
            } else {
                recyclerView.I0(0);
            }
        }
    }

    public void F(View view, boolean z) {
        CoordinatorLayout.e eVar;
        View B = B();
        if (B != null) {
            removeView(B);
        }
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null || !z) {
                eVar = new CoordinatorLayout.e(-2, -2);
            } else {
                eVar = generateLayoutParams(layoutParams);
            }
            eVar.j(new GlueHeaderAccessoryBehavior());
            addView(view, eVar);
        }
    }

    public <T extends View & com.spotify.android.glue.patterns.header.headers.a> void G(T t, HeaderBehavior<T> headerBehavior, boolean z) {
        View C = C(true);
        if (z || C != t) {
            View C2 = C(true);
            if (C2 != null) {
                removeView(C2);
            }
            View view = t.getView();
            CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -2);
            eVar.j(headerBehavior);
            addView(view, 1, eVar);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.K) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, getTranslucentAreaHeight(), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public u getToolbarUpdater() {
        return this.J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.K) {
            this.L.setBounds(0, 0, getMeasuredWidth(), getTranslucentAreaHeight());
            this.L.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (C(true) == null) {
            G(new GlueNoHeaderView(getContext()), new GlueNoHeaderBehavior(), true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            super.onRestoreInstanceState(((a) parcelable).a);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(AbsSavedState.EMPTY_STATE);
        aVar.a = (CoordinatorLayout.g) super.onSaveInstanceState();
        return aVar;
    }

    public void setAccessory(View view) {
        F(view, false);
    }

    public void setFakeActionBarWhenNoHeader(boolean z) {
        this.K = z;
        View C = C(true);
        if (C instanceof GlueNoHeaderView) {
            ((GlueNoHeaderView) C).setFakingActionBar(this.K);
        }
        setWillNotDraw(true ^ this.K);
    }

    public void setSplitView(boolean z) {
        this.I = z;
    }

    public void setTitle(CharSequence charSequence) {
        u uVar = this.J;
        if (uVar != null) {
            uVar.setTitle(charSequence != null ? charSequence.toString() : "");
        }
    }

    public void setToolbarUpdater(u uVar) {
        this.J = uVar;
    }

    public void z(View view) {
        CoordinatorLayout.e eVar = new CoordinatorLayout.e(-1, -1);
        eVar.j(new GlueScrollingViewBehavior());
        addView(view, eVar);
    }

    public GlueHeaderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0707R.attr.pasteActionBarBackground, typedValue, true)) {
            this.L = new ColorDrawable(0);
        } else if (typedValue.type == 3) {
            this.L = i2.d(context.getResources(), typedValue.resourceId, null);
        } else {
            this.L = new ColorDrawable(typedValue.data);
        }
    }
}
