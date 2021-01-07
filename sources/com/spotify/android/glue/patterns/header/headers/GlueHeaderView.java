package com.spotify.android.glue.patterns.header.headers;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.common.base.MoreObjects;
import com.spotify.android.glue.patterns.header.backgrounds.HeaderGenericBackground;
import com.spotify.android.glue.patterns.header.behavior.GlueHeaderBehavior;
import com.spotify.android.glue.patterns.header.behavior.e;
import com.spotify.android.glue.patterns.header.headers.b;
import com.spotify.android.glue.patterns.prettylist.r;
import com.spotify.music.C0707R;
import java.util.Locale;

@CoordinatorLayout.c(GlueHeaderBehavior.class)
public class GlueHeaderView extends ViewGroup implements r, com.spotify.android.glue.patterns.prettylist.b, a, com.spotify.android.glue.patterns.prettylist.a {
    private static final e o = new b();
    private e a;
    private c b;
    private b c;
    private final Rect f;
    private int n;

    /* access modifiers changed from: package-private */
    public class a implements b.a {
        a() {
        }
    }

    static class b implements e {
        b() {
        }

        @Override // com.spotify.android.glue.patterns.header.behavior.e
        public void a(float f) {
        }
    }

    public static class c {
        private int a = C0707R.attr.glueHeaderStyle;
        private HeaderGenericBackground.VisualStyle b = HeaderGenericBackground.VisualStyle.IMAGE_AND_COLOR;

        c(a aVar) {
        }

        public GlueHeaderView a(Context context) {
            return new GlueHeaderView(context, null, this.a, 0, this.b, null, null);
        }

        public c b() {
            this.a = C0707R.attr.glueHeaderStyleReduced;
            return this;
        }

        public c c(HeaderGenericBackground.VisualStyle visualStyle) {
            this.b = visualStyle;
            return this;
        }
    }

    /* synthetic */ GlueHeaderView(Context context, AttributeSet attributeSet, int i, int i2, HeaderGenericBackground.VisualStyle visualStyle, com.spotify.android.glue.patterns.header.backgrounds.a aVar, a aVar2) {
        this(context, null, i, i2, visualStyle, null);
    }

    static void c(int i, g90 g90) {
        if (g90 != null) {
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) g90.getView().getLayoutParams();
            if (!(glueHeaderViewLayoutParams != null ? glueHeaderViewLayoutParams.a : false)) {
                View view = g90.getView();
                view.offsetTopAndBottom(i - view.getTop());
            }
        }
    }

    public static c d() {
        return new c(null);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.b, com.spotify.android.glue.patterns.header.headers.v2.a
    public void a(int i, float f2) {
        this.c.c(i);
        this.b.a(i, f2);
        this.a.a(f2);
    }

    public void e(d dVar) {
        this.b.d.clear();
        dVar.a(this);
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new GlueHeaderViewLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new GlueHeaderViewLayoutParams(getContext(), attributeSet);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public ImageView getBackgroundImageView() {
        return this.b.d.getBackgroundImageView();
    }

    public qc0 getContentViewBinder() {
        return this.b.b;
    }

    public com.spotify.android.glue.components.toolbar.c getGlueToolbar() {
        return this.b.c;
    }

    public float getHeightFraction() {
        return this.c.b();
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public int getTotalScrollRange() {
        b bVar = this.c;
        return bVar.b - ((bVar.c + bVar.d) + bVar.e);
    }

    @Override // com.spotify.android.glue.patterns.header.headers.a
    public View getView() {
        return this;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        Rect rect = this.f;
        int i6 = rect.left + rect.right;
        int i7 = rect.top + rect.bottom;
        View view = this.b.d.getView();
        Rect rect2 = this.f;
        view.layout(rect2.left, rect2.top, getMeasuredWidth() - i6, getMeasuredHeight() - i7);
        b bVar = this.c;
        int i8 = bVar.e;
        com.spotify.android.glue.components.toolbar.c cVar = this.b.c;
        if (cVar != null) {
            View view2 = cVar.getView();
            view2.layout(0, i8, view2.getMeasuredWidth(), view2.getMeasuredHeight() + i8);
            if (!this.c.a) {
                i8 += view2.getMeasuredHeight();
            }
        } else if (!bVar.a) {
            i8 += this.n;
        }
        qc0 qc0 = this.b.b;
        if (qc0 != null) {
            View view3 = qc0.getView();
            int measuredHeight = (getMeasuredHeight() - i8) - this.c.d;
            int i9 = ((GlueHeaderViewLayoutParams) view3.getLayoutParams()).b;
            if (i9 == 0) {
                i5 = i8;
            } else if (i9 == 1) {
                i5 = (measuredHeight + i8) - view3.getMeasuredHeight();
            } else if (i9 == 2) {
                i5 = ((measuredHeight - view3.getMeasuredHeight()) / 2) + i8;
            } else {
                throw new IllegalArgumentException(String.format(Locale.getDefault(), "Invalid gravity value: %d", Integer.valueOf(i9)));
            }
            this.c.i = i5 - i8;
            view3.layout(0, i5, view3.getMeasuredWidth(), view3.getMeasuredHeight() + i5);
        }
        qc0 qc02 = this.b.b;
        if (qc02 instanceof sc0) {
            ((sc0) qc02).b();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        b bVar = this.c;
        int i3 = bVar.d + bVar.e;
        c cVar = this.b;
        com.spotify.android.glue.components.toolbar.c cVar2 = cVar.c;
        if (cVar2 != null) {
            cVar.getClass();
            View view = cVar2.getView();
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams = (GlueHeaderViewLayoutParams) view.getLayoutParams();
            glueHeaderViewLayoutParams.getClass();
            int i4 = ((ViewGroup.MarginLayoutParams) glueHeaderViewLayoutParams).height;
            MoreObjects.checkArgument((i4 == -2 || i4 == -1) ? false : true);
            view.measure(z42.A(size), z42.A(((ViewGroup.MarginLayoutParams) glueHeaderViewLayoutParams).height));
            int measuredHeight = view.getMeasuredHeight();
            b bVar2 = this.c;
            if (!bVar2.a) {
                i3 += measuredHeight;
            }
            bVar2.c = measuredHeight;
        } else {
            int i5 = this.n;
            bVar.c = i5;
            if (!bVar.a) {
                i3 += i5;
            }
        }
        if (this.b.b != null) {
            int a2 = this.c.a();
            c cVar3 = this.b;
            qc0 qc0 = cVar3.b;
            cVar3.getClass();
            View view2 = qc0.getView();
            GlueHeaderViewLayoutParams glueHeaderViewLayoutParams2 = (GlueHeaderViewLayoutParams) view2.getLayoutParams();
            if (glueHeaderViewLayoutParams2 == null) {
                view2.setMinimumHeight(a2);
                view2.measure(z42.A(size), z42.B());
            } else {
                int i6 = ((ViewGroup.MarginLayoutParams) glueHeaderViewLayoutParams2).height;
                if (i6 == -1) {
                    view2.setMinimumHeight(a2);
                    view2.measure(z42.A(size), z42.B());
                } else if (i6 == -2) {
                    view2.measure(z42.A(size), z42.B());
                } else {
                    view2.measure(z42.A(size), z42.A(((ViewGroup.MarginLayoutParams) glueHeaderViewLayoutParams2).height));
                }
            }
            i3 += Math.max(view2.getMeasuredHeight(), a2);
        }
        Rect rect = this.f;
        this.b.d.getView().measure(z42.A((size - rect.left) - rect.right), z42.A((i3 - rect.top) - rect.bottom));
        setMeasuredDimension(size, i3);
        this.c.b = i3;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.b
    public void setAccessoryMargin(int i) {
        this.c.d = i;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public void setAvoidCroppingImageWithParallax(boolean z) {
        this.b.d.setAvoidCroppingImageWithParallax(z);
    }

    /* access modifiers changed from: package-private */
    public void setChildHelper(c cVar) {
        this.b = cVar;
    }

    @Override // com.spotify.android.glue.patterns.prettylist.b
    public void setColor(int i) {
        this.b.d.setSolidColor(i);
    }

    public void setContentViewBinder(qc0 qc0) {
        this.b.b(qc0);
    }

    @Override // com.spotify.android.glue.patterns.prettylist.a
    public void setCoordinatorAccessoryOffset(int i) {
        setAccessoryMargin(i);
    }

    public void setCustomBackground(com.spotify.android.glue.patterns.header.backgrounds.a aVar) {
        aVar.getClass();
        removeView(this.b.d.getView());
        addView(aVar.getView(), 0);
        this.b.d = aVar;
    }

    public void setExternalToolbarHeight(int i) {
        this.n = i;
        requestLayout();
    }

    public void setGlueToolbar(com.spotify.android.glue.components.toolbar.c cVar) {
        this.b.c(cVar, nud.l(getContext(), C0707R.attr.actionBarSize));
    }

    @Override // com.spotify.android.glue.patterns.prettylist.r
    public void setHasFixedSize(boolean z) {
        this.b.d.setHasFixedSize(z);
    }

    /* access modifiers changed from: package-private */
    public void setHeaderInnerState(b bVar) {
        this.c = bVar;
    }

    public void setHeightFraction(float f2) {
        this.c.d(f2);
        requestLayout();
    }

    public void setScrollObserver(e eVar) {
        this.a = (e) MoreObjects.firstNonNull(eVar, this.a);
    }

    public void setToolbarOverlaysContent(boolean z) {
        this.c.a = z;
        requestLayout();
    }

    @Override // com.spotify.android.glue.patterns.prettylist.b
    public void setTopOffset(int i) {
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.glueHeaderStyle, 0, null, null);
    }

    public GlueHeaderView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, C0707R.attr.glueHeaderStyle, i, null, null);
    }

    /* JADX INFO: finally extract failed */
    private GlueHeaderView(Context context, AttributeSet attributeSet, int i, int i2, HeaderGenericBackground.VisualStyle visualStyle, com.spotify.android.glue.patterns.header.backgrounds.a aVar) {
        super(context, attributeSet, i);
        HeaderGenericBackground.VisualStyle visualStyle2;
        this.a = o;
        this.f = new Rect();
        int d = com.spotify.android.goldenpath.a.d(getContext());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, nm0.a, i, i2);
        try {
            float fraction = obtainStyledAttributes.getFraction(3, 1, 1, -1.0f);
            int integer = obtainStyledAttributes.getInteger(4, 3);
            if (integer == 1) {
                visualStyle2 = HeaderGenericBackground.VisualStyle.COLOR_ONLY;
            } else if (integer != 2) {
                visualStyle2 = HeaderGenericBackground.VisualStyle.IMAGE_AND_COLOR;
            } else {
                visualStyle2 = HeaderGenericBackground.VisualStyle.IMAGE_ONLY;
            }
            obtainStyledAttributes.recycle();
            this.c = new b(new a(), fraction, d, getResources().getDisplayMetrics().heightPixels);
            aVar = aVar == null ? new HeaderGenericBackground(context, (HeaderGenericBackground.VisualStyle) MoreObjects.firstNonNull(visualStyle, visualStyle2)) : aVar;
            addView(aVar.getView(), 0);
            this.b = new c(this, aVar);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static class GlueHeaderViewLayoutParams extends ViewGroup.MarginLayoutParams {
        public boolean a;
        public int b = 2;
        public ic0 c;

        public GlueHeaderViewLayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nm0.b);
            try {
                this.a = obtainStyledAttributes.getBoolean(1, true);
                this.b = obtainStyledAttributes.getInt(0, 2);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        public GlueHeaderViewLayoutParams(int i, int i2) {
            super(i, i2);
        }
    }
}
