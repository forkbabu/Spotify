package com.spotify.android.glue.patterns.prettylist;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.spotify.android.glue.components.toolbar.c;
import com.spotify.android.glue.patterns.header.headers.GlueHeaderView;
import com.spotify.android.glue.patterns.header.headers.a;
import com.spotify.music.C0707R;

public class PrettyHeaderView extends ViewGroup implements a, a {
    private u a = u.g;
    private HeaderInternalImageView b;
    private View c;
    private CharSequence f;
    private View n;
    private View o;
    private d p;
    private int q;
    private int r;
    private float s;
    private int t;
    private int u;
    private int v;

    /* access modifiers changed from: package-private */
    public static class HeaderInternalImageView extends AppCompatImageView {
        private boolean a;

        public HeaderInternalImageView(Context context) {
            super(context);
        }

        public boolean a() {
            return this.a;
        }

        public void d(boolean z) {
            this.a = z;
        }

        /* access modifiers changed from: package-private */
        public void e(Drawable drawable) {
            super.setImageDrawable(drawable);
        }

        @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
        public void setImageDrawable(Drawable drawable) {
            if (!this.a) {
                super.setImageDrawable(drawable);
            }
        }

        public HeaderInternalImageView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public HeaderInternalImageView(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }
    }

    public PrettyHeaderView(Context context, View view) {
        super(context);
        b(context, false);
        addView(view);
        setupHeaderMode(view);
    }

    private void setupHeaderMode(View view) {
        this.c = view;
        if (view instanceof b) {
            HeaderInternalImageView headerInternalImageView = this.b;
            this.p = new e(this, headerInternalImageView, view, this.t);
            headerInternalImageView.setVisibility(8);
            return;
        }
        this.p = new f(this, this.b, view, this.t, this.a);
        this.b.setVisibility(0);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f2) {
        this.r = i;
        this.s = f2;
        this.p.j(i, f2);
        if (this.p.c()) {
            invalidate(0, 0, getMeasuredWidth(), this.p.a() - i);
        }
    }

    /* access modifiers changed from: protected */
    public void b(Context context, boolean z) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0707R.attr.pastePrettyHeaderStyle, typedValue, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(typedValue.resourceId, oud.b);
            this.v = obtainStyledAttributes.getColor(1, -16777216);
            this.t = obtainStyledAttributes.getDimensionPixelSize(0, nud.g(24.0f, getResources()));
            obtainStyledAttributes.recycle();
            HeaderInternalImageView headerInternalImageView = new HeaderInternalImageView(context);
            this.b = headerInternalImageView;
            headerInternalImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            setHeaderBackgroundIsAlwaysImage(z);
            addView(this.b);
            return;
        }
        throw new IllegalStateException("Unable to resolve PrettyHeaderView style.");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        if (!this.p.c() || (view != this.b && view != this.c)) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, 0, getWidth(), this.p.a());
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public View getAccessory() {
        return this.n;
    }

    public ImageView getBackgroundView() {
        return this.p.b();
    }

    public int getDefaultScrollOffset() {
        return this.p.h;
    }

    public View getFooter() {
        return this.o;
    }

    public View getHeaderView() {
        return this.p.c;
    }

    public CharSequence getTitle() {
        return this.f;
    }

    public u getToolbarUpdater() {
        return this.a;
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        return getMeasuredHeight() - (this.q + this.u);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View view = null;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof a) {
                view = childAt;
            }
        }
        view.getClass();
        setupHeaderMode(view);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.p.d(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            this.p.e(i, i2);
        } else {
            this.p.e(i, z42.B());
        }
        d dVar = this.p;
        setMeasuredDimension(dVar.o, dVar.n);
    }

    public void setAccessory(View view) {
        View view2 = this.n;
        if (view2 != null) {
            removeView(view2);
        }
        this.n = view;
        this.p.f = view;
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setBackgroundColorFilter(int i) {
        this.p.f(i);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.a
    public void setCoordinatorAccessoryOffset(int i) {
        this.u = i;
        this.p.g(i);
    }

    public void setFooter(View view) {
        View view2 = this.o;
        if (view2 != null) {
            removeView(view2);
        }
        this.o = view;
        this.p.g = view;
        if (view != null) {
            addView(view);
            View view3 = this.n;
            if (view3 != null) {
                setAccessory(view3);
            }
        }
        requestLayout();
    }

    public void setGradientColor(int i) {
        this.p.h(i);
    }

    public void setHasFixedSize(boolean z) {
        this.p.i(z);
    }

    public void setHeaderBackgroundIsAlwaysImage(boolean z) {
        Context context = getContext();
        if (z) {
            this.b.d(false);
            this.b.setImageDrawable(new ColorDrawable(nud.h(context, 16842836)));
            this.b.setColorFilter(this.v);
            return;
        }
        this.b.d(true);
        this.b.setBackgroundColor(nud.h(context, 16842836));
    }

    public void setHeaderStatic(boolean z) {
        this.p.e = z;
    }

    public void setHeaderVisible(boolean z) {
        d dVar = this.p;
        dVar.d = z;
        dVar.c.setVisibility(z ? 0 : 8);
        if (getParent() != null) {
            getParent().requestLayout();
        }
    }

    public void setManageAccessorySize(boolean z) {
        this.p.s = z;
    }

    public void setMinHeight(int i) {
        this.p.m = i;
    }

    public void setScrollingTopPadding(int i) {
        this.p.k(i);
    }

    public void setTitle(CharSequence charSequence) {
        c glueToolbar;
        this.f = charSequence;
        this.p.q = charSequence;
        this.a.setTitle(charSequence != null ? charSequence.toString() : null);
        this.p.j(this.r, this.s);
        View view = this.c;
        if ((view instanceof GlueHeaderView) && (glueToolbar = ((GlueHeaderView) view).getGlueToolbar()) != null) {
            glueToolbar.setTitle(String.valueOf(charSequence));
        }
    }

    public void setToolbarUpdater(u uVar) {
        this.a = uVar;
        this.p.p = uVar;
    }

    public void setTopPadding(int i) {
        this.q = i;
        this.p.l(i);
    }

    public PrettyHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, false);
    }
}
