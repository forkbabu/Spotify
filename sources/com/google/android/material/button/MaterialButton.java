package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class MaterialButton extends AppCompatButton implements Checkable, gy {
    private static final int[] v = {16842911};
    private static final int[] w = {16842912};
    private final a a;
    private final LinkedHashSet<a> b;
    private b c;
    private PorterDuff.Mode f;
    private ColorStateList n;
    private Drawable o;
    private int p;
    private int q;
    private int r;
    private boolean s;
    private boolean t;
    private int u;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    /* access modifiers changed from: package-private */
    public interface b {
    }

    static class c extends l5 {
        public static final Parcelable.Creator<c> CREATOR = new a();
        boolean c;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.l5, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.c = parcel.readInt() != 1 ? false : true;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.materialButtonStyle);
    }

    private boolean d() {
        a aVar = this.a;
        return aVar != null && !aVar.l();
    }

    private void f(boolean z) {
        Drawable drawable = this.o;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = androidx.core.graphics.drawable.a.l(drawable).mutate();
            this.o = mutate;
            androidx.core.graphics.drawable.a.i(mutate, this.n);
            PorterDuff.Mode mode = this.f;
            if (mode != null) {
                androidx.core.graphics.drawable.a.j(this.o, mode);
            }
            int i = this.p;
            if (i == 0) {
                i = this.o.getIntrinsicWidth();
            }
            int i2 = this.p;
            if (i2 == 0) {
                i2 = this.o.getIntrinsicHeight();
            }
            Drawable drawable2 = this.o;
            int i3 = this.q;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.u;
        boolean z3 = i4 == 1 || i4 == 2;
        if (!z) {
            Drawable[] c2 = androidx.core.widget.c.c(this);
            Drawable drawable3 = c2[0];
            Drawable drawable4 = c2[2];
            if ((z3 && drawable3 != this.o) || (!z3 && drawable4 != this.o)) {
                z2 = true;
            }
            if (!z2) {
                return;
            }
            if (z3) {
                androidx.core.widget.c.g(this, this.o, null, null, null);
            } else {
                androidx.core.widget.c.g(this, null, null, this.o, null);
            }
        } else if (z3) {
            androidx.core.widget.c.g(this, this.o, null, null, null);
        } else {
            androidx.core.widget.c.g(this, null, null, this.o, null);
        }
    }

    private void g() {
        if (this.o != null && getLayout() != null) {
            int i = this.u;
            boolean z = true;
            if (i == 1 || i == 3) {
                this.q = 0;
                f(false);
                return;
            }
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
            int i2 = this.p;
            if (i2 == 0) {
                i2 = this.o.getIntrinsicWidth();
            }
            int measuredWidth = (((((getMeasuredWidth() - min) - q4.q(this)) - i2) - this.r) - q4.r(this)) / 2;
            boolean z2 = q4.o(this) == 1;
            if (this.u != 4) {
                z = false;
            }
            if (z2 != z) {
                measuredWidth = -measuredWidth;
            }
            if (this.q != measuredWidth) {
                this.q = measuredWidth;
                f(false);
            }
        }
    }

    private String getA11yClassName() {
        return (c() ? CompoundButton.class : Button.class).getName();
    }

    public void b(a aVar) {
        this.b.add(aVar);
    }

    public boolean c() {
        a aVar = this.a;
        return aVar != null && aVar.m();
    }

    public void e(a aVar) {
        this.b.remove(aVar);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (d()) {
            return this.a.a();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.o;
    }

    public int getIconGravity() {
        return this.u;
    }

    public int getIconPadding() {
        return this.r;
    }

    public int getIconSize() {
        return this.p;
    }

    public ColorStateList getIconTint() {
        return this.n;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f;
    }

    public ColorStateList getRippleColor() {
        if (d()) {
            return this.a.e();
        }
        return null;
    }

    public dy getShapeAppearanceModel() {
        if (d()) {
            return this.a.f();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (d()) {
            return this.a.g();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (d()) {
            return this.a.h();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.p4
    public ColorStateList getSupportBackgroundTintList() {
        if (d()) {
            return this.a.i();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.p4
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (d()) {
            return this.a.j();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.s;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d()) {
            zx.b(this, this.a.c());
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (c()) {
            Button.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT == 21 && (aVar = this.a) != null) {
            aVar.y(i4 - i2, i3 - i);
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        g();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.c = this.s;
        return cVar;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        g();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (d()) {
            a aVar = this.a;
            if (aVar.c() != null) {
                aVar.c().setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!d()) {
            super.setBackgroundDrawable(drawable);
        } else if (drawable != getBackground()) {
            this.a.o();
            super.setBackgroundDrawable(drawable);
        } else {
            getBackground().setState(drawable.getState());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? i0.b(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (d()) {
            this.a.p(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (c() && isEnabled() && this.s != z) {
            this.s = z;
            refreshDrawableState();
            if (!this.t) {
                this.t = true;
                Iterator<a> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.s);
                }
                this.t = false;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (d()) {
            this.a.q(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (d()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (d()) {
            this.a.c().G(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.o != drawable) {
            this.o = drawable;
            f(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.u != i) {
            this.u = i;
            g();
        }
    }

    public void setIconPadding(int i) {
        if (this.r != i) {
            this.r = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? i0.b(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.p != i) {
            this.p = i;
            f(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.n != colorStateList) {
            this.n = colorStateList;
            f(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f != mode) {
            this.f = mode;
            f(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(i0.a(getContext(), i));
    }

    /* access modifiers changed from: package-private */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    /* access modifiers changed from: package-private */
    public void setOnPressedChangeListenerInternal(b bVar) {
        this.c = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.c;
        if (bVar != null) {
            MaterialButtonToggleGroup.this.invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (d()) {
            this.a.r(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (d()) {
            setRippleColor(i0.a(getContext(), i));
        }
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        if (d()) {
            this.a.s(dyVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    /* access modifiers changed from: package-private */
    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (d()) {
            this.a.t(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (d()) {
            this.a.u(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (d()) {
            setStrokeColor(i0.a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (d()) {
            this.a.v(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (d()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.p4
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (d()) {
            this.a.w(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, defpackage.p4
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (d()) {
            this.a.x(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.s);
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_Button), attributeSet, i);
        this.b = new LinkedHashSet<>();
        boolean z = false;
        this.s = false;
        this.t = false;
        Context context2 = getContext();
        TypedArray f2 = j.f(context2, attributeSet, pw.t, i, C0707R.style.Widget_MaterialComponents_Button, new int[0]);
        this.r = f2.getDimensionPixelSize(12, 0);
        this.f = o.h(f2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.n = jx.a(getContext(), f2, 14);
        this.o = jx.c(getContext(), f2, 10);
        this.u = f2.getInteger(11, 1);
        this.p = f2.getDimensionPixelSize(13, 0);
        a aVar = new a(this, dy.c(context2, attributeSet, i, C0707R.style.Widget_MaterialComponents_Button, new rx((float) 0)).m());
        this.a = aVar;
        aVar.n(f2);
        f2.recycle();
        setCompoundDrawablePadding(this.r);
        f(this.o != null ? true : z);
    }
}
