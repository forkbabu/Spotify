package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.google.android.material.internal.j;
import com.spotify.music.C0707R;

public class MaterialCardView extends CardView implements Checkable, gy {
    private static final int[] x = {16842911};
    private static final int[] y = {16842912};
    private static final int[] z = {C0707R.attr.state_dragged};
    private final a s;
    private boolean t;
    private boolean u;
    private boolean v;
    private a w;

    public interface a {
        void a(MaterialCardView materialCardView, boolean z);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.materialCardViewStyle);
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.s.g().getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.s.h();
    }

    public ColorStateList getCardForegroundColor() {
        return this.s.i();
    }

    /* access modifiers changed from: package-private */
    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.s.j();
    }

    public ColorStateList getCheckedIconTint() {
        return this.s.k();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.s.t().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.s.t().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.s.t().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.s.t().top;
    }

    public float getProgress() {
        return this.s.n();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.s.m();
    }

    public ColorStateList getRippleColor() {
        return this.s.o();
    }

    public dy getShapeAppearanceModel() {
        return this.s.p();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.s.q();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.s.r();
    }

    public int getStrokeWidth() {
        return this.s.s();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.u;
    }

    public boolean o() {
        a aVar = this.s;
        return aVar != null && aVar.w();
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zx.b(this, this.s.g());
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (o()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, x);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, y);
        }
        if (this.v) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, z);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(o());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.s.y(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.t) {
            if (!this.s.v()) {
                this.s.z(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.s.A(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.s.Q();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.s.B(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.s.C(z2);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.u != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.s.D(drawable);
    }

    public void setCheckedIconResource(int i) {
        this.s.D(i0.b(getContext(), i));
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.s.E(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        a aVar = this.s;
        if (aVar != null) {
            aVar.O();
        }
    }

    public void setDragged(boolean z2) {
        if (this.v != z2) {
            this.v = z2;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                this.s.f();
            }
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.s.R();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.w = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        this.s.R();
        this.s.P();
    }

    public void setProgress(float f) {
        this.s.G(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.s.F(f);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.s.H(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.s.H(i0.a(getContext(), i));
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(dyVar.n(getBoundsAsRectF()));
        }
        this.s.I(dyVar);
    }

    public void setStrokeColor(int i) {
        this.s.J(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        this.s.K(i);
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        this.s.R();
        this.s.P();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (o() && isEnabled()) {
            this.u = !this.u;
            refreshDrawableState();
            if (Build.VERSION.SDK_INT > 26) {
                this.s.f();
            }
            a aVar = this.w;
            if (aVar != null) {
                aVar.a(this, this.u);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.u = false;
        this.v = false;
        this.t = true;
        TypedArray f = j.f(getContext(), attributeSet, pw.x, i, C0707R.style.Widget_MaterialComponents_CardView, new int[0]);
        a aVar = new a(this, attributeSet, i, C0707R.style.Widget_MaterialComponents_CardView);
        this.s = aVar;
        aVar.A(super.getCardBackgroundColor());
        aVar.L(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        aVar.x(f);
        f.recycle();
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.s.A(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.s.J(colorStateList);
    }
}
