package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.c;
import com.spotify.music.C0707R;

public class SwitchCompat extends CompoundButton {
    private static final Property<SwitchCompat, Float> W = new a(Float.class, "thumbPos");
    private static final int[] a0 = {16842912};
    private int A;
    private int B;
    private float C;
    private float D;
    private VelocityTracker E;
    private int F;
    float G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private final TextPaint O;
    private ColorStateList P;
    private Layout Q;
    private Layout R;
    private TransformationMethod S;
    ObjectAnimator T;
    private final m U;
    private final Rect V;
    private Drawable a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean f;
    private boolean n;
    private Drawable o;
    private ColorStateList p;
    private PorterDuff.Mode q;
    private boolean r;
    private boolean s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private CharSequence x;
    private CharSequence y;
    private boolean z;

    class a extends Property<SwitchCompat, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.G);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public void set(SwitchCompat switchCompat, Float f) {
            switchCompat.setThumbPosition(f.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.switchStyle);
    }

    private void a() {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        if (this.f || this.n) {
            Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            this.a = mutate;
            if (this.f) {
                androidx.core.graphics.drawable.a.i(mutate, this.b);
            }
            if (this.n) {
                androidx.core.graphics.drawable.a.j(this.a, this.c);
            }
            if (this.a.isStateful()) {
                this.a.setState(getDrawableState());
            }
        }
    }

    private void b() {
        Drawable drawable = this.o;
        if (drawable == null) {
            return;
        }
        if (this.r || this.s) {
            Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            this.o = mutate;
            if (this.r) {
                androidx.core.graphics.drawable.a.i(mutate, this.p);
            }
            if (this.s) {
                androidx.core.graphics.drawable.a.j(this.o, this.q);
            }
            if (this.o.isStateful()) {
                this.o.setState(getDrawableState());
            }
        }
    }

    private Layout c(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.S;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.O;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private boolean getTargetCheckedState() {
        return this.G > 0.5f;
    }

    private int getThumbOffset() {
        float f2;
        if (o0.b(this)) {
            f2 = 1.0f - this.G;
        } else {
            f2 = this.G;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.o;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.V;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            rect = q.c(drawable2);
        } else {
            rect = q.c;
        }
        return ((((this.H - this.J) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.V;
        int i3 = this.K;
        int i4 = this.L;
        int i5 = this.M;
        int i6 = this.N;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.a;
        if (drawable != null) {
            rect = q.c(drawable);
        } else {
            rect = q.c;
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.o.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.o.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.J + rect2.right;
            this.a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, f2, f3);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.e(drawable2, f2, f3);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!o0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.v : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (o0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.H;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.v : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.z;
    }

    public boolean getSplitTrack() {
        return this.w;
    }

    public int getSwitchMinWidth() {
        return this.u;
    }

    public int getSwitchPadding() {
        return this.v;
    }

    public CharSequence getTextOff() {
        return this.y;
    }

    public CharSequence getTextOn() {
        return this.x;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public int getThumbTextPadding() {
        return this.t;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.o;
    }

    public ColorStateList getTrackTintList() {
        return this.p;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.q;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.T;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.T.end();
            this.T = null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, a0);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.V;
        Drawable drawable = this.o;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.L;
        int i3 = this.N;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.w || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect c2 = q.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += c2.left;
                rect.right -= c2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.Q : this.R;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.P;
            if (colorStateList != null) {
                this.O.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.O.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.x : this.y;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z2, i, i2, i3, i4);
        int i10 = 0;
        if (this.a != null) {
            Rect rect = this.V;
            Drawable drawable = this.o;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect c2 = q.c(this.a);
            i5 = Math.max(0, c2.left - rect.left);
            i10 = Math.max(0, c2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (o0.b(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.H + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.H) + i5 + i10;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i11 = this.I;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i11 / 2);
            i8 = i11 + height;
            i9 = height;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.I + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.I;
        }
        this.K = i7;
        this.L = i9;
        this.N = i8;
        this.M = i6;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.z) {
            if (this.Q == null) {
                this.Q = c(this.x);
            }
            if (this.R == null) {
                this.R = c(this.y);
            }
        }
        Rect rect = this.V;
        Drawable drawable = this.a;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.a.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.z) {
            i5 = (this.t * 2) + Math.max(this.Q.getWidth(), this.R.getWidth());
        } else {
            i5 = 0;
        }
        this.J = Math.max(i5, i4);
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.o.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect c2 = q.c(drawable3);
            i7 = Math.max(i7, c2.left);
            i8 = Math.max(i8, c2.right);
        }
        int max = Math.max(this.u, (this.J * 2) + i7 + i8);
        int max2 = Math.max(i6, i3);
        this.H = max;
        this.I = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.x : this.y;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0153;
     */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
        // Method dump skipped, instructions count: 344
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        float f2 = 1.0f;
        if (getWindowToken() == null || !q4.w(this)) {
            ObjectAnimator objectAnimator = this.T;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            if (!isChecked) {
                f2 = 0.0f;
            }
            setThumbPosition(f2);
            return;
        }
        if (!isChecked) {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, W, f2);
        this.T = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.T.setAutoCancel(true);
        }
        this.T.start();
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(c.p(this, callback));
    }

    public void setShowText(boolean z2) {
        if (this.z != z2) {
            this.z = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.w = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.u = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.v = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.O.getTypeface() != null && !this.O.getTypeface().equals(typeface)) || (this.O.getTypeface() == null && typeface != null)) {
            this.O.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.y = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.x = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    public void setThumbPosition(float f2) {
        this.G = f2;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(i0.b(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.t = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.f = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.n = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(i0.b(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.p = colorStateList;
        this.r = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.q = mode;
        this.s = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.o;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface typeface2;
        this.b = null;
        this.c = null;
        this.f = false;
        this.n = false;
        this.p = null;
        this.q = null;
        this.r = false;
        this.s = false;
        this.E = VelocityTracker.obtain();
        this.V = new Rect();
        c0.a(this, getContext());
        boolean z2 = true;
        TextPaint textPaint = new TextPaint(1);
        this.O = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = h0.x;
        h0 v2 = h0.v(context, attributeSet, iArr, i, 0);
        q4.H(this, context, iArr, attributeSet, v2.r(), i, 0);
        Drawable g = v2.g(2);
        this.a = g;
        if (g != null) {
            g.setCallback(this);
        }
        Drawable g2 = v2.g(11);
        this.o = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        this.x = v2.p(0);
        this.y = v2.p(1);
        this.z = v2.a(3, true);
        this.t = v2.f(8, 0);
        this.u = v2.f(5, 0);
        this.v = v2.f(6, 0);
        this.w = v2.a(4, false);
        ColorStateList c2 = v2.c(9);
        if (c2 != null) {
            this.b = c2;
            this.f = true;
        }
        PorterDuff.Mode d = q.d(v2.k(10, -1), null);
        if (this.c != d) {
            this.c = d;
            this.n = true;
        }
        if (this.f || this.n) {
            a();
        }
        ColorStateList c3 = v2.c(12);
        if (c3 != null) {
            this.p = c3;
            this.r = true;
        }
        PorterDuff.Mode d2 = q.d(v2.k(13, -1), null);
        if (this.q != d2) {
            this.q = d2;
            this.s = true;
        }
        if (this.r || this.s) {
            b();
        }
        int n2 = v2.n(7, 0);
        if (n2 != 0) {
            h0 t2 = h0.t(context, n2, h0.y);
            ColorStateList c4 = t2.c(3);
            if (c4 != null) {
                this.P = c4;
            } else {
                this.P = getTextColors();
            }
            int f2 = t2.f(0, 0);
            if (f2 != 0) {
                float f3 = (float) f2;
                if (f3 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f3);
                    requestLayout();
                }
            }
            int k = t2.k(1, -1);
            int k2 = t2.k(2, -1);
            if (k == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (k == 2) {
                typeface = Typeface.SERIF;
            } else if (k != 3) {
                typeface = null;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            float f4 = 0.0f;
            if (k2 > 0) {
                if (typeface == null) {
                    typeface2 = Typeface.defaultFromStyle(k2);
                } else {
                    typeface2 = Typeface.create(typeface, k2);
                }
                setSwitchTypeface(typeface2);
                int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & k2;
                textPaint.setFakeBoldText((style & 1) == 0 ? false : z2);
                textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : f4);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (t2.a(14, false)) {
                this.S = new o0(getContext());
            } else {
                this.S = null;
            }
            t2.w();
        }
        m mVar = new m(this);
        this.U = mVar;
        mVar.m(attributeSet, i);
        v2.w();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.B = viewConfiguration.getScaledTouchSlop();
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
