package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.spotify.music.C0707R;

public class CardView extends FrameLayout {
    private static final int[] q = {16842801};
    private static final e r;
    private boolean a;
    private boolean b;
    int c;
    int f;
    final Rect n;
    final Rect o;
    private final d p;

    /* access modifiers changed from: package-private */
    public class a implements d {
        private Drawable a;

        a() {
        }

        public Drawable a() {
            return this.a;
        }

        public boolean b() {
            return CardView.this.getPreventCornerOverlap();
        }

        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        public void d(int i, int i2, int i3, int i4) {
            CardView.this.o.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.n;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            r = new b();
        } else if (i >= 17) {
            r = new a();
        } else {
            r = new c();
        }
        r.l();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return r.e(this.p);
    }

    public float getCardElevation() {
        return r.i(this.p);
    }

    public int getContentPaddingBottom() {
        return this.n.bottom;
    }

    public int getContentPaddingLeft() {
        return this.n.left;
    }

    public int getContentPaddingRight() {
        return this.n.right;
    }

    public int getContentPaddingTop() {
        return this.n.top;
    }

    public float getMaxCardElevation() {
        return r.d(this.p);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return r.b(this.p);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public void n(int i, int i2, int i3, int i4) {
        this.n.set(i, i2, i3, i4);
        r.k(this.p);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        e eVar = r;
        if (!(eVar instanceof b)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.m(this.p)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) eVar.f(this.p)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        r.n(this.p, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f2) {
        r.c(this.p, f2);
    }

    public void setMaxCardElevation(float f2) {
        r.o(this.p, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.f = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.c = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            r.g(this.p);
        }
    }

    public void setRadius(float f2) {
        r.a(this.p, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            r.j(this.p);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.n = rect;
        this.o = new Rect();
        a aVar = new a();
        this.p = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a, i, C0707R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(q);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C0707R.color.cardview_light_background);
            } else {
                i2 = getResources().getColor(C0707R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.a = obtainStyledAttributes.getBoolean(7, false);
        this.b = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        r.h(aVar, context, valueOf, dimension, dimension2, f2);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        r.n(this.p, colorStateList);
    }
}
