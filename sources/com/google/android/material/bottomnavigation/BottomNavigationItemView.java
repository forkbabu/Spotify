package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.k0;
import androidx.core.widget.c;
import com.comscore.streaming.ContentMediaFormat;
import com.spotify.music.C0707R;
import defpackage.d5;

public class BottomNavigationItemView extends FrameLayout implements n.a {
    private static final int[] y = {16842912};
    private final int a;
    private float b;
    private float c;
    private float f;
    private int n;
    private boolean o;
    private ImageView p;
    private final TextView q;
    private final TextView r;
    private int s;
    private i t;
    private ColorStateList u;
    private Drawable v;
    private Drawable w;
    private bx x;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (BottomNavigationItemView.this.p.getVisibility() == 0) {
                BottomNavigationItemView bottomNavigationItemView = BottomNavigationItemView.this;
                BottomNavigationItemView.b(bottomNavigationItemView, bottomNavigationItemView.p);
            }
        }
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static void b(BottomNavigationItemView bottomNavigationItemView, View view) {
        if (bottomNavigationItemView.f()) {
            cx.c(bottomNavigationItemView.x, view, bottomNavigationItemView.d(view));
        }
    }

    private void c(float f2, float f3) {
        this.b = f2 - f3;
        this.c = (f3 * 1.0f) / f2;
        this.f = (f2 * 1.0f) / f3;
    }

    private FrameLayout d(View view) {
        ImageView imageView = this.p;
        if (view != imageView || !cx.a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private boolean f() {
        return this.x != null;
    }

    private void i(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void j(View view, float f2, float f3, int i) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i) {
        CharSequence charSequence;
        this.t = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        if (!TextUtils.isEmpty(iVar.getTooltipText())) {
            charSequence = iVar.getTooltipText();
        } else {
            charSequence = iVar.getTitle();
        }
        k0.b(this, charSequence);
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    /* access modifiers changed from: package-private */
    public void g() {
        ImageView imageView = this.p;
        if (f()) {
            if (imageView != null) {
                setClipChildren(true);
                setClipToPadding(true);
                cx.b(this.x, imageView, d(imageView));
            }
            this.x = null;
        }
    }

    /* access modifiers changed from: package-private */
    public bx getBadge() {
        return this.x;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.t;
    }

    public int getItemPosition() {
        return this.s;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean h() {
        return false;
    }

    @Override // android.view.View, android.view.ViewGroup
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.t;
        if (iVar != null && iVar.isCheckable() && this.t.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, y);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bx bxVar = this.x;
        if (bxVar != null && bxVar.isVisible()) {
            CharSequence title = this.t.getTitle();
            if (!TextUtils.isEmpty(this.t.getContentDescription())) {
                title = this.t.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.x.e()));
        }
        d5 v0 = d5.v0(accessibilityNodeInfo);
        v0.U(d5.c.a(0, 1, getItemPosition(), 1, false, isSelected()));
        if (isSelected()) {
            v0.S(false);
            v0.J(d5.a.g);
        }
        v0.l0(getResources().getString(C0707R.string.item_view_role_description));
    }

    /* access modifiers changed from: package-private */
    public void setBadge(bx bxVar) {
        this.x = bxVar;
        ImageView imageView = this.p;
        if (imageView != null && f() && imageView != null) {
            setClipChildren(false);
            setClipToPadding(false);
            bx bxVar2 = this.x;
            FrameLayout d = d(imageView);
            cx.c(bxVar2, imageView, d);
            if (cx.a) {
                d.setForeground(bxVar2);
            } else {
                imageView.getOverlay().add(bxVar2);
            }
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.r;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.r;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.q;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.q;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.n;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    i(this.p, this.a, 49);
                    j(this.r, 1.0f, 1.0f, 0);
                } else {
                    i(this.p, this.a, 17);
                    j(this.r, 0.5f, 0.5f, 4);
                }
                this.q.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    i(this.p, this.a, 17);
                    this.r.setVisibility(8);
                    this.q.setVisibility(8);
                }
            } else if (z) {
                i(this.p, (int) (((float) this.a) + this.b), 49);
                j(this.r, 1.0f, 1.0f, 0);
                TextView textView5 = this.q;
                float f2 = this.c;
                j(textView5, f2, f2, 4);
            } else {
                i(this.p, this.a, 49);
                TextView textView6 = this.r;
                float f3 = this.f;
                j(textView6, f3, f3, 4);
                j(this.q, 1.0f, 1.0f, 0);
            }
        } else if (this.o) {
            if (z) {
                i(this.p, this.a, 49);
                j(this.r, 1.0f, 1.0f, 0);
            } else {
                i(this.p, this.a, 17);
                j(this.r, 0.5f, 0.5f, 4);
            }
            this.q.setVisibility(4);
        } else if (z) {
            i(this.p, (int) (((float) this.a) + this.b), 49);
            j(this.r, 1.0f, 1.0f, 0);
            TextView textView7 = this.q;
            float f4 = this.c;
            j(textView7, f4, f4, 4);
        } else {
            i(this.p, this.a, 49);
            TextView textView8 = this.r;
            float f5 = this.f;
            j(textView8, f5, f5, 4);
            j(this.q, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.q.setEnabled(z);
        this.r.setEnabled(z);
        this.p.setEnabled(z);
        if (z) {
            q4.R(this, o4.b(getContext(), ContentMediaFormat.FULL_CONTENT_EPISODE));
        } else {
            q4.R(this, null);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != this.v) {
            this.v = drawable;
            if (drawable != null) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.l(drawable).mutate();
                this.w = drawable;
                ColorStateList colorStateList = this.u;
                if (colorStateList != null) {
                    androidx.core.graphics.drawable.a.i(drawable, colorStateList);
                }
            }
            this.p.setImageDrawable(drawable);
        }
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.p.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.p.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.u = colorStateList;
        if (this.t != null && (drawable = this.w) != null) {
            androidx.core.graphics.drawable.a.i(drawable, colorStateList);
            this.w.invalidateSelf();
        }
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : androidx.core.content.a.d(getContext(), i));
    }

    public void setItemPosition(int i) {
        this.s = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.n != i) {
            this.n = i;
            i iVar = this.t;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        if (this.o != z) {
            this.o = z;
            i iVar = this.t;
            if (iVar != null) {
                setChecked(iVar.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        c.n(this.r, i);
        c(this.q.getTextSize(), this.r.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        c.n(this.q, i);
        c(this.q.getTextSize(), this.r.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.q.setTextColor(colorStateList);
            this.r.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.q.setText(charSequence);
        this.r.setText(charSequence);
        i iVar = this.t;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        i iVar2 = this.t;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.t.getTooltipText();
        }
        k0.b(this, charSequence);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(C0707R.layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C0707R.drawable.design_bottom_navigation_item_background);
        this.a = resources.getDimensionPixelSize(C0707R.dimen.design_bottom_navigation_margin);
        this.p = (ImageView) findViewById(C0707R.id.icon);
        TextView textView = (TextView) findViewById(C0707R.id.smallLabel);
        this.q = textView;
        TextView textView2 = (TextView) findViewById(C0707R.id.largeLabel);
        this.r = textView2;
        q4.O(textView, 2);
        q4.O(textView2, 2);
        setFocusable(true);
        c(textView.getTextSize(), textView2.getTextSize());
        ImageView imageView = this.p;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new a());
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        int i = q4.g;
        int i2 = Build.VERSION.SDK_INT;
        setBackground(drawable);
    }
}
