package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.c;
import androidx.viewpager.widget.ViewPager;
import com.spotify.encore.consumer.components.promo.impl.promocard.renders.BitmapRenderer;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
public class PagerTitleStrip extends ViewGroup {
    private static final int[] x = {16842804, 16842901, 16842904, 16842927};
    private static final int[] y = {16843660};
    ViewPager a;
    TextView b;
    TextView c;
    TextView f;
    private int n = -1;
    float o = -1.0f;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private final a t = new a();
    private WeakReference<a> u;
    private int v;
    int w;

    /* access modifiers changed from: private */
    public class a extends DataSetObserver implements ViewPager.i, ViewPager.h {
        private int a;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(int i) {
            this.a = i;
        }

        @Override // androidx.viewpager.widget.ViewPager.h
        public void b(ViewPager viewPager, a aVar, a aVar2) {
            PagerTitleStrip.this.a(aVar, aVar2);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void f(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            PagerTitleStrip.this.c(i, f, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void g(int i) {
            if (this.a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f = pagerTitleStrip2.o;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                pagerTitleStrip2.c(pagerTitleStrip2.a.getCurrentItem(), f, true);
            }
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.a.getCurrentItem(), PagerTitleStrip.this.a.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f = pagerTitleStrip2.o;
            if (f < 0.0f) {
                f = 0.0f;
            }
            pagerTitleStrip2.c(pagerTitleStrip2.a.getCurrentItem(), f, true);
        }
    }

    /* access modifiers changed from: private */
    public static class b extends SingleLineTransformationMethod {
        private Locale a;

        b(Context context) {
            this.a = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.a);
            }
            return null;
        }
    }

    public PagerTitleStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        this.b = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.c = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            c.n(this.b, resourceId);
            c.n(this.c, resourceId);
            c.n(this.f, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            float f2 = (float) dimensionPixelSize;
            this.b.setTextSize(0, f2);
            this.c.setTextSize(0, f2);
            this.f.setTextSize(0, f2);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.b.setTextColor(color);
            this.c.setTextColor(color);
            this.f.setTextColor(color);
        }
        this.q = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.w = this.c.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, y);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.b);
            setSingleLineAllCaps(this.c);
            setSingleLineAllCaps(this.f);
        } else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.f.setSingleLine();
        }
        this.p = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, a aVar2) {
        if (aVar != null) {
            aVar.q(this.t);
            this.u = null;
        }
        if (aVar2 != null) {
            aVar2.k(this.t);
            this.u = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            this.n = -1;
            this.o = -1.0f;
            b(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(int i, a aVar) {
        int d = aVar != null ? aVar.d() : 0;
        this.r = true;
        CharSequence charSequence = null;
        this.b.setText((i < 1 || aVar == null) ? null : aVar.f(i - 1));
        this.c.setText((aVar == null || i >= d) ? null : aVar.f(i));
        int i2 = i + 1;
        if (i2 < d && aVar != null) {
            charSequence = aVar.f(i2);
        }
        this.f.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.c.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f.measure(makeMeasureSpec, makeMeasureSpec2);
        this.n = i;
        if (!this.s) {
            c(i, this.o, false);
        }
        this.r = false;
    }

    /* access modifiers changed from: package-private */
    public void c(int i, float f2, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.n) {
            b(i, this.a.getAdapter());
        } else if (!z && f2 == this.o) {
            return;
        }
        this.s = true;
        int measuredWidth = this.b.getMeasuredWidth();
        int measuredWidth2 = this.c.getMeasuredWidth();
        int measuredWidth3 = this.f.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (((float) i8) * f3))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.b.getBaseline();
        int baseline2 = this.c.getBaseline();
        int baseline3 = this.f.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.b.getMeasuredHeight() + i11, this.c.getMeasuredHeight() + i12), this.f.getMeasuredHeight() + i13);
        int i14 = this.q & 112;
        if (i14 == 16) {
            i5 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i14 != 80) {
            i4 = i11 + paddingTop;
            i2 = i12 + paddingTop;
            i3 = paddingTop + i13;
            TextView textView = this.c;
            textView.layout(i9, i2, i10, textView.getMeasuredHeight() + i2);
            int min = Math.min(paddingLeft, (i9 - this.p) - measuredWidth);
            TextView textView2 = this.b;
            textView2.layout(min, i4, measuredWidth + min, textView2.getMeasuredHeight() + i4);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.p);
            TextView textView3 = this.f;
            textView3.layout(max3, i3, max3 + measuredWidth3, textView3.getMeasuredHeight() + i3);
            this.o = f2;
            this.s = false;
        } else {
            i5 = (height - paddingBottom) - max2;
        }
        i4 = i11 + i5;
        i2 = i12 + i5;
        i3 = i5 + i13;
        TextView textView4 = this.c;
        textView4.layout(i9, i2, i10, textView4.getMeasuredHeight() + i2);
        int min2 = Math.min(paddingLeft, (i9 - this.p) - measuredWidth);
        TextView textView22 = this.b;
        textView22.layout(min2, i4, measuredWidth + min2, textView22.getMeasuredHeight() + i4);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.p);
        TextView textView32 = this.f;
        textView32.layout(max32, i3, max32 + measuredWidth3, textView32.getMeasuredHeight() + i3);
        this.o = f2;
        this.s = false;
    }

    /* access modifiers changed from: package-private */
    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.p;
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            a adapter = viewPager.getAdapter();
            viewPager.C(this.t);
            viewPager.b(this.t);
            this.a = viewPager;
            WeakReference<a> weakReference = this.u;
            a(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.a;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            this.a.C(null);
            this.a.v(this.t);
            this.a = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a != null) {
            float f2 = this.o;
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            c(this.n, f2, true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (((float) size) * 0.2f), -2);
            this.b.measure(childMeasureSpec2, childMeasureSpec);
            this.c.measure(childMeasureSpec2, childMeasureSpec);
            this.f.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                i3 = View.MeasureSpec.getSize(i2);
            } else {
                i3 = Math.max(getMinHeight(), this.c.getMeasuredHeight() + paddingBottom);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i3, i2, this.c.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        if (!this.r) {
            super.requestLayout();
        }
    }

    public void setGravity(int i) {
        this.q = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        int i = ((int) (f2 * 255.0f)) & BitmapRenderer.ALPHA_VISIBLE;
        this.v = i;
        int i2 = (i << 24) | (this.w & 16777215);
        this.b.setTextColor(i2);
        this.f.setTextColor(i2);
    }

    public void setTextColor(int i) {
        this.w = i;
        this.c.setTextColor(i);
        int i2 = (this.v << 24) | (this.w & 16777215);
        this.b.setTextColor(i2);
        this.f.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.p = i;
        requestLayout();
    }
}
