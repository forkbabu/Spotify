package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.material.chip.b;
import com.google.android.material.internal.j;
import com.google.android.material.internal.o;
import com.spotify.music.C0707R;
import defpackage.d5;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements b.a, gy {
    private static final Rect C = new Rect();
    private static final int[] D = {16842913};
    private static final int[] E = {16842911};
    private final RectF A;
    private final mx B;
    private b f;
    private InsetDrawable n;
    private RippleDrawable o;
    private View.OnClickListener p;
    private CompoundButton.OnCheckedChangeListener q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private int w;
    private int x;
    private final b y;
    private final Rect z;

    class a extends mx {
        a() {
        }

        @Override // defpackage.mx
        public void a(int i) {
        }

        @Override // defpackage.mx
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f.c2() ? Chip.this.f.D0() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* access modifiers changed from: private */
    public class b extends m5 {
        b(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public int i(float f, float f2) {
            return (!Chip.this.j() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void j(List<Integer> list) {
            list.add(0);
            if (Chip.this.j() && Chip.this.l() && Chip.this.p != null) {
                list.add(1);
            }
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public boolean o(int i, int i2, Bundle bundle) {
            if (i2 != 16) {
                return false;
            }
            if (i == 0) {
                return Chip.this.performClick();
            }
            if (i == 1) {
                return Chip.this.m();
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void p(d5 d5Var) {
            d5Var.P(Chip.this.k());
            d5Var.S(Chip.this.isClickable());
            if (Chip.this.k() || Chip.this.isClickable()) {
                d5Var.R(Chip.this.k() ? "android.widget.CompoundButton" : "android.widget.Button");
            } else {
                d5Var.R("android.view.View");
            }
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                d5Var.s0(text);
            } else {
                d5Var.V(text);
            }
        }

        /* JADX DEBUG: Can't convert new array creation: APUT found in different block: 0x002a: APUT  (r1v1 java.lang.Object[]), (0 ??[int, short, byte, char]), (r0v1 java.lang.CharSequence) */
        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void q(int i, d5 d5Var) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    d5Var.V(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    d5Var.V(context.getString(C0707R.string.mtrl_chip_close_icon_content_description, objArr).trim());
                }
                d5Var.M(Chip.this.getCloseIconTouchBoundsInt());
                d5Var.b(d5.a.g);
                d5Var.X(Chip.this.isEnabled());
                return;
            }
            d5Var.V(charSequence);
            d5Var.M(Chip.C);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.m5
        public void r(int i, boolean z) {
            if (i == 1) {
                Chip.this.u = z;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0707R.attr.chipStyle);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private RectF getCloseIconTouchBounds() {
        this.A.setEmpty();
        if (j()) {
            this.f.w0(this.A);
        }
        return this.A;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.z.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.z;
    }

    private kx getTextAppearance() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.E0();
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private boolean j() {
        b bVar = this.f;
        return (bVar == null || bVar.q0() == null) ? false : true;
    }

    private void n() {
        if (this.n != null) {
            this.n = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            p();
        }
    }

    private void o() {
        if (j()) {
            b bVar = this.f;
            if ((bVar != null && bVar.K0()) && this.p != null) {
                q4.I(this, this.y);
                return;
            }
        }
        q4.I(this, null);
    }

    private void p() {
        if (ox.a) {
            q();
            return;
        }
        this.f.b2(true);
        Drawable backgroundDrawable = getBackgroundDrawable();
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(backgroundDrawable);
        r();
        if (getBackgroundDrawable() == this.n && this.f.getCallback() == null) {
            this.f.setCallback(this.n);
        }
    }

    private void q() {
        this.o = new RippleDrawable(ox.c(this.f.B0()), getBackgroundDrawable(), null);
        this.f.b2(false);
        RippleDrawable rippleDrawable = this.o;
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(rippleDrawable);
        r();
    }

    private void r() {
        b bVar;
        if (!TextUtils.isEmpty(getText()) && (bVar = this.f) != null) {
            int F0 = (int) (this.f.F0() + bVar.i0() + this.f.c0());
            int G0 = (int) (this.f.G0() + this.f.n0() + this.f.Z());
            if (this.n != null) {
                Rect rect = new Rect();
                this.n.getPadding(rect);
                G0 += rect.left;
                F0 += rect.right;
            }
            q4.Q(this, G0, getPaddingTop(), F0, getPaddingBottom());
        }
    }

    private void s() {
        TextPaint paint = getPaint();
        b bVar = this.f;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        kx textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.g(getContext(), paint, this.B);
        }
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.t != z2) {
            this.t = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.s != z2) {
            this.s = z2;
            refreshDrawableState();
        }
    }

    @Override // com.google.android.material.chip.b.a
    public void a() {
        i(this.x);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        boolean z2;
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = m5.class.getDeclaredField("j");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.y)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = m5.class.getDeclaredMethod("v", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.y, Integer.MIN_VALUE);
                    z2 = true;
                    if (!z2 || this.y.e(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
                        return true;
                    }
                    return false;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        z2 = false;
        return !z2 ? true : true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y.f(keyEvent) || this.y.h() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView, android.widget.CompoundButton, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            super.drawableStateChanged()
            com.google.android.material.chip.b r0 = r4.f
            r1 = 0
            if (r0 == 0) goto L_0x006c
            boolean r0 = r0.J0()
            if (r0 == 0) goto L_0x006c
            com.google.android.material.chip.b r0 = r4.f
            boolean r2 = r4.isEnabled()
            boolean r3 = r4.u
            if (r3 == 0) goto L_0x001a
            int r2 = r2 + 1
        L_0x001a:
            boolean r3 = r4.t
            if (r3 == 0) goto L_0x0020
            int r2 = r2 + 1
        L_0x0020:
            boolean r3 = r4.s
            if (r3 == 0) goto L_0x0026
            int r2 = r2 + 1
        L_0x0026:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L_0x002e
            int r2 = r2 + 1
        L_0x002e:
            int[] r2 = new int[r2]
            boolean r3 = r4.isEnabled()
            if (r3 == 0) goto L_0x003c
            r3 = 16842910(0x101009e, float:2.3694E-38)
            r2[r1] = r3
            r1 = 1
        L_0x003c:
            boolean r3 = r4.u
            if (r3 == 0) goto L_0x0047
            r3 = 16842908(0x101009c, float:2.3693995E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x0047:
            boolean r3 = r4.t
            if (r3 == 0) goto L_0x0052
            r3 = 16843623(0x1010367, float:2.3696E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x0052:
            boolean r3 = r4.s
            if (r3 == 0) goto L_0x005d
            r3 = 16842919(0x10100a7, float:2.3694026E-38)
            r2[r1] = r3
            int r1 = r1 + 1
        L_0x005d:
            boolean r3 = r4.isChecked()
            if (r3 == 0) goto L_0x0068
            r3 = 16842913(0x10100a1, float:2.369401E-38)
            r2[r1] = r3
        L_0x0068:
            boolean r1 = r0.C1(r2)
        L_0x006c:
            if (r1 == 0) goto L_0x0071
            r4.invalidate()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.drawableStateChanged():void");
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.n;
        return insetDrawable == null ? this.f : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.e0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.f0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.g0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        b bVar = this.f;
        if (bVar != null) {
            return Math.max(0.0f, bVar.h0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f;
    }

    public float getChipEndPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.i0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.j0();
        }
        return null;
    }

    public float getChipIconSize() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.k0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.l0();
        }
        return null;
    }

    public float getChipMinHeight() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.m0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.n0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.o0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.p0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.q0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.r0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.s0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.t0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.u0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.v0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.x0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.y.h() == 1 || this.y.g() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public xw getHideMotionSpec() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.y0();
        }
        return null;
    }

    public float getIconEndPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.z0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.A0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.B0();
        }
        return null;
    }

    public dy getShapeAppearanceModel() {
        return this.f.w();
    }

    public xw getShowMotionSpec() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.C0();
        }
        return null;
    }

    public float getTextEndPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.F0();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        b bVar = this.f;
        if (bVar != null) {
            return bVar.G0();
        }
        return 0.0f;
    }

    public boolean i(int i) {
        this.x = i;
        if (!this.v) {
            if (this.n != null) {
                n();
            } else {
                p();
            }
            return false;
        }
        int max = Math.max(0, i - this.f.getIntrinsicHeight());
        int max2 = Math.max(0, i - this.f.getIntrinsicWidth());
        if (max2 > 0 || max > 0) {
            int i2 = max2 > 0 ? max2 / 2 : 0;
            int i3 = max > 0 ? max / 2 : 0;
            if (this.n != null) {
                Rect rect = new Rect();
                this.n.getPadding(rect);
                if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                    p();
                    return true;
                }
            }
            int i4 = Build.VERSION.SDK_INT;
            if (getMinHeight() != i) {
                setMinHeight(i);
            }
            if (getMinWidth() != i) {
                setMinWidth(i);
            }
            this.n = new InsetDrawable((Drawable) this.f, i2, i3, i2, i3);
            p();
            return true;
        }
        if (this.n != null) {
            n();
        } else {
            p();
        }
        return false;
    }

    public boolean k() {
        b bVar = this.f;
        return bVar != null && bVar.I0();
    }

    public boolean l() {
        b bVar = this.f;
        return bVar != null && bVar.K0();
    }

    public boolean m() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.p;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        this.y.u(1, 1);
        return z2;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        zx.b(this, this.f);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.widget.CompoundButton, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, D);
        }
        if (k()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, E);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        this.y.n(z2, i, rect);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (k() || isClickable()) {
            accessibilityNodeInfo.setClassName(k() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(k());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            d5 v0 = d5.v0(accessibilityNodeInfo);
            if (chipGroup.a()) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        i4 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i4++;
                    }
                    i3++;
                }
                i = i4;
            } else {
                i = -1;
            }
            Object tag = getTag(C0707R.id.row_index_key);
            if (!(tag instanceof Integer)) {
                i2 = -1;
            } else {
                i2 = ((Integer) tag).intValue();
            }
            v0.U(d5.c.a(i2, 1, i, 1, false, isChecked()));
        }
    }

    @Override // android.widget.TextView, android.widget.Button, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), ContentMediaFormat.FULL_CONTENT_EPISODE);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.w != i) {
            this.w = i;
            r();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    @Override // android.widget.TextView, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0040
            goto L_0x004c
        L_0x0021:
            boolean r0 = r5.s
            if (r0 == 0) goto L_0x004c
            if (r1 != 0) goto L_0x004a
            r5.setCloseIconPressed(r2)
            goto L_0x004a
        L_0x002b:
            boolean r0 = r5.s
            if (r0 == 0) goto L_0x0040
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.p
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            com.google.android.material.chip.Chip$b r0 = r5.y
            r0.u(r3, r3)
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            r5.setCloseIconPressed(r2)
            goto L_0x004d
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r5.setCloseIconPressed(r3)
        L_0x004a:
            r0 = 1
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 != 0) goto L_0x0055
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x0056
        L_0x0055:
            r2 = 1
        L_0x0056:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.o) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.o) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.P0(z2);
        }
    }

    public void setCheckableResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Q0(i);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        b bVar = this.f;
        if (bVar == null) {
            this.r = z2;
        } else if (bVar.I0()) {
            boolean isChecked = isChecked();
            super.setChecked(z2);
            if (isChecked != z2 && (onCheckedChangeListener = this.q) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z2);
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.R0(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.S0(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.T0(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.U0(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.V0(i);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.X0(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Y0(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Z0(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a1(i);
        }
    }

    public void setChipDrawable(b bVar) {
        b bVar2 = this.f;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.G1(null);
            }
            this.f = bVar;
            bVar.R1(false);
            this.f.G1(this);
            i(this.x);
        }
    }

    public void setChipEndPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.b1(f2);
        }
    }

    public void setChipEndPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.c1(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.d1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.e1(i);
        }
    }

    public void setChipIconSize(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.f1(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.g1(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.h1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.i1(i);
        }
    }

    public void setChipIconVisible(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.j1(i);
        }
    }

    public void setChipMinHeight(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.l1(f2);
        }
    }

    public void setChipMinHeightResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.m1(i);
        }
    }

    public void setChipStartPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.n1(f2);
        }
    }

    public void setChipStartPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.o1(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.p1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.q1(i);
        }
    }

    public void setChipStrokeWidth(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.r1(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.s1(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.t1(drawable);
        }
        o();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.u1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.v1(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.w1(i);
        }
    }

    public void setCloseIconResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.x1(i);
        }
        o();
    }

    public void setCloseIconSize(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.y1(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.z1(i);
        }
    }

    public void setCloseIconStartPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.A1(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.B1(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.D1(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.E1(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        b bVar = this.f;
        if (bVar != null) {
            bVar.G(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                b bVar = this.f;
                if (bVar != null) {
                    bVar.H1(truncateAt);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.v = z2;
        i(this.x);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(xw xwVar) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.I1(xwVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.J1(i);
        }
    }

    public void setIconEndPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.K1(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.L1(i);
        }
    }

    public void setIconStartPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.M1(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.N1(i);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        b bVar = this.f;
        if (bVar != null) {
            bVar.O1(i);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.q = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
        o();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.P1(colorStateList);
        }
        if (!this.f.H0()) {
            q();
        }
    }

    public void setRippleColorResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Q1(i);
            if (!this.f.H0()) {
                q();
            }
        }
    }

    @Override // defpackage.gy
    public void setShapeAppearanceModel(dy dyVar) {
        this.f.setShapeAppearanceModel(dyVar);
    }

    public void setShowMotionSpec(xw xwVar) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.S1(xwVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.T1(i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        b bVar = this.f;
        if (bVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(bVar.c2() ? null : charSequence, bufferType);
            b bVar2 = this.f;
            if (bVar2 != null) {
                bVar2.U1(charSequence);
            }
        }
    }

    public void setTextAppearance(kx kxVar) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.V1(kxVar);
        }
        s();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.X1(f2);
        }
    }

    public void setTextEndPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Y1(i);
        }
    }

    public void setTextStartPadding(float f2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.Z1(f2);
        }
    }

    public void setTextStartPaddingResource(int i) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.a2(i);
        }
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(iy.a(context, attributeSet, i, C0707R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        this.z = new Rect();
        this.A = new RectF();
        this.B = new a();
        Context context2 = getContext();
        if (attributeSet != null) {
            attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background");
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627);
            } else {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
        }
        b d0 = b.d0(context2, attributeSet, i, C0707R.style.Widget_MaterialComponents_Chip_Action);
        int[] iArr = pw.h;
        TypedArray f2 = j.f(context2, attributeSet, iArr, i, C0707R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.v = f2.getBoolean(31, false);
        this.x = (int) Math.ceil((double) f2.getDimension(19, (float) Math.ceil((double) o.c(getContext(), 48))));
        f2.recycle();
        setChipDrawable(d0);
        d0.G(q4.k(this));
        TypedArray f3 = j.f(context2, attributeSet, iArr, i, C0707R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            setTextColor(jx.a(context2, f3, 1));
        }
        boolean hasValue = f3.hasValue(36);
        f3.recycle();
        this.y = new b(this);
        o();
        if (!hasValue && i2 >= 21) {
            setOutlineProvider(new a(this));
        }
        setChecked(this.r);
        setText(d0.D0());
        setEllipsize(d0.x0());
        s();
        if (!this.f.c2()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        r();
        if (this.v) {
            setMinHeight(this.x);
        }
        this.w = q4.o(this);
    }

    public void setCloseIconVisible(boolean z2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.F1(z2);
        }
        o();
    }

    public void setCheckedIconVisible(boolean z2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.W0(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        b bVar = this.f;
        if (bVar != null) {
            bVar.k1(z2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        b bVar = this.f;
        if (bVar != null) {
            bVar.W1(i);
        }
        s();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        b bVar = this.f;
        if (bVar != null) {
            bVar.W1(i);
        }
        s();
    }
}
